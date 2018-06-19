package java_spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;


public class GithubRepoPageProcessor implements PageProcessor {
// ����һ��ץȡ��վ��������ã��������롢ץȡ��������Դ�����
   private Site site = Site.me().setRetryTimes(3).setSleepTime(0);


   // process�Ƕ��������߼��ĺ��Ľӿڣ��������д��ȡ�߼�
   @Override
   public void process(Page page) {
// ���ֶ���������γ�ȡҳ����Ϣ������������
      //��δ���ķ�Ϊ������:
      // page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all()���ڻ�ȡ��������"(https:/ /github\.com/\w+/\w+)"���������ʽ�����ӣ�
      // page.addTargetRequests()����Щ���Ӽ��뵽��ץȡ�Ķ�����ȥ��
      page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());
      page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+)").all());

      page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
      //��δ���ʹ����XPath��������˼�ǡ���������class����Ϊ'entry-title public'��h1Ԫ�أ����ҵ�����strong�ӽڵ��a�ӽڵ㣬����ȡa�ڵ���ı���Ϣ���� ��Ӧ��Html�������ӵģ�
      page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
      if (page.getResultItems().get("name")==null){
//skip this page
         page.setSkip(true);
      }
// ����������ҳ�淢�ֺ�����url��ַ��ץȡ
      page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));
   }

@Override
   public Site getSite() {
return site;
   }

public static void main(String[] args) {
      Spider.create(new GithubRepoPageProcessor())
//��"https://github.com/code4craft"��ʼץ
            .addUrl("https://github.com/code4craft")
//����5���߳�ץȡ
            .thread(5)
//��������
            .run();
   }
}