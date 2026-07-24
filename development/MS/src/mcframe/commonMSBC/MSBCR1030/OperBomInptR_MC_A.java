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
 * ブロック"OperBomInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OperBomInptR_MC_A extends MCConstRow {

	/**
	 *  区分（投入指図）.<p>
	 *
	 */
	public static final String $d_oper_inst_typ = "d_oper_inst_typ";
	/**
	 *  投入品目.<p>
	 *
	 */
	public static final String $d_itm_cd = "d_itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $d_itm_sub1_view = "d_itm_sub1_view";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $d_itm_sub2_view = "d_itm_sub2_view";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $d_itm_sub3_view = "d_itm_sub3_view";
	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public static final String $d_itm_sub1_data = "d_itm_sub1_data";
	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public static final String $d_itm_sub2_data = "d_itm_sub2_data";
	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public static final String $d_itm_sub3_data = "d_itm_sub3_data";
	/**
	 *  投入品名.<p>
	 *
	 */
	public static final String $d_itm_nm = "d_itm_nm";
	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public static final String $d_itm_alt_nm1 = "d_itm_alt_nm1";
	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public static final String $d_itm_alt_nm2 = "d_itm_alt_nm2";
	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public static final String $d_itm_alt_nm3 = "d_itm_alt_nm3";
	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public static final String $d_itm_alt_nm4 = "d_itm_alt_nm4";
	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 *  代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public static final String $d_mfg_inst_rev_no = "d_mfg_inst_rev_no";
	/**
	 *  投入予定日.<p>
	 *
	 */
	public static final String $schd_dt = "schd_dt";
	/**
	 *  投入予定時刻.<p>
	 *
	 */
	public static final String $schd_hm = "schd_hm";
	/**
	 *  投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 *  必要数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	/**
	 *  固定必要数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	/**
	 *  投入数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_inpt_qty = "s_int_base_unit_inpt_qty";
	/**
	 *  投入数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_inpt_qty = "s_dec_base_unit_inpt_qty";
	/**
	 *  必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_rqmt_qty = "s_int_base_unit_rqmt_qty";
	/**
	 *  必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_rqmt_qty = "s_dec_base_unit_rqmt_qty";
	/**
	 *  固定必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_fxd_rqmt_qty = "s_int_base_unit_fxd_rqmt_qty";
	/**
	 *  固定必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_fxd_rqmt_qty = "s_dec_base_unit_fxd_rqmt_qty";
	/**
	 *  単位（投入予定）.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  単位名（投入予定）.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public static final String $bom_id_no = "bom_id_no";
	/**
	 *  親指図数量.<p>
	 *
	 */
	public static final String $par_inst_qty = "par_inst_qty";
	/**
	 *  親指図数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_par_inst_qty = "s_int_par_inst_qty";
	/**
	 *  親指図数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_par_inst_qty = "s_dec_par_inst_qty";
	/**
	 *  子投入数量.<p>
	 *
	 */
	public static final String $chd_inpt_qty = "chd_inpt_qty";
	/**
	 *  子投入数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_chd_inpt_qty = "s_int_chd_inpt_qty";
	/**
	 *  子投入数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_chd_inpt_qty = "s_dec_chd_inpt_qty";
	/**
	 *  子必要数量.<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	/**
	 *  子必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_chd_rqmt_qty = "s_int_chd_rqmt_qty";
	/**
	 *  子必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_chd_rqmt_qty = "s_dec_chd_rqmt_qty";
	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	/**
	 *  子固定必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_fxd_chd_rqmt_qty = "s_int_fxd_chd_rqmt_qty";
	/**
	 *  子固定必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_fxd_chd_rqmt_qty = "s_dec_fxd_chd_rqmt_qty";
	/**
	 *  投入オフセット区分.<p>
	 *
	 */
	public static final String $in_offst_typ = "in_offst_typ";
	/**
	 *  投入オフセット区分名.<p>
	 *
	 */
	public static final String $in_offst_typ_nm = "in_offst_typ_nm";
	/**
	 *  投入オフセット.<p>
	 *
	 */
	public static final String $in_offst = "in_offst";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $d_disp_seq = "d_disp_seq";
	/**
	 *  投入予定予備１.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char1 = "inpt_schd_sub_char1";
	/**
	 *  投入予定予備２.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char2 = "inpt_schd_sub_char2";
	/**
	 *  投入予定予備３.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char3 = "inpt_schd_sub_char3";


	public static final MCMeta d_oper_inst_typ_META = createStringMeta($d_oper_inst_typ);
	public static final MCMeta d_itm_cd_META = createCommonMeta($d_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta d_itm_sub1_view_META = createCommonMeta($d_itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta d_itm_sub2_view_META = createCommonMeta($d_itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta d_itm_sub3_view_META = createCommonMeta($d_itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta d_itm_sub1_data_META = createCommonMeta($d_itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta d_itm_sub2_data_META = createCommonMeta($d_itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta d_itm_sub3_data_META = createCommonMeta($d_itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta d_itm_nm_META = createCommonMeta($d_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta d_itm_alt_nm1_META = createCommonMeta($d_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta d_itm_alt_nm2_META = createCommonMeta($d_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta d_itm_alt_nm3_META = createCommonMeta($d_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta d_itm_alt_nm4_META = createCommonMeta($d_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta d_mfg_inst_rev_no_META = createCommonMeta($d_mfg_inst_rev_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta schd_dt_META = createCommonMeta($schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_hm_META = createCommonMeta($schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_inpt_qty_META = createStringMeta($s_int_base_unit_inpt_qty);
	public static final MCMeta s_dec_base_unit_inpt_qty_META = createStringMeta($s_dec_base_unit_inpt_qty);
	public static final MCMeta s_int_base_unit_rqmt_qty_META = createStringMeta($s_int_base_unit_rqmt_qty);
	public static final MCMeta s_dec_base_unit_rqmt_qty_META = createStringMeta($s_dec_base_unit_rqmt_qty);
	public static final MCMeta s_int_base_unit_fxd_rqmt_qty_META = createStringMeta($s_int_base_unit_fxd_rqmt_qty);
	public static final MCMeta s_dec_base_unit_fxd_rqmt_qty_META = createStringMeta($s_dec_base_unit_fxd_rqmt_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta bom_id_no_META = createCommonMeta($bom_id_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta par_inst_qty_META = createCommonMeta($par_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_par_inst_qty_META = createStringMeta($s_int_par_inst_qty);
	public static final MCMeta s_dec_par_inst_qty_META = createStringMeta($s_dec_par_inst_qty);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_chd_inpt_qty_META = createStringMeta($s_int_chd_inpt_qty);
	public static final MCMeta s_dec_chd_inpt_qty_META = createStringMeta($s_dec_chd_inpt_qty);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_chd_rqmt_qty_META = createStringMeta($s_int_chd_rqmt_qty);
	public static final MCMeta s_dec_chd_rqmt_qty_META = createStringMeta($s_dec_chd_rqmt_qty);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_fxd_chd_rqmt_qty_META = createStringMeta($s_int_fxd_chd_rqmt_qty);
	public static final MCMeta s_dec_fxd_chd_rqmt_qty_META = createStringMeta($s_dec_fxd_chd_rqmt_qty);
	public static final MCMeta in_offst_typ_META = createCommonMeta($in_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta in_offst_typ_nm_META = createStringMeta($in_offst_typ_nm);
	public static final MCMeta in_offst_META = createCommonMeta($in_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta d_disp_seq_META = createCommonMeta($d_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_schd_sub_char1_META = createCommonMeta($inpt_schd_sub_char1, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR1);
	public static final MCMeta inpt_schd_sub_char2_META = createCommonMeta($inpt_schd_sub_char2, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR2);
	public static final MCMeta inpt_schd_sub_char3_META = createCommonMeta($inpt_schd_sub_char3, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR3);

	protected static final ConstMetaList<OperBomInptR> constMetas = new ConstMetaList<OperBomInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			d_oper_inst_typ_META,
			d_itm_cd_META,
			d_itm_sub1_view_META,
			d_itm_sub2_view_META,
			d_itm_sub3_view_META,
			d_itm_sub1_data_META,
			d_itm_sub2_data_META,
			d_itm_sub3_data_META,
			d_itm_nm_META,
			d_itm_alt_nm1_META,
			d_itm_alt_nm2_META,
			d_itm_alt_nm3_META,
			d_itm_alt_nm4_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			d_mfg_inst_rev_no_META,
			schd_dt_META,
			schd_hm_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			s_int_base_unit_inpt_qty_META,
			s_dec_base_unit_inpt_qty_META,
			s_int_base_unit_rqmt_qty_META,
			s_dec_base_unit_rqmt_qty_META,
			s_int_base_unit_fxd_rqmt_qty_META,
			s_dec_base_unit_fxd_rqmt_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			bom_id_no_META,
			par_inst_qty_META,
			s_int_par_inst_qty_META,
			s_dec_par_inst_qty_META,
			chd_inpt_qty_META,
			s_int_chd_inpt_qty_META,
			s_dec_chd_inpt_qty_META,
			chd_rqmt_qty_META,
			s_int_chd_rqmt_qty_META,
			s_dec_chd_rqmt_qty_META,
			fxd_chd_rqmt_qty_META,
			s_int_fxd_chd_rqmt_qty_META,
			s_dec_fxd_chd_rqmt_qty_META,
			in_offst_typ_META,
			in_offst_typ_nm_META,
			in_offst_META,
			d_disp_seq_META,
			inpt_schd_sub_char1_META,
			inpt_schd_sub_char2_META,
			inpt_schd_sub_char3_META
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
	protected OperBomInptR_MC_A(ConstMetaList<? extends OperBomInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomInptR clone() {
		return (OperBomInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomInptR createInstance() {
		return (OperBomInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomInptR getValues(String... names) {
		return (OperBomInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  区分（投入指図）.<p>
	 *
	 */
	public String d_oper_inst_typ() {
		return getConstString(offset + 0, $d_oper_inst_typ);
	}

	/**
	 *  区分（投入指図）.<p>
	 *
	 */
	public void d_oper_inst_typ(String value) {
		setConstString(offset + 0, $d_oper_inst_typ, value);
	}


	/**
	 *  投入品目.<p>
	 *
	 */
	public String d_itm_cd() {
		return getConstString(offset + 1, $d_itm_cd);
	}

	/**
	 *  投入品目.<p>
	 *
	 */
	public void d_itm_cd(String value) {
		setConstString(offset + 1, $d_itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String d_itm_sub1_view() {
		return getConstString(offset + 2, $d_itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void d_itm_sub1_view(String value) {
		setConstString(offset + 2, $d_itm_sub1_view, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String d_itm_sub2_view() {
		return getConstString(offset + 3, $d_itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void d_itm_sub2_view(String value) {
		setConstString(offset + 3, $d_itm_sub2_view, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String d_itm_sub3_view() {
		return getConstString(offset + 4, $d_itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void d_itm_sub3_view(String value) {
		setConstString(offset + 4, $d_itm_sub3_view, value);
	}


	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public String d_itm_sub1_data() {
		return getConstString(offset + 5, $d_itm_sub1_data);
	}

	/**
	 *  枝番１(データ用).<p>
	 *
	 */
	public void d_itm_sub1_data(String value) {
		setConstString(offset + 5, $d_itm_sub1_data, value);
	}


	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public String d_itm_sub2_data() {
		return getConstString(offset + 6, $d_itm_sub2_data);
	}

	/**
	 *  枝番２(データ用).<p>
	 *
	 */
	public void d_itm_sub2_data(String value) {
		setConstString(offset + 6, $d_itm_sub2_data, value);
	}


	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public String d_itm_sub3_data() {
		return getConstString(offset + 7, $d_itm_sub3_data);
	}

	/**
	 *  枝番３(データ用).<p>
	 *
	 */
	public void d_itm_sub3_data(String value) {
		setConstString(offset + 7, $d_itm_sub3_data, value);
	}


	/**
	 *  投入品名.<p>
	 *
	 */
	public String d_itm_nm() {
		return getConstString(offset + 8, $d_itm_nm);
	}

	/**
	 *  投入品名.<p>
	 *
	 */
	public void d_itm_nm(String value) {
		setConstString(offset + 8, $d_itm_nm, value);
	}


	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public String d_itm_alt_nm1() {
		return getConstString(offset + 9, $d_itm_alt_nm1);
	}

	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public void d_itm_alt_nm1(String value) {
		setConstString(offset + 9, $d_itm_alt_nm1, value);
	}


	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public String d_itm_alt_nm2() {
		return getConstString(offset + 10, $d_itm_alt_nm2);
	}

	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public void d_itm_alt_nm2(String value) {
		setConstString(offset + 10, $d_itm_alt_nm2, value);
	}


	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public String d_itm_alt_nm3() {
		return getConstString(offset + 11, $d_itm_alt_nm3);
	}

	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public void d_itm_alt_nm3(String value) {
		setConstString(offset + 11, $d_itm_alt_nm3, value);
	}


	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public String d_itm_alt_nm4() {
		return getConstString(offset + 12, $d_itm_alt_nm4);
	}

	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public void d_itm_alt_nm4(String value) {
		setConstString(offset + 12, $d_itm_alt_nm4, value);
	}


	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 13, $alt_grp_cd);
	}

	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 13, $alt_grp_cd, value);
	}


	/**
	 *  代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 14, $alt_grp_nm);
	}

	/**
	 *  代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 14, $alt_grp_nm, value);
	}


	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public MCNumber d_mfg_inst_rev_no() {
		return getConstNumber(offset + 15, $d_mfg_inst_rev_no);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void d_mfg_inst_rev_no(MCNumber value) {
		setConstNumber(offset + 15, $d_mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void d_mfg_inst_rev_no(int value) {
		setConstNumber(offset + 15, $d_mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void d_mfg_inst_rev_no(long value) {
		setConstNumber(offset + 15, $d_mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void d_mfg_inst_rev_no(float value) {
		setConstNumber(offset + 15, $d_mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void d_mfg_inst_rev_no(double value) {
		setConstNumber(offset + 15, $d_mfg_inst_rev_no, value);
	}


	/**
	 *  投入予定日.<p>
	 *
	 */
	public MCDate schd_dt() {
		return getConstDate(offset + 16, $schd_dt);
	}

	/**
	 *  投入予定日.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		setConstDate(offset + 16, $schd_dt, value);
	}


	/**
	 *  投入予定時刻.<p>
	 *
	 */
	public MCDate schd_hm() {
		return getConstDate(offset + 17, $schd_hm);
	}

	/**
	 *  投入予定時刻.<p>
	 *
	 */
	public void schd_hm(MCDate value) {
		setConstDate(offset + 17, $schd_hm, value);
	}


	/**
	 *  投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 18, $base_unit_inpt_qty);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 18, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 18, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 18, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 18, $base_unit_inpt_qty, value);
	}


	/**
	 *  必要数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 19, $base_unit_rqmt_qty);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 19, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 19, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 19, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 19, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 19, $base_unit_rqmt_qty, value);
	}


	/**
	 *  固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 20, $base_unit_fxd_rqmt_qty);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 20, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 20, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 20, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 20, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 20, $base_unit_fxd_rqmt_qty, value);
	}


	/**
	 *  投入数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_inpt_qty() {
		return getConstString(offset + 21, $s_int_base_unit_inpt_qty);
	}

	/**
	 *  投入数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_inpt_qty(String value) {
		setConstString(offset + 21, $s_int_base_unit_inpt_qty, value);
	}


	/**
	 *  投入数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_inpt_qty() {
		return getConstString(offset + 22, $s_dec_base_unit_inpt_qty);
	}

	/**
	 *  投入数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_inpt_qty(String value) {
		setConstString(offset + 22, $s_dec_base_unit_inpt_qty, value);
	}


	/**
	 *  必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_rqmt_qty() {
		return getConstString(offset + 23, $s_int_base_unit_rqmt_qty);
	}

	/**
	 *  必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_rqmt_qty(String value) {
		setConstString(offset + 23, $s_int_base_unit_rqmt_qty, value);
	}


	/**
	 *  必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_rqmt_qty() {
		return getConstString(offset + 24, $s_dec_base_unit_rqmt_qty);
	}

	/**
	 *  必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_rqmt_qty(String value) {
		setConstString(offset + 24, $s_dec_base_unit_rqmt_qty, value);
	}


	/**
	 *  固定必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_fxd_rqmt_qty() {
		return getConstString(offset + 25, $s_int_base_unit_fxd_rqmt_qty);
	}

	/**
	 *  固定必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_fxd_rqmt_qty(String value) {
		setConstString(offset + 25, $s_int_base_unit_fxd_rqmt_qty, value);
	}


	/**
	 *  固定必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_fxd_rqmt_qty() {
		return getConstString(offset + 26, $s_dec_base_unit_fxd_rqmt_qty);
	}

	/**
	 *  固定必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_fxd_rqmt_qty(String value) {
		setConstString(offset + 26, $s_dec_base_unit_fxd_rqmt_qty, value);
	}


	/**
	 *  単位（投入予定）.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 27, $base_unit_cd);
	}

	/**
	 *  単位（投入予定）.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 27, $base_unit_cd, value);
	}


	/**
	 *  単位名（投入予定）.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 28, $base_unit_nm);
	}

	/**
	 *  単位名（投入予定）.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 28, $base_unit_nm, value);
	}


	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public MCNumber bom_id_no() {
		return getConstNumber(offset + 29, $bom_id_no);
	}

	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(MCNumber value) {
		setConstNumber(offset + 29, $bom_id_no, value);
	}

	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(int value) {
		setConstNumber(offset + 29, $bom_id_no, value);
	}

	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(long value) {
		setConstNumber(offset + 29, $bom_id_no, value);
	}

	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(float value) {
		setConstNumber(offset + 29, $bom_id_no, value);
	}

	/**
	 *  ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(double value) {
		setConstNumber(offset + 29, $bom_id_no, value);
	}


	/**
	 *  親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return getConstNumber(offset + 30, $par_inst_qty);
	}

	/**
	 *  親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		setConstNumber(offset + 30, $par_inst_qty, value);
	}

	/**
	 *  親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		setConstNumber(offset + 30, $par_inst_qty, value);
	}

	/**
	 *  親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		setConstNumber(offset + 30, $par_inst_qty, value);
	}

	/**
	 *  親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		setConstNumber(offset + 30, $par_inst_qty, value);
	}

	/**
	 *  親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		setConstNumber(offset + 30, $par_inst_qty, value);
	}


	/**
	 *  親指図数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_par_inst_qty() {
		return getConstString(offset + 31, $s_int_par_inst_qty);
	}

	/**
	 *  親指図数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_par_inst_qty(String value) {
		setConstString(offset + 31, $s_int_par_inst_qty, value);
	}


	/**
	 *  親指図数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_par_inst_qty() {
		return getConstString(offset + 32, $s_dec_par_inst_qty);
	}

	/**
	 *  親指図数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_par_inst_qty(String value) {
		setConstString(offset + 32, $s_dec_par_inst_qty, value);
	}


	/**
	 *  子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 33, $chd_inpt_qty);
	}

	/**
	 *  子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 33, $chd_inpt_qty, value);
	}

	/**
	 *  子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 33, $chd_inpt_qty, value);
	}

	/**
	 *  子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 33, $chd_inpt_qty, value);
	}

	/**
	 *  子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 33, $chd_inpt_qty, value);
	}

	/**
	 *  子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 33, $chd_inpt_qty, value);
	}


	/**
	 *  子投入数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_chd_inpt_qty() {
		return getConstString(offset + 34, $s_int_chd_inpt_qty);
	}

	/**
	 *  子投入数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_chd_inpt_qty(String value) {
		setConstString(offset + 34, $s_int_chd_inpt_qty, value);
	}


	/**
	 *  子投入数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_chd_inpt_qty() {
		return getConstString(offset + 35, $s_dec_chd_inpt_qty);
	}

	/**
	 *  子投入数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_chd_inpt_qty(String value) {
		setConstString(offset + 35, $s_dec_chd_inpt_qty, value);
	}


	/**
	 *  子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 36, $chd_rqmt_qty);
	}

	/**
	 *  子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 36, $chd_rqmt_qty, value);
	}

	/**
	 *  子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 36, $chd_rqmt_qty, value);
	}

	/**
	 *  子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 36, $chd_rqmt_qty, value);
	}

	/**
	 *  子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 36, $chd_rqmt_qty, value);
	}

	/**
	 *  子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 36, $chd_rqmt_qty, value);
	}


	/**
	 *  子必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_chd_rqmt_qty() {
		return getConstString(offset + 37, $s_int_chd_rqmt_qty);
	}

	/**
	 *  子必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_chd_rqmt_qty(String value) {
		setConstString(offset + 37, $s_int_chd_rqmt_qty, value);
	}


	/**
	 *  子必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_chd_rqmt_qty() {
		return getConstString(offset + 38, $s_dec_chd_rqmt_qty);
	}

	/**
	 *  子必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_chd_rqmt_qty(String value) {
		setConstString(offset + 38, $s_dec_chd_rqmt_qty, value);
	}


	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 39, $fxd_chd_rqmt_qty);
	}

	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 39, $fxd_chd_rqmt_qty, value);
	}

	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 39, $fxd_chd_rqmt_qty, value);
	}

	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 39, $fxd_chd_rqmt_qty, value);
	}

	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 39, $fxd_chd_rqmt_qty, value);
	}

	/**
	 *  子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 39, $fxd_chd_rqmt_qty, value);
	}


	/**
	 *  子固定必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_fxd_chd_rqmt_qty() {
		return getConstString(offset + 40, $s_int_fxd_chd_rqmt_qty);
	}

	/**
	 *  子固定必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_fxd_chd_rqmt_qty(String value) {
		setConstString(offset + 40, $s_int_fxd_chd_rqmt_qty, value);
	}


	/**
	 *  子固定必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_fxd_chd_rqmt_qty() {
		return getConstString(offset + 41, $s_dec_fxd_chd_rqmt_qty);
	}

	/**
	 *  子固定必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_fxd_chd_rqmt_qty(String value) {
		setConstString(offset + 41, $s_dec_fxd_chd_rqmt_qty, value);
	}


	/**
	 *  投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 42, $in_offst_typ);
	}

	/**
	 *  投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 42, $in_offst_typ, value);
	}


	/**
	 *  投入オフセット区分名.<p>
	 *
	 */
	public String in_offst_typ_nm() {
		return getConstString(offset + 43, $in_offst_typ_nm);
	}

	/**
	 *  投入オフセット区分名.<p>
	 *
	 */
	public void in_offst_typ_nm(String value) {
		setConstString(offset + 43, $in_offst_typ_nm, value);
	}


	/**
	 *  投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 44, $in_offst);
	}

	/**
	 *  投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 44, $in_offst, value);
	}

	/**
	 *  投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 44, $in_offst, value);
	}

	/**
	 *  投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 44, $in_offst, value);
	}

	/**
	 *  投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 44, $in_offst, value);
	}

	/**
	 *  投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 44, $in_offst, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber d_disp_seq() {
		return getConstNumber(offset + 45, $d_disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void d_disp_seq(MCNumber value) {
		setConstNumber(offset + 45, $d_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void d_disp_seq(int value) {
		setConstNumber(offset + 45, $d_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void d_disp_seq(long value) {
		setConstNumber(offset + 45, $d_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void d_disp_seq(float value) {
		setConstNumber(offset + 45, $d_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void d_disp_seq(double value) {
		setConstNumber(offset + 45, $d_disp_seq, value);
	}


	/**
	 *  投入予定予備１.<p>
	 *
	 */
	public String inpt_schd_sub_char1() {
		return getConstString(offset + 46, $inpt_schd_sub_char1);
	}

	/**
	 *  投入予定予備１.<p>
	 *
	 */
	public void inpt_schd_sub_char1(String value) {
		setConstString(offset + 46, $inpt_schd_sub_char1, value);
	}


	/**
	 *  投入予定予備２.<p>
	 *
	 */
	public String inpt_schd_sub_char2() {
		return getConstString(offset + 47, $inpt_schd_sub_char2);
	}

	/**
	 *  投入予定予備２.<p>
	 *
	 */
	public void inpt_schd_sub_char2(String value) {
		setConstString(offset + 47, $inpt_schd_sub_char2, value);
	}


	/**
	 *  投入予定予備３.<p>
	 *
	 */
	public String inpt_schd_sub_char3() {
		return getConstString(offset + 48, $inpt_schd_sub_char3);
	}

	/**
	 *  投入予定予備３.<p>
	 *
	 */
	public void inpt_schd_sub_char3(String value) {
		setConstString(offset + 48, $inpt_schd_sub_char3, value);
	}


	public String getString(String name) {
		if ($d_oper_inst_typ.equalsIgnoreCase(name)) {
			return d_oper_inst_typ();
		}
		if ($d_itm_cd.equalsIgnoreCase(name)) {
			return d_itm_cd();
		}
		if ($d_itm_sub1_view.equalsIgnoreCase(name)) {
			return d_itm_sub1_view();
		}
		if ($d_itm_sub2_view.equalsIgnoreCase(name)) {
			return d_itm_sub2_view();
		}
		if ($d_itm_sub3_view.equalsIgnoreCase(name)) {
			return d_itm_sub3_view();
		}
		if ($d_itm_sub1_data.equalsIgnoreCase(name)) {
			return d_itm_sub1_data();
		}
		if ($d_itm_sub2_data.equalsIgnoreCase(name)) {
			return d_itm_sub2_data();
		}
		if ($d_itm_sub3_data.equalsIgnoreCase(name)) {
			return d_itm_sub3_data();
		}
		if ($d_itm_nm.equalsIgnoreCase(name)) {
			return d_itm_nm();
		}
		if ($d_itm_alt_nm1.equalsIgnoreCase(name)) {
			return d_itm_alt_nm1();
		}
		if ($d_itm_alt_nm2.equalsIgnoreCase(name)) {
			return d_itm_alt_nm2();
		}
		if ($d_itm_alt_nm3.equalsIgnoreCase(name)) {
			return d_itm_alt_nm3();
		}
		if ($d_itm_alt_nm4.equalsIgnoreCase(name)) {
			return d_itm_alt_nm4();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_qty();
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_qty();
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_rqmt_qty();
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_rqmt_qty();
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_fxd_rqmt_qty();
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_fxd_rqmt_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($s_int_par_inst_qty.equalsIgnoreCase(name)) {
			return s_int_par_inst_qty();
		}
		if ($s_dec_par_inst_qty.equalsIgnoreCase(name)) {
			return s_dec_par_inst_qty();
		}
		if ($s_int_chd_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_chd_inpt_qty();
		}
		if ($s_dec_chd_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_chd_inpt_qty();
		}
		if ($s_int_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_chd_rqmt_qty();
		}
		if ($s_dec_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_chd_rqmt_qty();
		}
		if ($s_int_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_fxd_chd_rqmt_qty();
		}
		if ($s_dec_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_fxd_chd_rqmt_qty();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			return in_offst_typ_nm();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return d_mfg_inst_rev_no();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			return bom_id_no();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			return d_disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			return schd_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($d_oper_inst_typ.equalsIgnoreCase(name)) {
			return d_oper_inst_typ();
		}
		if ($d_itm_cd.equalsIgnoreCase(name)) {
			return d_itm_cd();
		}
		if ($d_itm_sub1_view.equalsIgnoreCase(name)) {
			return d_itm_sub1_view();
		}
		if ($d_itm_sub2_view.equalsIgnoreCase(name)) {
			return d_itm_sub2_view();
		}
		if ($d_itm_sub3_view.equalsIgnoreCase(name)) {
			return d_itm_sub3_view();
		}
		if ($d_itm_sub1_data.equalsIgnoreCase(name)) {
			return d_itm_sub1_data();
		}
		if ($d_itm_sub2_data.equalsIgnoreCase(name)) {
			return d_itm_sub2_data();
		}
		if ($d_itm_sub3_data.equalsIgnoreCase(name)) {
			return d_itm_sub3_data();
		}
		if ($d_itm_nm.equalsIgnoreCase(name)) {
			return d_itm_nm();
		}
		if ($d_itm_alt_nm1.equalsIgnoreCase(name)) {
			return d_itm_alt_nm1();
		}
		if ($d_itm_alt_nm2.equalsIgnoreCase(name)) {
			return d_itm_alt_nm2();
		}
		if ($d_itm_alt_nm3.equalsIgnoreCase(name)) {
			return d_itm_alt_nm3();
		}
		if ($d_itm_alt_nm4.equalsIgnoreCase(name)) {
			return d_itm_alt_nm4();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_qty();
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_qty();
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_rqmt_qty();
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_rqmt_qty();
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_fxd_rqmt_qty();
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_fxd_rqmt_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($s_int_par_inst_qty.equalsIgnoreCase(name)) {
			return s_int_par_inst_qty();
		}
		if ($s_dec_par_inst_qty.equalsIgnoreCase(name)) {
			return s_dec_par_inst_qty();
		}
		if ($s_int_chd_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_chd_inpt_qty();
		}
		if ($s_dec_chd_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_chd_inpt_qty();
		}
		if ($s_int_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_chd_rqmt_qty();
		}
		if ($s_dec_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_chd_rqmt_qty();
		}
		if ($s_int_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_fxd_chd_rqmt_qty();
		}
		if ($s_dec_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_fxd_chd_rqmt_qty();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			return in_offst_typ_nm();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return d_mfg_inst_rev_no();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			return bom_id_no();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			return d_disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			return schd_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($d_oper_inst_typ.equalsIgnoreCase(name)) {
			d_oper_inst_typ(value);
			return;
		}
		if ($d_itm_cd.equalsIgnoreCase(name)) {
			d_itm_cd(value);
			return;
		}
		if ($d_itm_sub1_view.equalsIgnoreCase(name)) {
			d_itm_sub1_view(value);
			return;
		}
		if ($d_itm_sub2_view.equalsIgnoreCase(name)) {
			d_itm_sub2_view(value);
			return;
		}
		if ($d_itm_sub3_view.equalsIgnoreCase(name)) {
			d_itm_sub3_view(value);
			return;
		}
		if ($d_itm_sub1_data.equalsIgnoreCase(name)) {
			d_itm_sub1_data(value);
			return;
		}
		if ($d_itm_sub2_data.equalsIgnoreCase(name)) {
			d_itm_sub2_data(value);
			return;
		}
		if ($d_itm_sub3_data.equalsIgnoreCase(name)) {
			d_itm_sub3_data(value);
			return;
		}
		if ($d_itm_nm.equalsIgnoreCase(name)) {
			d_itm_nm(value);
			return;
		}
		if ($d_itm_alt_nm1.equalsIgnoreCase(name)) {
			d_itm_alt_nm1(value);
			return;
		}
		if ($d_itm_alt_nm2.equalsIgnoreCase(name)) {
			d_itm_alt_nm2(value);
			return;
		}
		if ($d_itm_alt_nm3.equalsIgnoreCase(name)) {
			d_itm_alt_nm3(value);
			return;
		}
		if ($d_itm_alt_nm4.equalsIgnoreCase(name)) {
			d_itm_alt_nm4(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_qty(value);
			return;
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_fxd_rqmt_qty(value);
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
		if ($s_int_par_inst_qty.equalsIgnoreCase(name)) {
			s_int_par_inst_qty(value);
			return;
		}
		if ($s_dec_par_inst_qty.equalsIgnoreCase(name)) {
			s_dec_par_inst_qty(value);
			return;
		}
		if ($s_int_chd_inpt_qty.equalsIgnoreCase(name)) {
			s_int_chd_inpt_qty(value);
			return;
		}
		if ($s_dec_chd_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_chd_inpt_qty(value);
			return;
		}
		if ($s_int_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_chd_rqmt_qty(value);
			return;
		}
		if ($s_dec_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_chd_rqmt_qty(value);
			return;
		}
		if ($s_int_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_fxd_chd_rqmt_qty(value);
			return;
		}
		if ($s_dec_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			in_offst_typ_nm(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			schd_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($d_oper_inst_typ.equalsIgnoreCase(name)) {
			d_oper_inst_typ(value);
			return;
		}
		if ($d_itm_cd.equalsIgnoreCase(name)) {
			d_itm_cd(value);
			return;
		}
		if ($d_itm_sub1_view.equalsIgnoreCase(name)) {
			d_itm_sub1_view(value);
			return;
		}
		if ($d_itm_sub2_view.equalsIgnoreCase(name)) {
			d_itm_sub2_view(value);
			return;
		}
		if ($d_itm_sub3_view.equalsIgnoreCase(name)) {
			d_itm_sub3_view(value);
			return;
		}
		if ($d_itm_sub1_data.equalsIgnoreCase(name)) {
			d_itm_sub1_data(value);
			return;
		}
		if ($d_itm_sub2_data.equalsIgnoreCase(name)) {
			d_itm_sub2_data(value);
			return;
		}
		if ($d_itm_sub3_data.equalsIgnoreCase(name)) {
			d_itm_sub3_data(value);
			return;
		}
		if ($d_itm_nm.equalsIgnoreCase(name)) {
			d_itm_nm(value);
			return;
		}
		if ($d_itm_alt_nm1.equalsIgnoreCase(name)) {
			d_itm_alt_nm1(value);
			return;
		}
		if ($d_itm_alt_nm2.equalsIgnoreCase(name)) {
			d_itm_alt_nm2(value);
			return;
		}
		if ($d_itm_alt_nm3.equalsIgnoreCase(name)) {
			d_itm_alt_nm3(value);
			return;
		}
		if ($d_itm_alt_nm4.equalsIgnoreCase(name)) {
			d_itm_alt_nm4(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_qty(value);
			return;
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_fxd_rqmt_qty(value);
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
		if ($s_int_par_inst_qty.equalsIgnoreCase(name)) {
			s_int_par_inst_qty(value);
			return;
		}
		if ($s_dec_par_inst_qty.equalsIgnoreCase(name)) {
			s_dec_par_inst_qty(value);
			return;
		}
		if ($s_int_chd_inpt_qty.equalsIgnoreCase(name)) {
			s_int_chd_inpt_qty(value);
			return;
		}
		if ($s_dec_chd_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_chd_inpt_qty(value);
			return;
		}
		if ($s_int_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_chd_rqmt_qty(value);
			return;
		}
		if ($s_dec_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_chd_rqmt_qty(value);
			return;
		}
		if ($s_int_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_fxd_chd_rqmt_qty(value);
			return;
		}
		if ($s_dec_fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			in_offst_typ_nm(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($d_mfg_inst_rev_no.equalsIgnoreCase(name)) {
			d_mfg_inst_rev_no(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($bom_id_no.equalsIgnoreCase(name)) {
			bom_id_no(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($d_disp_seq.equalsIgnoreCase(name)) {
			d_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($schd_hm.equalsIgnoreCase(name)) {
			schd_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

