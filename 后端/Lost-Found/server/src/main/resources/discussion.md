# ʵ����

```java
@Data
// ��ԭ����lost&found��
public class Item {
    private Long id;
    private String name;
    private String description;
    private String img;
    private Integer status;  //��ʾ�һ��˻��Ƕ�ʧ
    private Integer tag;    //�����Ʒ��ʲô����
    private Long userId;    // ������ID
    private Integer isLost;     //�Ƕ�ʧ��������
    private Timestamp startTime;    //ʲôʱ���ҵ����߶�ʧ
    private Timestamp endTime;
    private Timestamp publishTime;  //����ʶ�����ݿ��е���Ʒ
}

@Data
public class Message {
    private Long id;
    private Long itemId;
    private Long lostUserId;    // ��ʧ��ID
    private Long foundUserId;
    private String content;     //��Ϣ����
    private Timestamp createTime;   //����Ի�����ʱ��
    private Timestamp updateTime;   //�Ի����޸�ʱ��
}

@Data
public class Suggestion {
    private Long id;
    private Long userId;
    private Integer tag;        //��������
    private Integer pollCount;      //�����Ʊ��
    private String content;
    private Timestamp publishTime;  //����ʱ��
}

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String avatar;
    private Integer role;
    private Integer reputation;     //�û�����������������flower����admin�޸�
    private String school;      //����
    private Timestamp createTime;   
    private Integer status;  //�û���״̬�������ע���ȣ�������չadmin�Ĺ��ܣ�
}
```

# ����

1. ����֪���������Admin��User���������û���������ǵĹ��ܶ������ƵĻ���û�б�Ҫ��дcontroller������Ҳ���ܲ���Ҫ����Ա�����ݣ���������˼������ܵĹ���
   1. Admin����ˡ�������¡���ԭ�û��˺š��޸Ľ���etc��
   2. User�����顢�������¡���ѯetc��
2. �Ҿ���notice�Ǹ�controllerû�б�Ҫ������ֻ��Ҫ��item��ԭ����lost&found����ѡ�������Ϳ�����
---

# ����

Ϊ�˺����������㣬���Ƚ���ǰ�汾�Ĵ����ϴ���file�ϴ�����Ϊʵ�֣���������Ƚ�������ȡ�����ز���һ�½ӿڣ��ӿ�δ��ȫ���ԣ���˿��ܴ������⣩����Ϥһ���޸ĺ�Ľӿڲ�������Ե����⡣���ⰴ�� **�ļ���-������** 
��ʶ���������Ի��ܳ�һ���ĵ����ң��ҽ�ͬ�����в��ԣ�������ͳһ�޸ĺ�˴��룬�޸���ɺ�����������޸�ǰ�ˡ�

## ��β���

1. ��github��pull���뵽���أ�����ʹ���ҷ�����Ĵ��룩�����еĴ󲿷��߼�δ�����ı䣬ֻ�Ǵ����ع��ˣ�
2. ����Maven�ֿ⣨ʹ����֮ǰ�ģ��󲿷����ö������У��Ҷ����һ��swagger�����Լ�������һЩjson��������
3. �������ݿ�sql�ű������д󲿷ֶ��Ǳ�ṹ���Ҹղ�����UserController��������ݲ��ࣩ��
4. compile��Ҳ���Բ�compile�������������localhost:9090/doc.html����endpoint���ԣ�����Ҫ����ǰ����Ŀ��


## ����

1. ������ֶγ���У����ǰ����ɣ����������У�����ɾ��
2. �û�����Ϣ�Ѿ��洢ThreadLocal���ˣ�������Ǻ�������ʱ�����ж��û���Ȩ��
3. �޸�ʱ���費��Ҫ���ϣ�
4. �����û�п��Է�װ���߼����룡[discussion.md](discussion.md)
5. ��ȡ���޻�δʵ��
6. �������ʹ��@Param��mapper�ļ��������ǿ��Խ�Role��ThreadLocal
7. �û��͹���Ա�ֻ��š������ͻ���
8. ����������ֶ�Ϊ��ӣ�����߼�Ϊ�޸ģ�����msg������ˣ�
9. ǰ����Ҫ����ҳ�������Ͳ�ͬ�ĵ�½�����Լ���½�ɹ�����ת���߼���ͬ
---

UserService��
1. �ֻ��š������Ƿ���ϸ�ʽУ�飨����ǰ��У�飩
2. �û�ɾ������ֻ��ɾ���Լ�����Ȩ�޷Ÿ�����Ա;ɾ�����Բ����ж������Ƿ���ڣ�
3. �ֶ����ƣ������item��