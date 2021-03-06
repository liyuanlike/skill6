package cn.skill6.website.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.skill6.common.entity.po.DiscussArea;
import cn.skill6.website.dao.DiscussAreaMapper;
import cn.skill6.website.dao.intf.DiscussAreaOper;

/**
 * 讨论区操作实现类
 *
 * @author 何明胜
 * @version 1.0.1
 * @since 2018年8月28日 上午12:17:53
 */
public class DiscussAreaImpl implements DiscussAreaOper {
  private static final Logger logger = LoggerFactory.getLogger(DiscussAreaImpl.class);

  @Autowired private DiscussAreaMapper discussAreaMapper;

  /* (non-Javadoc)
   * @see cn.skill6.service.intf.basic.DiscussAreaOper#deleteByDiscussId(java.lang.Long)
   */
  @Override
  public int deleteByDiscussId(Long discussId) {
    logger.warn("删除id为{}的讨论区", discussId);

    return discussAreaMapper.deleteByPrimaryKey(discussId);
  }

  /* (non-Javadoc)
   * @see cn.skill6.service.intf.basic.DiscussAreaOper#addDiscussArea(cn.skill6.common.entity.po.DiscussArea)
   */
  @Override
  public int addDiscussArea(DiscussArea discussArea) {
    // TODO Auto-generated method stub
    return 0;
  }

  /* (non-Javadoc)
   * @see cn.skill6.service.intf.basic.DiscussAreaOper#findByDiscussId(java.lang.Long)
   */
  @Override
  public DiscussArea findByDiscussId(Long discussId) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see cn.skill6.service.intf.basic.DiscussAreaOper#findAll()
   */
  @Override
  public List<DiscussArea> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see cn.skill6.service.intf.basic.DiscussAreaOper#modifyByDiscussId(cn.skill6.common.entity.po.DiscussArea)
   */
  @Override
  public int modifyByDiscussId(DiscussArea discussArea) {
    // TODO Auto-generated method stub
    return 0;
  }
}
