package mcframe.serverMSBE.MSBEL1750;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public static final String $sim_cnd_grp_no = "sim_cnd_grp_no";
	public static final String $PL_d = "PL_d";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public static final String $cntnr_nm = "cntnr_nm";
	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public static final String $sum_qty = "sum_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $pl_d_no = $PL_d + ".pl_d_no";
	public static final String $itm_cd = $PL_d + ".itm_cd";
	public static final String $itm_sub1 = $PL_d + ".itm_sub1";
	public static final String $itm_sub2 = $PL_d + ".itm_sub2";
	public static final String $itm_sub3 = $PL_d + ".itm_sub3";
	public static final String $sundry_flg = $PL_d + ".sundry_itm_flg";
	public static final String $itm_nm = $PL_d + ".itm_nm";
	public static final String $sno1 = $PL_d + ".sno1";
	public static final String $sno2 = $PL_d + ".sno2";
	public static final String $sno3 = $PL_d + ".sno3";
	public static final String $sno4 = $PL_d + ".sno4";
	public static final String $iv_itm_nm = $PL_d + ".iv_itm_nm";
	public static final String $cntry_org_cd = $PL_d + ".cntry_org_cd";
	public static final String $trd_unit_cd = $PL_d + ".trd_unit_cd";
	public static final String $trd_unit_qty = $PL_d + ".trd_unit_qty";
	public static final String $cntnr_cd = $PL_d + ".cntnr_cd";
	public static final String $cntnr_no_fr = $PL_d + ".cntnr_no_fr";
	public static final String $cntnr_no_to = $PL_d + ".cntnr_no_to";
	public static final String $net_wt = $PL_d + ".net_wt";
	public static final String $grss_wt = $PL_d + ".grss_wt";
	public static final String $dim = $PL_d + ".dim";
	public static final String $pl_d_rmrks = $PL_d + ".pl_d_rmrks";
	public static final String $cst_po_no = $PL_d + ".cst_po_no";
	public static final String $cst_po_d_no = $PL_d + ".cst_po_d_no";
	public static final String $cst_itm_cd = $PL_d + ".cst_itm_cd";
	public static final String $cst_itm_nm = $PL_d + ".cst_itm_nm";
	public static final String $intr_d_rmrks = $PL_d + ".intr_d_rmrks";
	public static final String $sub_char1 = $PL_d + ".sub_char1";
	public static final String $sub_char2 = $PL_d + ".sub_char2";
	public static final String $sub_char3 = $PL_d + ".sub_char3";
	public static final String $disp_seq = $PL_d + ".disp_seq";

	public static final MCMeta sim_cnd_grp_no_META = createCommonMeta($sim_cnd_grp_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta PL_d_META = createInnerRowMeta($PL_d, mcframe.serverMS.dbc.MST_PL_D_R.class);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cntnr_nm_META = createCommonMeta($cntnr_nm, mcframe.commonMA.meta.MA_META.CNTNR_NM);
	public static final MCMeta sum_qty_META = createCommonMeta($sum_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk01_DtlR> constMetas = new ConstMetaList<Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sim_cnd_grp_no_META,
			PL_d_META,
			sundry_itm_flg_META,
			cntry_org_nm_META,
			trd_unit_nm_META,
			cntnr_nm_META,
			sum_qty_META,
			trd_unit_dec_place_META,
			err_flg_META
		},
		new String[][]{
			{
				"pl_d_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"sundry_flg",
				"itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"iv_itm_nm",
				"cntry_org_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"cntnr_cd",
				"cntnr_no_fr",
				"cntnr_no_to",
				"net_wt",
				"grss_wt",
				"dim",
				"pl_d_rmrks",
				"cst_po_no",
				"cst_po_d_no",
				"cst_itm_cd",
				"cst_itm_nm",
				"intr_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"disp_seq"
			},
			{
				$pl_d_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$sundry_flg,
				$itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$iv_itm_nm,
				$cntry_org_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$cntnr_cd,
				$cntnr_no_fr,
				$cntnr_no_to,
				$net_wt,
				$grss_wt,
				$dim,
				$pl_d_rmrks,
				$cst_po_no,
				$cst_po_d_no,
				$cst_itm_cd,
				$cst_itm_nm,
				$intr_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$disp_seq
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$PL_d + ".sno1", "E"},	// PL_d.sno1
				{$PL_d + ".sno2", "E"},	// PL_d.sno2
				{$PL_d + ".sno3", "E"},	// PL_d.sno3
				{$PL_d + ".sno4", "E"}	// PL_d.sno4
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$PL_d + ".itm_cd", "E"},	// PL_d.itm_cd
				{$PL_d + ".trd_unit_cd", "E"},	// PL_d.trd_unit_cd
				{$PL_d + ".trd_unit_qty", "E"}	// PL_d.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$PL_d + ".trd_unit_qty", "positive"},	// PL_d.trd_unit_qty
				{$PL_d + ".net_wt", "positive"},	// PL_d.net_wt
				{$PL_d + ".grss_wt", "positive"},	// PL_d.grss_wt
				{$PL_d + ".dim", "positive"}	// PL_d.dim
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$PL_d + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// PL_d.itm_sub3
				{$PL_d + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// PL_d.trd_unit_cd
				{$PL_d + ".cntnr_cd", "MA.MAUAL0010.ExCntnr"}	// PL_d.cntnr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$PL_d + ".trd_unit_cd", "trd_unit_dec_place"}	// PL_d.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$PL_d + ".trd_unit_cd", "dec_place"}	// PL_d.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$PL_d + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2"},	// PL_d.itm_sub3
				{$PL_d + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// PL_d.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$PL_d + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// PL_d.itm_sub3
				{$PL_d + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// PL_d.trd_unit_cd
			}
		))
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Chk01_DtlR_MC_A(ConstMetaList<? extends Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR clone() {
		return (Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR createInstance() {
		return (Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR getValues(String... names) {
		return (Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public MCNumber sim_cnd_grp_no() {
		return getConstNumber(offset + 0, $sim_cnd_grp_no);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(MCNumber value) {
		setConstNumber(offset + 0, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(int value) {
		setConstNumber(offset + 0, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(long value) {
		setConstNumber(offset + 0, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(float value) {
		setConstNumber(offset + 0, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(double value) {
		setConstNumber(offset + 0, $sim_cnd_grp_no, value);
	}


	public mcframe.serverMS.dbc.MST_PL_D_R PL_d(){
		return (mcframe.serverMS.dbc.MST_PL_D_R) getConstInnerRow(offset + 1, $PL_d);
	}
	
	public void PL_d(mcframe.serverMS.dbc.MST_PL_D_R row){
		setConstInnerRow(offset + 1, $PL_d, row);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 2, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 2, $sundry_itm_flg, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 3, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 3, $cntry_org_nm, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 4, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 4, $trd_unit_nm, value);
	}


	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public String cntnr_nm() {
		return getConstString(offset + 5, $cntnr_nm);
	}

	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public void cntnr_nm(String value) {
		setConstString(offset + 5, $cntnr_nm, value);
	}


	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public MCNumber sum_qty() {
		return getConstNumber(offset + 6, $sum_qty);
	}

	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public void sum_qty(MCNumber value) {
		setConstNumber(offset + 6, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public void sum_qty(int value) {
		setConstNumber(offset + 6, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public void sum_qty(long value) {
		setConstNumber(offset + 6, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public void sum_qty(float value) {
		setConstNumber(offset + 6, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数.<p>
	 *
	 */
	public void sum_qty(double value) {
		setConstNumber(offset + 6, $sum_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 7, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 8, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 8, $err_flg, value);
	}


	public String getString(String name) {
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			return cntnr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			return sim_cnd_grp_no();
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			return sum_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			return cntnr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			return sim_cnd_grp_no();
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			return sum_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			cntnr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			cntnr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($PL_d.equalsIgnoreCase(name)) {
			return PL_d();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($PL_d.equalsIgnoreCase(name)) {
			PL_d(
				((MCContainerMeta) PL_d_META).castInnerRow(mcframe.serverMS.dbc.MST_PL_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Packing list details No. パッキングリスト明細ＮＯ.<p>
	 *
	 */
	public String pl_d_no() {
		return PL_d().pl_d_no();
	}

	/**
	 * Packing list details No. パッキングリスト明細ＮＯ.<p>
	 *
	 */
	public void pl_d_no(String value) {
		PL_d().pl_d_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return PL_d().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		PL_d().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return PL_d().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		PL_d().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return PL_d().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		PL_d().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return PL_d().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		PL_d().itm_sub3(value);
	}

	public boolean sundry_flg() {
		return PL_d().sundry_itm_flg();
	}

	public void sundry_flg(boolean value) {
		PL_d().sundry_itm_flg(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return PL_d().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		PL_d().itm_nm(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return PL_d().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		PL_d().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return PL_d().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		PL_d().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return PL_d().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		PL_d().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return PL_d().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		PL_d().sno4(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return PL_d().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		PL_d().iv_itm_nm(value);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return PL_d().cntry_org_cd();
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		PL_d().cntry_org_cd(value);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return PL_d().trd_unit_cd();
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		PL_d().trd_unit_cd(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return PL_d().trd_unit_qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		PL_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		PL_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		PL_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		PL_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		PL_d().trd_unit_qty(value);
	}

	/**
	 * Packing container 梱包容器.<p>
	 *
	 */
	public String cntnr_cd() {
		return PL_d().cntnr_cd();
	}

	/**
	 * Packing container 梱包容器.<p>
	 *
	 */
	public void cntnr_cd(String value) {
		PL_d().cntnr_cd(value);
	}

	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public MCNumber cntnr_no_fr() {
		return PL_d().cntnr_no_fr();
	}

	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(MCNumber value) {
		PL_d().cntnr_no_fr(value);
	}

	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(int value) {
		PL_d().cntnr_no_fr(value);
	}

	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(long value) {
		PL_d().cntnr_no_fr(value);
	}

	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(float value) {
		PL_d().cntnr_no_fr(value);
	}

	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public void cntnr_no_fr(double value) {
		PL_d().cntnr_no_fr(value);
	}

	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public MCNumber cntnr_no_to() {
		return PL_d().cntnr_no_to();
	}

	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(MCNumber value) {
		PL_d().cntnr_no_to(value);
	}

	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(int value) {
		PL_d().cntnr_no_to(value);
	}

	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(long value) {
		PL_d().cntnr_no_to(value);
	}

	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(float value) {
		PL_d().cntnr_no_to(value);
	}

	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public void cntnr_no_to(double value) {
		PL_d().cntnr_no_to(value);
	}

	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public MCNumber net_wt() {
		return PL_d().net_wt();
	}

	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public void net_wt(MCNumber value) {
		PL_d().net_wt(value);
	}

	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public void net_wt(int value) {
		PL_d().net_wt(value);
	}

	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public void net_wt(long value) {
		PL_d().net_wt(value);
	}

	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public void net_wt(float value) {
		PL_d().net_wt(value);
	}

	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public void net_wt(double value) {
		PL_d().net_wt(value);
	}

	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public MCNumber grss_wt() {
		return PL_d().grss_wt();
	}

	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public void grss_wt(MCNumber value) {
		PL_d().grss_wt(value);
	}

	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public void grss_wt(int value) {
		PL_d().grss_wt(value);
	}

	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public void grss_wt(long value) {
		PL_d().grss_wt(value);
	}

	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public void grss_wt(float value) {
		PL_d().grss_wt(value);
	}

	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public void grss_wt(double value) {
		PL_d().grss_wt(value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber dim() {
		return PL_d().dim();
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(MCNumber value) {
		PL_d().dim(value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(int value) {
		PL_d().dim(value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(long value) {
		PL_d().dim(value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(float value) {
		PL_d().dim(value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(double value) {
		PL_d().dim(value);
	}

	/**
	 * P/L details remarks Ｐ／Ｌ明細備考.<p>
	 *
	 */
	public String pl_d_rmrks() {
		return PL_d().pl_d_rmrks();
	}

	/**
	 * P/L details remarks Ｐ／Ｌ明細備考.<p>
	 *
	 */
	public void pl_d_rmrks(String value) {
		PL_d().pl_d_rmrks(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return PL_d().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		PL_d().cst_po_no(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return PL_d().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		PL_d().cst_po_d_no(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return PL_d().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		PL_d().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品目名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return PL_d().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品目名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		PL_d().cst_itm_nm(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return PL_d().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		PL_d().intr_d_rmrks(value);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return PL_d().sub_char1();
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		PL_d().sub_char1(value);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return PL_d().sub_char2();
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		PL_d().sub_char2(value);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return PL_d().sub_char3();
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		PL_d().sub_char3(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return PL_d().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		PL_d().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		PL_d().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		PL_d().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		PL_d().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		PL_d().disp_seq(value);
	}

}

