package com.nj.model.generate;

public class NjIdSequence {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column nj_id_sequence.seq_name
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	private String seqName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column nj_id_sequence.current_val
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	private Integer currentVal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column nj_id_sequence.increment_val
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	private Integer incrementVal;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column nj_id_sequence.seq_name
	 * @return  the value of nj_id_sequence.seq_name
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public String getSeqName() {
		return seqName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column nj_id_sequence.seq_name
	 * @param seqName  the value for nj_id_sequence.seq_name
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column nj_id_sequence.current_val
	 * @return  the value of nj_id_sequence.current_val
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public Integer getCurrentVal() {
		return currentVal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column nj_id_sequence.current_val
	 * @param currentVal  the value for nj_id_sequence.current_val
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void setCurrentVal(Integer currentVal) {
		this.currentVal = currentVal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column nj_id_sequence.increment_val
	 * @return  the value of nj_id_sequence.increment_val
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public Integer getIncrementVal() {
		return incrementVal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column nj_id_sequence.increment_val
	 * @param incrementVal  the value for nj_id_sequence.increment_val
	 * @mbg.generated  Tue Mar 07 15:58:03 CST 2017
	 */
	public void setIncrementVal(Integer incrementVal) {
		this.incrementVal = incrementVal;
	}
}