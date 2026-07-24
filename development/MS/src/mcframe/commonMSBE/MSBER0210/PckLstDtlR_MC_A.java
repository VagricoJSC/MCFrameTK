package mcframe.commonMSBE.MSBER0210;

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
 * ブロック"PckLstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PckLstDtlR_MC_A extends MCConstRow {

	/**
	 *  （ラベル）Container No..<p>
	 *
	 */
	public static final String $t_cont_no = "t_cont_no";
	/**
	 *  （ラベル）Item Code / Description.<p>
	 *
	 */
	public static final String $t_itm_code = "t_itm_code";
	/**
	 *  （ラベル）Quantity.<p>
	 *
	 */
	public static final String $t_qty = "t_qty";
	/**
	 *  （ラベル）Net Weight.<p>
	 *
	 */
	public static final String $t_net = "t_net";
	/**
	 *  （ラベル）Gross Weight.<p>
	 *
	 */
	public static final String $t_grss = "t_grss";
	/**
	 *  （ラベル）Dimension.<p>
	 *
	 */
	public static final String $t_dim = "t_dim";
	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public static final String $cntnr_no_fr = "cntnr_no_fr";
	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public static final String $cntnr_no_to = "cntnr_no_to";
	/**
	 *  梱包番号.<p>
	 *
	 */
	public static final String $cntnr_no_fr_to = "cntnr_no_fr_to";
	/**
	 *  品目コード.<p>
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
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 *  原産地名（データ）.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  取引単位数量（文字列）.<p>
	 *
	 */
	public static final String $s_trd_unit_qty = "s_trd_unit_qty";
	/**
	 *  取引単位数量（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  取引単位数量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public static final String $wt_dec_place = "wt_dec_place";
	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public static final String $dim_dec_place = "dim_dec_place";
	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public static final String $net_wt = "net_wt";
	/**
	 *  純重量（文字列）.<p>
	 *
	 */
	public static final String $s_net_wt = "s_net_wt";
	/**
	 *  純重量（整数部）.<p>
	 *
	 */
	public static final String $s_int_net_wt = "s_int_net_wt";
	/**
	 *  純重量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_net_wt = "s_dec_net_wt";
	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public static final String $grss_wt = "grss_wt";
	/**
	 *  総重量（文字列）.<p>
	 *
	 */
	public static final String $s_grss_wt = "s_grss_wt";
	/**
	 *  総重量（整数部）.<p>
	 *
	 */
	public static final String $s_int_grss_wt = "s_int_grss_wt";
	/**
	 *  総重量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_grss_wt = "s_dec_grss_wt";
	/**
	 *  容積（データ）.<p>
	 *
	 */
	public static final String $dim = "dim";
	/**
	 *  容積（文字列）.<p>
	 *
	 */
	public static final String $s_dim = "s_dim";
	/**
	 *  容積（整数部）.<p>
	 *
	 */
	public static final String $s_int_dim = "s_int_dim";
	/**
	 *  容積（小数部）.<p>
	 *
	 */
	public static final String $s_dec_dim = "s_dec_dim";
	/**
	 *  コンテナ数.<p>
	 *
	 */
	public static final String $container = "container";
	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 *  インボイス表記用品目別名１.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm1 = "iv_itm_alt_nm1";
	/**
	 *  インボイス表記用品目別名２.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm2 = "iv_itm_alt_nm2";
	/**
	 *  インボイス表記用品目別名３.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm3 = "iv_itm_alt_nm3";
	/**
	 *  インボイス表記用品目別名４.<p>
	 *
	 */
	public static final String $iv_itm_alt_nm4 = "iv_itm_alt_nm4";
	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 *  得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $pl_d_sub_char1 = "pl_d_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $pl_d_sub_char2 = "pl_d_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $pl_d_sub_char3 = "pl_d_sub_char3";
	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public static final String $t_total = "t_total";
	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public static final String $sum_trd_unit_qty = "sum_trd_unit_qty";
	/**
	 *  取引単位数量合計（文字列）.<p>
	 *
	 */
	public static final String $s_sum_trd_unit_qty = "s_sum_trd_unit_qty";
	/**
	 *  取引単位数量合計（整数部）.<p>
	 *
	 */
	public static final String $s_int_sum_trd_unit_qty = "s_int_sum_trd_unit_qty";
	/**
	 *  取引単位数量合計（小数部）.<p>
	 *
	 */
	public static final String $s_dec_sum_trd_unit_qty = "s_dec_sum_trd_unit_qty";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $sum_trd_unit_nm = "sum_trd_unit_nm";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $sum_trd_unit_cd = "sum_trd_unit_cd";
	/**
	 *  合計純重量.<p>
	 *
	 */
	public static final String $sum_net_wt = "sum_net_wt";
	/**
	 *  合計純重量（文字列）.<p>
	 *
	 */
	public static final String $s_sum_net_wt = "s_sum_net_wt";
	/**
	 *  合計総重量.<p>
	 *
	 */
	public static final String $sum_grss_wt = "sum_grss_wt";
	/**
	 *  合計総重量（文字列）.<p>
	 *
	 */
	public static final String $s_sum_grss_wt = "s_sum_grss_wt";
	/**
	 *  合計容積.<p>
	 *
	 */
	public static final String $sum_dim = "sum_dim";
	/**
	 *  合計容積（文字列）.<p>
	 *
	 */
	public static final String $s_sum_dim = "s_sum_dim";
	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public static final String $f_cntry_org_cd = "f_cntry_org_cd";
	/**
	 *  （ラベル）: MADE IN.<p>
	 *
	 */
	public static final String $t_made_in = "t_made_in";
	/**
	 *  原産地名.<p>
	 *
	 */
	public static final String $f_cntry_org_nm = "f_cntry_org_nm";
	/**
	 *  自由入力(罫線部分).<p>
	 *
	 */
	public static final String $free = "free";


	public static final MCMeta t_cont_no_META = createStringMeta($t_cont_no);
	public static final MCMeta t_itm_code_META = createStringMeta($t_itm_code);
	public static final MCMeta t_qty_META = createStringMeta($t_qty);
	public static final MCMeta t_net_META = createStringMeta($t_net);
	public static final MCMeta t_grss_META = createStringMeta($t_grss);
	public static final MCMeta t_dim_META = createStringMeta($t_dim);
	public static final MCMeta cntnr_no_fr_META = createCommonMeta($cntnr_no_fr, mcframe.commonMS.meta.MS_META.CNTNR_NO);
	public static final MCMeta cntnr_no_to_META = createCommonMeta($cntnr_no_to, mcframe.commonMS.meta.MS_META.CNTNR_NO);
	public static final MCMeta cntnr_no_fr_to_META = createStringMeta($cntnr_no_fr_to);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_META = createStringMeta($s_trd_unit_qty);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wt_dec_place_META = createCommonMeta($wt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dim_dec_place_META = createCommonMeta($dim_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta net_wt_META = createCommonMeta($net_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_net_wt_META = createStringMeta($s_net_wt);
	public static final MCMeta s_int_net_wt_META = createStringMeta($s_int_net_wt);
	public static final MCMeta s_dec_net_wt_META = createStringMeta($s_dec_net_wt);
	public static final MCMeta grss_wt_META = createCommonMeta($grss_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_grss_wt_META = createStringMeta($s_grss_wt);
	public static final MCMeta s_int_grss_wt_META = createStringMeta($s_int_grss_wt);
	public static final MCMeta s_dec_grss_wt_META = createStringMeta($s_dec_grss_wt);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta s_dim_META = createStringMeta($s_dim);
	public static final MCMeta s_int_dim_META = createStringMeta($s_int_dim);
	public static final MCMeta s_dec_dim_META = createStringMeta($s_dec_dim);
	public static final MCMeta container_META = createStringMeta($container);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_alt_nm1_META = createCommonMeta($iv_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta iv_itm_alt_nm2_META = createCommonMeta($iv_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta iv_itm_alt_nm3_META = createCommonMeta($iv_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta iv_itm_alt_nm4_META = createCommonMeta($iv_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta pl_d_sub_char1_META = createCommonMeta($pl_d_sub_char1, mcframe.commonMS.meta.MS_META.PL_D_SUB_CHAR1);
	public static final MCMeta pl_d_sub_char2_META = createCommonMeta($pl_d_sub_char2, mcframe.commonMS.meta.MS_META.PL_D_SUB_CHAR2);
	public static final MCMeta pl_d_sub_char3_META = createCommonMeta($pl_d_sub_char3, mcframe.commonMS.meta.MS_META.PL_D_SUB_CHAR3);
	public static final MCMeta t_total_META = createStringMeta($t_total);
	public static final MCMeta sum_trd_unit_qty_META = createCommonMeta($sum_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_sum_trd_unit_qty_META = createStringMeta($s_sum_trd_unit_qty);
	public static final MCMeta s_int_sum_trd_unit_qty_META = createStringMeta($s_int_sum_trd_unit_qty);
	public static final MCMeta s_dec_sum_trd_unit_qty_META = createStringMeta($s_dec_sum_trd_unit_qty);
	public static final MCMeta sum_trd_unit_nm_META = createCommonMeta($sum_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta sum_trd_unit_cd_META = createCommonMeta($sum_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta sum_net_wt_META = createCommonMeta($sum_net_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_sum_net_wt_META = createStringMeta($s_sum_net_wt);
	public static final MCMeta sum_grss_wt_META = createCommonMeta($sum_grss_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta s_sum_grss_wt_META = createStringMeta($s_sum_grss_wt);
	public static final MCMeta sum_dim_META = createCommonMeta($sum_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta s_sum_dim_META = createStringMeta($s_sum_dim);
	public static final MCMeta f_cntry_org_cd_META = createCommonMeta($f_cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta t_made_in_META = createStringMeta($t_made_in);
	public static final MCMeta f_cntry_org_nm_META = createCommonMeta($f_cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta free_META = createStringMeta($free);

	protected static final ConstMetaList<PckLstDtlR> constMetas = new ConstMetaList<PckLstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			t_cont_no_META,
			t_itm_code_META,
			t_qty_META,
			t_net_META,
			t_grss_META,
			t_dim_META,
			cntnr_no_fr_META,
			cntnr_no_to_META,
			cntnr_no_fr_to_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			trd_unit_qty_META,
			s_trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			trd_unit_nm_META,
			trd_unit_cd_META,
			trd_unit_dec_place_META,
			wt_dec_place_META,
			dim_dec_place_META,
			net_wt_META,
			s_net_wt_META,
			s_int_net_wt_META,
			s_dec_net_wt_META,
			grss_wt_META,
			s_grss_wt_META,
			s_int_grss_wt_META,
			s_dec_grss_wt_META,
			dim_META,
			s_dim_META,
			s_int_dim_META,
			s_dec_dim_META,
			container_META,
			iv_itm_nm_META,
			iv_itm_alt_nm1_META,
			iv_itm_alt_nm2_META,
			iv_itm_alt_nm3_META,
			iv_itm_alt_nm4_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			disp_seq_META,
			pl_d_sub_char1_META,
			pl_d_sub_char2_META,
			pl_d_sub_char3_META,
			t_total_META,
			sum_trd_unit_qty_META,
			s_sum_trd_unit_qty_META,
			s_int_sum_trd_unit_qty_META,
			s_dec_sum_trd_unit_qty_META,
			sum_trd_unit_nm_META,
			sum_trd_unit_cd_META,
			sum_net_wt_META,
			s_sum_net_wt_META,
			sum_grss_wt_META,
			s_sum_grss_wt_META,
			sum_dim_META,
			s_sum_dim_META,
			f_cntry_org_cd_META,
			t_made_in_META,
			f_cntry_org_nm_META,
			free_META
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
	protected PckLstDtlR_MC_A(ConstMetaList<? extends PckLstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PckLstDtlR clone() {
		return (PckLstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PckLstDtlR createInstance() {
		return (PckLstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PckLstDtlR getValues(String... names) {
		return (PckLstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  （ラベル）Container No..<p>
	 *
	 */
	public String t_cont_no() {
		return getConstString(offset + 0, $t_cont_no);
	}

	/**
	 *  （ラベル）Container No..<p>
	 *
	 */
	public void t_cont_no(String value) {
		setConstString(offset + 0, $t_cont_no, value);
	}


	/**
	 *  （ラベル）Item Code / Description.<p>
	 *
	 */
	public String t_itm_code() {
		return getConstString(offset + 1, $t_itm_code);
	}

	/**
	 *  （ラベル）Item Code / Description.<p>
	 *
	 */
	public void t_itm_code(String value) {
		setConstString(offset + 1, $t_itm_code, value);
	}


	/**
	 *  （ラベル）Quantity.<p>
	 *
	 */
	public String t_qty() {
		return getConstString(offset + 2, $t_qty);
	}

	/**
	 *  （ラベル）Quantity.<p>
	 *
	 */
	public void t_qty(String value) {
		setConstString(offset + 2, $t_qty, value);
	}


	/**
	 *  （ラベル）Net Weight.<p>
	 *
	 */
	public String t_net() {
		return getConstString(offset + 3, $t_net);
	}

	/**
	 *  （ラベル）Net Weight.<p>
	 *
	 */
	public void t_net(String value) {
		setConstString(offset + 3, $t_net, value);
	}


	/**
	 *  （ラベル）Gross Weight.<p>
	 *
	 */
	public String t_grss() {
		return getConstString(offset + 4, $t_grss);
	}

	/**
	 *  （ラベル）Gross Weight.<p>
	 *
	 */
	public void t_grss(String value) {
		setConstString(offset + 4, $t_grss, value);
	}


	/**
	 *  （ラベル）Dimension.<p>
	 *
	 */
	public String t_dim() {
		return getConstString(offset + 5, $t_dim);
	}

	/**
	 *  （ラベル）Dimension.<p>
	 *
	 */
	public void t_dim(String value) {
		setConstString(offset + 5, $t_dim, value);
	}


	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public MCNumber cntnr_no_fr() {
		return getConstNumber(offset + 6, $cntnr_no_fr);
	}

	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(MCNumber value) {
		setConstNumber(offset + 6, $cntnr_no_fr, value);
	}

	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(int value) {
		setConstNumber(offset + 6, $cntnr_no_fr, value);
	}

	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(long value) {
		setConstNumber(offset + 6, $cntnr_no_fr, value);
	}

	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(float value) {
		setConstNumber(offset + 6, $cntnr_no_fr, value);
	}

	/**
	 *  梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(double value) {
		setConstNumber(offset + 6, $cntnr_no_fr, value);
	}


	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public MCNumber cntnr_no_to() {
		return getConstNumber(offset + 7, $cntnr_no_to);
	}

	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(MCNumber value) {
		setConstNumber(offset + 7, $cntnr_no_to, value);
	}

	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(int value) {
		setConstNumber(offset + 7, $cntnr_no_to, value);
	}

	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(long value) {
		setConstNumber(offset + 7, $cntnr_no_to, value);
	}

	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(float value) {
		setConstNumber(offset + 7, $cntnr_no_to, value);
	}

	/**
	 *  梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(double value) {
		setConstNumber(offset + 7, $cntnr_no_to, value);
	}


	/**
	 *  梱包番号.<p>
	 *
	 */
	public String cntnr_no_fr_to() {
		return getConstString(offset + 8, $cntnr_no_fr_to);
	}

	/**
	 *  梱包番号.<p>
	 *
	 */
	public void cntnr_no_fr_to(String value) {
		setConstString(offset + 8, $cntnr_no_fr_to, value);
	}


	/**
	 *  品目コード.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 9, $itm_cd);
	}

	/**
	 *  品目コード.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 9, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 10, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 10, $itm_sub1_view, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 11, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 11, $itm_sub2_view, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 12, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 12, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 13, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 13, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 14, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 14, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 15, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 15, $itm_sub3_data, value);
	}


	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 16, $cntry_org_cd);
	}

	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 16, $cntry_org_cd, value);
	}


	/**
	 *  原産地名（データ）.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 17, $cntry_org_nm);
	}

	/**
	 *  原産地名（データ）.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 17, $cntry_org_nm, value);
	}


	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 18, $trd_unit_qty);
	}

	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}


	/**
	 *  取引単位数量（文字列）.<p>
	 *
	 */
	public String s_trd_unit_qty() {
		return getConstString(offset + 19, $s_trd_unit_qty);
	}

	/**
	 *  取引単位数量（文字列）.<p>
	 *
	 */
	public void s_trd_unit_qty(String value) {
		setConstString(offset + 19, $s_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 20, $s_int_trd_unit_qty);
	}

	/**
	 *  取引単位数量（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 20, $s_int_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 21, $s_dec_trd_unit_qty);
	}

	/**
	 *  取引単位数量（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 21, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 22, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 22, $trd_unit_nm, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 23, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 23, $trd_unit_cd, value);
	}


	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 24, $trd_unit_dec_place);
	}

	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 *  取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}


	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public MCNumber wt_dec_place() {
		return getConstNumber(offset + 25, $wt_dec_place);
	}

	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $wt_dec_place, value);
	}

	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(int value) {
		setConstNumber(offset + 25, $wt_dec_place, value);
	}

	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(long value) {
		setConstNumber(offset + 25, $wt_dec_place, value);
	}

	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(float value) {
		setConstNumber(offset + 25, $wt_dec_place, value);
	}

	/**
	 *  重量小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(double value) {
		setConstNumber(offset + 25, $wt_dec_place, value);
	}


	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public MCNumber dim_dec_place() {
		return getConstNumber(offset + 26, $dim_dec_place);
	}

	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $dim_dec_place, value);
	}

	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(int value) {
		setConstNumber(offset + 26, $dim_dec_place, value);
	}

	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(long value) {
		setConstNumber(offset + 26, $dim_dec_place, value);
	}

	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(float value) {
		setConstNumber(offset + 26, $dim_dec_place, value);
	}

	/**
	 *  容積小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(double value) {
		setConstNumber(offset + 26, $dim_dec_place, value);
	}


	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public MCNumber net_wt() {
		return getConstNumber(offset + 27, $net_wt);
	}

	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public void net_wt(MCNumber value) {
		setConstNumber(offset + 27, $net_wt, value);
	}

	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public void net_wt(int value) {
		setConstNumber(offset + 27, $net_wt, value);
	}

	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public void net_wt(long value) {
		setConstNumber(offset + 27, $net_wt, value);
	}

	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public void net_wt(float value) {
		setConstNumber(offset + 27, $net_wt, value);
	}

	/**
	 *  純重量（データ）.<p>
	 *
	 */
	public void net_wt(double value) {
		setConstNumber(offset + 27, $net_wt, value);
	}


	/**
	 *  純重量（文字列）.<p>
	 *
	 */
	public String s_net_wt() {
		return getConstString(offset + 28, $s_net_wt);
	}

	/**
	 *  純重量（文字列）.<p>
	 *
	 */
	public void s_net_wt(String value) {
		setConstString(offset + 28, $s_net_wt, value);
	}


	/**
	 *  純重量（整数部）.<p>
	 *
	 */
	public String s_int_net_wt() {
		return getConstString(offset + 29, $s_int_net_wt);
	}

	/**
	 *  純重量（整数部）.<p>
	 *
	 */
	public void s_int_net_wt(String value) {
		setConstString(offset + 29, $s_int_net_wt, value);
	}


	/**
	 *  純重量（小数部）.<p>
	 *
	 */
	public String s_dec_net_wt() {
		return getConstString(offset + 30, $s_dec_net_wt);
	}

	/**
	 *  純重量（小数部）.<p>
	 *
	 */
	public void s_dec_net_wt(String value) {
		setConstString(offset + 30, $s_dec_net_wt, value);
	}


	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public MCNumber grss_wt() {
		return getConstNumber(offset + 31, $grss_wt);
	}

	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public void grss_wt(MCNumber value) {
		setConstNumber(offset + 31, $grss_wt, value);
	}

	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public void grss_wt(int value) {
		setConstNumber(offset + 31, $grss_wt, value);
	}

	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public void grss_wt(long value) {
		setConstNumber(offset + 31, $grss_wt, value);
	}

	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public void grss_wt(float value) {
		setConstNumber(offset + 31, $grss_wt, value);
	}

	/**
	 *  総重量（データ）.<p>
	 *
	 */
	public void grss_wt(double value) {
		setConstNumber(offset + 31, $grss_wt, value);
	}


	/**
	 *  総重量（文字列）.<p>
	 *
	 */
	public String s_grss_wt() {
		return getConstString(offset + 32, $s_grss_wt);
	}

	/**
	 *  総重量（文字列）.<p>
	 *
	 */
	public void s_grss_wt(String value) {
		setConstString(offset + 32, $s_grss_wt, value);
	}


	/**
	 *  総重量（整数部）.<p>
	 *
	 */
	public String s_int_grss_wt() {
		return getConstString(offset + 33, $s_int_grss_wt);
	}

	/**
	 *  総重量（整数部）.<p>
	 *
	 */
	public void s_int_grss_wt(String value) {
		setConstString(offset + 33, $s_int_grss_wt, value);
	}


	/**
	 *  総重量（小数部）.<p>
	 *
	 */
	public String s_dec_grss_wt() {
		return getConstString(offset + 34, $s_dec_grss_wt);
	}

	/**
	 *  総重量（小数部）.<p>
	 *
	 */
	public void s_dec_grss_wt(String value) {
		setConstString(offset + 34, $s_dec_grss_wt, value);
	}


	/**
	 *  容積（データ）.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 35, $dim);
	}

	/**
	 *  容積（データ）.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 35, $dim, value);
	}

	/**
	 *  容積（データ）.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 35, $dim, value);
	}

	/**
	 *  容積（データ）.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 35, $dim, value);
	}

	/**
	 *  容積（データ）.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 35, $dim, value);
	}

	/**
	 *  容積（データ）.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 35, $dim, value);
	}


	/**
	 *  容積（文字列）.<p>
	 *
	 */
	public String s_dim() {
		return getConstString(offset + 36, $s_dim);
	}

	/**
	 *  容積（文字列）.<p>
	 *
	 */
	public void s_dim(String value) {
		setConstString(offset + 36, $s_dim, value);
	}


	/**
	 *  容積（整数部）.<p>
	 *
	 */
	public String s_int_dim() {
		return getConstString(offset + 37, $s_int_dim);
	}

	/**
	 *  容積（整数部）.<p>
	 *
	 */
	public void s_int_dim(String value) {
		setConstString(offset + 37, $s_int_dim, value);
	}


	/**
	 *  容積（小数部）.<p>
	 *
	 */
	public String s_dec_dim() {
		return getConstString(offset + 38, $s_dec_dim);
	}

	/**
	 *  容積（小数部）.<p>
	 *
	 */
	public void s_dec_dim(String value) {
		setConstString(offset + 38, $s_dec_dim, value);
	}


	/**
	 *  コンテナ数.<p>
	 *
	 */
	public String container() {
		return getConstString(offset + 39, $container);
	}

	/**
	 *  コンテナ数.<p>
	 *
	 */
	public void container(String value) {
		setConstString(offset + 39, $container, value);
	}


	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 40, $iv_itm_nm);
	}

	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 40, $iv_itm_nm, value);
	}


	/**
	 *  インボイス表記用品目別名１.<p>
	 *
	 */
	public String iv_itm_alt_nm1() {
		return getConstString(offset + 41, $iv_itm_alt_nm1);
	}

	/**
	 *  インボイス表記用品目別名１.<p>
	 *
	 */
	public void iv_itm_alt_nm1(String value) {
		setConstString(offset + 41, $iv_itm_alt_nm1, value);
	}


	/**
	 *  インボイス表記用品目別名２.<p>
	 *
	 */
	public String iv_itm_alt_nm2() {
		return getConstString(offset + 42, $iv_itm_alt_nm2);
	}

	/**
	 *  インボイス表記用品目別名２.<p>
	 *
	 */
	public void iv_itm_alt_nm2(String value) {
		setConstString(offset + 42, $iv_itm_alt_nm2, value);
	}


	/**
	 *  インボイス表記用品目別名３.<p>
	 *
	 */
	public String iv_itm_alt_nm3() {
		return getConstString(offset + 43, $iv_itm_alt_nm3);
	}

	/**
	 *  インボイス表記用品目別名３.<p>
	 *
	 */
	public void iv_itm_alt_nm3(String value) {
		setConstString(offset + 43, $iv_itm_alt_nm3, value);
	}


	/**
	 *  インボイス表記用品目別名４.<p>
	 *
	 */
	public String iv_itm_alt_nm4() {
		return getConstString(offset + 44, $iv_itm_alt_nm4);
	}

	/**
	 *  インボイス表記用品目別名４.<p>
	 *
	 */
	public void iv_itm_alt_nm4(String value) {
		setConstString(offset + 44, $iv_itm_alt_nm4, value);
	}


	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 45, $cst_itm_cd);
	}

	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 45, $cst_itm_cd, value);
	}


	/**
	 *  得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 46, $cst_itm_nm);
	}

	/**
	 *  得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 46, $cst_itm_nm, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 47, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 47, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 47, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 47, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 47, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 47, $disp_seq, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String pl_d_sub_char1() {
		return getConstString(offset + 48, $pl_d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void pl_d_sub_char1(String value) {
		setConstString(offset + 48, $pl_d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String pl_d_sub_char2() {
		return getConstString(offset + 49, $pl_d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void pl_d_sub_char2(String value) {
		setConstString(offset + 49, $pl_d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String pl_d_sub_char3() {
		return getConstString(offset + 50, $pl_d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void pl_d_sub_char3(String value) {
		setConstString(offset + 50, $pl_d_sub_char3, value);
	}


	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public String t_total() {
		return getConstString(offset + 51, $t_total);
	}

	/**
	 *  （ラベル）Total :.<p>
	 *
	 */
	public void t_total(String value) {
		setConstString(offset + 51, $t_total, value);
	}


	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public MCNumber sum_trd_unit_qty() {
		return getConstNumber(offset + 52, $sum_trd_unit_qty);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 52, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(int value) {
		setConstNumber(offset + 52, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(long value) {
		setConstNumber(offset + 52, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(float value) {
		setConstNumber(offset + 52, $sum_trd_unit_qty, value);
	}

	/**
	 *  取引単位数量合計.<p>
	 *
	 */
	public void sum_trd_unit_qty(double value) {
		setConstNumber(offset + 52, $sum_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量合計（文字列）.<p>
	 *
	 */
	public String s_sum_trd_unit_qty() {
		return getConstString(offset + 53, $s_sum_trd_unit_qty);
	}

	/**
	 *  取引単位数量合計（文字列）.<p>
	 *
	 */
	public void s_sum_trd_unit_qty(String value) {
		setConstString(offset + 53, $s_sum_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量合計（整数部）.<p>
	 *
	 */
	public String s_int_sum_trd_unit_qty() {
		return getConstString(offset + 54, $s_int_sum_trd_unit_qty);
	}

	/**
	 *  取引単位数量合計（整数部）.<p>
	 *
	 */
	public void s_int_sum_trd_unit_qty(String value) {
		setConstString(offset + 54, $s_int_sum_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量合計（小数部）.<p>
	 *
	 */
	public String s_dec_sum_trd_unit_qty() {
		return getConstString(offset + 55, $s_dec_sum_trd_unit_qty);
	}

	/**
	 *  取引単位数量合計（小数部）.<p>
	 *
	 */
	public void s_dec_sum_trd_unit_qty(String value) {
		setConstString(offset + 55, $s_dec_sum_trd_unit_qty, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String sum_trd_unit_nm() {
		return getConstString(offset + 56, $sum_trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void sum_trd_unit_nm(String value) {
		setConstString(offset + 56, $sum_trd_unit_nm, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String sum_trd_unit_cd() {
		return getConstString(offset + 57, $sum_trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void sum_trd_unit_cd(String value) {
		setConstString(offset + 57, $sum_trd_unit_cd, value);
	}


	/**
	 *  合計純重量.<p>
	 *
	 */
	public MCNumber sum_net_wt() {
		return getConstNumber(offset + 58, $sum_net_wt);
	}

	/**
	 *  合計純重量.<p>
	 *
	 */
	public void sum_net_wt(MCNumber value) {
		setConstNumber(offset + 58, $sum_net_wt, value);
	}

	/**
	 *  合計純重量.<p>
	 *
	 */
	public void sum_net_wt(int value) {
		setConstNumber(offset + 58, $sum_net_wt, value);
	}

	/**
	 *  合計純重量.<p>
	 *
	 */
	public void sum_net_wt(long value) {
		setConstNumber(offset + 58, $sum_net_wt, value);
	}

	/**
	 *  合計純重量.<p>
	 *
	 */
	public void sum_net_wt(float value) {
		setConstNumber(offset + 58, $sum_net_wt, value);
	}

	/**
	 *  合計純重量.<p>
	 *
	 */
	public void sum_net_wt(double value) {
		setConstNumber(offset + 58, $sum_net_wt, value);
	}


	/**
	 *  合計純重量（文字列）.<p>
	 *
	 */
	public String s_sum_net_wt() {
		return getConstString(offset + 59, $s_sum_net_wt);
	}

	/**
	 *  合計純重量（文字列）.<p>
	 *
	 */
	public void s_sum_net_wt(String value) {
		setConstString(offset + 59, $s_sum_net_wt, value);
	}


	/**
	 *  合計総重量.<p>
	 *
	 */
	public MCNumber sum_grss_wt() {
		return getConstNumber(offset + 60, $sum_grss_wt);
	}

	/**
	 *  合計総重量.<p>
	 *
	 */
	public void sum_grss_wt(MCNumber value) {
		setConstNumber(offset + 60, $sum_grss_wt, value);
	}

	/**
	 *  合計総重量.<p>
	 *
	 */
	public void sum_grss_wt(int value) {
		setConstNumber(offset + 60, $sum_grss_wt, value);
	}

	/**
	 *  合計総重量.<p>
	 *
	 */
	public void sum_grss_wt(long value) {
		setConstNumber(offset + 60, $sum_grss_wt, value);
	}

	/**
	 *  合計総重量.<p>
	 *
	 */
	public void sum_grss_wt(float value) {
		setConstNumber(offset + 60, $sum_grss_wt, value);
	}

	/**
	 *  合計総重量.<p>
	 *
	 */
	public void sum_grss_wt(double value) {
		setConstNumber(offset + 60, $sum_grss_wt, value);
	}


	/**
	 *  合計総重量（文字列）.<p>
	 *
	 */
	public String s_sum_grss_wt() {
		return getConstString(offset + 61, $s_sum_grss_wt);
	}

	/**
	 *  合計総重量（文字列）.<p>
	 *
	 */
	public void s_sum_grss_wt(String value) {
		setConstString(offset + 61, $s_sum_grss_wt, value);
	}


	/**
	 *  合計容積.<p>
	 *
	 */
	public MCNumber sum_dim() {
		return getConstNumber(offset + 62, $sum_dim);
	}

	/**
	 *  合計容積.<p>
	 *
	 */
	public void sum_dim(MCNumber value) {
		setConstNumber(offset + 62, $sum_dim, value);
	}

	/**
	 *  合計容積.<p>
	 *
	 */
	public void sum_dim(int value) {
		setConstNumber(offset + 62, $sum_dim, value);
	}

	/**
	 *  合計容積.<p>
	 *
	 */
	public void sum_dim(long value) {
		setConstNumber(offset + 62, $sum_dim, value);
	}

	/**
	 *  合計容積.<p>
	 *
	 */
	public void sum_dim(float value) {
		setConstNumber(offset + 62, $sum_dim, value);
	}

	/**
	 *  合計容積.<p>
	 *
	 */
	public void sum_dim(double value) {
		setConstNumber(offset + 62, $sum_dim, value);
	}


	/**
	 *  合計容積（文字列）.<p>
	 *
	 */
	public String s_sum_dim() {
		return getConstString(offset + 63, $s_sum_dim);
	}

	/**
	 *  合計容積（文字列）.<p>
	 *
	 */
	public void s_sum_dim(String value) {
		setConstString(offset + 63, $s_sum_dim, value);
	}


	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public String f_cntry_org_cd() {
		return getConstString(offset + 64, $f_cntry_org_cd);
	}

	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public void f_cntry_org_cd(String value) {
		setConstString(offset + 64, $f_cntry_org_cd, value);
	}


	/**
	 *  （ラベル）: MADE IN.<p>
	 *
	 */
	public String t_made_in() {
		return getConstString(offset + 65, $t_made_in);
	}

	/**
	 *  （ラベル）: MADE IN.<p>
	 *
	 */
	public void t_made_in(String value) {
		setConstString(offset + 65, $t_made_in, value);
	}


	/**
	 *  原産地名.<p>
	 *
	 */
	public String f_cntry_org_nm() {
		return getConstString(offset + 66, $f_cntry_org_nm);
	}

	/**
	 *  原産地名.<p>
	 *
	 */
	public void f_cntry_org_nm(String value) {
		setConstString(offset + 66, $f_cntry_org_nm, value);
	}


	/**
	 *  自由入力(罫線部分).<p>
	 *
	 */
	public String free() {
		return getConstString(offset + 67, $free);
	}

	/**
	 *  自由入力(罫線部分).<p>
	 *
	 */
	public void free(String value) {
		setConstString(offset + 67, $free, value);
	}


	public String getString(String name) {
		if ($t_cont_no.equalsIgnoreCase(name)) {
			return t_cont_no();
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			return t_itm_code();
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			return t_qty();
		}
		if ($t_net.equalsIgnoreCase(name)) {
			return t_net();
		}
		if ($t_grss.equalsIgnoreCase(name)) {
			return t_grss();
		}
		if ($t_dim.equalsIgnoreCase(name)) {
			return t_dim();
		}
		if ($cntnr_no_fr_to.equalsIgnoreCase(name)) {
			return cntnr_no_fr_to();
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($s_net_wt.equalsIgnoreCase(name)) {
			return s_net_wt();
		}
		if ($s_int_net_wt.equalsIgnoreCase(name)) {
			return s_int_net_wt();
		}
		if ($s_dec_net_wt.equalsIgnoreCase(name)) {
			return s_dec_net_wt();
		}
		if ($s_grss_wt.equalsIgnoreCase(name)) {
			return s_grss_wt();
		}
		if ($s_int_grss_wt.equalsIgnoreCase(name)) {
			return s_int_grss_wt();
		}
		if ($s_dec_grss_wt.equalsIgnoreCase(name)) {
			return s_dec_grss_wt();
		}
		if ($s_dim.equalsIgnoreCase(name)) {
			return s_dim();
		}
		if ($s_int_dim.equalsIgnoreCase(name)) {
			return s_int_dim();
		}
		if ($s_dec_dim.equalsIgnoreCase(name)) {
			return s_dec_dim();
		}
		if ($container.equalsIgnoreCase(name)) {
			return container();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm1();
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm2();
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm3();
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm4();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($pl_d_sub_char1.equalsIgnoreCase(name)) {
			return pl_d_sub_char1();
		}
		if ($pl_d_sub_char2.equalsIgnoreCase(name)) {
			return pl_d_sub_char2();
		}
		if ($pl_d_sub_char3.equalsIgnoreCase(name)) {
			return pl_d_sub_char3();
		}
		if ($t_total.equalsIgnoreCase(name)) {
			return t_total();
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_sum_trd_unit_qty();
		}
		if ($s_int_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_sum_trd_unit_qty();
		}
		if ($s_dec_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_sum_trd_unit_qty();
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			return sum_trd_unit_nm();
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			return sum_trd_unit_cd();
		}
		if ($s_sum_net_wt.equalsIgnoreCase(name)) {
			return s_sum_net_wt();
		}
		if ($s_sum_grss_wt.equalsIgnoreCase(name)) {
			return s_sum_grss_wt();
		}
		if ($s_sum_dim.equalsIgnoreCase(name)) {
			return s_sum_dim();
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			return f_cntry_org_cd();
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			return t_made_in();
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			return f_cntry_org_nm();
		}
		if ($free.equalsIgnoreCase(name)) {
			return free();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			return cntnr_no_fr();
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			return cntnr_no_to();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			return wt_dec_place();
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			return dim_dec_place();
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			return net_wt();
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			return grss_wt();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return sum_trd_unit_qty();
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			return sum_net_wt();
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			return sum_grss_wt();
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			return sum_dim();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($t_cont_no.equalsIgnoreCase(name)) {
			return t_cont_no();
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			return t_itm_code();
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			return t_qty();
		}
		if ($t_net.equalsIgnoreCase(name)) {
			return t_net();
		}
		if ($t_grss.equalsIgnoreCase(name)) {
			return t_grss();
		}
		if ($t_dim.equalsIgnoreCase(name)) {
			return t_dim();
		}
		if ($cntnr_no_fr_to.equalsIgnoreCase(name)) {
			return cntnr_no_fr_to();
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($s_net_wt.equalsIgnoreCase(name)) {
			return s_net_wt();
		}
		if ($s_int_net_wt.equalsIgnoreCase(name)) {
			return s_int_net_wt();
		}
		if ($s_dec_net_wt.equalsIgnoreCase(name)) {
			return s_dec_net_wt();
		}
		if ($s_grss_wt.equalsIgnoreCase(name)) {
			return s_grss_wt();
		}
		if ($s_int_grss_wt.equalsIgnoreCase(name)) {
			return s_int_grss_wt();
		}
		if ($s_dec_grss_wt.equalsIgnoreCase(name)) {
			return s_dec_grss_wt();
		}
		if ($s_dim.equalsIgnoreCase(name)) {
			return s_dim();
		}
		if ($s_int_dim.equalsIgnoreCase(name)) {
			return s_int_dim();
		}
		if ($s_dec_dim.equalsIgnoreCase(name)) {
			return s_dec_dim();
		}
		if ($container.equalsIgnoreCase(name)) {
			return container();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm1();
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm2();
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm3();
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			return iv_itm_alt_nm4();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($pl_d_sub_char1.equalsIgnoreCase(name)) {
			return pl_d_sub_char1();
		}
		if ($pl_d_sub_char2.equalsIgnoreCase(name)) {
			return pl_d_sub_char2();
		}
		if ($pl_d_sub_char3.equalsIgnoreCase(name)) {
			return pl_d_sub_char3();
		}
		if ($t_total.equalsIgnoreCase(name)) {
			return t_total();
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_sum_trd_unit_qty();
		}
		if ($s_int_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_sum_trd_unit_qty();
		}
		if ($s_dec_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_sum_trd_unit_qty();
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			return sum_trd_unit_nm();
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			return sum_trd_unit_cd();
		}
		if ($s_sum_net_wt.equalsIgnoreCase(name)) {
			return s_sum_net_wt();
		}
		if ($s_sum_grss_wt.equalsIgnoreCase(name)) {
			return s_sum_grss_wt();
		}
		if ($s_sum_dim.equalsIgnoreCase(name)) {
			return s_sum_dim();
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			return f_cntry_org_cd();
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			return t_made_in();
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			return f_cntry_org_nm();
		}
		if ($free.equalsIgnoreCase(name)) {
			return free();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			return cntnr_no_fr();
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			return cntnr_no_to();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			return wt_dec_place();
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			return dim_dec_place();
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			return net_wt();
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			return grss_wt();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			return sum_trd_unit_qty();
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			return sum_net_wt();
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			return sum_grss_wt();
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			return sum_dim();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($t_cont_no.equalsIgnoreCase(name)) {
			t_cont_no(value);
			return;
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			t_itm_code(value);
			return;
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			t_qty(value);
			return;
		}
		if ($t_net.equalsIgnoreCase(name)) {
			t_net(value);
			return;
		}
		if ($t_grss.equalsIgnoreCase(name)) {
			t_grss(value);
			return;
		}
		if ($t_dim.equalsIgnoreCase(name)) {
			t_dim(value);
			return;
		}
		if ($cntnr_no_fr_to.equalsIgnoreCase(name)) {
			cntnr_no_fr_to(value);
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($s_net_wt.equalsIgnoreCase(name)) {
			s_net_wt(value);
			return;
		}
		if ($s_int_net_wt.equalsIgnoreCase(name)) {
			s_int_net_wt(value);
			return;
		}
		if ($s_dec_net_wt.equalsIgnoreCase(name)) {
			s_dec_net_wt(value);
			return;
		}
		if ($s_grss_wt.equalsIgnoreCase(name)) {
			s_grss_wt(value);
			return;
		}
		if ($s_int_grss_wt.equalsIgnoreCase(name)) {
			s_int_grss_wt(value);
			return;
		}
		if ($s_dec_grss_wt.equalsIgnoreCase(name)) {
			s_dec_grss_wt(value);
			return;
		}
		if ($s_dim.equalsIgnoreCase(name)) {
			s_dim(value);
			return;
		}
		if ($s_int_dim.equalsIgnoreCase(name)) {
			s_int_dim(value);
			return;
		}
		if ($s_dec_dim.equalsIgnoreCase(name)) {
			s_dec_dim(value);
			return;
		}
		if ($container.equalsIgnoreCase(name)) {
			container(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			iv_itm_alt_nm1(value);
			return;
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			iv_itm_alt_nm2(value);
			return;
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			iv_itm_alt_nm3(value);
			return;
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			iv_itm_alt_nm4(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($pl_d_sub_char1.equalsIgnoreCase(name)) {
			pl_d_sub_char1(value);
			return;
		}
		if ($pl_d_sub_char2.equalsIgnoreCase(name)) {
			pl_d_sub_char2(value);
			return;
		}
		if ($pl_d_sub_char3.equalsIgnoreCase(name)) {
			pl_d_sub_char3(value);
			return;
		}
		if ($t_total.equalsIgnoreCase(name)) {
			t_total(value);
			return;
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_sum_trd_unit_qty(value);
			return;
		}
		if ($s_int_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_sum_trd_unit_qty(value);
			return;
		}
		if ($s_dec_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			sum_trd_unit_nm(value);
			return;
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			sum_trd_unit_cd(value);
			return;
		}
		if ($s_sum_net_wt.equalsIgnoreCase(name)) {
			s_sum_net_wt(value);
			return;
		}
		if ($s_sum_grss_wt.equalsIgnoreCase(name)) {
			s_sum_grss_wt(value);
			return;
		}
		if ($s_sum_dim.equalsIgnoreCase(name)) {
			s_sum_dim(value);
			return;
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			f_cntry_org_cd(value);
			return;
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			t_made_in(value);
			return;
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			f_cntry_org_nm(value);
			return;
		}
		if ($free.equalsIgnoreCase(name)) {
			free(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($t_cont_no.equalsIgnoreCase(name)) {
			t_cont_no(value);
			return;
		}
		if ($t_itm_code.equalsIgnoreCase(name)) {
			t_itm_code(value);
			return;
		}
		if ($t_qty.equalsIgnoreCase(name)) {
			t_qty(value);
			return;
		}
		if ($t_net.equalsIgnoreCase(name)) {
			t_net(value);
			return;
		}
		if ($t_grss.equalsIgnoreCase(name)) {
			t_grss(value);
			return;
		}
		if ($t_dim.equalsIgnoreCase(name)) {
			t_dim(value);
			return;
		}
		if ($cntnr_no_fr_to.equalsIgnoreCase(name)) {
			cntnr_no_fr_to(value);
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($s_net_wt.equalsIgnoreCase(name)) {
			s_net_wt(value);
			return;
		}
		if ($s_int_net_wt.equalsIgnoreCase(name)) {
			s_int_net_wt(value);
			return;
		}
		if ($s_dec_net_wt.equalsIgnoreCase(name)) {
			s_dec_net_wt(value);
			return;
		}
		if ($s_grss_wt.equalsIgnoreCase(name)) {
			s_grss_wt(value);
			return;
		}
		if ($s_int_grss_wt.equalsIgnoreCase(name)) {
			s_int_grss_wt(value);
			return;
		}
		if ($s_dec_grss_wt.equalsIgnoreCase(name)) {
			s_dec_grss_wt(value);
			return;
		}
		if ($s_dim.equalsIgnoreCase(name)) {
			s_dim(value);
			return;
		}
		if ($s_int_dim.equalsIgnoreCase(name)) {
			s_int_dim(value);
			return;
		}
		if ($s_dec_dim.equalsIgnoreCase(name)) {
			s_dec_dim(value);
			return;
		}
		if ($container.equalsIgnoreCase(name)) {
			container(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($iv_itm_alt_nm1.equalsIgnoreCase(name)) {
			iv_itm_alt_nm1(value);
			return;
		}
		if ($iv_itm_alt_nm2.equalsIgnoreCase(name)) {
			iv_itm_alt_nm2(value);
			return;
		}
		if ($iv_itm_alt_nm3.equalsIgnoreCase(name)) {
			iv_itm_alt_nm3(value);
			return;
		}
		if ($iv_itm_alt_nm4.equalsIgnoreCase(name)) {
			iv_itm_alt_nm4(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($pl_d_sub_char1.equalsIgnoreCase(name)) {
			pl_d_sub_char1(value);
			return;
		}
		if ($pl_d_sub_char2.equalsIgnoreCase(name)) {
			pl_d_sub_char2(value);
			return;
		}
		if ($pl_d_sub_char3.equalsIgnoreCase(name)) {
			pl_d_sub_char3(value);
			return;
		}
		if ($t_total.equalsIgnoreCase(name)) {
			t_total(value);
			return;
		}
		if ($s_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_sum_trd_unit_qty(value);
			return;
		}
		if ($s_int_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_sum_trd_unit_qty(value);
			return;
		}
		if ($s_dec_sum_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_sum_trd_unit_qty(value);
			return;
		}
		if ($sum_trd_unit_nm.equalsIgnoreCase(name)) {
			sum_trd_unit_nm(value);
			return;
		}
		if ($sum_trd_unit_cd.equalsIgnoreCase(name)) {
			sum_trd_unit_cd(value);
			return;
		}
		if ($s_sum_net_wt.equalsIgnoreCase(name)) {
			s_sum_net_wt(value);
			return;
		}
		if ($s_sum_grss_wt.equalsIgnoreCase(name)) {
			s_sum_grss_wt(value);
			return;
		}
		if ($s_sum_dim.equalsIgnoreCase(name)) {
			s_sum_dim(value);
			return;
		}
		if ($f_cntry_org_cd.equalsIgnoreCase(name)) {
			f_cntry_org_cd(value);
			return;
		}
		if ($t_made_in.equalsIgnoreCase(name)) {
			t_made_in(value);
			return;
		}
		if ($f_cntry_org_nm.equalsIgnoreCase(name)) {
			f_cntry_org_nm(value);
			return;
		}
		if ($free.equalsIgnoreCase(name)) {
			free(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cntnr_no_fr.equalsIgnoreCase(name)) {
			cntnr_no_fr(value);
			return;
		}
		if ($cntnr_no_to.equalsIgnoreCase(name)) {
			cntnr_no_to(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($net_wt.equalsIgnoreCase(name)) {
			net_wt(value);
			return;
		}
		if ($grss_wt.equalsIgnoreCase(name)) {
			grss_wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($sum_trd_unit_qty.equalsIgnoreCase(name)) {
			sum_trd_unit_qty(value);
			return;
		}
		if ($sum_net_wt.equalsIgnoreCase(name)) {
			sum_net_wt(value);
			return;
		}
		if ($sum_grss_wt.equalsIgnoreCase(name)) {
			sum_grss_wt(value);
			return;
		}
		if ($sum_dim.equalsIgnoreCase(name)) {
			sum_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

