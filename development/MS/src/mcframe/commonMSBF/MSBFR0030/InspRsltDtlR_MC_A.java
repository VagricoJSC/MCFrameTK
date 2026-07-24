package mcframe.commonMSBF.MSBFR0030;

import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"InspRsltDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspRsltDtlR_MC_A extends MCConstRow {

	/**
	 *  順序.<p>
	 *
	 */
	public static final String $insp_seq = "insp_seq";
	/**
	 *  定性定量区分.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	/**
	 *  定性定量区分名.<p>
	 *
	 */
	public static final String $insp_qlqn_typ_nm = "insp_qlqn_typ_nm";
	/**
	 *  検査項目ＣＤ.<p>
	 *
	 */
	public static final String $insp_point_cd = "insp_point_cd";
	/**
	 *  検査項目名.<p>
	 *
	 */
	public static final String $insp_point_nm = "insp_point_nm";
	/**
	 *  定性規格値.<p>
	 *
	 */
	public static final String $ql_std_val = "ql_std_val";
	/**
	 *  定性検査値.<p>
	 *
	 */
	public static final String $ql_insp_val = "ql_insp_val";
	/**
	 *  外規格下限値.<p>
	 *
	 */
	public static final String $qn_out_min = "qn_out_min";
	/**
	 *  外規格下限値文字列.<p>
	 *
	 */
	public static final String $s_qn_out_min = "s_qn_out_min";
	/**
	 *  外規格下限値文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qn_out_min = "s_int_qn_out_min";
	/**
	 *  外規格下限値文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_qn_out_min = "s_dec_qn_out_min";
	/**
	 *  外規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_out_min_typ = "sign_out_min_typ";
	/**
	 *  外規格下限符号.<p>
	 *
	 */
	public static final String $sign_out_min_typ_nm = "sign_out_min_typ_nm";
	/**
	 *  内規格下限値.<p>
	 *
	 */
	public static final String $qn_in_min = "qn_in_min";
	/**
	 *  内規格下限値文字列.<p>
	 *
	 */
	public static final String $s_qn_in_min = "s_qn_in_min";
	/**
	 *  内規格下限値文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qn_in_min = "s_int_qn_in_min";
	/**
	 *  内規格下限値文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_qn_in_min = "s_dec_qn_in_min";
	/**
	 *  内規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_in_min_typ = "sign_in_min_typ";
	/**
	 *  内規格下限符号.<p>
	 *
	 */
	public static final String $sign_in_min_typ_nm = "sign_in_min_typ_nm";
	/**
	 *  定量検査値.<p>
	 *
	 */
	public static final String $qn_insp_val = "qn_insp_val";
	/**
	 *  定量検査値文字列.<p>
	 *
	 */
	public static final String $s_qn_insp_val = "s_qn_insp_val";
	/**
	 *  定量検査値文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qn_insp_val = "s_int_qn_insp_val";
	/**
	 *  定量検査値文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_qn_insp_val = "s_dec_qn_insp_val";
	/**
	 *  外規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_out_max_typ = "sign_out_max_typ";
	/**
	 *  外規格上限符号.<p>
	 *
	 */
	public static final String $sign_out_max_typ_nm = "sign_out_max_typ_nm";
	/**
	 *  外規格上限値.<p>
	 *
	 */
	public static final String $qn_out_max = "qn_out_max";
	/**
	 *  外規格上限値文字列.<p>
	 *
	 */
	public static final String $s_qn_out_max = "s_qn_out_max";
	/**
	 *  外規格上限値文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qn_out_max = "s_int_qn_out_max";
	/**
	 *  外規格上限値文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_qn_out_max = "s_dec_qn_out_max";
	/**
	 *  内規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_in_max_typ = "sign_in_max_typ";
	/**
	 *  内規格上限符号.<p>
	 *
	 */
	public static final String $sign_in_max_typ_nm = "sign_in_max_typ_nm";
	/**
	 *  内規格上限値.<p>
	 *
	 */
	public static final String $qn_in_max = "qn_in_max";
	/**
	 *  内規格上限値文字列.<p>
	 *
	 */
	public static final String $s_qn_in_max = "s_qn_in_max";
	/**
	 *  内規格上限値文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qn_in_max = "s_int_qn_in_max";
	/**
	 *  内規格上限値文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_qn_in_max = "s_dec_qn_in_max";
	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public static final String $qn_int_frac = "qn_int_frac";
	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  判定結果区分.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ = "std_insp_rslt_typ";
	/**
	 *  判定結果名（検査項目）.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ_nm = "std_insp_rslt_typ_nm";
	/**
	 *  検査終了日時.<p>
	 *
	 */
	public static final String $insp_end_tm = "insp_end_tm";
	/**
	 *  検査者ＣＤ.<p>
	 *
	 */
	public static final String $insp_usr_cd = "insp_usr_cd";
	/**
	 *  検査者名.<p>
	 *
	 */
	public static final String $insp_usr_nm = "insp_usr_nm";
	/**
	 *  確認者ＣＤ.<p>
	 *
	 */
	public static final String $cnf_usr_cd = "cnf_usr_cd";
	/**
	 *  確認者名.<p>
	 *
	 */
	public static final String $cnf_usr_nm = "cnf_usr_nm";
	/**
	 *  規格検査指図予備１.<p>
	 *
	 */
	public static final String $inst_sub_char1 = "inst_sub_char1";
	/**
	 *  規格検査指図予備２.<p>
	 *
	 */
	public static final String $inst_sub_char2 = "inst_sub_char2";
	/**
	 *  規格検査指図予備３.<p>
	 *
	 */
	public static final String $inst_sub_char3 = "inst_sub_char3";
	/**
	 *  規格検査実績予備１.<p>
	 *
	 */
	public static final String $act_sub_char1 = "act_sub_char1";
	/**
	 *  規格検査実績予備２.<p>
	 *
	 */
	public static final String $act_sub_char2 = "act_sub_char2";
	/**
	 *  規格検査実績予備３.<p>
	 *
	 */
	public static final String $act_sub_char3 = "act_sub_char3";


	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta insp_qlqn_typ_nm_META = createStringMeta($insp_qlqn_typ_nm);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta insp_point_nm_META = createStringMeta($insp_point_nm);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta ql_insp_val_META = createCommonMeta($ql_insp_val, mcframe.commonMS.meta.MS_META.QL_INSP_VAL);
	public static final MCMeta qn_out_min_META = createCommonMeta($qn_out_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta s_qn_out_min_META = createStringMeta($s_qn_out_min);
	public static final MCMeta s_int_qn_out_min_META = createStringMeta($s_int_qn_out_min);
	public static final MCMeta s_dec_qn_out_min_META = createStringMeta($s_dec_qn_out_min);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_min_typ_nm_META = createStringMeta($sign_out_min_typ_nm);
	public static final MCMeta qn_in_min_META = createCommonMeta($qn_in_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta s_qn_in_min_META = createStringMeta($s_qn_in_min);
	public static final MCMeta s_int_qn_in_min_META = createStringMeta($s_int_qn_in_min);
	public static final MCMeta s_dec_qn_in_min_META = createStringMeta($s_dec_qn_in_min);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_min_typ_nm_META = createStringMeta($sign_in_min_typ_nm);
	public static final MCMeta qn_insp_val_META = createCommonMeta($qn_insp_val, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta s_qn_insp_val_META = createStringMeta($s_qn_insp_val);
	public static final MCMeta s_int_qn_insp_val_META = createStringMeta($s_int_qn_insp_val);
	public static final MCMeta s_dec_qn_insp_val_META = createStringMeta($s_dec_qn_insp_val);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_max_typ_nm_META = createStringMeta($sign_out_max_typ_nm);
	public static final MCMeta qn_out_max_META = createCommonMeta($qn_out_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta s_qn_out_max_META = createStringMeta($s_qn_out_max);
	public static final MCMeta s_int_qn_out_max_META = createStringMeta($s_int_qn_out_max);
	public static final MCMeta s_dec_qn_out_max_META = createStringMeta($s_dec_qn_out_max);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_nm_META = createStringMeta($sign_in_max_typ_nm);
	public static final MCMeta qn_in_max_META = createCommonMeta($qn_in_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta s_qn_in_max_META = createStringMeta($s_qn_in_max);
	public static final MCMeta s_int_qn_in_max_META = createStringMeta($s_int_qn_in_max);
	public static final MCMeta s_dec_qn_in_max_META = createStringMeta($s_dec_qn_in_max);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta std_insp_rslt_typ_META = createCommonMeta($std_insp_rslt_typ, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP);
	public static final MCMeta std_insp_rslt_typ_nm_META = createStringMeta($std_insp_rslt_typ_nm);
	public static final MCMeta insp_end_tm_META = createCommonMeta($insp_end_tm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_usr_cd_META = createCommonMeta($insp_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta insp_usr_nm_META = createCommonMeta($insp_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cnf_usr_cd_META = createCommonMeta($cnf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cnf_usr_nm_META = createCommonMeta($cnf_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_sub_char1_META = createCommonMeta($inst_sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR1);
	public static final MCMeta inst_sub_char2_META = createCommonMeta($inst_sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR2);
	public static final MCMeta inst_sub_char3_META = createCommonMeta($inst_sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR3);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR3);

	protected static final ConstMetaList<InspRsltDtlR> constMetas = new ConstMetaList<InspRsltDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_seq_META,
			insp_qlqn_typ_META,
			insp_qlqn_typ_nm_META,
			insp_point_cd_META,
			insp_point_nm_META,
			ql_std_val_META,
			ql_insp_val_META,
			qn_out_min_META,
			s_qn_out_min_META,
			s_int_qn_out_min_META,
			s_dec_qn_out_min_META,
			sign_out_min_typ_META,
			sign_out_min_typ_nm_META,
			qn_in_min_META,
			s_qn_in_min_META,
			s_int_qn_in_min_META,
			s_dec_qn_in_min_META,
			sign_in_min_typ_META,
			sign_in_min_typ_nm_META,
			qn_insp_val_META,
			s_qn_insp_val_META,
			s_int_qn_insp_val_META,
			s_dec_qn_insp_val_META,
			sign_out_max_typ_META,
			sign_out_max_typ_nm_META,
			qn_out_max_META,
			s_qn_out_max_META,
			s_int_qn_out_max_META,
			s_dec_qn_out_max_META,
			sign_in_max_typ_META,
			sign_in_max_typ_nm_META,
			qn_in_max_META,
			s_qn_in_max_META,
			s_int_qn_in_max_META,
			s_dec_qn_in_max_META,
			qn_int_frac_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			std_insp_rslt_typ_META,
			std_insp_rslt_typ_nm_META,
			insp_end_tm_META,
			insp_usr_cd_META,
			insp_usr_nm_META,
			cnf_usr_cd_META,
			cnf_usr_nm_META,
			inst_sub_char1_META,
			inst_sub_char2_META,
			inst_sub_char3_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected InspRsltDtlR_MC_A(ConstMetaList<? extends InspRsltDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRsltDtlR clone() {
		return (InspRsltDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRsltDtlR createInstance() {
		return (InspRsltDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRsltDtlR getValues(String... names) {
		return (InspRsltDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  順序.<p>
	 *
	 */
	public MCNumber insp_seq() {
		return getConstNumber(offset + 0, $insp_seq);
	}

	/**
	 *  順序.<p>
	 *
	 */
	public void insp_seq(MCNumber value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 *  順序.<p>
	 *
	 */
	public void insp_seq(int value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 *  順序.<p>
	 *
	 */
	public void insp_seq(long value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 *  順序.<p>
	 *
	 */
	public void insp_seq(float value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 *  順序.<p>
	 *
	 */
	public void insp_seq(double value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}


	/**
	 *  定性定量区分.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 1, $insp_qlqn_typ);
	}

	/**
	 *  定性定量区分.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 1, $insp_qlqn_typ, value);
	}


	/**
	 *  定性定量区分名.<p>
	 *
	 */
	public String insp_qlqn_typ_nm() {
		return getConstString(offset + 2, $insp_qlqn_typ_nm);
	}

	/**
	 *  定性定量区分名.<p>
	 *
	 */
	public void insp_qlqn_typ_nm(String value) {
		setConstString(offset + 2, $insp_qlqn_typ_nm, value);
	}


	/**
	 *  検査項目ＣＤ.<p>
	 *
	 */
	public String insp_point_cd() {
		return getConstString(offset + 3, $insp_point_cd);
	}

	/**
	 *  検査項目ＣＤ.<p>
	 *
	 */
	public void insp_point_cd(String value) {
		setConstString(offset + 3, $insp_point_cd, value);
	}


	/**
	 *  検査項目名.<p>
	 *
	 */
	public String insp_point_nm() {
		return getConstString(offset + 4, $insp_point_nm);
	}

	/**
	 *  検査項目名.<p>
	 *
	 */
	public void insp_point_nm(String value) {
		setConstString(offset + 4, $insp_point_nm, value);
	}


	/**
	 *  定性規格値.<p>
	 *
	 */
	public String ql_std_val() {
		return getConstString(offset + 5, $ql_std_val);
	}

	/**
	 *  定性規格値.<p>
	 *
	 */
	public void ql_std_val(String value) {
		setConstString(offset + 5, $ql_std_val, value);
	}


	/**
	 *  定性検査値.<p>
	 *
	 */
	public String ql_insp_val() {
		return getConstString(offset + 6, $ql_insp_val);
	}

	/**
	 *  定性検査値.<p>
	 *
	 */
	public void ql_insp_val(String value) {
		setConstString(offset + 6, $ql_insp_val, value);
	}


	/**
	 *  外規格下限値.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return getConstNumber(offset + 7, $qn_out_min);
	}

	/**
	 *  外規格下限値.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}

	/**
	 *  外規格下限値.<p>
	 *
	 */
	public void qn_out_min(int value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}

	/**
	 *  外規格下限値.<p>
	 *
	 */
	public void qn_out_min(long value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}

	/**
	 *  外規格下限値.<p>
	 *
	 */
	public void qn_out_min(float value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}

	/**
	 *  外規格下限値.<p>
	 *
	 */
	public void qn_out_min(double value) {
		setConstNumber(offset + 7, $qn_out_min, value);
	}


	/**
	 *  外規格下限値文字列.<p>
	 *
	 */
	public String s_qn_out_min() {
		return getConstString(offset + 8, $s_qn_out_min);
	}

	/**
	 *  外規格下限値文字列.<p>
	 *
	 */
	public void s_qn_out_min(String value) {
		setConstString(offset + 8, $s_qn_out_min, value);
	}


	/**
	 *  外規格下限値文字列（整数部）.<p>
	 *
	 */
	public String s_int_qn_out_min() {
		return getConstString(offset + 9, $s_int_qn_out_min);
	}

	/**
	 *  外規格下限値文字列（整数部）.<p>
	 *
	 */
	public void s_int_qn_out_min(String value) {
		setConstString(offset + 9, $s_int_qn_out_min, value);
	}


	/**
	 *  外規格下限値文字列（小数部）.<p>
	 *
	 */
	public String s_dec_qn_out_min() {
		return getConstString(offset + 10, $s_dec_qn_out_min);
	}

	/**
	 *  外規格下限値文字列（小数部）.<p>
	 *
	 */
	public void s_dec_qn_out_min(String value) {
		setConstString(offset + 10, $s_dec_qn_out_min, value);
	}


	/**
	 *  外規格下限符号区分.<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 11, $sign_out_min_typ);
	}

	/**
	 *  外規格下限符号区分.<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 11, $sign_out_min_typ, value);
	}


	/**
	 *  外規格下限符号.<p>
	 *
	 */
	public String sign_out_min_typ_nm() {
		return getConstString(offset + 12, $sign_out_min_typ_nm);
	}

	/**
	 *  外規格下限符号.<p>
	 *
	 */
	public void sign_out_min_typ_nm(String value) {
		setConstString(offset + 12, $sign_out_min_typ_nm, value);
	}


	/**
	 *  内規格下限値.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return getConstNumber(offset + 13, $qn_in_min);
	}

	/**
	 *  内規格下限値.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		setConstNumber(offset + 13, $qn_in_min, value);
	}

	/**
	 *  内規格下限値.<p>
	 *
	 */
	public void qn_in_min(int value) {
		setConstNumber(offset + 13, $qn_in_min, value);
	}

	/**
	 *  内規格下限値.<p>
	 *
	 */
	public void qn_in_min(long value) {
		setConstNumber(offset + 13, $qn_in_min, value);
	}

	/**
	 *  内規格下限値.<p>
	 *
	 */
	public void qn_in_min(float value) {
		setConstNumber(offset + 13, $qn_in_min, value);
	}

	/**
	 *  内規格下限値.<p>
	 *
	 */
	public void qn_in_min(double value) {
		setConstNumber(offset + 13, $qn_in_min, value);
	}


	/**
	 *  内規格下限値文字列.<p>
	 *
	 */
	public String s_qn_in_min() {
		return getConstString(offset + 14, $s_qn_in_min);
	}

	/**
	 *  内規格下限値文字列.<p>
	 *
	 */
	public void s_qn_in_min(String value) {
		setConstString(offset + 14, $s_qn_in_min, value);
	}


	/**
	 *  内規格下限値文字列（整数部）.<p>
	 *
	 */
	public String s_int_qn_in_min() {
		return getConstString(offset + 15, $s_int_qn_in_min);
	}

	/**
	 *  内規格下限値文字列（整数部）.<p>
	 *
	 */
	public void s_int_qn_in_min(String value) {
		setConstString(offset + 15, $s_int_qn_in_min, value);
	}


	/**
	 *  内規格下限値文字列（小数部）.<p>
	 *
	 */
	public String s_dec_qn_in_min() {
		return getConstString(offset + 16, $s_dec_qn_in_min);
	}

	/**
	 *  内規格下限値文字列（小数部）.<p>
	 *
	 */
	public void s_dec_qn_in_min(String value) {
		setConstString(offset + 16, $s_dec_qn_in_min, value);
	}


	/**
	 *  内規格下限符号区分.<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 17, $sign_in_min_typ);
	}

	/**
	 *  内規格下限符号区分.<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 17, $sign_in_min_typ, value);
	}


	/**
	 *  内規格下限符号.<p>
	 *
	 */
	public String sign_in_min_typ_nm() {
		return getConstString(offset + 18, $sign_in_min_typ_nm);
	}

	/**
	 *  内規格下限符号.<p>
	 *
	 */
	public void sign_in_min_typ_nm(String value) {
		setConstString(offset + 18, $sign_in_min_typ_nm, value);
	}


	/**
	 *  定量検査値.<p>
	 *
	 */
	public MCNumber qn_insp_val() {
		return getConstNumber(offset + 19, $qn_insp_val);
	}

	/**
	 *  定量検査値.<p>
	 *
	 */
	public void qn_insp_val(MCNumber value) {
		setConstNumber(offset + 19, $qn_insp_val, value);
	}

	/**
	 *  定量検査値.<p>
	 *
	 */
	public void qn_insp_val(int value) {
		setConstNumber(offset + 19, $qn_insp_val, value);
	}

	/**
	 *  定量検査値.<p>
	 *
	 */
	public void qn_insp_val(long value) {
		setConstNumber(offset + 19, $qn_insp_val, value);
	}

	/**
	 *  定量検査値.<p>
	 *
	 */
	public void qn_insp_val(float value) {
		setConstNumber(offset + 19, $qn_insp_val, value);
	}

	/**
	 *  定量検査値.<p>
	 *
	 */
	public void qn_insp_val(double value) {
		setConstNumber(offset + 19, $qn_insp_val, value);
	}


	/**
	 *  定量検査値文字列.<p>
	 *
	 */
	public String s_qn_insp_val() {
		return getConstString(offset + 20, $s_qn_insp_val);
	}

	/**
	 *  定量検査値文字列.<p>
	 *
	 */
	public void s_qn_insp_val(String value) {
		setConstString(offset + 20, $s_qn_insp_val, value);
	}


	/**
	 *  定量検査値文字列（整数部）.<p>
	 *
	 */
	public String s_int_qn_insp_val() {
		return getConstString(offset + 21, $s_int_qn_insp_val);
	}

	/**
	 *  定量検査値文字列（整数部）.<p>
	 *
	 */
	public void s_int_qn_insp_val(String value) {
		setConstString(offset + 21, $s_int_qn_insp_val, value);
	}


	/**
	 *  定量検査値文字列（小数部）.<p>
	 *
	 */
	public String s_dec_qn_insp_val() {
		return getConstString(offset + 22, $s_dec_qn_insp_val);
	}

	/**
	 *  定量検査値文字列（小数部）.<p>
	 *
	 */
	public void s_dec_qn_insp_val(String value) {
		setConstString(offset + 22, $s_dec_qn_insp_val, value);
	}


	/**
	 *  外規格上限符号区分.<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 23, $sign_out_max_typ);
	}

	/**
	 *  外規格上限符号区分.<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 23, $sign_out_max_typ, value);
	}


	/**
	 *  外規格上限符号.<p>
	 *
	 */
	public String sign_out_max_typ_nm() {
		return getConstString(offset + 24, $sign_out_max_typ_nm);
	}

	/**
	 *  外規格上限符号.<p>
	 *
	 */
	public void sign_out_max_typ_nm(String value) {
		setConstString(offset + 24, $sign_out_max_typ_nm, value);
	}


	/**
	 *  外規格上限値.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return getConstNumber(offset + 25, $qn_out_max);
	}

	/**
	 *  外規格上限値.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		setConstNumber(offset + 25, $qn_out_max, value);
	}

	/**
	 *  外規格上限値.<p>
	 *
	 */
	public void qn_out_max(int value) {
		setConstNumber(offset + 25, $qn_out_max, value);
	}

	/**
	 *  外規格上限値.<p>
	 *
	 */
	public void qn_out_max(long value) {
		setConstNumber(offset + 25, $qn_out_max, value);
	}

	/**
	 *  外規格上限値.<p>
	 *
	 */
	public void qn_out_max(float value) {
		setConstNumber(offset + 25, $qn_out_max, value);
	}

	/**
	 *  外規格上限値.<p>
	 *
	 */
	public void qn_out_max(double value) {
		setConstNumber(offset + 25, $qn_out_max, value);
	}


	/**
	 *  外規格上限値文字列.<p>
	 *
	 */
	public String s_qn_out_max() {
		return getConstString(offset + 26, $s_qn_out_max);
	}

	/**
	 *  外規格上限値文字列.<p>
	 *
	 */
	public void s_qn_out_max(String value) {
		setConstString(offset + 26, $s_qn_out_max, value);
	}


	/**
	 *  外規格上限値文字列（整数部）.<p>
	 *
	 */
	public String s_int_qn_out_max() {
		return getConstString(offset + 27, $s_int_qn_out_max);
	}

	/**
	 *  外規格上限値文字列（整数部）.<p>
	 *
	 */
	public void s_int_qn_out_max(String value) {
		setConstString(offset + 27, $s_int_qn_out_max, value);
	}


	/**
	 *  外規格上限値文字列（小数部）.<p>
	 *
	 */
	public String s_dec_qn_out_max() {
		return getConstString(offset + 28, $s_dec_qn_out_max);
	}

	/**
	 *  外規格上限値文字列（小数部）.<p>
	 *
	 */
	public void s_dec_qn_out_max(String value) {
		setConstString(offset + 28, $s_dec_qn_out_max, value);
	}


	/**
	 *  内規格上限符号区分.<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 29, $sign_in_max_typ);
	}

	/**
	 *  内規格上限符号区分.<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 29, $sign_in_max_typ, value);
	}


	/**
	 *  内規格上限符号.<p>
	 *
	 */
	public String sign_in_max_typ_nm() {
		return getConstString(offset + 30, $sign_in_max_typ_nm);
	}

	/**
	 *  内規格上限符号.<p>
	 *
	 */
	public void sign_in_max_typ_nm(String value) {
		setConstString(offset + 30, $sign_in_max_typ_nm, value);
	}


	/**
	 *  内規格上限値.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return getConstNumber(offset + 31, $qn_in_max);
	}

	/**
	 *  内規格上限値.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		setConstNumber(offset + 31, $qn_in_max, value);
	}

	/**
	 *  内規格上限値.<p>
	 *
	 */
	public void qn_in_max(int value) {
		setConstNumber(offset + 31, $qn_in_max, value);
	}

	/**
	 *  内規格上限値.<p>
	 *
	 */
	public void qn_in_max(long value) {
		setConstNumber(offset + 31, $qn_in_max, value);
	}

	/**
	 *  内規格上限値.<p>
	 *
	 */
	public void qn_in_max(float value) {
		setConstNumber(offset + 31, $qn_in_max, value);
	}

	/**
	 *  内規格上限値.<p>
	 *
	 */
	public void qn_in_max(double value) {
		setConstNumber(offset + 31, $qn_in_max, value);
	}


	/**
	 *  内規格上限値文字列.<p>
	 *
	 */
	public String s_qn_in_max() {
		return getConstString(offset + 32, $s_qn_in_max);
	}

	/**
	 *  内規格上限値文字列.<p>
	 *
	 */
	public void s_qn_in_max(String value) {
		setConstString(offset + 32, $s_qn_in_max, value);
	}


	/**
	 *  内規格上限値文字列（整数部）.<p>
	 *
	 */
	public String s_int_qn_in_max() {
		return getConstString(offset + 33, $s_int_qn_in_max);
	}

	/**
	 *  内規格上限値文字列（整数部）.<p>
	 *
	 */
	public void s_int_qn_in_max(String value) {
		setConstString(offset + 33, $s_int_qn_in_max, value);
	}


	/**
	 *  内規格上限値文字列（小数部）.<p>
	 *
	 */
	public String s_dec_qn_in_max() {
		return getConstString(offset + 34, $s_dec_qn_in_max);
	}

	/**
	 *  内規格上限値文字列（小数部）.<p>
	 *
	 */
	public void s_dec_qn_in_max(String value) {
		setConstString(offset + 34, $s_dec_qn_in_max, value);
	}


	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 35, $qn_int_frac);
	}

	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 35, $qn_int_frac, value);
	}

	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 35, $qn_int_frac, value);
	}

	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 35, $qn_int_frac, value);
	}

	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 35, $qn_int_frac, value);
	}

	/**
	 *  定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 35, $qn_int_frac, value);
	}


	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 36, $trd_unit_cd);
	}

	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 36, $trd_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 37, $trd_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 37, $trd_unit_nm, value);
	}


	/**
	 *  判定結果区分.<p>
	 *
	 */
	public String std_insp_rslt_typ() {
		return getConstString(offset + 38, $std_insp_rslt_typ);
	}

	/**
	 *  判定結果区分.<p>
	 *
	 */
	public void std_insp_rslt_typ(String value) {
		setConstString(offset + 38, $std_insp_rslt_typ, value);
	}


	/**
	 *  判定結果名（検査項目）.<p>
	 *
	 */
	public String std_insp_rslt_typ_nm() {
		return getConstString(offset + 39, $std_insp_rslt_typ_nm);
	}

	/**
	 *  判定結果名（検査項目）.<p>
	 *
	 */
	public void std_insp_rslt_typ_nm(String value) {
		setConstString(offset + 39, $std_insp_rslt_typ_nm, value);
	}


	/**
	 *  検査終了日時.<p>
	 *
	 */
	public MCDate insp_end_tm() {
		return getConstDate(offset + 40, $insp_end_tm);
	}

	/**
	 *  検査終了日時.<p>
	 *
	 */
	public void insp_end_tm(MCDate value) {
		setConstDate(offset + 40, $insp_end_tm, value);
	}


	/**
	 *  検査者ＣＤ.<p>
	 *
	 */
	public String insp_usr_cd() {
		return getConstString(offset + 41, $insp_usr_cd);
	}

	/**
	 *  検査者ＣＤ.<p>
	 *
	 */
	public void insp_usr_cd(String value) {
		setConstString(offset + 41, $insp_usr_cd, value);
	}


	/**
	 *  検査者名.<p>
	 *
	 */
	public String insp_usr_nm() {
		return getConstString(offset + 42, $insp_usr_nm);
	}

	/**
	 *  検査者名.<p>
	 *
	 */
	public void insp_usr_nm(String value) {
		setConstString(offset + 42, $insp_usr_nm, value);
	}


	/**
	 *  確認者ＣＤ.<p>
	 *
	 */
	public String cnf_usr_cd() {
		return getConstString(offset + 43, $cnf_usr_cd);
	}

	/**
	 *  確認者ＣＤ.<p>
	 *
	 */
	public void cnf_usr_cd(String value) {
		setConstString(offset + 43, $cnf_usr_cd, value);
	}


	/**
	 *  確認者名.<p>
	 *
	 */
	public String cnf_usr_nm() {
		return getConstString(offset + 44, $cnf_usr_nm);
	}

	/**
	 *  確認者名.<p>
	 *
	 */
	public void cnf_usr_nm(String value) {
		setConstString(offset + 44, $cnf_usr_nm, value);
	}


	/**
	 *  規格検査指図予備１.<p>
	 *
	 */
	public String inst_sub_char1() {
		return getConstString(offset + 45, $inst_sub_char1);
	}

	/**
	 *  規格検査指図予備１.<p>
	 *
	 */
	public void inst_sub_char1(String value) {
		setConstString(offset + 45, $inst_sub_char1, value);
	}


	/**
	 *  規格検査指図予備２.<p>
	 *
	 */
	public String inst_sub_char2() {
		return getConstString(offset + 46, $inst_sub_char2);
	}

	/**
	 *  規格検査指図予備２.<p>
	 *
	 */
	public void inst_sub_char2(String value) {
		setConstString(offset + 46, $inst_sub_char2, value);
	}


	/**
	 *  規格検査指図予備３.<p>
	 *
	 */
	public String inst_sub_char3() {
		return getConstString(offset + 47, $inst_sub_char3);
	}

	/**
	 *  規格検査指図予備３.<p>
	 *
	 */
	public void inst_sub_char3(String value) {
		setConstString(offset + 47, $inst_sub_char3, value);
	}


	/**
	 *  規格検査実績予備１.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 48, $act_sub_char1);
	}

	/**
	 *  規格検査実績予備１.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 48, $act_sub_char1, value);
	}


	/**
	 *  規格検査実績予備２.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 49, $act_sub_char2);
	}

	/**
	 *  規格検査実績予備２.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 49, $act_sub_char2, value);
	}


	/**
	 *  規格検査実績予備３.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 50, $act_sub_char3);
	}

	/**
	 *  規格検査実績予備３.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 50, $act_sub_char3, value);
	}


	public String getString(String name) {
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			return insp_qlqn_typ_nm();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($s_qn_out_min.equalsIgnoreCase(name)) {
			return s_qn_out_min();
		}
		if ($s_int_qn_out_min.equalsIgnoreCase(name)) {
			return s_int_qn_out_min();
		}
		if ($s_dec_qn_out_min.equalsIgnoreCase(name)) {
			return s_dec_qn_out_min();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_min_typ_nm();
		}
		if ($s_qn_in_min.equalsIgnoreCase(name)) {
			return s_qn_in_min();
		}
		if ($s_int_qn_in_min.equalsIgnoreCase(name)) {
			return s_int_qn_in_min();
		}
		if ($s_dec_qn_in_min.equalsIgnoreCase(name)) {
			return s_dec_qn_in_min();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_min_typ_nm();
		}
		if ($s_qn_insp_val.equalsIgnoreCase(name)) {
			return s_qn_insp_val();
		}
		if ($s_int_qn_insp_val.equalsIgnoreCase(name)) {
			return s_int_qn_insp_val();
		}
		if ($s_dec_qn_insp_val.equalsIgnoreCase(name)) {
			return s_dec_qn_insp_val();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_max_typ_nm();
		}
		if ($s_qn_out_max.equalsIgnoreCase(name)) {
			return s_qn_out_max();
		}
		if ($s_int_qn_out_max.equalsIgnoreCase(name)) {
			return s_int_qn_out_max();
		}
		if ($s_dec_qn_out_max.equalsIgnoreCase(name)) {
			return s_dec_qn_out_max();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_max_typ_nm();
		}
		if ($s_qn_in_max.equalsIgnoreCase(name)) {
			return s_qn_in_max();
		}
		if ($s_int_qn_in_max.equalsIgnoreCase(name)) {
			return s_int_qn_in_max();
		}
		if ($s_dec_qn_in_max.equalsIgnoreCase(name)) {
			return s_dec_qn_in_max();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ_nm();
		}
		if ($insp_usr_cd.equalsIgnoreCase(name)) {
			return insp_usr_cd();
		}
		if ($insp_usr_nm.equalsIgnoreCase(name)) {
			return insp_usr_nm();
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			return cnf_usr_cd();
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			return cnf_usr_nm();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			return insp_end_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			return insp_qlqn_typ_nm();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($s_qn_out_min.equalsIgnoreCase(name)) {
			return s_qn_out_min();
		}
		if ($s_int_qn_out_min.equalsIgnoreCase(name)) {
			return s_int_qn_out_min();
		}
		if ($s_dec_qn_out_min.equalsIgnoreCase(name)) {
			return s_dec_qn_out_min();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_min_typ_nm();
		}
		if ($s_qn_in_min.equalsIgnoreCase(name)) {
			return s_qn_in_min();
		}
		if ($s_int_qn_in_min.equalsIgnoreCase(name)) {
			return s_int_qn_in_min();
		}
		if ($s_dec_qn_in_min.equalsIgnoreCase(name)) {
			return s_dec_qn_in_min();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_min_typ_nm();
		}
		if ($s_qn_insp_val.equalsIgnoreCase(name)) {
			return s_qn_insp_val();
		}
		if ($s_int_qn_insp_val.equalsIgnoreCase(name)) {
			return s_int_qn_insp_val();
		}
		if ($s_dec_qn_insp_val.equalsIgnoreCase(name)) {
			return s_dec_qn_insp_val();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_max_typ_nm();
		}
		if ($s_qn_out_max.equalsIgnoreCase(name)) {
			return s_qn_out_max();
		}
		if ($s_int_qn_out_max.equalsIgnoreCase(name)) {
			return s_int_qn_out_max();
		}
		if ($s_dec_qn_out_max.equalsIgnoreCase(name)) {
			return s_dec_qn_out_max();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_max_typ_nm();
		}
		if ($s_qn_in_max.equalsIgnoreCase(name)) {
			return s_qn_in_max();
		}
		if ($s_int_qn_in_max.equalsIgnoreCase(name)) {
			return s_int_qn_in_max();
		}
		if ($s_dec_qn_in_max.equalsIgnoreCase(name)) {
			return s_dec_qn_in_max();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ_nm();
		}
		if ($insp_usr_cd.equalsIgnoreCase(name)) {
			return insp_usr_cd();
		}
		if ($insp_usr_nm.equalsIgnoreCase(name)) {
			return insp_usr_nm();
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			return cnf_usr_cd();
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			return cnf_usr_nm();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			return insp_end_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			insp_qlqn_typ_nm(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($s_qn_out_min.equalsIgnoreCase(name)) {
			s_qn_out_min(value);
			return;
		}
		if ($s_int_qn_out_min.equalsIgnoreCase(name)) {
			s_int_qn_out_min(value);
			return;
		}
		if ($s_dec_qn_out_min.equalsIgnoreCase(name)) {
			s_dec_qn_out_min(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			sign_out_min_typ_nm(value);
			return;
		}
		if ($s_qn_in_min.equalsIgnoreCase(name)) {
			s_qn_in_min(value);
			return;
		}
		if ($s_int_qn_in_min.equalsIgnoreCase(name)) {
			s_int_qn_in_min(value);
			return;
		}
		if ($s_dec_qn_in_min.equalsIgnoreCase(name)) {
			s_dec_qn_in_min(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			sign_in_min_typ_nm(value);
			return;
		}
		if ($s_qn_insp_val.equalsIgnoreCase(name)) {
			s_qn_insp_val(value);
			return;
		}
		if ($s_int_qn_insp_val.equalsIgnoreCase(name)) {
			s_int_qn_insp_val(value);
			return;
		}
		if ($s_dec_qn_insp_val.equalsIgnoreCase(name)) {
			s_dec_qn_insp_val(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			sign_out_max_typ_nm(value);
			return;
		}
		if ($s_qn_out_max.equalsIgnoreCase(name)) {
			s_qn_out_max(value);
			return;
		}
		if ($s_int_qn_out_max.equalsIgnoreCase(name)) {
			s_int_qn_out_max(value);
			return;
		}
		if ($s_dec_qn_out_max.equalsIgnoreCase(name)) {
			s_dec_qn_out_max(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			sign_in_max_typ_nm(value);
			return;
		}
		if ($s_qn_in_max.equalsIgnoreCase(name)) {
			s_qn_in_max(value);
			return;
		}
		if ($s_int_qn_in_max.equalsIgnoreCase(name)) {
			s_int_qn_in_max(value);
			return;
		}
		if ($s_dec_qn_in_max.equalsIgnoreCase(name)) {
			s_dec_qn_in_max(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			std_insp_rslt_typ_nm(value);
			return;
		}
		if ($insp_usr_cd.equalsIgnoreCase(name)) {
			insp_usr_cd(value);
			return;
		}
		if ($insp_usr_nm.equalsIgnoreCase(name)) {
			insp_usr_nm(value);
			return;
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			cnf_usr_cd(value);
			return;
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			cnf_usr_nm(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			insp_end_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			insp_qlqn_typ_nm(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($s_qn_out_min.equalsIgnoreCase(name)) {
			s_qn_out_min(value);
			return;
		}
		if ($s_int_qn_out_min.equalsIgnoreCase(name)) {
			s_int_qn_out_min(value);
			return;
		}
		if ($s_dec_qn_out_min.equalsIgnoreCase(name)) {
			s_dec_qn_out_min(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			sign_out_min_typ_nm(value);
			return;
		}
		if ($s_qn_in_min.equalsIgnoreCase(name)) {
			s_qn_in_min(value);
			return;
		}
		if ($s_int_qn_in_min.equalsIgnoreCase(name)) {
			s_int_qn_in_min(value);
			return;
		}
		if ($s_dec_qn_in_min.equalsIgnoreCase(name)) {
			s_dec_qn_in_min(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			sign_in_min_typ_nm(value);
			return;
		}
		if ($s_qn_insp_val.equalsIgnoreCase(name)) {
			s_qn_insp_val(value);
			return;
		}
		if ($s_int_qn_insp_val.equalsIgnoreCase(name)) {
			s_int_qn_insp_val(value);
			return;
		}
		if ($s_dec_qn_insp_val.equalsIgnoreCase(name)) {
			s_dec_qn_insp_val(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			sign_out_max_typ_nm(value);
			return;
		}
		if ($s_qn_out_max.equalsIgnoreCase(name)) {
			s_qn_out_max(value);
			return;
		}
		if ($s_int_qn_out_max.equalsIgnoreCase(name)) {
			s_int_qn_out_max(value);
			return;
		}
		if ($s_dec_qn_out_max.equalsIgnoreCase(name)) {
			s_dec_qn_out_max(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			sign_in_max_typ_nm(value);
			return;
		}
		if ($s_qn_in_max.equalsIgnoreCase(name)) {
			s_qn_in_max(value);
			return;
		}
		if ($s_int_qn_in_max.equalsIgnoreCase(name)) {
			s_int_qn_in_max(value);
			return;
		}
		if ($s_dec_qn_in_max.equalsIgnoreCase(name)) {
			s_dec_qn_in_max(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			std_insp_rslt_typ_nm(value);
			return;
		}
		if ($insp_usr_cd.equalsIgnoreCase(name)) {
			insp_usr_cd(value);
			return;
		}
		if ($insp_usr_nm.equalsIgnoreCase(name)) {
			insp_usr_nm(value);
			return;
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			cnf_usr_cd(value);
			return;
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			cnf_usr_nm(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($insp_end_tm.equalsIgnoreCase(name)) {
			insp_end_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

