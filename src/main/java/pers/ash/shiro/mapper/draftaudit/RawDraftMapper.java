package pers.ash.shiro.mapper.draftaudit;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.ash.shiro.model.draftaudit.RawDraft;
import pers.ash.shiro.model.draftaudit.RawDraftExample;

public interface RawDraftMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int countByExample(RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int deleteByExample(RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int insert(RawDraft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int insertSelective(RawDraft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    List<RawDraft> selectByExampleWithBLOBs(RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    List<RawDraft> selectByExample(RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    RawDraft selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int updateByExampleSelective(@Param("record") RawDraft record, @Param("example") RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") RawDraft record, @Param("example") RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int updateByExample(@Param("record") RawDraft record, @Param("example") RawDraftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int updateByPrimaryKeySelective(RawDraft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(RawDraft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shiro_raw_draft
     *
     * @mbggenerated Wed Oct 21 09:28:44 CST 2015
     */
    int updateByPrimaryKey(RawDraft record);
}