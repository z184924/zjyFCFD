package cn.zhangjingyao.serviceImpl.dict;

import cn.zhangjingyao.dao.DaoImpl;
import cn.zhangjingyao.entity.Page;
import cn.zhangjingyao.entity.PageData;
import cn.zhangjingyao.service.dict.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@com.alibaba.dubbo.config.annotation.Service
@org.springframework.stereotype.Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private DaoImpl dao;
	
	/**
	 * 新增
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void save(PageData pd)throws Exception{
		dao.save("ProjectMapper.save", pd);
	}

	/**
	 * 批量新增
	 * @param list
	 * @throws Exception
	 */
	@Override
	public void save(List<PageData> list)throws Exception{
		for (PageData pd:list) {
			dao.save("ProjectMapper.save", pd);
		}
	}

    /**
     * 删除
     * @param pd
     * @throws Exception
     */
	@Override
	public void delete(PageData pd)throws Exception{
		dao.delete("ProjectMapper.delete", pd);
	}

    /**
     * 批量删除
     * @param list
     * @throws Exception
     */
	@Override
	public void delete(List<PageData> list)throws Exception{
        for (PageData pd:list) {
			dao.delete("ProjectMapper.delete", pd);
		}
	}

    /**
     * 修改
     * @param pd
     * @throws Exception
     */
	@Override
	public void edit(PageData pd)throws Exception{
		dao.update("ProjectMapper.edit", pd);
	}

	/**
	 * 批量修改
     * @param list
     * @throws Exception
     */
	@Override
	public void edit(List<PageData> list)throws Exception{
        for (PageData pd:list) {
			dao.update("ProjectMapper.edit", pd);
		}
	}

    /**
	 * 分页列表
     * @param page
     * @return
     * @throws Exception
     */
	@Override
	public List<PageData> listPage(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ProjectMapper.datalistPage", page);
	}

    /**
     * 列表(全部)
     * @param pd
     * @return
     * @throws Exception
     */
	@Override
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ProjectMapper.listAll", pd);
	}
    /**
     * 列表(全部)
     * @param pd
     * @return
     * @throws Exception
     */
	@Override
	public List<PageData> listAllCity(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ProjectMapper.listAllCity", pd);
	}

     /**
      * 通过id获取数据
      * @param pd
      * @return
      * @throws Exception
      */
	@Override
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ProjectMapper.findById", pd);
	}

     /**
      * 批量删除
      * @param ArrayDATA_IDS
      * @throws Exception
      */
	@Override
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("ProjectMapper.deleteAll", ArrayDATA_IDS);
	}
	
}

