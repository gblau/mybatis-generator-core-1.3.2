package po;

import po.Parking;

public interface ParkingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:26 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:26 CST 2017
     */
    int insert(Parking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:26 CST 2017
     */
    int insertSelective(Parking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:26 CST 2017
     */
    Parking selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:26 CST 2017
     */
    int updateByPrimaryKeySelective(Parking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table face_verify_log
     *
     * @mbggenerated Sat Mar 04 09:43:26 CST 2017
     */
    int updateByPrimaryKey(Parking record);
}