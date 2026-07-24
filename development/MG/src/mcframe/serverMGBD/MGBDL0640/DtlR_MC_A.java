package mcframe.serverMGBD.MGBDL0640;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 * <br>
 * @see mcframe.serverMGBD.MGBDL0640.DtlL_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_R {

	/**
	 * Calculation category cd. 計算カテゴリーＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * (Copy-to) Item cd. （コピー先）品目ＣＤ.<p>
	 *
	 */
	public static final String $dest_itm_cd = "dest_itm_cd";
	/**
	 * (Copy-to) Branch No. 1 （コピー先）枝番１.<p>
	 *
	 */
	public static final String $dest_itm_sub1 = "dest_itm_sub1";
	/**
	 * (Copy-to) Branch No. 2 （コピー先）枝番２.<p>
	 *
	 */
	public static final String $dest_itm_sub2 = "dest_itm_sub2";
	/**
	 * (Copy-to) Branch No. 3 （コピー先）枝番３.<p>
	 *
	 */
	public static final String $dest_itm_sub3 = "dest_itm_sub3";
	/**
	 * (Copy-to) Item name （コピー先）品名.<p>
	 *
	 */
	public static final String $dest_itm_nm = "dest_itm_nm";
	/**
	 * (Copy-to) Inventory management type （コピー先）在庫管理区分.<p>
	 *
	 */
	public static final String $dest_stk_mng_typ = "dest_stk_mng_typ";
	/**
	 * (Copy-to) Asset management type （コピー先）資産管理区分.<p>
	 *
	 */
	public static final String $dest_asset_mng_typ = "dest_asset_mng_typ";
	/**
	 * (Copy-to) Base unit cd. （コピー先）基準単位ＣＤ.<p>
	 *
	 */
	public static final String $dest_base_unit_cd = "dest_base_unit_cd";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $mam_itm_ = "mam_itm_";
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public static final String $mgt_itm = "mgt_itm";
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public static final String $mgt_itm_dtl = "mgt_itm_dtl";
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public static final String $mgt_itm_oper = "mgt_itm_oper";
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public static final String $mgt_bom = "mgt_bom";
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public static final String $mgt_itm_wk = "mgt_itm_wk";
	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public static final String $mgt_itm_purc = "mgt_itm_purc";
	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public static final String $mgt_itm_proc = "mgt_itm_proc";
	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public static final String $mgt_itm_prov = "mgt_itm_prov";
	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public static final String $mgt_itm_sls = "mgt_itm_sls";
	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public static final String $mgt_itm_fix = "mgt_itm_fix";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $copy_mam_itm_ = "copy_mam_itm_";
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public static final String $copy_mgt_itm = "copy_mgt_itm";
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public static final String $copy_mgt_itm_dtl = "copy_mgt_itm_dtl";
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public static final String $copy_mgt_itm_oper = "copy_mgt_itm_oper";
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public static final String $copy_mgt_bom = "copy_mgt_bom";
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public static final String $copy_mgt_itm_wk = "copy_mgt_itm_wk";
	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_purc = "copy_mgt_itm_purc";
	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_proc = "copy_mgt_itm_proc";
	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_prov = "copy_mgt_itm_prov";
	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public static final String $copy_mgt_itm_sls = "copy_mgt_itm_sls";
	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public static final String $copy_mgt_itm_fix = "copy_mgt_itm_fix";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dest_itm_cd_META = createCommonMeta($dest_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta dest_itm_sub1_META = createCommonMeta($dest_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta dest_itm_sub2_META = createCommonMeta($dest_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta dest_itm_sub3_META = createCommonMeta($dest_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta dest_itm_nm_META = createCommonMeta($dest_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta dest_stk_mng_typ_META = createCommonMeta($dest_stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta dest_asset_mng_typ_META = createCommonMeta($dest_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta dest_base_unit_cd_META = createCommonMeta($dest_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta mam_itm__META = createCommonMeta($mam_itm_, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_META = createCommonMeta($mgt_itm, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_dtl_META = createCommonMeta($mgt_itm_dtl, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_oper_META = createCommonMeta($mgt_itm_oper, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_bom_META = createCommonMeta($mgt_bom, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_wk_META = createCommonMeta($mgt_itm_wk, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_purc_META = createCommonMeta($mgt_itm_purc, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_proc_META = createCommonMeta($mgt_itm_proc, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_prov_META = createCommonMeta($mgt_itm_prov, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_sls_META = createCommonMeta($mgt_itm_sls, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mgt_itm_fix_META = createCommonMeta($mgt_itm_fix, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta copy_mam_itm__META = createCommonMeta($copy_mam_itm_, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_META = createCommonMeta($copy_mgt_itm, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_dtl_META = createCommonMeta($copy_mgt_itm_dtl, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_oper_META = createCommonMeta($copy_mgt_itm_oper, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_bom_META = createCommonMeta($copy_mgt_bom, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_wk_META = createCommonMeta($copy_mgt_itm_wk, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_purc_META = createCommonMeta($copy_mgt_itm_purc, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_proc_META = createCommonMeta($copy_mgt_itm_proc, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_prov_META = createCommonMeta($copy_mgt_itm_prov, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_sls_META = createCommonMeta($copy_mgt_itm_sls, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_mgt_itm_fix_META = createCommonMeta($copy_mgt_itm_fix, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_R.constMetas,
		new MCMeta[]{
			calc_ctg_cd_META,
			term_META,
			itm_typ_nm_META,
			itm_typ_d_nm_META,
			itm_jnl_nm_META,
			base_unit_cd_META,
			dest_itm_cd_META,
			dest_itm_sub1_META,
			dest_itm_sub2_META,
			dest_itm_sub3_META,
			dest_itm_nm_META,
			dest_stk_mng_typ_META,
			dest_asset_mng_typ_META,
			dest_base_unit_cd_META,
			mam_itm__META,
			mgt_itm_META,
			mgt_itm_dtl_META,
			mgt_itm_oper_META,
			mgt_bom_META,
			mgt_itm_wk_META,
			mgt_itm_purc_META,
			mgt_itm_proc_META,
			mgt_itm_prov_META,
			mgt_itm_sls_META,
			mgt_itm_fix_META,
			copy_mam_itm__META,
			copy_mgt_itm_META,
			copy_mgt_itm_dtl_META,
			copy_mgt_itm_oper_META,
			copy_mgt_bom_META,
			copy_mgt_itm_wk_META,
			copy_mgt_itm_purc_META,
			copy_mgt_itm_proc_META,
			copy_mgt_itm_prov_META,
			copy_mgt_itm_sls_META,
			copy_mgt_itm_fix_META,
			rtn_sts_typ_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$calc_ctg_cd, "E"},	// calc_ctg_cd
				{$term, "E"},	// term
				{$itm_cd, "E"}	// itm_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
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
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$dest_itm_sub3, "MA.MAUAL0010.ItmSub3"}	// dest_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "stk_mng_typ;asset_mng_typ;base_unit_cd"},	// itm_sub3
				{$dest_itm_sub3, "dest_stk_mng_typ;dest_asset_mng_typ;dest_base_unit_cd"}	// dest_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "stk_mng_typ;asset_mng_typ;unit_cd"},	// itm_sub3
				{$dest_itm_sub3, "stk_mng_typ;asset_mng_typ;unit_cd"}	// dest_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$dest_itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;dest_itm_cd;dest_itm_sub1;dest_itm_sub2;true;true"}	// dest_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$dest_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// dest_itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$dest_itm_sub1, "E"},	// dest_itm_sub1
				{$dest_itm_sub2, "E"},	// dest_itm_sub2
				{$dest_itm_sub3, "E"}	// dest_itm_sub3
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation category cd. 計算カテゴリーＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 0, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリーＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 0, $calc_ctg_cd, value);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 1, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 1, $term, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 2, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 2, $itm_typ_nm, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 3, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 3, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 4, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 4, $itm_jnl_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 5, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 5, $base_unit_cd, value);
	}


	/**
	 * (Copy-to) Item cd. （コピー先）品目ＣＤ.<p>
	 *
	 */
	public String dest_itm_cd() {
		return getConstString(offset + 6, $dest_itm_cd);
	}

	/**
	 * (Copy-to) Item cd. （コピー先）品目ＣＤ.<p>
	 *
	 */
	public void dest_itm_cd(String value) {
		setConstString(offset + 6, $dest_itm_cd, value);
	}


	/**
	 * (Copy-to) Branch No. 1 （コピー先）枝番１.<p>
	 *
	 */
	public String dest_itm_sub1() {
		return getConstString(offset + 7, $dest_itm_sub1);
	}

	/**
	 * (Copy-to) Branch No. 1 （コピー先）枝番１.<p>
	 *
	 */
	public void dest_itm_sub1(String value) {
		setConstString(offset + 7, $dest_itm_sub1, value);
	}


	/**
	 * (Copy-to) Branch No. 2 （コピー先）枝番２.<p>
	 *
	 */
	public String dest_itm_sub2() {
		return getConstString(offset + 8, $dest_itm_sub2);
	}

	/**
	 * (Copy-to) Branch No. 2 （コピー先）枝番２.<p>
	 *
	 */
	public void dest_itm_sub2(String value) {
		setConstString(offset + 8, $dest_itm_sub2, value);
	}


	/**
	 * (Copy-to) Branch No. 3 （コピー先）枝番３.<p>
	 *
	 */
	public String dest_itm_sub3() {
		return getConstString(offset + 9, $dest_itm_sub3);
	}

	/**
	 * (Copy-to) Branch No. 3 （コピー先）枝番３.<p>
	 *
	 */
	public void dest_itm_sub3(String value) {
		setConstString(offset + 9, $dest_itm_sub3, value);
	}


	/**
	 * (Copy-to) Item name （コピー先）品名.<p>
	 *
	 */
	public String dest_itm_nm() {
		return getConstString(offset + 10, $dest_itm_nm);
	}

	/**
	 * (Copy-to) Item name （コピー先）品名.<p>
	 *
	 */
	public void dest_itm_nm(String value) {
		setConstString(offset + 10, $dest_itm_nm, value);
	}


	/**
	 * (Copy-to) Inventory management type （コピー先）在庫管理区分.<p>
	 *
	 */
	public String dest_stk_mng_typ() {
		return getConstString(offset + 11, $dest_stk_mng_typ);
	}

	/**
	 * (Copy-to) Inventory management type （コピー先）在庫管理区分.<p>
	 *
	 */
	public void dest_stk_mng_typ(String value) {
		setConstString(offset + 11, $dest_stk_mng_typ, value);
	}


	/**
	 * (Copy-to) Asset management type （コピー先）資産管理区分.<p>
	 *
	 */
	public String dest_asset_mng_typ() {
		return getConstString(offset + 12, $dest_asset_mng_typ);
	}

	/**
	 * (Copy-to) Asset management type （コピー先）資産管理区分.<p>
	 *
	 */
	public void dest_asset_mng_typ(String value) {
		setConstString(offset + 12, $dest_asset_mng_typ, value);
	}


	/**
	 * (Copy-to) Base unit cd. （コピー先）基準単位ＣＤ.<p>
	 *
	 */
	public String dest_base_unit_cd() {
		return getConstString(offset + 13, $dest_base_unit_cd);
	}

	/**
	 * (Copy-to) Base unit cd. （コピー先）基準単位ＣＤ.<p>
	 *
	 */
	public void dest_base_unit_cd(String value) {
		setConstString(offset + 13, $dest_base_unit_cd, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public MCNumber mam_itm_() {
		return getConstNumber(offset + 14, $mam_itm_);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void mam_itm_(MCNumber value) {
		setConstNumber(offset + 14, $mam_itm_, value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void mam_itm_(int value) {
		setConstNumber(offset + 14, $mam_itm_, value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void mam_itm_(long value) {
		setConstNumber(offset + 14, $mam_itm_, value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void mam_itm_(float value) {
		setConstNumber(offset + 14, $mam_itm_, value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void mam_itm_(double value) {
		setConstNumber(offset + 14, $mam_itm_, value);
	}


	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public MCNumber mgt_itm() {
		return getConstNumber(offset + 15, $mgt_itm);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(MCNumber value) {
		setConstNumber(offset + 15, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(int value) {
		setConstNumber(offset + 15, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(long value) {
		setConstNumber(offset + 15, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(float value) {
		setConstNumber(offset + 15, $mgt_itm, value);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void mgt_itm(double value) {
		setConstNumber(offset + 15, $mgt_itm, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public MCNumber mgt_itm_dtl() {
		return getConstNumber(offset + 16, $mgt_itm_dtl);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(MCNumber value) {
		setConstNumber(offset + 16, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(int value) {
		setConstNumber(offset + 16, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(long value) {
		setConstNumber(offset + 16, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(float value) {
		setConstNumber(offset + 16, $mgt_itm_dtl, value);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void mgt_itm_dtl(double value) {
		setConstNumber(offset + 16, $mgt_itm_dtl, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public MCNumber mgt_itm_oper() {
		return getConstNumber(offset + 17, $mgt_itm_oper);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(MCNumber value) {
		setConstNumber(offset + 17, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(int value) {
		setConstNumber(offset + 17, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(long value) {
		setConstNumber(offset + 17, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(float value) {
		setConstNumber(offset + 17, $mgt_itm_oper, value);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void mgt_itm_oper(double value) {
		setConstNumber(offset + 17, $mgt_itm_oper, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public MCNumber mgt_bom() {
		return getConstNumber(offset + 18, $mgt_bom);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(MCNumber value) {
		setConstNumber(offset + 18, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(int value) {
		setConstNumber(offset + 18, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(long value) {
		setConstNumber(offset + 18, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(float value) {
		setConstNumber(offset + 18, $mgt_bom, value);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void mgt_bom(double value) {
		setConstNumber(offset + 18, $mgt_bom, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public MCNumber mgt_itm_wk() {
		return getConstNumber(offset + 19, $mgt_itm_wk);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(MCNumber value) {
		setConstNumber(offset + 19, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(int value) {
		setConstNumber(offset + 19, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(long value) {
		setConstNumber(offset + 19, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(float value) {
		setConstNumber(offset + 19, $mgt_itm_wk, value);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void mgt_itm_wk(double value) {
		setConstNumber(offset + 19, $mgt_itm_wk, value);
	}


	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public MCNumber mgt_itm_purc() {
		return getConstNumber(offset + 20, $mgt_itm_purc);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(MCNumber value) {
		setConstNumber(offset + 20, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(int value) {
		setConstNumber(offset + 20, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(long value) {
		setConstNumber(offset + 20, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(float value) {
		setConstNumber(offset + 20, $mgt_itm_purc, value);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void mgt_itm_purc(double value) {
		setConstNumber(offset + 20, $mgt_itm_purc, value);
	}


	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public MCNumber mgt_itm_proc() {
		return getConstNumber(offset + 21, $mgt_itm_proc);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(MCNumber value) {
		setConstNumber(offset + 21, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(int value) {
		setConstNumber(offset + 21, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(long value) {
		setConstNumber(offset + 21, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(float value) {
		setConstNumber(offset + 21, $mgt_itm_proc, value);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void mgt_itm_proc(double value) {
		setConstNumber(offset + 21, $mgt_itm_proc, value);
	}


	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public MCNumber mgt_itm_prov() {
		return getConstNumber(offset + 22, $mgt_itm_prov);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(MCNumber value) {
		setConstNumber(offset + 22, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(int value) {
		setConstNumber(offset + 22, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(long value) {
		setConstNumber(offset + 22, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(float value) {
		setConstNumber(offset + 22, $mgt_itm_prov, value);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void mgt_itm_prov(double value) {
		setConstNumber(offset + 22, $mgt_itm_prov, value);
	}


	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public MCNumber mgt_itm_sls() {
		return getConstNumber(offset + 23, $mgt_itm_sls);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(MCNumber value) {
		setConstNumber(offset + 23, $mgt_itm_sls, value);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(int value) {
		setConstNumber(offset + 23, $mgt_itm_sls, value);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(long value) {
		setConstNumber(offset + 23, $mgt_itm_sls, value);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(float value) {
		setConstNumber(offset + 23, $mgt_itm_sls, value);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void mgt_itm_sls(double value) {
		setConstNumber(offset + 23, $mgt_itm_sls, value);
	}


	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public MCNumber mgt_itm_fix() {
		return getConstNumber(offset + 24, $mgt_itm_fix);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(MCNumber value) {
		setConstNumber(offset + 24, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(int value) {
		setConstNumber(offset + 24, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(long value) {
		setConstNumber(offset + 24, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(float value) {
		setConstNumber(offset + 24, $mgt_itm_fix, value);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void mgt_itm_fix(double value) {
		setConstNumber(offset + 24, $mgt_itm_fix, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean copy_mam_itm_() {
		return getConstBoolean(offset + 25, $copy_mam_itm_);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void copy_mam_itm_(boolean value) {
		setConstBoolean(offset + 25, $copy_mam_itm_, value);
	}


	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public boolean copy_mgt_itm() {
		return getConstBoolean(offset + 26, $copy_mgt_itm);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void copy_mgt_itm(boolean value) {
		setConstBoolean(offset + 26, $copy_mgt_itm, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public boolean copy_mgt_itm_dtl() {
		return getConstBoolean(offset + 27, $copy_mgt_itm_dtl);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void copy_mgt_itm_dtl(boolean value) {
		setConstBoolean(offset + 27, $copy_mgt_itm_dtl, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public boolean copy_mgt_itm_oper() {
		return getConstBoolean(offset + 28, $copy_mgt_itm_oper);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void copy_mgt_itm_oper(boolean value) {
		setConstBoolean(offset + 28, $copy_mgt_itm_oper, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public boolean copy_mgt_bom() {
		return getConstBoolean(offset + 29, $copy_mgt_bom);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void copy_mgt_bom(boolean value) {
		setConstBoolean(offset + 29, $copy_mgt_bom, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public boolean copy_mgt_itm_wk() {
		return getConstBoolean(offset + 30, $copy_mgt_itm_wk);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void copy_mgt_itm_wk(boolean value) {
		setConstBoolean(offset + 30, $copy_mgt_itm_wk, value);
	}


	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_purc() {
		return getConstBoolean(offset + 31, $copy_mgt_itm_purc);
	}

	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public void copy_mgt_itm_purc(boolean value) {
		setConstBoolean(offset + 31, $copy_mgt_itm_purc, value);
	}


	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_proc() {
		return getConstBoolean(offset + 32, $copy_mgt_itm_proc);
	}

	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public void copy_mgt_itm_proc(boolean value) {
		setConstBoolean(offset + 32, $copy_mgt_itm_proc, value);
	}


	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_prov() {
		return getConstBoolean(offset + 33, $copy_mgt_itm_prov);
	}

	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public void copy_mgt_itm_prov(boolean value) {
		setConstBoolean(offset + 33, $copy_mgt_itm_prov, value);
	}


	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public boolean copy_mgt_itm_sls() {
		return getConstBoolean(offset + 34, $copy_mgt_itm_sls);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void copy_mgt_itm_sls(boolean value) {
		setConstBoolean(offset + 34, $copy_mgt_itm_sls, value);
	}


	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public boolean copy_mgt_itm_fix() {
		return getConstBoolean(offset + 35, $copy_mgt_itm_fix);
	}

	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public void copy_mgt_itm_fix(boolean value) {
		setConstBoolean(offset + 35, $copy_mgt_itm_fix, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 36, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 36, $rtn_sts_typ, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 37, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 37, $err_flg, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($dest_itm_cd.equalsIgnoreCase(name)) {
			return dest_itm_cd();
		}
		if ($dest_itm_sub1.equalsIgnoreCase(name)) {
			return dest_itm_sub1();
		}
		if ($dest_itm_sub2.equalsIgnoreCase(name)) {
			return dest_itm_sub2();
		}
		if ($dest_itm_sub3.equalsIgnoreCase(name)) {
			return dest_itm_sub3();
		}
		if ($dest_itm_nm.equalsIgnoreCase(name)) {
			return dest_itm_nm();
		}
		if ($dest_stk_mng_typ.equalsIgnoreCase(name)) {
			return dest_stk_mng_typ();
		}
		if ($dest_asset_mng_typ.equalsIgnoreCase(name)) {
			return dest_asset_mng_typ();
		}
		if ($dest_base_unit_cd.equalsIgnoreCase(name)) {
			return dest_base_unit_cd();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			return mam_itm_();
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			return mgt_itm();
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			return mgt_itm_dtl();
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			return mgt_itm_oper();
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			return mgt_bom();
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			return mgt_itm_wk();
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			return mgt_itm_purc();
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			return mgt_itm_proc();
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			return mgt_itm_prov();
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			return mgt_itm_sls();
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			return mgt_itm_fix();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			return copy_mam_itm_();
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			return copy_mgt_itm();
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			return copy_mgt_itm_dtl();
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			return copy_mgt_itm_oper();
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			return copy_mgt_bom();
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			return copy_mgt_itm_wk();
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_purc();
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_proc();
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			return copy_mgt_itm_prov();
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			return copy_mgt_itm_sls();
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			return copy_mgt_itm_fix();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($dest_itm_cd.equalsIgnoreCase(name)) {
			return dest_itm_cd();
		}
		if ($dest_itm_sub1.equalsIgnoreCase(name)) {
			return dest_itm_sub1();
		}
		if ($dest_itm_sub2.equalsIgnoreCase(name)) {
			return dest_itm_sub2();
		}
		if ($dest_itm_sub3.equalsIgnoreCase(name)) {
			return dest_itm_sub3();
		}
		if ($dest_itm_nm.equalsIgnoreCase(name)) {
			return dest_itm_nm();
		}
		if ($dest_stk_mng_typ.equalsIgnoreCase(name)) {
			return dest_stk_mng_typ();
		}
		if ($dest_asset_mng_typ.equalsIgnoreCase(name)) {
			return dest_asset_mng_typ();
		}
		if ($dest_base_unit_cd.equalsIgnoreCase(name)) {
			return dest_base_unit_cd();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			return mam_itm_();
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			return mgt_itm();
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			return mgt_itm_dtl();
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			return mgt_itm_oper();
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			return mgt_bom();
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			return mgt_itm_wk();
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			return mgt_itm_purc();
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			return mgt_itm_proc();
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			return mgt_itm_prov();
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			return mgt_itm_sls();
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			return mgt_itm_fix();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			return copy_mam_itm_();
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			return copy_mgt_itm();
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			return copy_mgt_itm_dtl();
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			return copy_mgt_itm_oper();
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			return copy_mgt_bom();
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			return copy_mgt_itm_wk();
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_purc();
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			return copy_mgt_itm_proc();
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			return copy_mgt_itm_prov();
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			return copy_mgt_itm_sls();
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			return copy_mgt_itm_fix();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($dest_itm_cd.equalsIgnoreCase(name)) {
			dest_itm_cd(value);
			return;
		}
		if ($dest_itm_sub1.equalsIgnoreCase(name)) {
			dest_itm_sub1(value);
			return;
		}
		if ($dest_itm_sub2.equalsIgnoreCase(name)) {
			dest_itm_sub2(value);
			return;
		}
		if ($dest_itm_sub3.equalsIgnoreCase(name)) {
			dest_itm_sub3(value);
			return;
		}
		if ($dest_itm_nm.equalsIgnoreCase(name)) {
			dest_itm_nm(value);
			return;
		}
		if ($dest_stk_mng_typ.equalsIgnoreCase(name)) {
			dest_stk_mng_typ(value);
			return;
		}
		if ($dest_asset_mng_typ.equalsIgnoreCase(name)) {
			dest_asset_mng_typ(value);
			return;
		}
		if ($dest_base_unit_cd.equalsIgnoreCase(name)) {
			dest_base_unit_cd(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			copy_mam_itm_(value);
			return;
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			copy_mgt_itm(value);
			return;
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			copy_mgt_itm_dtl(value);
			return;
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			copy_mgt_itm_oper(value);
			return;
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			copy_mgt_bom(value);
			return;
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			copy_mgt_itm_wk(value);
			return;
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			copy_mgt_itm_purc(value);
			return;
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			copy_mgt_itm_proc(value);
			return;
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			copy_mgt_itm_prov(value);
			return;
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			copy_mgt_itm_sls(value);
			return;
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			copy_mgt_itm_fix(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($dest_itm_cd.equalsIgnoreCase(name)) {
			dest_itm_cd(value);
			return;
		}
		if ($dest_itm_sub1.equalsIgnoreCase(name)) {
			dest_itm_sub1(value);
			return;
		}
		if ($dest_itm_sub2.equalsIgnoreCase(name)) {
			dest_itm_sub2(value);
			return;
		}
		if ($dest_itm_sub3.equalsIgnoreCase(name)) {
			dest_itm_sub3(value);
			return;
		}
		if ($dest_itm_nm.equalsIgnoreCase(name)) {
			dest_itm_nm(value);
			return;
		}
		if ($dest_stk_mng_typ.equalsIgnoreCase(name)) {
			dest_stk_mng_typ(value);
			return;
		}
		if ($dest_asset_mng_typ.equalsIgnoreCase(name)) {
			dest_asset_mng_typ(value);
			return;
		}
		if ($dest_base_unit_cd.equalsIgnoreCase(name)) {
			dest_base_unit_cd(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mam_itm_.equalsIgnoreCase(name)) {
			mam_itm_(value);
			return;
		}
		if ($mgt_itm.equalsIgnoreCase(name)) {
			mgt_itm(value);
			return;
		}
		if ($mgt_itm_dtl.equalsIgnoreCase(name)) {
			mgt_itm_dtl(value);
			return;
		}
		if ($mgt_itm_oper.equalsIgnoreCase(name)) {
			mgt_itm_oper(value);
			return;
		}
		if ($mgt_bom.equalsIgnoreCase(name)) {
			mgt_bom(value);
			return;
		}
		if ($mgt_itm_wk.equalsIgnoreCase(name)) {
			mgt_itm_wk(value);
			return;
		}
		if ($mgt_itm_purc.equalsIgnoreCase(name)) {
			mgt_itm_purc(value);
			return;
		}
		if ($mgt_itm_proc.equalsIgnoreCase(name)) {
			mgt_itm_proc(value);
			return;
		}
		if ($mgt_itm_prov.equalsIgnoreCase(name)) {
			mgt_itm_prov(value);
			return;
		}
		if ($mgt_itm_sls.equalsIgnoreCase(name)) {
			mgt_itm_sls(value);
			return;
		}
		if ($mgt_itm_fix.equalsIgnoreCase(name)) {
			mgt_itm_fix(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($copy_mam_itm_.equalsIgnoreCase(name)) {
			copy_mam_itm_(value);
			return;
		}
		if ($copy_mgt_itm.equalsIgnoreCase(name)) {
			copy_mgt_itm(value);
			return;
		}
		if ($copy_mgt_itm_dtl.equalsIgnoreCase(name)) {
			copy_mgt_itm_dtl(value);
			return;
		}
		if ($copy_mgt_itm_oper.equalsIgnoreCase(name)) {
			copy_mgt_itm_oper(value);
			return;
		}
		if ($copy_mgt_bom.equalsIgnoreCase(name)) {
			copy_mgt_bom(value);
			return;
		}
		if ($copy_mgt_itm_wk.equalsIgnoreCase(name)) {
			copy_mgt_itm_wk(value);
			return;
		}
		if ($copy_mgt_itm_purc.equalsIgnoreCase(name)) {
			copy_mgt_itm_purc(value);
			return;
		}
		if ($copy_mgt_itm_proc.equalsIgnoreCase(name)) {
			copy_mgt_itm_proc(value);
			return;
		}
		if ($copy_mgt_itm_prov.equalsIgnoreCase(name)) {
			copy_mgt_itm_prov(value);
			return;
		}
		if ($copy_mgt_itm_sls.equalsIgnoreCase(name)) {
			copy_mgt_itm_sls(value);
			return;
		}
		if ($copy_mgt_itm_fix.equalsIgnoreCase(name)) {
			copy_mgt_itm_fix(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

