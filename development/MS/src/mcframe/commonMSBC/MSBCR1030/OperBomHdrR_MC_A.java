package mcframe.commonMSBC.MSBCR1030;

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
 * ブロック"OperBomHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OperBomHdrR_MC_A extends MCConstRow {

	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 *  工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 *  帳票名.<p>
	 *
	 */
	public static final String $form_name = "form_name";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  製造品目.<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $prod_itm_sub1_view = "prod_itm_sub1_view";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $prod_itm_sub2_view = "prod_itm_sub2_view";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $prod_itm_sub3_view = "prod_itm_sub3_view";
	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public static final String $prod_itm_sub1_data = "prod_itm_sub1_data";
	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public static final String $prod_itm_sub2_data = "prod_itm_sub2_data";
	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public static final String $prod_itm_sub3_data = "prod_itm_sub3_data";
	/**
	 *  製造品名.<p>
	 *
	 */
	public static final String $prod_itm_nm = "prod_itm_nm";
	/**
	 *  製造品目別名１.<p>
	 *
	 */
	public static final String $prod_itm_alt_nm1 = "prod_itm_alt_nm1";
	/**
	 *  製造品目別名２.<p>
	 *
	 */
	public static final String $prod_itm_alt_nm2 = "prod_itm_alt_nm2";
	/**
	 *  製造品目別名３.<p>
	 *
	 */
	public static final String $prod_itm_alt_nm3 = "prod_itm_alt_nm3";
	/**
	 *  製造品目別名４.<p>
	 *
	 */
	public static final String $prod_itm_alt_nm4 = "prod_itm_alt_nm4";
	/**
	 *  構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 *  製造場所.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 *  製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 *  製造棚・ライン.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 *  製造棚・ライン名.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	/**
	 *  区分（工程指図）.<p>
	 *
	 */
	public static final String $oper_inst_typ = "oper_inst_typ";
	/**
	 *  工程.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 *  工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 *  工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 *  工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public static final String $old_mfg_inst_rev_no = "old_mfg_inst_rev_no";
	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public static final String $new_mfg_inst_rev_no = "new_mfg_inst_rev_no";
	/**
	 *  変更前指図書発行日時.<p>
	 *
	 */
	public static final String $old_inst_prnt_tm = "old_inst_prnt_tm";
	/**
	 *  変更後指図書発行日時.<p>
	 *
	 */
	public static final String $new_inst_prnt_tm = "new_inst_prnt_tm";
	/**
	 *  再展開履歴変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 *  工程指図担当者.<p>
	 *
	 */
	public static final String $oper_inst_usr_cd = "oper_inst_usr_cd";
	/**
	 *  工程指図担当者名.<p>
	 *
	 */
	public static final String $oper_inst_usr_nm = "oper_inst_usr_nm";
	/**
	 *  指図部門.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";


	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta form_name_META = createStringMeta($form_name);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_view_META = createCommonMeta($prod_itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_view_META = createCommonMeta($prod_itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_view_META = createCommonMeta($prod_itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_itm_sub1_data_META = createCommonMeta($prod_itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_data_META = createCommonMeta($prod_itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_data_META = createCommonMeta($prod_itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_itm_nm_META = createCommonMeta($prod_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta prod_itm_alt_nm1_META = createCommonMeta($prod_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta prod_itm_alt_nm2_META = createCommonMeta($prod_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta prod_itm_alt_nm3_META = createCommonMeta($prod_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta prod_itm_alt_nm4_META = createCommonMeta($prod_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_inst_typ_META = createStringMeta($oper_inst_typ);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta old_mfg_inst_rev_no_META = createCommonMeta($old_mfg_inst_rev_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta new_mfg_inst_rev_no_META = createCommonMeta($new_mfg_inst_rev_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta old_inst_prnt_tm_META = createCommonMeta($old_inst_prnt_tm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta new_inst_prnt_tm_META = createCommonMeta($new_inst_prnt_tm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CNG_NO);
	public static final MCMeta oper_inst_usr_cd_META = createCommonMeta($oper_inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta oper_inst_usr_nm_META = createCommonMeta($oper_inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);

	protected static final ConstMetaList<OperBomHdrR> constMetas = new ConstMetaList<OperBomHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_inst_no_META,
			oper_inst_no_META,
			form_name_META,
			prnt_tm_META,
			prod_itm_cd_META,
			prod_itm_sub1_view_META,
			prod_itm_sub2_view_META,
			prod_itm_sub3_view_META,
			prod_itm_sub1_data_META,
			prod_itm_sub2_data_META,
			prod_itm_sub3_data_META,
			prod_itm_nm_META,
			prod_itm_alt_nm1_META,
			prod_itm_alt_nm2_META,
			prod_itm_alt_nm3_META,
			prod_itm_alt_nm4_META,
			bom_ptn_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			oper_inst_typ_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			old_mfg_inst_rev_no_META,
			new_mfg_inst_rev_no_META,
			old_inst_prnt_tm_META,
			new_inst_prnt_tm_META,
			chng_no_META,
			oper_inst_usr_cd_META,
			oper_inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META
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
	protected OperBomHdrR_MC_A(ConstMetaList<? extends OperBomHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomHdrR clone() {
		return (OperBomHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomHdrR createInstance() {
		return (OperBomHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomHdrR getValues(String... names) {
		return (OperBomHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 0, $mfg_inst_no);
	}

	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 0, $mfg_inst_no, value);
	}


	/**
	 *  工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 1, $oper_inst_no);
	}

	/**
	 *  工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 1, $oper_inst_no, value);
	}


	/**
	 *  帳票名.<p>
	 *
	 */
	public String form_name() {
		return getConstString(offset + 2, $form_name);
	}

	/**
	 *  帳票名.<p>
	 *
	 */
	public void form_name(String value) {
		setConstString(offset + 2, $form_name, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 3, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 3, $prnt_tm, value);
	}


	/**
	 *  製造品目.<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 4, $prod_itm_cd);
	}

	/**
	 *  製造品目.<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 4, $prod_itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String prod_itm_sub1_view() {
		return getConstString(offset + 5, $prod_itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void prod_itm_sub1_view(String value) {
		setConstString(offset + 5, $prod_itm_sub1_view, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String prod_itm_sub2_view() {
		return getConstString(offset + 6, $prod_itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void prod_itm_sub2_view(String value) {
		setConstString(offset + 6, $prod_itm_sub2_view, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String prod_itm_sub3_view() {
		return getConstString(offset + 7, $prod_itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void prod_itm_sub3_view(String value) {
		setConstString(offset + 7, $prod_itm_sub3_view, value);
	}


	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public String prod_itm_sub1_data() {
		return getConstString(offset + 8, $prod_itm_sub1_data);
	}

	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public void prod_itm_sub1_data(String value) {
		setConstString(offset + 8, $prod_itm_sub1_data, value);
	}


	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public String prod_itm_sub2_data() {
		return getConstString(offset + 9, $prod_itm_sub2_data);
	}

	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public void prod_itm_sub2_data(String value) {
		setConstString(offset + 9, $prod_itm_sub2_data, value);
	}


	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public String prod_itm_sub3_data() {
		return getConstString(offset + 10, $prod_itm_sub3_data);
	}

	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public void prod_itm_sub3_data(String value) {
		setConstString(offset + 10, $prod_itm_sub3_data, value);
	}


	/**
	 *  製造品名.<p>
	 *
	 */
	public String prod_itm_nm() {
		return getConstString(offset + 11, $prod_itm_nm);
	}

	/**
	 *  製造品名.<p>
	 *
	 */
	public void prod_itm_nm(String value) {
		setConstString(offset + 11, $prod_itm_nm, value);
	}


	/**
	 *  製造品目別名１.<p>
	 *
	 */
	public String prod_itm_alt_nm1() {
		return getConstString(offset + 12, $prod_itm_alt_nm1);
	}

	/**
	 *  製造品目別名１.<p>
	 *
	 */
	public void prod_itm_alt_nm1(String value) {
		setConstString(offset + 12, $prod_itm_alt_nm1, value);
	}


	/**
	 *  製造品目別名２.<p>
	 *
	 */
	public String prod_itm_alt_nm2() {
		return getConstString(offset + 13, $prod_itm_alt_nm2);
	}

	/**
	 *  製造品目別名２.<p>
	 *
	 */
	public void prod_itm_alt_nm2(String value) {
		setConstString(offset + 13, $prod_itm_alt_nm2, value);
	}


	/**
	 *  製造品目別名３.<p>
	 *
	 */
	public String prod_itm_alt_nm3() {
		return getConstString(offset + 14, $prod_itm_alt_nm3);
	}

	/**
	 *  製造品目別名３.<p>
	 *
	 */
	public void prod_itm_alt_nm3(String value) {
		setConstString(offset + 14, $prod_itm_alt_nm3, value);
	}


	/**
	 *  製造品目別名４.<p>
	 *
	 */
	public String prod_itm_alt_nm4() {
		return getConstString(offset + 15, $prod_itm_alt_nm4);
	}

	/**
	 *  製造品目別名４.<p>
	 *
	 */
	public void prod_itm_alt_nm4(String value) {
		setConstString(offset + 15, $prod_itm_alt_nm4, value);
	}


	/**
	 *  構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 16, $bom_ptn);
	}

	/**
	 *  構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 16, $bom_ptn, value);
	}


	/**
	 *  製造場所.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 17, $mfg_loc_cd);
	}

	/**
	 *  製造場所.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 17, $mfg_loc_cd, value);
	}


	/**
	 *  製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 18, $mfg_loc_nm);
	}

	/**
	 *  製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 18, $mfg_loc_nm, value);
	}


	/**
	 *  製造棚・ライン.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 19, $mfg_str_ln_cd);
	}

	/**
	 *  製造棚・ライン.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 19, $mfg_str_ln_cd, value);
	}


	/**
	 *  製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 20, $mfg_str_ln_nm);
	}

	/**
	 *  製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 20, $mfg_str_ln_nm, value);
	}


	/**
	 *  区分（工程指図）.<p>
	 *
	 */
	public String oper_inst_typ() {
		return getConstString(offset + 21, $oper_inst_typ);
	}

	/**
	 *  区分（工程指図）.<p>
	 *
	 */
	public void oper_inst_typ(String value) {
		setConstString(offset + 21, $oper_inst_typ, value);
	}


	/**
	 *  工程.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 22, $oper_cd);
	}

	/**
	 *  工程.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 22, $oper_cd, value);
	}


	/**
	 *  工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 23, $oper_nm);
	}

	/**
	 *  工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 23, $oper_nm, value);
	}


	/**
	 *  工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 24, $oper_seq);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 24, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 24, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 24, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 24, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 24, $oper_seq, value);
	}


	/**
	 *  工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 25, $disp_seq);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 25, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 25, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 25, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 25, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 25, $disp_seq, value);
	}


	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public MCNumber old_mfg_inst_rev_no() {
		return getConstNumber(offset + 26, $old_mfg_inst_rev_no);
	}

	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public void old_mfg_inst_rev_no(MCNumber value) {
		setConstNumber(offset + 26, $old_mfg_inst_rev_no, value);
	}

	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public void old_mfg_inst_rev_no(int value) {
		setConstNumber(offset + 26, $old_mfg_inst_rev_no, value);
	}

	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public void old_mfg_inst_rev_no(long value) {
		setConstNumber(offset + 26, $old_mfg_inst_rev_no, value);
	}

	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public void old_mfg_inst_rev_no(float value) {
		setConstNumber(offset + 26, $old_mfg_inst_rev_no, value);
	}

	/**
	 *  変更前リビジョンＮＯ.<p>
	 *
	 */
	public void old_mfg_inst_rev_no(double value) {
		setConstNumber(offset + 26, $old_mfg_inst_rev_no, value);
	}


	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public MCNumber new_mfg_inst_rev_no() {
		return getConstNumber(offset + 27, $new_mfg_inst_rev_no);
	}

	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public void new_mfg_inst_rev_no(MCNumber value) {
		setConstNumber(offset + 27, $new_mfg_inst_rev_no, value);
	}

	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public void new_mfg_inst_rev_no(int value) {
		setConstNumber(offset + 27, $new_mfg_inst_rev_no, value);
	}

	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public void new_mfg_inst_rev_no(long value) {
		setConstNumber(offset + 27, $new_mfg_inst_rev_no, value);
	}

	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public void new_mfg_inst_rev_no(float value) {
		setConstNumber(offset + 27, $new_mfg_inst_rev_no, value);
	}

	/**
	 *  変更後リビジョンＮＯ.<p>
	 *
	 */
	public void new_mfg_inst_rev_no(double value) {
		setConstNumber(offset + 27, $new_mfg_inst_rev_no, value);
	}


	/**
	 *  変更前指図書発行日時.<p>
	 *
	 */
	public MCDate old_inst_prnt_tm() {
		return getConstDate(offset + 28, $old_inst_prnt_tm);
	}

	/**
	 *  変更前指図書発行日時.<p>
	 *
	 */
	public void old_inst_prnt_tm(MCDate value) {
		setConstDate(offset + 28, $old_inst_prnt_tm, value);
	}


	/**
	 *  変更後指図書発行日時.<p>
	 *
	 */
	public MCDate new_inst_prnt_tm() {
		return getConstDate(offset + 29, $new_inst_prnt_tm);
	}

	/**
	 *  変更後指図書発行日時.<p>
	 *
	 */
	public void new_inst_prnt_tm(MCDate value) {
		setConstDate(offset + 29, $new_inst_prnt_tm, value);
	}


	/**
	 *  再展開履歴変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 30, $chng_no);
	}

	/**
	 *  再展開履歴変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 30, $chng_no, value);
	}


	/**
	 *  工程指図担当者.<p>
	 *
	 */
	public String oper_inst_usr_cd() {
		return getConstString(offset + 31, $oper_inst_usr_cd);
	}

	/**
	 *  工程指図担当者.<p>
	 *
	 */
	public void oper_inst_usr_cd(String value) {
		setConstString(offset + 31, $oper_inst_usr_cd, value);
	}


	/**
	 *  工程指図担当者名.<p>
	 *
	 */
	public String oper_inst_usr_nm() {
		return getConstString(offset + 32, $oper_inst_usr_nm);
	}

	/**
	 *  工程指図担当者名.<p>
	 *
	 */
	public void oper_inst_usr_nm(String value) {
		setConstString(offset + 32, $oper_inst_usr_nm, value);
	}


	/**
	 *  指図部門.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 33, $inst_dpt_cd);
	}

	/**
	 *  指図部門.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 33, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 34, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 34, $inst_dpt_nm, value);
	}


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1_view.equalsIgnoreCase(name)) {
			return prod_itm_sub1_view();
		}
		if ($prod_itm_sub2_view.equalsIgnoreCase(name)) {
			return prod_itm_sub2_view();
		}
		if ($prod_itm_sub3_view.equalsIgnoreCase(name)) {
			return prod_itm_sub3_view();
		}
		if ($prod_itm_sub1_data.equalsIgnoreCase(name)) {
			return prod_itm_sub1_data();
		}
		if ($prod_itm_sub2_data.equalsIgnoreCase(name)) {
			return prod_itm_sub2_data();
		}
		if ($prod_itm_sub3_data.equalsIgnoreCase(name)) {
			return prod_itm_sub3_data();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($prod_itm_alt_nm1.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm1();
		}
		if ($prod_itm_alt_nm2.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm2();
		}
		if ($prod_itm_alt_nm3.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm3();
		}
		if ($prod_itm_alt_nm4.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm4();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($oper_inst_typ.equalsIgnoreCase(name)) {
			return oper_inst_typ();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			return oper_inst_usr_cd();
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			return oper_inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return old_mfg_inst_rev_no();
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return new_mfg_inst_rev_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($old_inst_prnt_tm.equalsIgnoreCase(name)) {
			return old_inst_prnt_tm();
		}
		if ($new_inst_prnt_tm.equalsIgnoreCase(name)) {
			return new_inst_prnt_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1_view.equalsIgnoreCase(name)) {
			return prod_itm_sub1_view();
		}
		if ($prod_itm_sub2_view.equalsIgnoreCase(name)) {
			return prod_itm_sub2_view();
		}
		if ($prod_itm_sub3_view.equalsIgnoreCase(name)) {
			return prod_itm_sub3_view();
		}
		if ($prod_itm_sub1_data.equalsIgnoreCase(name)) {
			return prod_itm_sub1_data();
		}
		if ($prod_itm_sub2_data.equalsIgnoreCase(name)) {
			return prod_itm_sub2_data();
		}
		if ($prod_itm_sub3_data.equalsIgnoreCase(name)) {
			return prod_itm_sub3_data();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($prod_itm_alt_nm1.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm1();
		}
		if ($prod_itm_alt_nm2.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm2();
		}
		if ($prod_itm_alt_nm3.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm3();
		}
		if ($prod_itm_alt_nm4.equalsIgnoreCase(name)) {
			return prod_itm_alt_nm4();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($oper_inst_typ.equalsIgnoreCase(name)) {
			return oper_inst_typ();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			return oper_inst_usr_cd();
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			return oper_inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return old_mfg_inst_rev_no();
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return new_mfg_inst_rev_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($old_inst_prnt_tm.equalsIgnoreCase(name)) {
			return old_inst_prnt_tm();
		}
		if ($new_inst_prnt_tm.equalsIgnoreCase(name)) {
			return new_inst_prnt_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1_view.equalsIgnoreCase(name)) {
			prod_itm_sub1_view(value);
			return;
		}
		if ($prod_itm_sub2_view.equalsIgnoreCase(name)) {
			prod_itm_sub2_view(value);
			return;
		}
		if ($prod_itm_sub3_view.equalsIgnoreCase(name)) {
			prod_itm_sub3_view(value);
			return;
		}
		if ($prod_itm_sub1_data.equalsIgnoreCase(name)) {
			prod_itm_sub1_data(value);
			return;
		}
		if ($prod_itm_sub2_data.equalsIgnoreCase(name)) {
			prod_itm_sub2_data(value);
			return;
		}
		if ($prod_itm_sub3_data.equalsIgnoreCase(name)) {
			prod_itm_sub3_data(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($prod_itm_alt_nm1.equalsIgnoreCase(name)) {
			prod_itm_alt_nm1(value);
			return;
		}
		if ($prod_itm_alt_nm2.equalsIgnoreCase(name)) {
			prod_itm_alt_nm2(value);
			return;
		}
		if ($prod_itm_alt_nm3.equalsIgnoreCase(name)) {
			prod_itm_alt_nm3(value);
			return;
		}
		if ($prod_itm_alt_nm4.equalsIgnoreCase(name)) {
			prod_itm_alt_nm4(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($oper_inst_typ.equalsIgnoreCase(name)) {
			oper_inst_typ(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			oper_inst_usr_cd(value);
			return;
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			oper_inst_usr_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($old_inst_prnt_tm.equalsIgnoreCase(name)) {
			old_inst_prnt_tm(value);
			return;
		}
		if ($new_inst_prnt_tm.equalsIgnoreCase(name)) {
			new_inst_prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1_view.equalsIgnoreCase(name)) {
			prod_itm_sub1_view(value);
			return;
		}
		if ($prod_itm_sub2_view.equalsIgnoreCase(name)) {
			prod_itm_sub2_view(value);
			return;
		}
		if ($prod_itm_sub3_view.equalsIgnoreCase(name)) {
			prod_itm_sub3_view(value);
			return;
		}
		if ($prod_itm_sub1_data.equalsIgnoreCase(name)) {
			prod_itm_sub1_data(value);
			return;
		}
		if ($prod_itm_sub2_data.equalsIgnoreCase(name)) {
			prod_itm_sub2_data(value);
			return;
		}
		if ($prod_itm_sub3_data.equalsIgnoreCase(name)) {
			prod_itm_sub3_data(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($prod_itm_alt_nm1.equalsIgnoreCase(name)) {
			prod_itm_alt_nm1(value);
			return;
		}
		if ($prod_itm_alt_nm2.equalsIgnoreCase(name)) {
			prod_itm_alt_nm2(value);
			return;
		}
		if ($prod_itm_alt_nm3.equalsIgnoreCase(name)) {
			prod_itm_alt_nm3(value);
			return;
		}
		if ($prod_itm_alt_nm4.equalsIgnoreCase(name)) {
			prod_itm_alt_nm4(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($oper_inst_typ.equalsIgnoreCase(name)) {
			oper_inst_typ(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			oper_inst_usr_cd(value);
			return;
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			oper_inst_usr_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($old_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			old_mfg_inst_rev_no(value);
			return;
		}
		if ($new_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			new_mfg_inst_rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($old_inst_prnt_tm.equalsIgnoreCase(name)) {
			old_inst_prnt_tm(value);
			return;
		}
		if ($new_inst_prnt_tm.equalsIgnoreCase(name)) {
			new_inst_prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

