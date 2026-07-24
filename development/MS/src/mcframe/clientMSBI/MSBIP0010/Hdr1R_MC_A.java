package mcframe.clientMSBI.MSBIP0010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Hdr1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Hdr1R_MC_A extends MCConstRow {

	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public static final String $cl_ope = "cl_ope";
	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public static final String $sls_cl_flg = "sls_cl_flg";
	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public static final String $sls_cl_ym = "sls_cl_ym";
	/**
	 * Last sales closing execution date and time 前回売上締実行日時.<p>
	 *
	 */
	public static final String $sls_cl_tm = "sls_cl_tm";
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
	 * Payment received closing 入金締.<p>
	 *
	 */
	public static final String $rcv_cl_flg = "rcv_cl_flg";
	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public static final String $rcv_cl_ym = "rcv_cl_ym";
	/**
	 * Last payment received closing execution date and time 前回入金締実行日時.<p>
	 *
	 */
	public static final String $rcv_cl_tm = "rcv_cl_tm";
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
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public static final String $purc_cl_flg = "purc_cl_flg";
	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public static final String $purc_cl_ym = "purc_cl_ym";
	/**
	 * Last purchase closing execution date and time 前回仕入締実行日時.<p>
	 *
	 */
	public static final String $purc_cl_tm = "purc_cl_tm";
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
	 * Payment closing 支払締.<p>
	 *
	 */
	public static final String $pay_cl_flg = "pay_cl_flg";
	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public static final String $pay_cl_ym = "pay_cl_ym";
	/**
	 * Last payment closing issue date and time 前回支払締実行日時.<p>
	 *
	 */
	public static final String $pay_cl_tm = "pay_cl_tm";
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
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public static final String $stk_cl_flg = "stk_cl_flg";
	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public static final String $stk_cl_ym = "stk_cl_ym";
	/**
	 * Last inventory closing execution date and time 前回在庫締実行日時.<p>
	 *
	 */
	public static final String $stk_cl_tm = "stk_cl_tm";
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
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public static final String $pre_cl_ope = "pre_cl_ope";
	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public static final String $ar_pre_cl_flg = "ar_pre_cl_flg";
	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public static final String $ar_pre_cl_tm = "ar_pre_cl_tm";
	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public static final String $db_ar_pre_cl_flg = "db_ar_pre_cl_flg";
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
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public static final String $ap_pre_cl_flg = "ap_pre_cl_flg";
	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public static final String $ap_pre_cl_tm = "ap_pre_cl_tm";
	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public static final String $db_ap_pre_cl_flg = "db_ap_pre_cl_flg";
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
	 * 0,All AR customer;1,Any AR customer 0,全売掛先;1,任意売掛先.<p>
	 *
	 */
	public static final String $ar_ope = "ar_ope";
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
	 * 0,All AP supplier;1,Any AP supplier 0,全買掛先;1,任意買掛先.<p>
	 *
	 */
	public static final String $ap_ope = "ap_ope";
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
	 * Fiscal month 年月度.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Closing at search 検索時締.<p>
	 *
	 */
	public static final String $srch_cl_flg = "srch_cl_flg";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta cl_ope_META = createStringMeta($cl_ope);
	public static final MCMeta sls_cl_flg_META = createCommonMeta($sls_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_ym_META = createCommonMeta($sls_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_cl_tm_META = createCommonMeta($sls_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sls_cl_usr_cd_META = createCommonMeta($sls_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_cl_usr_nm_META = createCommonMeta($sls_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_cl_flg_META = createCommonMeta($rcv_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cl_ym_META = createCommonMeta($rcv_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rcv_cl_tm_META = createCommonMeta($rcv_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rcv_cl_usr_cd_META = createCommonMeta($rcv_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_cl_usr_nm_META = createCommonMeta($rcv_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta purc_cl_flg_META = createCommonMeta($purc_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cl_ym_META = createCommonMeta($purc_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta purc_cl_tm_META = createCommonMeta($purc_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta purc_cl_usr_cd_META = createCommonMeta($purc_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_cl_usr_nm_META = createCommonMeta($purc_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pay_cl_flg_META = createCommonMeta($pay_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cl_ym_META = createCommonMeta($pay_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pay_cl_tm_META = createCommonMeta($pay_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pay_cl_usr_cd_META = createCommonMeta($pay_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_cl_usr_nm_META = createCommonMeta($pay_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta stk_cl_flg_META = createCommonMeta($stk_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_cl_ym_META = createCommonMeta($stk_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta stk_cl_tm_META = createCommonMeta($stk_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta stk_cl_usr_cd_META = createCommonMeta($stk_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta stk_cl_usr_nm_META = createCommonMeta($stk_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pre_cl_ope_META = createStringMeta($pre_cl_ope);
	public static final MCMeta ar_pre_cl_flg_META = createCommonMeta($ar_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_pre_cl_tm_META = createCommonMeta($ar_pre_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta db_ar_pre_cl_flg_META = createCommonMeta($db_ar_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_pre_cl_usr_cd_META = createCommonMeta($ar_pre_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ar_pre_cl_usr_nm_META = createCommonMeta($ar_pre_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ap_pre_cl_flg_META = createCommonMeta($ap_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_pre_cl_tm_META = createCommonMeta($ap_pre_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta db_ap_pre_cl_flg_META = createCommonMeta($db_ap_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_pre_cl_usr_cd_META = createCommonMeta($ap_pre_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ap_pre_cl_usr_nm_META = createCommonMeta($ap_pre_cl_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ar_ope_META = createStringMeta($ar_ope);
	public static final MCMeta all_acst_pre_cl_flg_META = createCommonMeta($all_acst_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta for_sv_all_acst_pre_cl_flg_META = createCommonMeta($for_sv_all_acst_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_ope_META = createStringMeta($ap_ope);
	public static final MCMeta all_asppl_pre_cl_flg_META = createCommonMeta($all_asppl_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta for_sv_all_asppl_pre_cl_flg_META = createCommonMeta($for_sv_all_asppl_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta srch_cl_flg_META = createCommonMeta($srch_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Hdr1R> constMetas = new ConstMetaList<Hdr1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cl_ope_META,
			sls_cl_flg_META,
			sls_cl_ym_META,
			sls_cl_tm_META,
			sls_cl_usr_cd_META,
			sls_cl_usr_nm_META,
			rcv_cl_flg_META,
			rcv_cl_ym_META,
			rcv_cl_tm_META,
			rcv_cl_usr_cd_META,
			rcv_cl_usr_nm_META,
			purc_cl_flg_META,
			purc_cl_ym_META,
			purc_cl_tm_META,
			purc_cl_usr_cd_META,
			purc_cl_usr_nm_META,
			pay_cl_flg_META,
			pay_cl_ym_META,
			pay_cl_tm_META,
			pay_cl_usr_cd_META,
			pay_cl_usr_nm_META,
			stk_cl_flg_META,
			stk_cl_ym_META,
			stk_cl_tm_META,
			stk_cl_usr_cd_META,
			stk_cl_usr_nm_META,
			pre_cl_ope_META,
			ar_pre_cl_flg_META,
			ar_pre_cl_tm_META,
			db_ar_pre_cl_flg_META,
			ar_pre_cl_usr_cd_META,
			ar_pre_cl_usr_nm_META,
			ap_pre_cl_flg_META,
			ap_pre_cl_tm_META,
			db_ap_pre_cl_flg_META,
			ap_pre_cl_usr_cd_META,
			ap_pre_cl_usr_nm_META,
			ar_ope_META,
			all_acst_pre_cl_flg_META,
			for_sv_all_acst_pre_cl_flg_META,
			ap_ope_META,
			all_asppl_pre_cl_flg_META,
			for_sv_all_asppl_pre_cl_flg_META,
			ym_META,
			srch_cl_flg_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected Hdr1R_MC_A(ConstMetaList<? extends Hdr1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R clone() {
		return (Hdr1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R createInstance() {
		return (Hdr1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R getValues(String... names) {
		return (Hdr1R) super.getValues(names);
	}



	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public String cl_ope() {
		return getConstString(offset + 0, $cl_ope);
	}

	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public void cl_ope(String value) {
		setConstString(offset + 0, $cl_ope, value);
	}


	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return getConstBoolean(offset + 1, $sls_cl_flg);
	}

	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		setConstBoolean(offset + 1, $sls_cl_flg, value);
	}


	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public MCDate sls_cl_ym() {
		return getConstDate(offset + 2, $sls_cl_ym);
	}

	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public void sls_cl_ym(MCDate value) {
		setConstDate(offset + 2, $sls_cl_ym, value);
	}


	/**
	 * Last sales closing execution date and time 前回売上締実行日時.<p>
	 *
	 */
	public MCDate sls_cl_tm() {
		return getConstDate(offset + 3, $sls_cl_tm);
	}

	/**
	 * Last sales closing execution date and time 前回売上締実行日時.<p>
	 *
	 */
	public void sls_cl_tm(MCDate value) {
		setConstDate(offset + 3, $sls_cl_tm, value);
	}


	/**
	 * Sales closing PIC cd. 売上締担当者ＣＤ.<p>
	 *
	 */
	public String sls_cl_usr_cd() {
		return getConstString(offset + 4, $sls_cl_usr_cd);
	}

	/**
	 * Sales closing PIC cd. 売上締担当者ＣＤ.<p>
	 *
	 */
	public void sls_cl_usr_cd(String value) {
		setConstString(offset + 4, $sls_cl_usr_cd, value);
	}


	/**
	 * Sales closing PIC name 売上締担当者名.<p>
	 *
	 */
	public String sls_cl_usr_nm() {
		return getConstString(offset + 5, $sls_cl_usr_nm);
	}

	/**
	 * Sales closing PIC name 売上締担当者名.<p>
	 *
	 */
	public void sls_cl_usr_nm(String value) {
		setConstString(offset + 5, $sls_cl_usr_nm, value);
	}


	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return getConstBoolean(offset + 6, $rcv_cl_flg);
	}

	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		setConstBoolean(offset + 6, $rcv_cl_flg, value);
	}


	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public MCDate rcv_cl_ym() {
		return getConstDate(offset + 7, $rcv_cl_ym);
	}

	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public void rcv_cl_ym(MCDate value) {
		setConstDate(offset + 7, $rcv_cl_ym, value);
	}


	/**
	 * Last payment received closing execution date and time 前回入金締実行日時.<p>
	 *
	 */
	public MCDate rcv_cl_tm() {
		return getConstDate(offset + 8, $rcv_cl_tm);
	}

	/**
	 * Last payment received closing execution date and time 前回入金締実行日時.<p>
	 *
	 */
	public void rcv_cl_tm(MCDate value) {
		setConstDate(offset + 8, $rcv_cl_tm, value);
	}


	/**
	 * Payment received closing PIC cd. 入金締担当者ＣＤ.<p>
	 *
	 */
	public String rcv_cl_usr_cd() {
		return getConstString(offset + 9, $rcv_cl_usr_cd);
	}

	/**
	 * Payment received closing PIC cd. 入金締担当者ＣＤ.<p>
	 *
	 */
	public void rcv_cl_usr_cd(String value) {
		setConstString(offset + 9, $rcv_cl_usr_cd, value);
	}


	/**
	 * Payment received closing PIC name 入金締担当者名.<p>
	 *
	 */
	public String rcv_cl_usr_nm() {
		return getConstString(offset + 10, $rcv_cl_usr_nm);
	}

	/**
	 * Payment received closing PIC name 入金締担当者名.<p>
	 *
	 */
	public void rcv_cl_usr_nm(String value) {
		setConstString(offset + 10, $rcv_cl_usr_nm, value);
	}


	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return getConstBoolean(offset + 11, $purc_cl_flg);
	}

	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		setConstBoolean(offset + 11, $purc_cl_flg, value);
	}


	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public MCDate purc_cl_ym() {
		return getConstDate(offset + 12, $purc_cl_ym);
	}

	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public void purc_cl_ym(MCDate value) {
		setConstDate(offset + 12, $purc_cl_ym, value);
	}


	/**
	 * Last purchase closing execution date and time 前回仕入締実行日時.<p>
	 *
	 */
	public MCDate purc_cl_tm() {
		return getConstDate(offset + 13, $purc_cl_tm);
	}

	/**
	 * Last purchase closing execution date and time 前回仕入締実行日時.<p>
	 *
	 */
	public void purc_cl_tm(MCDate value) {
		setConstDate(offset + 13, $purc_cl_tm, value);
	}


	/**
	 * Purchase closing PIC cd. 仕入締担当者ＣＤ.<p>
	 *
	 */
	public String purc_cl_usr_cd() {
		return getConstString(offset + 14, $purc_cl_usr_cd);
	}

	/**
	 * Purchase closing PIC cd. 仕入締担当者ＣＤ.<p>
	 *
	 */
	public void purc_cl_usr_cd(String value) {
		setConstString(offset + 14, $purc_cl_usr_cd, value);
	}


	/**
	 * Purchase closing PIC name 仕入締担当者名.<p>
	 *
	 */
	public String purc_cl_usr_nm() {
		return getConstString(offset + 15, $purc_cl_usr_nm);
	}

	/**
	 * Purchase closing PIC name 仕入締担当者名.<p>
	 *
	 */
	public void purc_cl_usr_nm(String value) {
		setConstString(offset + 15, $purc_cl_usr_nm, value);
	}


	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return getConstBoolean(offset + 16, $pay_cl_flg);
	}

	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		setConstBoolean(offset + 16, $pay_cl_flg, value);
	}


	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public MCDate pay_cl_ym() {
		return getConstDate(offset + 17, $pay_cl_ym);
	}

	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public void pay_cl_ym(MCDate value) {
		setConstDate(offset + 17, $pay_cl_ym, value);
	}


	/**
	 * Last payment closing issue date and time 前回支払締実行日時.<p>
	 *
	 */
	public MCDate pay_cl_tm() {
		return getConstDate(offset + 18, $pay_cl_tm);
	}

	/**
	 * Last payment closing issue date and time 前回支払締実行日時.<p>
	 *
	 */
	public void pay_cl_tm(MCDate value) {
		setConstDate(offset + 18, $pay_cl_tm, value);
	}


	/**
	 * Payment closing PIC cd. 支払締担当者ＣＤ.<p>
	 *
	 */
	public String pay_cl_usr_cd() {
		return getConstString(offset + 19, $pay_cl_usr_cd);
	}

	/**
	 * Payment closing PIC cd. 支払締担当者ＣＤ.<p>
	 *
	 */
	public void pay_cl_usr_cd(String value) {
		setConstString(offset + 19, $pay_cl_usr_cd, value);
	}


	/**
	 * Payment closing PIC name 支払締担当者名.<p>
	 *
	 */
	public String pay_cl_usr_nm() {
		return getConstString(offset + 20, $pay_cl_usr_nm);
	}

	/**
	 * Payment closing PIC name 支払締担当者名.<p>
	 *
	 */
	public void pay_cl_usr_nm(String value) {
		setConstString(offset + 20, $pay_cl_usr_nm, value);
	}


	/**
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public boolean stk_cl_flg() {
		return getConstBoolean(offset + 21, $stk_cl_flg);
	}

	/**
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public void stk_cl_flg(boolean value) {
		setConstBoolean(offset + 21, $stk_cl_flg, value);
	}


	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public MCDate stk_cl_ym() {
		return getConstDate(offset + 22, $stk_cl_ym);
	}

	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public void stk_cl_ym(MCDate value) {
		setConstDate(offset + 22, $stk_cl_ym, value);
	}


	/**
	 * Last inventory closing execution date and time 前回在庫締実行日時.<p>
	 *
	 */
	public MCDate stk_cl_tm() {
		return getConstDate(offset + 23, $stk_cl_tm);
	}

	/**
	 * Last inventory closing execution date and time 前回在庫締実行日時.<p>
	 *
	 */
	public void stk_cl_tm(MCDate value) {
		setConstDate(offset + 23, $stk_cl_tm, value);
	}


	/**
	 * Inventory closing PIC cd. 在庫締担当者ＣＤ.<p>
	 *
	 */
	public String stk_cl_usr_cd() {
		return getConstString(offset + 24, $stk_cl_usr_cd);
	}

	/**
	 * Inventory closing PIC cd. 在庫締担当者ＣＤ.<p>
	 *
	 */
	public void stk_cl_usr_cd(String value) {
		setConstString(offset + 24, $stk_cl_usr_cd, value);
	}


	/**
	 * Inventory closing PIC name 在庫締担当者名.<p>
	 *
	 */
	public String stk_cl_usr_nm() {
		return getConstString(offset + 25, $stk_cl_usr_nm);
	}

	/**
	 * Inventory closing PIC name 在庫締担当者名.<p>
	 *
	 */
	public void stk_cl_usr_nm(String value) {
		setConstString(offset + 25, $stk_cl_usr_nm, value);
	}


	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public String pre_cl_ope() {
		return getConstString(offset + 26, $pre_cl_ope);
	}

	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public void pre_cl_ope(String value) {
		setConstString(offset + 26, $pre_cl_ope, value);
	}


	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public boolean ar_pre_cl_flg() {
		return getConstBoolean(offset + 27, $ar_pre_cl_flg);
	}

	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public void ar_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 27, $ar_pre_cl_flg, value);
	}


	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public MCDate ar_pre_cl_tm() {
		return getConstDate(offset + 28, $ar_pre_cl_tm);
	}

	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public void ar_pre_cl_tm(MCDate value) {
		setConstDate(offset + 28, $ar_pre_cl_tm, value);
	}


	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public boolean db_ar_pre_cl_flg() {
		return getConstBoolean(offset + 29, $db_ar_pre_cl_flg);
	}

	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public void db_ar_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 29, $db_ar_pre_cl_flg, value);
	}


	/**
	 * AR temporary closing PIC cd. 売掛仮締担当者ＣＤ.<p>
	 *
	 */
	public String ar_pre_cl_usr_cd() {
		return getConstString(offset + 30, $ar_pre_cl_usr_cd);
	}

	/**
	 * AR temporary closing PIC cd. 売掛仮締担当者ＣＤ.<p>
	 *
	 */
	public void ar_pre_cl_usr_cd(String value) {
		setConstString(offset + 30, $ar_pre_cl_usr_cd, value);
	}


	/**
	 * AR temporary closing PIC name 売掛仮締担当者名.<p>
	 *
	 */
	public String ar_pre_cl_usr_nm() {
		return getConstString(offset + 31, $ar_pre_cl_usr_nm);
	}

	/**
	 * AR temporary closing PIC name 売掛仮締担当者名.<p>
	 *
	 */
	public void ar_pre_cl_usr_nm(String value) {
		setConstString(offset + 31, $ar_pre_cl_usr_nm, value);
	}


	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public boolean ap_pre_cl_flg() {
		return getConstBoolean(offset + 32, $ap_pre_cl_flg);
	}

	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public void ap_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 32, $ap_pre_cl_flg, value);
	}


	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public MCDate ap_pre_cl_tm() {
		return getConstDate(offset + 33, $ap_pre_cl_tm);
	}

	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public void ap_pre_cl_tm(MCDate value) {
		setConstDate(offset + 33, $ap_pre_cl_tm, value);
	}


	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public boolean db_ap_pre_cl_flg() {
		return getConstBoolean(offset + 34, $db_ap_pre_cl_flg);
	}

	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public void db_ap_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 34, $db_ap_pre_cl_flg, value);
	}


	/**
	 * AP temporary closing PIC cd. 買掛仮締担当者ＣＤ.<p>
	 *
	 */
	public String ap_pre_cl_usr_cd() {
		return getConstString(offset + 35, $ap_pre_cl_usr_cd);
	}

	/**
	 * AP temporary closing PIC cd. 買掛仮締担当者ＣＤ.<p>
	 *
	 */
	public void ap_pre_cl_usr_cd(String value) {
		setConstString(offset + 35, $ap_pre_cl_usr_cd, value);
	}


	/**
	 * AP temporarily closing PIC name 買掛仮締担当者名.<p>
	 *
	 */
	public String ap_pre_cl_usr_nm() {
		return getConstString(offset + 36, $ap_pre_cl_usr_nm);
	}

	/**
	 * AP temporarily closing PIC name 買掛仮締担当者名.<p>
	 *
	 */
	public void ap_pre_cl_usr_nm(String value) {
		setConstString(offset + 36, $ap_pre_cl_usr_nm, value);
	}


	/**
	 * 0,All AR customer;1,Any AR customer 0,全売掛先;1,任意売掛先.<p>
	 *
	 */
	public String ar_ope() {
		return getConstString(offset + 37, $ar_ope);
	}

	/**
	 * 0,All AR customer;1,Any AR customer 0,全売掛先;1,任意売掛先.<p>
	 *
	 */
	public void ar_ope(String value) {
		setConstString(offset + 37, $ar_ope, value);
	}


	/**
	 * All AR customer temporary closing 全売掛先仮締.<p>
	 *
	 */
	public boolean all_acst_pre_cl_flg() {
		return getConstBoolean(offset + 38, $all_acst_pre_cl_flg);
	}

	/**
	 * All AR customer temporary closing 全売掛先仮締.<p>
	 *
	 */
	public void all_acst_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 38, $all_acst_pre_cl_flg, value);
	}


	/**
	 * All AR customer temporary closing (for server processing) 全売掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public boolean for_sv_all_acst_pre_cl_flg() {
		return getConstBoolean(offset + 39, $for_sv_all_acst_pre_cl_flg);
	}

	/**
	 * All AR customer temporary closing (for server processing) 全売掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public void for_sv_all_acst_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 39, $for_sv_all_acst_pre_cl_flg, value);
	}


	/**
	 * 0,All AP supplier;1,Any AP supplier 0,全買掛先;1,任意買掛先.<p>
	 *
	 */
	public String ap_ope() {
		return getConstString(offset + 40, $ap_ope);
	}

	/**
	 * 0,All AP supplier;1,Any AP supplier 0,全買掛先;1,任意買掛先.<p>
	 *
	 */
	public void ap_ope(String value) {
		setConstString(offset + 40, $ap_ope, value);
	}


	/**
	 * All AP supplier temporary closing 全買掛先仮締.<p>
	 *
	 */
	public boolean all_asppl_pre_cl_flg() {
		return getConstBoolean(offset + 41, $all_asppl_pre_cl_flg);
	}

	/**
	 * All AP supplier temporary closing 全買掛先仮締.<p>
	 *
	 */
	public void all_asppl_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 41, $all_asppl_pre_cl_flg, value);
	}


	/**
	 * All AP supplier temporary closing (for server processing) 全買掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public boolean for_sv_all_asppl_pre_cl_flg() {
		return getConstBoolean(offset + 42, $for_sv_all_asppl_pre_cl_flg);
	}

	/**
	 * All AP supplier temporary closing (for server processing) 全買掛先仮締（サーバ処理用）.<p>
	 *
	 */
	public void for_sv_all_asppl_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 42, $for_sv_all_asppl_pre_cl_flg, value);
	}


	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 43, $ym);
	}

	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 43, $ym, value);
	}


	/**
	 * Closing at search 検索時締.<p>
	 *
	 */
	public boolean srch_cl_flg() {
		return getConstBoolean(offset + 44, $srch_cl_flg);
	}

	/**
	 * Closing at search 検索時締.<p>
	 *
	 */
	public void srch_cl_flg(boolean value) {
		setConstBoolean(offset + 44, $srch_cl_flg, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 45, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 45, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($cl_ope.equalsIgnoreCase(name)) {
			return cl_ope();
		}
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
		if ($pre_cl_ope.equalsIgnoreCase(name)) {
			return pre_cl_ope();
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
		if ($ar_ope.equalsIgnoreCase(name)) {
			return ar_ope();
		}
		if ($ap_ope.equalsIgnoreCase(name)) {
			return ap_ope();
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
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			return sls_cl_ym();
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			return sls_cl_tm();
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			return rcv_cl_ym();
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			return rcv_cl_tm();
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			return purc_cl_ym();
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			return purc_cl_tm();
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			return pay_cl_ym();
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			return pay_cl_tm();
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			return stk_cl_ym();
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
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
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
		if ($db_ar_pre_cl_flg.equalsIgnoreCase(name)) {
			return db_ar_pre_cl_flg();
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return ap_pre_cl_flg();
		}
		if ($db_ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return db_ap_pre_cl_flg();
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
		if ($srch_cl_flg.equalsIgnoreCase(name)) {
			return srch_cl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cl_ope.equalsIgnoreCase(name)) {
			return cl_ope();
		}
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
		if ($pre_cl_ope.equalsIgnoreCase(name)) {
			return pre_cl_ope();
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
		if ($ar_ope.equalsIgnoreCase(name)) {
			return ar_ope();
		}
		if ($ap_ope.equalsIgnoreCase(name)) {
			return ap_ope();
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
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			return sls_cl_ym();
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			return sls_cl_tm();
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			return rcv_cl_ym();
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			return rcv_cl_tm();
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			return purc_cl_ym();
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			return purc_cl_tm();
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			return pay_cl_ym();
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			return pay_cl_tm();
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			return stk_cl_ym();
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
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
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
		if ($db_ar_pre_cl_flg.equalsIgnoreCase(name)) {
			return db_ar_pre_cl_flg();
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return ap_pre_cl_flg();
		}
		if ($db_ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return db_ap_pre_cl_flg();
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
		if ($srch_cl_flg.equalsIgnoreCase(name)) {
			return srch_cl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cl_ope.equalsIgnoreCase(name)) {
			cl_ope(value);
			return;
		}
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
		if ($pre_cl_ope.equalsIgnoreCase(name)) {
			pre_cl_ope(value);
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
		if ($ar_ope.equalsIgnoreCase(name)) {
			ar_ope(value);
			return;
		}
		if ($ap_ope.equalsIgnoreCase(name)) {
			ap_ope(value);
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
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			sls_cl_ym(value);
			return;
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			sls_cl_tm(value);
			return;
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			rcv_cl_ym(value);
			return;
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			rcv_cl_tm(value);
			return;
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			purc_cl_ym(value);
			return;
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			purc_cl_tm(value);
			return;
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			pay_cl_ym(value);
			return;
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			pay_cl_tm(value);
			return;
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			stk_cl_ym(value);
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
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
		if ($db_ar_pre_cl_flg.equalsIgnoreCase(name)) {
			db_ar_pre_cl_flg(value);
			return;
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			ap_pre_cl_flg(value);
			return;
		}
		if ($db_ap_pre_cl_flg.equalsIgnoreCase(name)) {
			db_ap_pre_cl_flg(value);
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
		if ($srch_cl_flg.equalsIgnoreCase(name)) {
			srch_cl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cl_ope.equalsIgnoreCase(name)) {
			cl_ope(value);
			return;
		}
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
		if ($pre_cl_ope.equalsIgnoreCase(name)) {
			pre_cl_ope(value);
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
		if ($ar_ope.equalsIgnoreCase(name)) {
			ar_ope(value);
			return;
		}
		if ($ap_ope.equalsIgnoreCase(name)) {
			ap_ope(value);
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
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			sls_cl_ym(value);
			return;
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			sls_cl_tm(value);
			return;
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			rcv_cl_ym(value);
			return;
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			rcv_cl_tm(value);
			return;
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			purc_cl_ym(value);
			return;
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			purc_cl_tm(value);
			return;
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			pay_cl_ym(value);
			return;
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			pay_cl_tm(value);
			return;
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			stk_cl_ym(value);
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
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
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
		if ($db_ar_pre_cl_flg.equalsIgnoreCase(name)) {
			db_ar_pre_cl_flg(value);
			return;
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			ap_pre_cl_flg(value);
			return;
		}
		if ($db_ap_pre_cl_flg.equalsIgnoreCase(name)) {
			db_ap_pre_cl_flg(value);
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
		if ($srch_cl_flg.equalsIgnoreCase(name)) {
			srch_cl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

