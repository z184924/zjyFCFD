package cn.zhangjingyao.service.dict;

import cn.zhangjingyao.entity.Page;
import cn.zhangjingyao.entity.PageData;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DangerService {


	/**
	 * 新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;

	/**
	 * 批量新增
	 * @param list
	 * @throws Exception
	 */
	public void save(List<PageData> list)throws Exception;

	/**
	 * 删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;

	/**
	 * 批量删除
	 * @param list
	 * @throws Exception
	 */
	public void delete(List<PageData> list)throws Exception;

	/**
	 * 修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;

	/**
	 * 批量修改
	 * @param list
	 * @throws Exception
	 */
	public void edit(List<PageData> list)throws Exception;

	/**
	 * 列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listPage(Page page)throws Exception;

	/**
	 * 列表(全部)
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;
	/**
	 * 列表(全部)
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllContructionStageName(PageData pd)throws Exception;



	/**
	 * 查询最后隐患时间
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findLastUploadTime(PageData pd)throws Exception;

	/**
	 * unitTypeCount
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> unitTypeCount(PageData pd)throws Exception;
	/**
	 * getTypePie
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> getTypePie(PageData pd)throws Exception;
	/**
	 * gradePartition
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> gradePartition(PageData pd)throws Exception;
	/**
	 * gradePartitionAreaCount
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> gradePartitionAreaCount(PageData pd)throws Exception;
	/**
	 * recordgetCountTime
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> recordgetCountTime(PageData pd)throws Exception;


	/**
	 * 通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;

	/**
	 * 批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
	
}

