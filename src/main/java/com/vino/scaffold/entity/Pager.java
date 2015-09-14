package com.vino.scaffold.entity;


public class Pager{
	private Integer totalRecord;//�ܼ�¼����
	private Integer curPageNo;//��ǰҳ��
	private Integer pageSize=Constants.PAGE_SIZE; //ÿҳ��¼��
/*	private List<T> curBeanList;//��ǰҳ�ļ�¼
*/	//���ƫ�Ƶļ�¼��ʼλ�ã���Ӧlimit���begin
	public Integer getRecordOffsetStart(){
		if(curPageNo>0)
			return (curPageNo-1)*pageSize;
		return 0;
	}
	//��Ӧlimit���end
	public Integer getRecordOffsetEnd(){
		return curPageNo*pageSize;
	}
	//�����ܹ���ҳ��
	public Integer getTotalPage(){
		return totalRecord%pageSize>0?(totalRecord/pageSize+1):(totalRecord/pageSize);
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}
	public Integer getCurPageNo() {
		return curPageNo;
	}
	public void setCurPageNo(Integer curPageNo) {
		this.curPageNo = curPageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	/*public List<T> getCurBeanList() {
		return curBeanList;
	}
	public void setCurBeanList(List<T> curBeanList) {
		this.curBeanList = curBeanList;
	}
	*/
	

}