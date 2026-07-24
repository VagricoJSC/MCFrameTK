package mcframe.serverMSBI.MSBIL0010;

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
 * ブロック"Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Final closing 本締.<p>
	 *
	 */
	public static final String $cl_flg = "cl_flg";
	/**
	 * Release final closing 本締解除.<p>
	 *
	 */
	public static final String $rel_cl_flg = "rel_cl_flg";
	/**
	 * Temporary closing 仮締.<p>
	 *
	 */
	public static final String $pre_cl_flg = "pre_cl_flg";
	/**
	 * Release temporary closing 仮締解除.<p>
	 *
	 */
	public static final String $rel_pre_cl_flg = "rel_pre_cl_flg";
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public static final String $sls_cl_flg = "sls_cl_flg";
	/**
	 * Payment received 入金.<p>
	 *
	 */
	public static final String $rcv_cl_flg = "rcv_cl_flg";
	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public static final String $purc_cl_flg = "purc_cl_flg";
	/**
	 * Payment 支払.<p>
	 *
	 */
	public static final String $pay_cl_flg = "pay_cl_flg";
	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public static final String $stk_cl_flg = "stk_cl_flg";
	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public static final String $ar_pre_cl_flg = "ar_pre_cl_flg";
	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public static final String $ap_pre_cl_flg = "ap_pre_cl_flg";
	/**
	 * All AR customer temporary closing 全売掛先仮締.<p>
	 *
	 */
	public static final String $all_acst_pre_cl_flg = "all_acst_pre_cl_flg";
	/**
	 * All AR customer temporary closing (for server processing) 全売掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public static final String $for_sv_all_acst_pre_cl_flg = "for_sv_all_acst_pre_cl_flg";
	/**
	 * All AP supplier temporary closing 全買掛先仮締.<p>
	 *
	 */
	public static final String $all_asppl_pre_cl_flg = "all_asppl_pre_cl_flg";
	/**
	 * All AP supplier temporary closing (for server processing) 全買掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public static final String $for_sv_all_asppl_pre_cl_flg = "for_sv_all_asppl_pre_cl_flg";
	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public static final String $sls_cl_ym = "sls_cl_ym";
	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public static final String $rcv_cl_ym = "rcv_cl_ym";
	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public static final String $purc_cl_ym = "purc_cl_ym";
	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public static final String $pay_cl_ym = "pay_cl_ym";
	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public static final String $stk_cl_ym = "stk_cl_ym";
	/**
	 * Sales closing execution date and time 売上締実行日時.<p>
	 *
	 */
	public static final String $sls_cl_tm = "sls_cl_tm";
	/**
	 * Payment received closing execution date and time 入金締実行日時.<p>
	 *
	 */
	public static final String $rcv_cl_tm = "rcv_cl_tm";
	/**
	 * Purchase closing execution date and time 仕入締実行日時.<p>
	 *
	 */
	public static final String $purc_cl_tm = "purc_cl_tm";
	/**
	 * Payment closing execution date and time 支払締実行日時.<p>
	 *
	 */
	public static final String $pay_cl_tm = "pay_cl_tm";
	/**
	 * Inventory closing execution date and time 在庫締実行日時.<p>
	 *
	 */
	public static final String $stk_cl_tm = "stk_cl_tm";
	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public static final String $ar_pre_cl_tm = "ar_pre_cl_tm";
	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public static final String $ap_pre_cl_tm = "ap_pre_cl_tm";
	/**
	 * Sales closing PIC cd. 売上締担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_cl_usr_cd = "sls_cl_usr_cd";
	/**
	 * Sales closing PIC name 売上締担当者名.<p>
	 *
	 */
	public static final String $sls_cl_usr_nm = "sls_cl_usr_nm";
	/**
	 * Payment received closing PIC cd. 入金締担当者ＣＤ.<p>
	 *
	 */
	public static final String $rcv_cl_usr_cd = "rcv_cl_usr_cd";
	/**
	 * Payment received closing PIC name 入金締担当者名.<p>
	 *
	 */
	public static final String $rcv_cl_usr_nm = "rcv_cl_usr_nm";
	/**
	 * Purchase closing PIC cd. 仕入締担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_cl_usr_cd = "purc_cl_usr_cd";
	/**
	 * Purchase closing PIC name 仕入締担当者名.<p>
	 *
	 */
	public static final String $purc_cl_usr_nm = "purc_cl_usr_nm";
	/**
	 * Payment closing PIC cd. 支払締担当者ＣＤ.<p>
	 *
	 */
	public static final String $pay_cl_usr_cd = "pay_cl_usr_cd";
	/**
	 * Payment closing PIC name 支払締担当者名.<p>
	 *
	 */
	public static final String $pay_cl_usr_nm = "pay_cl_usr_nm";
	/**
	 * Inventory closing PIC cd. 在庫締担当者ＣＤ.<p>
	 *
	 */
	public static final String $stk_cl_usr_cd = "stk_cl_usr_cd";
	/**
	 * Inventory closing PIC name 在庫締担当者名.<p>
	 *
	 */
	public static final String $stk_cl_usr_nm = "stk_cl_usr_nm";
	/**
	 * AR temporary closing PIC cd. 売掛仮締担当者ＣＤ.<p>
	 *
	 */
	public static final String $ar_pre_cl_usr_cd = "ar_pre_cl_usr_cd";
	/**
	 * AR temporary closing PIC name 売掛仮締担当者名.<p>
	 *
	 */
	public static final String $ar_pre_cl_usr_nm = "ar_pre_cl_usr_nm";
	/**
	 * AP temporary closing PIC cd. 買掛仮締担当者ＣＤ.<p>
	 *
	 */
	public static final String $ap_pre_cl_usr_cd = "ap_pre_cl_usr_cd";
	/**
	 * AP temporarily closing PIC name 買掛仮締担当者名.<p>
	 *
	 */
	public static final String $ap_pre_cl_usr_nm = "ap_pre_cl_usr_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta cl_flg_META = createCommonMeta($cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rel_cl_flg_META = createCommonMeta($rel_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_cl_flg_META = createCommonMeta($pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rel_pre_cl_flg_META = createCommonMeta($rel_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_flg_META = createCommonMeta($sls_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cl_flg_META = createCommonMeta($rcv_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cl_flg_META = createCommonMeta($purc_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cl_flg_META = createCommonMeta($pay_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_cl_flg_META = createCommonMeta($stk_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_pre_cl_flg_META = createCommonMeta($ar_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_pre_cl_flg_META = createCommonMeta($ap_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_acst_pre_cl_flg_META = createCommonMeta($all_acst_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta for_sv_all_acst_pre_cl_flg_META = createCommonMeta($for_sv_all_acst_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_asppl_pre_cl_flg_META = createCommonMeta($all_asppl_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta for_sv_all_asppl_pre_cl_flg_META = createCommonMeta($for_sv_all_asppl_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_ym_META = createCommonMeta($sls_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rcv_cl_ym_META = createCommonMeta($rcv_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta purc_cl_ym_META = createCommonMeta($purc_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pay_cl_ym_META = createCommonMeta($pay_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta stk_cl_ym_META = createCommonMeta($stk_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_cl_tm_META = createCommonMeta($sls_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rcv_cl_tm_META = createCommonMeta($rcv_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta purc_cl_tm_META = createCommonMeta($purc_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pay_cl_tm_META = createCommonMeta($pay_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta stk_cl_tm_META = createCommonMeta($stk_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ar_pre_cl_tm_META = createCommonMeta($ar_pre_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ap_pre_cl_tm_META = createCommonMeta($ap_pre_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sls_cl_usr_cd_META = createCommonMeta($sls_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_cl_usr_nm_META = createCommonMeta($sls_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_cl_usr_cd_META = createCommonMeta($rcv_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_cl_usr_nm_META = createCommonMeta($rcv_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta purc_cl_usr_cd_META = createCommonMeta($purc_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_cl_usr_nm_META = createCommonMeta($purc_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pay_cl_usr_cd_META = createCommonMeta($pay_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_cl_usr_nm_META = createCommonMeta($pay_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta stk_cl_usr_cd_META = createCommonMeta($stk_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta stk_cl_usr_nm_META = createCommonMeta($stk_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ar_pre_cl_usr_cd_META = createCommonMeta($ar_pre_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ar_pre_cl_usr_nm_META = createCommonMeta($ar_pre_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ap_pre_cl_usr_cd_META = createCommonMeta($ap_pre_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ap_pre_cl_usr_nm_META = createCommonMeta($ap_pre_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_HdrR> constMetas = new ConstMetaList<Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			cl_flg_META,
			rel_cl_flg_META,
			pre_cl_flg_META,
			rel_pre_cl_flg_META,
			sls_cl_flg_META,
			rcv_cl_flg_META,
			purc_cl_flg_META,
			pay_cl_flg_META,
			stk_cl_flg_META,
			ar_pre_cl_flg_META,
			ap_pre_cl_flg_META,
			all_acst_pre_cl_flg_META,
			for_sv_all_acst_pre_cl_flg_META,
			all_asppl_pre_cl_flg_META,
			for_sv_all_asppl_pre_cl_flg_META,
			sls_cl_ym_META,
			rcv_cl_ym_META,
			purc_cl_ym_META,
			pay_cl_ym_META,
			stk_cl_ym_META,
			sls_cl_tm_META,
			rcv_cl_tm_META,
			purc_cl_tm_META,
			pay_cl_tm_META,
			stk_cl_tm_META,
			ar_pre_cl_tm_META,
			ap_pre_cl_tm_META,
			sls_cl_usr_cd_META,
			sls_cl_usr_nm_META,
			rcv_cl_usr_cd_META,
			rcv_cl_usr_nm_META,
			purc_cl_usr_cd_META,
			purc_cl_usr_nm_META,
			pay_cl_usr_cd_META,
			pay_cl_usr_nm_META,
			stk_cl_usr_cd_META,
			stk_cl_usr_nm_META,
			ar_pre_cl_usr_cd_META,
			ar_pre_cl_usr_nm_META,
			ap_pre_cl_usr_cd_META,
			ap_pre_cl_usr_nm_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
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
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ym, "E"}	// ym
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$sls_cl_flg, "E1"},	// sls_cl_flg
				{$rcv_cl_flg, "E1"},	// rcv_cl_flg
				{$purc_cl_flg, "E1"},	// purc_cl_flg
				{$pay_cl_flg, "E1"},	// pay_cl_flg
				{$stk_cl_flg, "E1"},	// stk_cl_flg
				{$ar_pre_cl_flg, "E2"},	// ar_pre_cl_flg
				{$ap_pre_cl_flg, "E2"}	// ap_pre_cl_flg
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
	protected Chk01_HdrR_MC_A(ConstMetaList<? extends Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR clone() {
		return (Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR createInstance() {
		return (Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR getValues(String... names) {
		return (Chk01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Final closing 本締.<p>
	 *
	 */
	public boolean cl_flg() {
		return getConstBoolean(offset + 1, $cl_flg);
	}

	/**
	 * Final closing 本締.<p>
	 *
	 */
	public void cl_flg(boolean value) {
		setConstBoolean(offset + 1, $cl_flg, value);
	}


	/**
	 * Release final closing 本締解除.<p>
	 *
	 */
	public boolean rel_cl_flg() {
		return getConstBoolean(offset + 2, $rel_cl_flg);
	}

	/**
	 * Release final closing 本締解除.<p>
	 *
	 */
	public void rel_cl_flg(boolean value) {
		setConstBoolean(offset + 2, $rel_cl_flg, value);
	}


	/**
	 * Temporary closing 仮締.<p>
	 *
	 */
	public boolean pre_cl_flg() {
		return getConstBoolean(offset + 3, $pre_cl_flg);
	}

	/**
	 * Temporary closing 仮締.<p>
	 *
	 */
	public void pre_cl_flg(boolean value) {
		setConstBoolean(offset + 3, $pre_cl_flg, value);
	}


	/**
	 * Release temporary closing 仮締解除.<p>
	 *
	 */
	public boolean rel_pre_cl_flg() {
		return getConstBoolean(offset + 4, $rel_pre_cl_flg);
	}

	/**
	 * Release temporary closing 仮締解除.<p>
	 *
	 */
	public void rel_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 4, $rel_pre_cl_flg, value);
	}


	/**
	 * Sales result 売上.<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return getConstBoolean(offset + 5, $sls_cl_flg);
	}

	/**
	 * Sales result 売上.<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		setConstBoolean(offset + 5, $sls_cl_flg, value);
	}


	/**
	 * Payment received 入金.<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return getConstBoolean(offset + 6, $rcv_cl_flg);
	}

	/**
	 * Payment received 入金.<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		setConstBoolean(offset + 6, $rcv_cl_flg, value);
	}


	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return getConstBoolean(offset + 7, $purc_cl_flg);
	}

	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		setConstBoolean(offset + 7, $purc_cl_flg, value);
	}


	/**
	 * Payment 支払.<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return getConstBoolean(offset + 8, $pay_cl_flg);
	}

	/**
	 * Payment 支払.<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		setConstBoolean(offset + 8, $pay_cl_flg, value);
	}


	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public boolean stk_cl_flg() {
		return getConstBoolean(offset + 9, $stk_cl_flg);
	}

	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public void stk_cl_flg(boolean value) {
		setConstBoolean(offset + 9, $stk_cl_flg, value);
	}


	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public boolean ar_pre_cl_flg() {
		return getConstBoolean(offset + 10, $ar_pre_cl_flg);
	}

	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public void ar_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 10, $ar_pre_cl_flg, value);
	}


	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public boolean ap_pre_cl_flg() {
		return getConstBoolean(offset + 11, $ap_pre_cl_flg);
	}

	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public void ap_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 11, $ap_pre_cl_flg, value);
	}


	/**
	 * All AR customer temporary closing 全売掛先仮締.<p>
	 *
	 */
	public boolean all_acst_pre_cl_flg() {
		return getConstBoolean(offset + 12, $all_acst_pre_cl_flg);
	}

	/**
	 * All AR customer temporary closing 全売掛先仮締.<p>
	 *
	 */
	public void all_acst_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 12, $all_acst_pre_cl_flg, value);
	}


	/**
	 * All AR customer temporary closing (for server processing) 全売掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public boolean for_sv_all_acst_pre_cl_flg() {
		return getConstBoolean(offset + 13, $for_sv_all_acst_pre_cl_flg);
	}

	/**
	 * All AR customer temporary closing (for server processing) 全売掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public void for_sv_all_acst_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 13, $for_sv_all_acst_pre_cl_flg, value);
	}


	/**
	 * All AP supplier temporary closing 全買掛先仮締.<p>
	 *
	 */
	public boolean all_asppl_pre_cl_flg() {
		return getConstBoolean(offset + 14, $all_asppl_pre_cl_flg);
	}

	/**
	 * All AP supplier temporary closing 全買掛先仮締.<p>
	 *
	 */
	public void all_asppl_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 14, $all_asppl_pre_cl_flg, value);
	}


	/**
	 * All AP supplier temporary closing (for server processing) 全買掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public boolean for_sv_all_asppl_pre_cl_flg() {
		return getConstBoolean(offset + 15, $for_sv_all_asppl_pre_cl_flg);
	}

	/**
	 * All AP supplier temporary closing (for server processing) 全買掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public void for_sv_all_asppl_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 15, $for_sv_all_asppl_pre_cl_flg, value);
	}


	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public MCDate sls_cl_ym() {
		return getConstDate(offset + 16, $sls_cl_ym);
	}

	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public void sls_cl_ym(MCDate value) {
		setConstDate(offset + 16, $sls_cl_ym, value);
	}


	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public MCDate rcv_cl_ym() {
		return getConstDate(offset + 17, $rcv_cl_ym);
	}

	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public void rcv_cl_ym(MCDate value) {
		setConstDate(offset + 17, $rcv_cl_ym, value);
	}


	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public MCDate purc_cl_ym() {
		return getConstDate(offset + 18, $purc_cl_ym);
	}

	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public void purc_cl_ym(MCDate value) {
		setConstDate(offset + 18, $purc_cl_ym, value);
	}


	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public MCDate pay_cl_ym() {
		return getConstDate(offset + 19, $pay_cl_ym);
	}

	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public void pay_cl_ym(MCDate value) {
		setConstDate(offset + 19, $pay_cl_ym, value);
	}


	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public MCDate stk_cl_ym() {
		return getConstDate(offset + 20, $stk_cl_ym);
	}

	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public void stk_cl_ym(MCDate value) {
		setConstDate(offset + 20, $stk_cl_ym, value);
	}


	/**
	 * Sales closing execution date and time 売上締実行日時.<p>
	 *
	 */
	public MCDate sls_cl_tm() {
		return getConstDate(offset + 21, $sls_cl_tm);
	}

	/**
	 * Sales closing execution date and time 売上締実行日時.<p>
	 *
	 */
	public void sls_cl_tm(MCDate value) {
		setConstDate(offset + 21, $sls_cl_tm, value);
	}


	/**
	 * Payment received closing execution date and time 入金締実行日時.<p>
	 *
	 */
	public MCDate rcv_cl_tm() {
		return getConstDate(offset + 22, $rcv_cl_tm);
	}

	/**
	 * Payment received closing execution date and time 入金締実行日時.<p>
	 *
	 */
	public void rcv_cl_tm(MCDate value) {
		setConstDate(offset + 22, $rcv_cl_tm, value);
	}


	/**
	 * Purchase closing execution date and time 仕入締実行日時.<p>
	 *
	 */
	public MCDate purc_cl_tm() {
		return getConstDate(offset + 23, $purc_cl_tm);
	}

	/**
	 * Purchase closing execution date and time 仕入締実行日時.<p>
	 *
	 */
	public void purc_cl_tm(MCDate value) {
		setConstDate(offset + 23, $purc_cl_tm, value);
	}


	/**
	 * Payment closing execution date and time 支払締実行日時.<p>
	 *
	 */
	public MCDate pay_cl_tm() {
		return getConstDate(offset + 24, $pay_cl_tm);
	}

	/**
	 * Payment closing execution date and time 支払締実行日時.<p>
	 *
	 */
	public void pay_cl_tm(MCDate value) {
		setConstDate(offset + 24, $pay_cl_tm, value);
	}


	/**
	 * Inventory closing execution date and time 在庫締実行日時.<p>
	 *
	 */
	public MCDate stk_cl_tm() {
		return getConstDate(offset + 25, $stk_cl_tm);
	}

	/**
	 * Inventory closing execution date and time 在庫締実行日時.<p>
	 *
	 */
	public void stk_cl_tm(MCDate value) {
		setConstDate(offset + 25, $stk_cl_tm, value);
	}


	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public MCDate ar_pre_cl_tm() {
		return getConstDate(offset + 26, $ar_pre_cl_tm);
	}

	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public void ar_pre_cl_tm(MCDate value) {
		setConstDate(offset + 26, $ar_pre_cl_tm, value);
	}


	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public MCDate ap_pre_cl_tm() {
		return getConstDate(offset + 27, $ap_pre_cl_tm);
	}

	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public void ap_pre_cl_tm(MCDate value) {
		setConstDate(offset + 27, $ap_pre_cl_tm, value);
	}


	/**
	 * Sales closing PIC cd. 売上締担当者ＣＤ.<p>
	 *
	 */
	public String sls_cl_usr_cd() {
		return getConstString(offset + 28, $sls_cl_usr_cd);
	}

	/**
	 * Sales closing PIC cd. 売上締担当者ＣＤ.<p>
	 *
	 */
	public void sls_cl_usr_cd(String value) {
		setConstString(offset + 28, $sls_cl_usr_cd, value);
	}


	/**
	 * Sales closing PIC name 売上締担当者名.<p>
	 *
	 */
	public String sls_cl_usr_nm() {
		return getConstString(offset + 29, $sls_cl_usr_nm);
	}

	/**
	 * Sales closing PIC name 売上締担当者名.<p>
	 *
	 */
	public void sls_cl_usr_nm(String value) {
		setConstString(offset + 29, $sls_cl_usr_nm, value);
	}


	/**
	 * Payment received closing PIC cd. 入金締担当者ＣＤ.<p>
	 *
	 */
	public String rcv_cl_usr_cd() {
		return getConstString(offset + 30, $rcv_cl_usr_cd);
	}

	/**
	 * Payment received closing PIC cd. 入金締担当者ＣＤ.<p>
	 *
	 */
	public void rcv_cl_usr_cd(String value) {
		setConstString(offset + 30, $rcv_cl_usr_cd, value);
	}


	/**
	 * Payment received closing PIC name 入金締担当者名.<p>
	 *
	 */
	public String rcv_cl_usr_nm() {
		return getConstString(offset + 31, $rcv_cl_usr_nm);
	}

	/**
	 * Payment received closing PIC name 入金締担当者名.<p>
	 *
	 */
	public void rcv_cl_usr_nm(String value) {
		setConstString(offset + 31, $rcv_cl_usr_nm, value);
	}


	/**
	 * Purchase closing PIC cd. 仕入締担当者ＣＤ.<p>
	 *
	 */
	public String purc_cl_usr_cd() {
		return getConstString(offset + 32, $purc_cl_usr_cd);
	}

	/**
	 * Purchase closing PIC cd. 仕入締担当者ＣＤ.<p>
	 *
	 */
	public void purc_cl_usr_cd(String value) {
		setConstString(offset + 32, $purc_cl_usr_cd, value);
	}


	/**
	 * Purchase closing PIC name 仕入締担当者名.<p>
	 *
	 */
	public String purc_cl_usr_nm() {
		return getConstString(offset + 33, $purc_cl_usr_nm);
	}

	/**
	 * Purchase closing PIC name 仕入締担当者名.<p>
	 *
	 */
	public void purc_cl_usr_nm(String value) {
		setConstString(offset + 33, $purc_cl_usr_nm, value);
	}


	/**
	 * Payment closing PIC cd. 支払締担当者ＣＤ.<p>
	 *
	 */
	public String pay_cl_usr_cd() {
		return getConstString(offset + 34, $pay_cl_usr_cd);
	}

	/**
	 * Payment closing PIC cd. 支払締担当者ＣＤ.<p>
	 *
	 */
	public void pay_cl_usr_cd(String value) {
		setConstString(offset + 34, $pay_cl_usr_cd, value);
	}


	/**
	 * Payment closing PIC name 支払締担当者名.<p>
	 *
	 */
	public String pay_cl_usr_nm() {
		return getConstString(offset + 35, $pay_cl_usr_nm);
	}

	/**
	 * Payment closing PIC name 支払締担当者名.<p>
	 *
	 */
	public void pay_cl_usr_nm(String value) {
		setConstString(offset + 35, $pay_cl_usr_nm, value);
	}


	/**
	 * Inventory closing PIC cd. 在庫締担当者ＣＤ.<p>
	 *
	 */
	public String stk_cl_usr_cd() {
		return getConstString(offset + 36, $stk_cl_usr_cd);
	}

	/**
	 * Inventory closing PIC cd. 在庫締担当者ＣＤ.<p>
	 *
	 */
	public void stk_cl_usr_cd(String value) {
		setConstString(offset + 36, $stk_cl_usr_cd, value);
	}


	/**
	 * Inventory closing PIC name 在庫締担当者名.<p>
	 *
	 */
	public String stk_cl_usr_nm() {
		return getConstString(offset + 37, $stk_cl_usr_nm);
	}

	/**
	 * Inventory closing PIC name 在庫締担当者名.<p>
	 *
	 */
	public void stk_cl_usr_nm(String value) {
		setConstString(offset + 37, $stk_cl_usr_nm, value);
	}


	/**
	 * AR temporary closing PIC cd. 売掛仮締担当者ＣＤ.<p>
	 *
	 */
	public String ar_pre_cl_usr_cd() {
		return getConstString(offset + 38, $ar_pre_cl_usr_cd);
	}

	/**
	 * AR temporary closing PIC cd. 売掛仮締担当者ＣＤ.<p>
	 *
	 */
	public void ar_pre_cl_usr_cd(String value) {
		setConstString(offset + 38, $ar_pre_cl_usr_cd, value);
	}


	/**
	 * AR temporary closing PIC name 売掛仮締担当者名.<p>
	 *
	 */
	public String ar_pre_cl_usr_nm() {
		return getConstString(offset + 39, $ar_pre_cl_usr_nm);
	}

	/**
	 * AR temporary closing PIC name 売掛仮締担当者名.<p>
	 *
	 */
	public void ar_pre_cl_usr_nm(String value) {
		setConstString(offset + 39, $ar_pre_cl_usr_nm, value);
	}


	/**
	 * AP temporary closing PIC cd. 買掛仮締担当者ＣＤ.<p>
	 *
	 */
	public String ap_pre_cl_usr_cd() {
		return getConstString(offset + 40, $ap_pre_cl_usr_cd);
	}

	/**
	 * AP temporary closing PIC cd. 買掛仮締担当者ＣＤ.<p>
	 *
	 */
	public void ap_pre_cl_usr_cd(String value) {
		setConstString(offset + 40, $ap_pre_cl_usr_cd, value);
	}


	/**
	 * AP temporarily closing PIC name 買掛仮締担当者名.<p>
	 *
	 */
	public String ap_pre_cl_usr_nm() {
		return getConstString(offset + 41, $ap_pre_cl_usr_nm);
	}

	/**
	 * AP temporarily closing PIC name 買掛仮締担当者名.<p>
	 *
	 */
	public void ap_pre_cl_usr_nm(String value) {
		setConstString(offset + 41, $ap_pre_cl_usr_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 42, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			return sls_cl_usr_cd();
		}
		if ($sls_cl_usr_nm.equalsIgnoreCase(name)) {
			return sls_cl_usr_nm();
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			return rcv_cl_usr_cd();
		}
		if ($rcv_cl_usr_nm.equalsIgnoreCase(name)) {
			return rcv_cl_usr_nm();
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			return purc_cl_usr_cd();
		}
		if ($purc_cl_usr_nm.equalsIgnoreCase(name)) {
			return purc_cl_usr_nm();
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			return pay_cl_usr_cd();
		}
		if ($pay_cl_usr_nm.equalsIgnoreCase(name)) {
			return pay_cl_usr_nm();
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			return stk_cl_usr_cd();
		}
		if ($stk_cl_usr_nm.equalsIgnoreCase(name)) {
			return stk_cl_usr_nm();
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ar_pre_cl_usr_cd();
		}
		if ($ar_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			return ar_pre_cl_usr_nm();
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ap_pre_cl_usr_cd();
		}
		if ($ap_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			return ap_pre_cl_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			return sls_cl_ym();
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			return rcv_cl_ym();
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			return purc_cl_ym();
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			return pay_cl_ym();
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			return stk_cl_ym();
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			return sls_cl_tm();
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			return rcv_cl_tm();
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			return purc_cl_tm();
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			return pay_cl_tm();
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			return stk_cl_tm();
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			return ar_pre_cl_tm();
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			return ap_pre_cl_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			return cl_flg();
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			return rel_cl_flg();
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			return pre_cl_flg();
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			return rel_pre_cl_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			return stk_cl_flg();
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			return ar_pre_cl_flg();
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return ap_pre_cl_flg();
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_acst_pre_cl_flg();
		}
		if ($for_sv_all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			return for_sv_all_acst_pre_cl_flg();
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_asppl_pre_cl_flg();
		}
		if ($for_sv_all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			return for_sv_all_asppl_pre_cl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			return sls_cl_usr_cd();
		}
		if ($sls_cl_usr_nm.equalsIgnoreCase(name)) {
			return sls_cl_usr_nm();
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			return rcv_cl_usr_cd();
		}
		if ($rcv_cl_usr_nm.equalsIgnoreCase(name)) {
			return rcv_cl_usr_nm();
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			return purc_cl_usr_cd();
		}
		if ($purc_cl_usr_nm.equalsIgnoreCase(name)) {
			return purc_cl_usr_nm();
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			return pay_cl_usr_cd();
		}
		if ($pay_cl_usr_nm.equalsIgnoreCase(name)) {
			return pay_cl_usr_nm();
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			return stk_cl_usr_cd();
		}
		if ($stk_cl_usr_nm.equalsIgnoreCase(name)) {
			return stk_cl_usr_nm();
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ar_pre_cl_usr_cd();
		}
		if ($ar_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			return ar_pre_cl_usr_nm();
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ap_pre_cl_usr_cd();
		}
		if ($ap_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			return ap_pre_cl_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			return sls_cl_ym();
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			return rcv_cl_ym();
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			return purc_cl_ym();
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			return pay_cl_ym();
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			return stk_cl_ym();
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			return sls_cl_tm();
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			return rcv_cl_tm();
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			return purc_cl_tm();
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			return pay_cl_tm();
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			return stk_cl_tm();
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			return ar_pre_cl_tm();
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			return ap_pre_cl_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			return cl_flg();
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			return rel_cl_flg();
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			return pre_cl_flg();
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			return rel_pre_cl_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			return stk_cl_flg();
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			return ar_pre_cl_flg();
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return ap_pre_cl_flg();
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_acst_pre_cl_flg();
		}
		if ($for_sv_all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			return for_sv_all_acst_pre_cl_flg();
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_asppl_pre_cl_flg();
		}
		if ($for_sv_all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			return for_sv_all_asppl_pre_cl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			sls_cl_usr_cd(value);
			return;
		}
		if ($sls_cl_usr_nm.equalsIgnoreCase(name)) {
			sls_cl_usr_nm(value);
			return;
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			rcv_cl_usr_cd(value);
			return;
		}
		if ($rcv_cl_usr_nm.equalsIgnoreCase(name)) {
			rcv_cl_usr_nm(value);
			return;
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			purc_cl_usr_cd(value);
			return;
		}
		if ($purc_cl_usr_nm.equalsIgnoreCase(name)) {
			purc_cl_usr_nm(value);
			return;
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			pay_cl_usr_cd(value);
			return;
		}
		if ($pay_cl_usr_nm.equalsIgnoreCase(name)) {
			pay_cl_usr_nm(value);
			return;
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			stk_cl_usr_cd(value);
			return;
		}
		if ($stk_cl_usr_nm.equalsIgnoreCase(name)) {
			stk_cl_usr_nm(value);
			return;
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ar_pre_cl_usr_cd(value);
			return;
		}
		if ($ar_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			ar_pre_cl_usr_nm(value);
			return;
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ap_pre_cl_usr_cd(value);
			return;
		}
		if ($ap_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			ap_pre_cl_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			sls_cl_ym(value);
			return;
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			rcv_cl_ym(value);
			return;
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			purc_cl_ym(value);
			return;
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			pay_cl_ym(value);
			return;
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			stk_cl_ym(value);
			return;
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			sls_cl_tm(value);
			return;
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			rcv_cl_tm(value);
			return;
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			purc_cl_tm(value);
			return;
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			pay_cl_tm(value);
			return;
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			stk_cl_tm(value);
			return;
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			ar_pre_cl_tm(value);
			return;
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			ap_pre_cl_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			cl_flg(value);
			return;
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			rel_cl_flg(value);
			return;
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			pre_cl_flg(value);
			return;
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			rel_pre_cl_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			stk_cl_flg(value);
			return;
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			ar_pre_cl_flg(value);
			return;
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			ap_pre_cl_flg(value);
			return;
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			all_acst_pre_cl_flg(value);
			return;
		}
		if ($for_sv_all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			for_sv_all_acst_pre_cl_flg(value);
			return;
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			all_asppl_pre_cl_flg(value);
			return;
		}
		if ($for_sv_all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			for_sv_all_asppl_pre_cl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			sls_cl_usr_cd(value);
			return;
		}
		if ($sls_cl_usr_nm.equalsIgnoreCase(name)) {
			sls_cl_usr_nm(value);
			return;
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			rcv_cl_usr_cd(value);
			return;
		}
		if ($rcv_cl_usr_nm.equalsIgnoreCase(name)) {
			rcv_cl_usr_nm(value);
			return;
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			purc_cl_usr_cd(value);
			return;
		}
		if ($purc_cl_usr_nm.equalsIgnoreCase(name)) {
			purc_cl_usr_nm(value);
			return;
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			pay_cl_usr_cd(value);
			return;
		}
		if ($pay_cl_usr_nm.equalsIgnoreCase(name)) {
			pay_cl_usr_nm(value);
			return;
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			stk_cl_usr_cd(value);
			return;
		}
		if ($stk_cl_usr_nm.equalsIgnoreCase(name)) {
			stk_cl_usr_nm(value);
			return;
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ar_pre_cl_usr_cd(value);
			return;
		}
		if ($ar_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			ar_pre_cl_usr_nm(value);
			return;
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ap_pre_cl_usr_cd(value);
			return;
		}
		if ($ap_pre_cl_usr_nm.equalsIgnoreCase(name)) {
			ap_pre_cl_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			sls_cl_ym(value);
			return;
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			rcv_cl_ym(value);
			return;
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			purc_cl_ym(value);
			return;
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			pay_cl_ym(value);
			return;
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			stk_cl_ym(value);
			return;
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			sls_cl_tm(value);
			return;
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			rcv_cl_tm(value);
			return;
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			purc_cl_tm(value);
			return;
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			pay_cl_tm(value);
			return;
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			stk_cl_tm(value);
			return;
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			ar_pre_cl_tm(value);
			return;
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			ap_pre_cl_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			cl_flg(value);
			return;
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			rel_cl_flg(value);
			return;
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			pre_cl_flg(value);
			return;
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			rel_pre_cl_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			stk_cl_flg(value);
			return;
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			ar_pre_cl_flg(value);
			return;
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			ap_pre_cl_flg(value);
			return;
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			all_acst_pre_cl_flg(value);
			return;
		}
		if ($for_sv_all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			for_sv_all_acst_pre_cl_flg(value);
			return;
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			all_asppl_pre_cl_flg(value);
			return;
		}
		if ($for_sv_all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			for_sv_all_asppl_pre_cl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

