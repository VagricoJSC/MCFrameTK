package mcframe.commonMSBE.MSBER0110;

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
 * ブロック"ShipInstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipInstHdrR_MC_A extends MCConstRow {

	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	/**
	 *  出荷作業ＣＤ（データ）.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 *  出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 *  納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 *  指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 *  出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 *  出荷条件ＣＤ（データ）.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 *  出荷指図日.<p>
	 *
	 */
	public static final String $ship_inst_dt = "ship_inst_dt";
	/**
	 *  出荷指図Ｎｏ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 *  インボイスＮｏ（ラベル）.<p>
	 *
	 */
	public static final String $iv_no_lbl = "iv_no_lbl";
	/**
	 *  インボイスＮｏ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 *  送付先（送付先名）.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 *  送付先別名１.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm1 = "ship_to_id_alt_nm1";
	/**
	 *  送付先別名２.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm2 = "ship_to_id_alt_nm2";
	/**
	 *  送付先別名３.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm3 = "ship_to_id_alt_nm3";
	/**
	 *  送付先別名４.<p>
	 *
	 */
	public static final String $ship_to_id_alt_nm4 = "ship_to_id_alt_nm4";
	/**
	 *  送付先（送付先）（データ）.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 *  住所（送付先郵便番号）.<p>
	 *
	 */
	public static final String $ship_to_zip_cd = "ship_to_zip_cd";
	/**
	 *  住所（送付先住所１）.<p>
	 *
	 */
	public static final String $ship_to_addr1 = "ship_to_addr1";
	/**
	 *  住所（送付先住所２）.<p>
	 *
	 */
	public static final String $ship_to_addr2 = "ship_to_addr2";
	/**
	 *  住所（送付先住所３）.<p>
	 *
	 */
	public static final String $ship_to_addr3 = "ship_to_addr3";
	/**
	 *  住所（送付先住所４）.<p>
	 *
	 */
	public static final String $ship_to_addr4 = "ship_to_addr4";
	/**
	 *  住所１-４（データ）.<p>
	 *
	 */
	public static final String $ship_to_addr = "ship_to_addr";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $ship_to_tel = "ship_to_tel";
	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public static final String $ship_to_fax = "ship_to_fax";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 *  重量.<p>
	 *
	 */
	public static final String $sum_ship_wt = "sum_ship_wt";
	/**
	 *  重量（文字列）.<p>
	 *
	 */
	public static final String $s_sum_ship_wt = "s_sum_ship_wt";
	/**
	 *  容積.<p>
	 *
	 */
	public static final String $sum_ship_dim = "sum_ship_dim";
	/**
	 *  容積（文字列）.<p>
	 *
	 */
	public static final String $s_sum_ship_dim = "s_sum_ship_dim";
	/**
	 *  伝票枚数.<p>
	 *
	 */
	public static final String $dlv_slip_num = "dlv_slip_num";
	/**
	 *  伝票枚数（文字列）.<p>
	 *
	 */
	public static final String $s_dlv_slip_num = "s_dlv_slip_num";


	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_inst_dt_META = createCommonMeta($ship_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta iv_no_lbl_META = createStringMeta($iv_no_lbl);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_id_alt_nm1_META = createCommonMeta($ship_to_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta ship_to_id_alt_nm2_META = createCommonMeta($ship_to_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta ship_to_id_alt_nm3_META = createCommonMeta($ship_to_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta ship_to_id_alt_nm4_META = createCommonMeta($ship_to_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_zip_cd_META = createCommonMeta($ship_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ship_to_addr1_META = createCommonMeta($ship_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr2_META = createCommonMeta($ship_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr3_META = createCommonMeta($ship_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr4_META = createCommonMeta($ship_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr_META = createStringMeta($ship_to_addr);
	public static final MCMeta ship_to_tel_META = createCommonMeta($ship_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_fax_META = createCommonMeta($ship_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR3);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_RMRKS);
	public static final MCMeta sum_ship_wt_META = createCommonMeta($sum_ship_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_sum_ship_wt_META = createStringMeta($s_sum_ship_wt);
	public static final MCMeta sum_ship_dim_META = createCommonMeta($sum_ship_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta s_sum_ship_dim_META = createStringMeta($s_sum_ship_dim);
	public static final MCMeta dlv_slip_num_META = createCommonMeta($dlv_slip_num, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta s_dlv_slip_num_META = createStringMeta($s_dlv_slip_num);

	protected static final ConstMetaList<ShipInstHdrR> constMetas = new ConstMetaList<ShipInstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_tm_META,
			ship_wk_nm_META,
			ship_wk_cd_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			ship_term_nm_META,
			ship_term_cd_META,
			ship_inst_dt_META,
			ship_inst_no_META,
			iv_no_lbl_META,
			iv_no_META,
			ship_to_id_nm_META,
			ship_to_id_alt_nm1_META,
			ship_to_id_alt_nm2_META,
			ship_to_id_alt_nm3_META,
			ship_to_id_alt_nm4_META,
			ship_to_id_cd_META,
			ship_to_zip_cd_META,
			ship_to_addr1_META,
			ship_to_addr2_META,
			ship_to_addr3_META,
			ship_to_addr4_META,
			ship_to_addr_META,
			ship_to_tel_META,
			ship_to_fax_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			inst_rmrks_META,
			sum_ship_wt_META,
			s_sum_ship_wt_META,
			sum_ship_dim_META,
			s_sum_ship_dim_META,
			dlv_slip_num_META,
			s_dlv_slip_num_META
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
	protected ShipInstHdrR_MC_A(ConstMetaList<? extends ShipInstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipInstHdrR clone() {
		return (ShipInstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipInstHdrR createInstance() {
		return (ShipInstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipInstHdrR getValues(String... names) {
		return (ShipInstHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 0, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 0, $prnt_tm, value);
	}


	/**
	 *  出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 1, $ship_wk_nm);
	}

	/**
	 *  出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 1, $ship_wk_nm, value);
	}


	/**
	 *  出荷作業ＣＤ（データ）.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 2, $ship_wk_cd);
	}

	/**
	 *  出荷作業ＣＤ（データ）.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 2, $ship_wk_cd, value);
	}


	/**
	 *  出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 3, $ship_schd_tm);
	}

	/**
	 *  出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 3, $ship_schd_tm, value);
	}


	/**
	 *  納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 4, $dlv_schd_tm);
	}

	/**
	 *  納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 4, $dlv_schd_tm, value);
	}


	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 5, $inst_dpt_cd);
	}

	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 5, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 6, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 6, $inst_dpt_nm, value);
	}


	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 7, $inst_usr_cd);
	}

	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 7, $inst_usr_cd, value);
	}


	/**
	 *  指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 8, $inst_usr_nm);
	}

	/**
	 *  指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 8, $inst_usr_nm, value);
	}


	/**
	 *  出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 9, $ship_term_nm);
	}

	/**
	 *  出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 9, $ship_term_nm, value);
	}


	/**
	 *  出荷条件ＣＤ（データ）.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 10, $ship_term_cd);
	}

	/**
	 *  出荷条件ＣＤ（データ）.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 10, $ship_term_cd, value);
	}


	/**
	 *  出荷指図日.<p>
	 *
	 */
	public MCDate ship_inst_dt() {
		return getConstDate(offset + 11, $ship_inst_dt);
	}

	/**
	 *  出荷指図日.<p>
	 *
	 */
	public void ship_inst_dt(MCDate value) {
		setConstDate(offset + 11, $ship_inst_dt, value);
	}


	/**
	 *  出荷指図Ｎｏ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 12, $ship_inst_no);
	}

	/**
	 *  出荷指図Ｎｏ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 12, $ship_inst_no, value);
	}


	/**
	 *  インボイスＮｏ（ラベル）.<p>
	 *
	 */
	public String iv_no_lbl() {
		return getConstString(offset + 13, $iv_no_lbl);
	}

	/**
	 *  インボイスＮｏ（ラベル）.<p>
	 *
	 */
	public void iv_no_lbl(String value) {
		setConstString(offset + 13, $iv_no_lbl, value);
	}


	/**
	 *  インボイスＮｏ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 14, $iv_no);
	}

	/**
	 *  インボイスＮｏ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 14, $iv_no, value);
	}


	/**
	 *  送付先（送付先名）.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 15, $ship_to_id_nm);
	}

	/**
	 *  送付先（送付先名）.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 15, $ship_to_id_nm, value);
	}


	/**
	 *  送付先別名１.<p>
	 *
	 */
	public String ship_to_id_alt_nm1() {
		return getConstString(offset + 16, $ship_to_id_alt_nm1);
	}

	/**
	 *  送付先別名１.<p>
	 *
	 */
	public void ship_to_id_alt_nm1(String value) {
		setConstString(offset + 16, $ship_to_id_alt_nm1, value);
	}


	/**
	 *  送付先別名２.<p>
	 *
	 */
	public String ship_to_id_alt_nm2() {
		return getConstString(offset + 17, $ship_to_id_alt_nm2);
	}

	/**
	 *  送付先別名２.<p>
	 *
	 */
	public void ship_to_id_alt_nm2(String value) {
		setConstString(offset + 17, $ship_to_id_alt_nm2, value);
	}


	/**
	 *  送付先別名３.<p>
	 *
	 */
	public String ship_to_id_alt_nm3() {
		return getConstString(offset + 18, $ship_to_id_alt_nm3);
	}

	/**
	 *  送付先別名３.<p>
	 *
	 */
	public void ship_to_id_alt_nm3(String value) {
		setConstString(offset + 18, $ship_to_id_alt_nm3, value);
	}


	/**
	 *  送付先別名４.<p>
	 *
	 */
	public String ship_to_id_alt_nm4() {
		return getConstString(offset + 19, $ship_to_id_alt_nm4);
	}

	/**
	 *  送付先別名４.<p>
	 *
	 */
	public void ship_to_id_alt_nm4(String value) {
		setConstString(offset + 19, $ship_to_id_alt_nm4, value);
	}


	/**
	 *  送付先（送付先）（データ）.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 20, $ship_to_id_cd);
	}

	/**
	 *  送付先（送付先）（データ）.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 20, $ship_to_id_cd, value);
	}


	/**
	 *  住所（送付先郵便番号）.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 21, $ship_to_zip_cd);
	}

	/**
	 *  住所（送付先郵便番号）.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 21, $ship_to_zip_cd, value);
	}


	/**
	 *  住所（送付先住所１）.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 22, $ship_to_addr1);
	}

	/**
	 *  住所（送付先住所１）.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 22, $ship_to_addr1, value);
	}


	/**
	 *  住所（送付先住所２）.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 23, $ship_to_addr2);
	}

	/**
	 *  住所（送付先住所２）.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 23, $ship_to_addr2, value);
	}


	/**
	 *  住所（送付先住所３）.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 24, $ship_to_addr3);
	}

	/**
	 *  住所（送付先住所３）.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 24, $ship_to_addr3, value);
	}


	/**
	 *  住所（送付先住所４）.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 25, $ship_to_addr4);
	}

	/**
	 *  住所（送付先住所４）.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 25, $ship_to_addr4, value);
	}


	/**
	 *  住所１-４（データ）.<p>
	 *
	 */
	public String ship_to_addr() {
		return getConstString(offset + 26, $ship_to_addr);
	}

	/**
	 *  住所１-４（データ）.<p>
	 *
	 */
	public void ship_to_addr(String value) {
		setConstString(offset + 26, $ship_to_addr, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 27, $ship_to_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 27, $ship_to_tel, value);
	}


	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 28, $ship_to_fax);
	}

	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 28, $ship_to_fax, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 29, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 29, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 30, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 30, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 31, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 31, $sub_char3, value);
	}


	/**
	 *  指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 32, $inst_rmrks);
	}

	/**
	 *  指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 32, $inst_rmrks, value);
	}


	/**
	 *  重量.<p>
	 *
	 */
	public MCNumber sum_ship_wt() {
		return getConstNumber(offset + 33, $sum_ship_wt);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void sum_ship_wt(MCNumber value) {
		setConstNumber(offset + 33, $sum_ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void sum_ship_wt(int value) {
		setConstNumber(offset + 33, $sum_ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void sum_ship_wt(long value) {
		setConstNumber(offset + 33, $sum_ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void sum_ship_wt(float value) {
		setConstNumber(offset + 33, $sum_ship_wt, value);
	}

	/**
	 *  重量.<p>
	 *
	 */
	public void sum_ship_wt(double value) {
		setConstNumber(offset + 33, $sum_ship_wt, value);
	}


	/**
	 *  重量（文字列）.<p>
	 *
	 */
	public String s_sum_ship_wt() {
		return getConstString(offset + 34, $s_sum_ship_wt);
	}

	/**
	 *  重量（文字列）.<p>
	 *
	 */
	public void s_sum_ship_wt(String value) {
		setConstString(offset + 34, $s_sum_ship_wt, value);
	}


	/**
	 *  容積.<p>
	 *
	 */
	public MCNumber sum_ship_dim() {
		return getConstNumber(offset + 35, $sum_ship_dim);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void sum_ship_dim(MCNumber value) {
		setConstNumber(offset + 35, $sum_ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void sum_ship_dim(int value) {
		setConstNumber(offset + 35, $sum_ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void sum_ship_dim(long value) {
		setConstNumber(offset + 35, $sum_ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void sum_ship_dim(float value) {
		setConstNumber(offset + 35, $sum_ship_dim, value);
	}

	/**
	 *  容積.<p>
	 *
	 */
	public void sum_ship_dim(double value) {
		setConstNumber(offset + 35, $sum_ship_dim, value);
	}


	/**
	 *  容積（文字列）.<p>
	 *
	 */
	public String s_sum_ship_dim() {
		return getConstString(offset + 36, $s_sum_ship_dim);
	}

	/**
	 *  容積（文字列）.<p>
	 *
	 */
	public void s_sum_ship_dim(String value) {
		setConstString(offset + 36, $s_sum_ship_dim, value);
	}


	/**
	 *  伝票枚数.<p>
	 *
	 */
	public MCNumber dlv_slip_num() {
		return getConstNumber(offset + 37, $dlv_slip_num);
	}

	/**
	 *  伝票枚数.<p>
	 *
	 */
	public void dlv_slip_num(MCNumber value) {
		setConstNumber(offset + 37, $dlv_slip_num, value);
	}

	/**
	 *  伝票枚数.<p>
	 *
	 */
	public void dlv_slip_num(int value) {
		setConstNumber(offset + 37, $dlv_slip_num, value);
	}

	/**
	 *  伝票枚数.<p>
	 *
	 */
	public void dlv_slip_num(long value) {
		setConstNumber(offset + 37, $dlv_slip_num, value);
	}

	/**
	 *  伝票枚数.<p>
	 *
	 */
	public void dlv_slip_num(float value) {
		setConstNumber(offset + 37, $dlv_slip_num, value);
	}

	/**
	 *  伝票枚数.<p>
	 *
	 */
	public void dlv_slip_num(double value) {
		setConstNumber(offset + 37, $dlv_slip_num, value);
	}


	/**
	 *  伝票枚数（文字列）.<p>
	 *
	 */
	public String s_dlv_slip_num() {
		return getConstString(offset + 38, $s_dlv_slip_num);
	}

	/**
	 *  伝票枚数（文字列）.<p>
	 *
	 */
	public void s_dlv_slip_num(String value) {
		setConstString(offset + 38, $s_dlv_slip_num, value);
	}


	public String getString(String name) {
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no_lbl.equalsIgnoreCase(name)) {
			return iv_no_lbl();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			return ship_to_addr();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($s_sum_ship_wt.equalsIgnoreCase(name)) {
			return s_sum_ship_wt();
		}
		if ($s_sum_ship_dim.equalsIgnoreCase(name)) {
			return s_sum_ship_dim();
		}
		if ($s_dlv_slip_num.equalsIgnoreCase(name)) {
			return s_dlv_slip_num();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			return sum_ship_wt();
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			return sum_ship_dim();
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			return dlv_slip_num();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_inst_dt.equalsIgnoreCase(name)) {
			return ship_inst_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no_lbl.equalsIgnoreCase(name)) {
			return iv_no_lbl();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm1();
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm2();
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm3();
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_to_id_alt_nm4();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			return ship_to_addr();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($s_sum_ship_wt.equalsIgnoreCase(name)) {
			return s_sum_ship_wt();
		}
		if ($s_sum_ship_dim.equalsIgnoreCase(name)) {
			return s_sum_ship_dim();
		}
		if ($s_dlv_slip_num.equalsIgnoreCase(name)) {
			return s_dlv_slip_num();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			return sum_ship_wt();
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			return sum_ship_dim();
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			return dlv_slip_num();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_inst_dt.equalsIgnoreCase(name)) {
			return ship_inst_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no_lbl.equalsIgnoreCase(name)) {
			iv_no_lbl(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			ship_to_addr(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($s_sum_ship_wt.equalsIgnoreCase(name)) {
			s_sum_ship_wt(value);
			return;
		}
		if ($s_sum_ship_dim.equalsIgnoreCase(name)) {
			s_sum_ship_dim(value);
			return;
		}
		if ($s_dlv_slip_num.equalsIgnoreCase(name)) {
			s_dlv_slip_num(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($ship_inst_dt.equalsIgnoreCase(name)) {
			ship_inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no_lbl.equalsIgnoreCase(name)) {
			iv_no_lbl(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm1(value);
			return;
		}
		if ($ship_to_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm2(value);
			return;
		}
		if ($ship_to_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm3(value);
			return;
		}
		if ($ship_to_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_to_id_alt_nm4(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_addr.equalsIgnoreCase(name)) {
			ship_to_addr(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($s_sum_ship_wt.equalsIgnoreCase(name)) {
			s_sum_ship_wt(value);
			return;
		}
		if ($s_sum_ship_dim.equalsIgnoreCase(name)) {
			s_sum_ship_dim(value);
			return;
		}
		if ($s_dlv_slip_num.equalsIgnoreCase(name)) {
			s_dlv_slip_num(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sum_ship_wt.equalsIgnoreCase(name)) {
			sum_ship_wt(value);
			return;
		}
		if ($sum_ship_dim.equalsIgnoreCase(name)) {
			sum_ship_dim(value);
			return;
		}
		if ($dlv_slip_num.equalsIgnoreCase(name)) {
			dlv_slip_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($ship_inst_dt.equalsIgnoreCase(name)) {
			ship_inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

