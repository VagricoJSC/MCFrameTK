package mcframe.commonMSBF.MSBFR0020;

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
 * ブロック"InspLstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspLstDtlR_MC_A extends MCConstRow {

	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public static final String $insp_lst_no = "insp_lst_no";
	/**
	 *  指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 *  検査回数.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	/**
	 *  品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  指図数.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  指図数文字列.<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
	/**
	 *  指図数文字列(整数部).<p>
	 *
	 */
	public static final String $s_int_base_unit_qty = "s_int_base_unit_qty";
	/**
	 *  指図数文字列(小数部).<p>
	 *
	 */
	public static final String $s_dec_base_unit_qty = "s_dec_base_unit_qty";
	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 *  検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 *  検査種類区分名.<p>
	 *
	 */
	public static final String $insp_typ_nm = "insp_typ_nm";
	/**
	 *  検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 *  検査方法.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 *  検査方法名.<p>
	 *
	 */
	public static final String $insp_mtd_typ_nm = "insp_mtd_typ_nm";
	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	/**
	 *  承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 *  承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
	/**
	 *  開始予定日時.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	/**
	 *  終了予定日時.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	/**
	 *  規格入力必須ＦＬＧ.<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	/**
	 *  確認必須ＦＬＧ.<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	/**
	 *  規格入力必須ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $s_std_req_flg = "s_std_req_flg";
	/**
	 *  確認必須ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $s_std_cnf_req_flg = "s_std_cnf_req_flg";
	/**
	 *  抜取指図数.<p>
	 *
	 */
	public static final String $smpl_inst_qty = "smpl_inst_qty";
	/**
	 *  抜取指図数(整数部).<p>
	 *
	 */
	public static final String $int_smpl_inst_qty = "int_smpl_inst_qty";
	/**
	 *  抜取指図数(小数部).<p>
	 *
	 */
	public static final String $dec_smpl_inst_qty = "dec_smpl_inst_qty";
	/**
	 *  抜取指図単位名.<p>
	 *
	 */
	public static final String $smpl_inst_base_unit_nm = "smpl_inst_base_unit_nm";
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


	public static final MCMeta insp_lst_no_META = createCommonMeta($insp_lst_no, mcframe.commonMA.meta.MA_META.INSP_LST_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta s_int_base_unit_qty_META = createStringMeta($s_int_base_unit_qty);
	public static final MCMeta s_dec_base_unit_qty_META = createStringMeta($s_dec_base_unit_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_typ_nm_META = createCommonMeta($insp_typ_nm, mcframe.commonMS.meta.MS_META.INSP_TYP_NM);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_mtd_typ_nm_META = createCommonMeta($insp_mtd_typ_nm, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP_NM);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_std_req_flg_META = createStringMeta($s_std_req_flg);
	public static final MCMeta s_std_cnf_req_flg_META = createStringMeta($s_std_cnf_req_flg);
	public static final MCMeta smpl_inst_qty_META = createCommonMeta($smpl_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta int_smpl_inst_qty_META = createStringMeta($int_smpl_inst_qty);
	public static final MCMeta dec_smpl_inst_qty_META = createStringMeta($dec_smpl_inst_qty);
	public static final MCMeta smpl_inst_base_unit_nm_META = createCommonMeta($smpl_inst_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_INST_SUB_CHAR3);

	protected static final ConstMetaList<InspLstDtlR> constMetas = new ConstMetaList<InspLstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_lst_no_META,
			inst_dt_META,
			insp_no_META,
			insp_freq_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			lot_no_view_META,
			sublot_no_view_META,
			lot_no_data_META,
			sublot_no_data_META,
			bp_lot_no_META,
			ver_no_lbl_META,
			ver_no_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			s_int_base_unit_qty_META,
			s_dec_base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			insp_typ_META,
			insp_typ_nm_META,
			insp_ptn_nm_META,
			insp_mtd_typ_META,
			insp_mtd_typ_nm_META,
			insp_std_no_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			st_tm_META,
			end_tm_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			s_std_req_flg_META,
			s_std_cnf_req_flg_META,
			smpl_inst_qty_META,
			int_smpl_inst_qty_META,
			dec_smpl_inst_qty_META,
			smpl_inst_base_unit_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
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
	protected InspLstDtlR_MC_A(ConstMetaList<? extends InspLstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspLstDtlR clone() {
		return (InspLstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspLstDtlR createInstance() {
		return (InspLstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspLstDtlR getValues(String... names) {
		return (InspLstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public String insp_lst_no() {
		return getConstString(offset + 0, $insp_lst_no);
	}

	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public void insp_lst_no(String value) {
		setConstString(offset + 0, $insp_lst_no, value);
	}


	/**
	 *  指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 1, $inst_dt);
	}

	/**
	 *  指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 1, $inst_dt, value);
	}


	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 2, $insp_no);
	}

	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 2, $insp_no, value);
	}


	/**
	 *  検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 3, $insp_freq);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 3, $insp_freq, value);
	}


	/**
	 *  品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 *  品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 5, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 5, $itm_sub1_view, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 6, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 6, $itm_sub2_view, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 7, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 7, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 8, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 8, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 9, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 9, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 10, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 10, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 11, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 11, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 12, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 12, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 13, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 13, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 14, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 14, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 15, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 15, $itm_alt_nm4, value);
	}


	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 16, $lot_no_view);
	}

	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 16, $lot_no_view, value);
	}


	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 17, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 17, $sublot_no_view, value);
	}


	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 18, $lot_no_data);
	}

	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 18, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 19, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 19, $sublot_no_data, value);
	}


	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 20, $bp_lot_no);
	}

	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 20, $bp_lot_no, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 21, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 21, $ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 22, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 22, $ver_no, value);
	}


	/**
	 *  指図数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 23, $base_unit_qty);
	}

	/**
	 *  指図数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 *  指図数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 *  指図数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 *  指図数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 *  指図数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}


	/**
	 *  指図数文字列.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 24, $s_base_unit_qty);
	}

	/**
	 *  指図数文字列.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 24, $s_base_unit_qty, value);
	}


	/**
	 *  指図数文字列(整数部).<p>
	 *
	 */
	public String s_int_base_unit_qty() {
		return getConstString(offset + 25, $s_int_base_unit_qty);
	}

	/**
	 *  指図数文字列(整数部).<p>
	 *
	 */
	public void s_int_base_unit_qty(String value) {
		setConstString(offset + 25, $s_int_base_unit_qty, value);
	}


	/**
	 *  指図数文字列(小数部).<p>
	 *
	 */
	public String s_dec_base_unit_qty() {
		return getConstString(offset + 26, $s_dec_base_unit_qty);
	}

	/**
	 *  指図数文字列(小数部).<p>
	 *
	 */
	public void s_dec_base_unit_qty(String value) {
		setConstString(offset + 26, $s_dec_base_unit_qty, value);
	}


	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 27, $base_unit_cd);
	}

	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 27, $base_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 28, $base_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 28, $base_unit_nm, value);
	}


	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 29, $base_unit_dec_place);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 *  基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}


	/**
	 *  検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 30, $insp_typ);
	}

	/**
	 *  検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 30, $insp_typ, value);
	}


	/**
	 *  検査種類区分名.<p>
	 *
	 */
	public String insp_typ_nm() {
		return getConstString(offset + 31, $insp_typ_nm);
	}

	/**
	 *  検査種類区分名.<p>
	 *
	 */
	public void insp_typ_nm(String value) {
		setConstString(offset + 31, $insp_typ_nm, value);
	}


	/**
	 *  検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 32, $insp_ptn_nm);
	}

	/**
	 *  検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 32, $insp_ptn_nm, value);
	}


	/**
	 *  検査方法.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 33, $insp_mtd_typ);
	}

	/**
	 *  検査方法.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 33, $insp_mtd_typ, value);
	}


	/**
	 *  検査方法名.<p>
	 *
	 */
	public String insp_mtd_typ_nm() {
		return getConstString(offset + 34, $insp_mtd_typ_nm);
	}

	/**
	 *  検査方法名.<p>
	 *
	 */
	public void insp_mtd_typ_nm(String value) {
		setConstString(offset + 34, $insp_mtd_typ_nm, value);
	}


	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 35, $insp_std_no);
	}

	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 35, $insp_std_no, value);
	}


	/**
	 *  承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 36, $insp_aprv_sts_typ);
	}

	/**
	 *  承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 36, $insp_aprv_sts_typ, value);
	}


	/**
	 *  承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 37, $insp_aprv_sts_typ_nm);
	}

	/**
	 *  承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 37, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 *  開始予定日時.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 38, $st_tm);
	}

	/**
	 *  開始予定日時.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 38, $st_tm, value);
	}


	/**
	 *  終了予定日時.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 39, $end_tm);
	}

	/**
	 *  終了予定日時.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 39, $end_tm, value);
	}


	/**
	 *  規格入力必須ＦＬＧ.<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 40, $std_req_flg);
	}

	/**
	 *  規格入力必須ＦＬＧ.<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 40, $std_req_flg, value);
	}


	/**
	 *  確認必須ＦＬＧ.<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 41, $std_cnf_req_flg);
	}

	/**
	 *  確認必須ＦＬＧ.<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 41, $std_cnf_req_flg, value);
	}


	/**
	 *  規格入力必須ＦＬＧ文字列.<p>
	 *
	 */
	public String s_std_req_flg() {
		return getConstString(offset + 42, $s_std_req_flg);
	}

	/**
	 *  規格入力必須ＦＬＧ文字列.<p>
	 *
	 */
	public void s_std_req_flg(String value) {
		setConstString(offset + 42, $s_std_req_flg, value);
	}


	/**
	 *  確認必須ＦＬＧ文字列.<p>
	 *
	 */
	public String s_std_cnf_req_flg() {
		return getConstString(offset + 43, $s_std_cnf_req_flg);
	}

	/**
	 *  確認必須ＦＬＧ文字列.<p>
	 *
	 */
	public void s_std_cnf_req_flg(String value) {
		setConstString(offset + 43, $s_std_cnf_req_flg, value);
	}


	/**
	 *  抜取指図数.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return getConstNumber(offset + 44, $smpl_inst_qty);
	}

	/**
	 *  抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		setConstNumber(offset + 44, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		setConstNumber(offset + 44, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		setConstNumber(offset + 44, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		setConstNumber(offset + 44, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		setConstNumber(offset + 44, $smpl_inst_qty, value);
	}


	/**
	 *  抜取指図数(整数部).<p>
	 *
	 */
	public String int_smpl_inst_qty() {
		return getConstString(offset + 45, $int_smpl_inst_qty);
	}

	/**
	 *  抜取指図数(整数部).<p>
	 *
	 */
	public void int_smpl_inst_qty(String value) {
		setConstString(offset + 45, $int_smpl_inst_qty, value);
	}


	/**
	 *  抜取指図数(小数部).<p>
	 *
	 */
	public String dec_smpl_inst_qty() {
		return getConstString(offset + 46, $dec_smpl_inst_qty);
	}

	/**
	 *  抜取指図数(小数部).<p>
	 *
	 */
	public void dec_smpl_inst_qty(String value) {
		setConstString(offset + 46, $dec_smpl_inst_qty, value);
	}


	/**
	 *  抜取指図単位名.<p>
	 *
	 */
	public String smpl_inst_base_unit_nm() {
		return getConstString(offset + 47, $smpl_inst_base_unit_nm);
	}

	/**
	 *  抜取指図単位名.<p>
	 *
	 */
	public void smpl_inst_base_unit_nm(String value) {
		setConstString(offset + 47, $smpl_inst_base_unit_nm, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 48, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 48, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 49, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 49, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 50, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 50, $sub_char3, value);
	}


	public String getString(String name) {
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty();
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($s_std_req_flg.equalsIgnoreCase(name)) {
			return s_std_req_flg();
		}
		if ($s_std_cnf_req_flg.equalsIgnoreCase(name)) {
			return s_std_cnf_req_flg();
		}
		if ($int_smpl_inst_qty.equalsIgnoreCase(name)) {
			return int_smpl_inst_qty();
		}
		if ($dec_smpl_inst_qty.equalsIgnoreCase(name)) {
			return dec_smpl_inst_qty();
		}
		if ($smpl_inst_base_unit_nm.equalsIgnoreCase(name)) {
			return smpl_inst_base_unit_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty();
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($s_std_req_flg.equalsIgnoreCase(name)) {
			return s_std_req_flg();
		}
		if ($s_std_cnf_req_flg.equalsIgnoreCase(name)) {
			return s_std_cnf_req_flg();
		}
		if ($int_smpl_inst_qty.equalsIgnoreCase(name)) {
			return int_smpl_inst_qty();
		}
		if ($dec_smpl_inst_qty.equalsIgnoreCase(name)) {
			return dec_smpl_inst_qty();
		}
		if ($smpl_inst_base_unit_nm.equalsIgnoreCase(name)) {
			return smpl_inst_base_unit_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_qty(value);
			return;
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($s_std_req_flg.equalsIgnoreCase(name)) {
			s_std_req_flg(value);
			return;
		}
		if ($s_std_cnf_req_flg.equalsIgnoreCase(name)) {
			s_std_cnf_req_flg(value);
			return;
		}
		if ($int_smpl_inst_qty.equalsIgnoreCase(name)) {
			int_smpl_inst_qty(value);
			return;
		}
		if ($dec_smpl_inst_qty.equalsIgnoreCase(name)) {
			dec_smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_base_unit_nm.equalsIgnoreCase(name)) {
			smpl_inst_base_unit_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_qty(value);
			return;
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($s_std_req_flg.equalsIgnoreCase(name)) {
			s_std_req_flg(value);
			return;
		}
		if ($s_std_cnf_req_flg.equalsIgnoreCase(name)) {
			s_std_cnf_req_flg(value);
			return;
		}
		if ($int_smpl_inst_qty.equalsIgnoreCase(name)) {
			int_smpl_inst_qty(value);
			return;
		}
		if ($dec_smpl_inst_qty.equalsIgnoreCase(name)) {
			dec_smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_base_unit_nm.equalsIgnoreCase(name)) {
			smpl_inst_base_unit_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

