package mcframe.clientMAUA.MAUAP1040;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public static final String $up_lv_dpt_cd = "up_lv_dpt_cd";
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public static final String $up_lv_dpt_nm = "up_lv_dpt_nm";
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public static final String $new_dpt_cd = "new_dpt_cd";
	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public static final String $ar_dpt_flg = "ar_dpt_flg";
	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_dpt_flg = "sls_dpt_flg";
	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_dpt_flg = "purc_dpt_flg";
	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public static final String $asst_dpt_flg = "asst_dpt_flg";
	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_dpt_flg = "ship_dpt_flg";
	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_dpt_flg = "arr_dpt_flg";
	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public static final String $mfg_dpt_flg = "mfg_dpt_flg";
	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_dpt_flg = "insp_dpt_flg";
	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public static final String $bd_dpt_flg = "bd_dpt_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public static final String $ac_dpt_cd = "ac_dpt_cd";
	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public static final String $cost_dpt_cd = "cost_dpt_cd";
	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public static final String $rcv_bank_ac_cd = "rcv_bank_ac_cd";
	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta up_lv_dpt_cd_META = createCommonMeta($up_lv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta up_lv_dpt_nm_META = createCommonMeta($up_lv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta new_dpt_cd_META = createCommonMeta($new_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_flg_META = createCommonMeta($ar_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dpt_flg_META = createCommonMeta($sls_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_flg_META = createCommonMeta($purc_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_dpt_flg_META = createCommonMeta($asst_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_dpt_flg_META = createCommonMeta($ship_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_dpt_flg_META = createCommonMeta($arr_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_dpt_flg_META = createCommonMeta($mfg_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_dpt_flg_META = createCommonMeta($insp_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_flg_META = createCommonMeta($bd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ac_dpt_cd_META = createCommonMeta($ac_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cost_dpt_cd_META = createCommonMeta($cost_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcv_bank_ac_cd_META = createCommonMeta($rcv_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			dpt_cd_META,
			dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			dpt_lvl_cd_META,
			dpt_lvl_nm_META,
			up_lv_dpt_cd_META,
			up_lv_dpt_nm_META,
			new_dpt_cd_META,
			ar_dpt_flg_META,
			ap_dpt_flg_META,
			sls_dpt_flg_META,
			purc_dpt_flg_META,
			asst_dpt_flg_META,
			ship_dpt_flg_META,
			arr_dpt_flg_META,
			mfg_dpt_flg_META,
			insp_dpt_flg_META,
			bd_dpt_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_ts_META,
			upd_ts_META,
			st_dt_META,
			end_dt_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			ac_dpt_cd_META,
			cost_dpt_cd_META,
			rcv_bank_ac_cd_META,
			pay_bank_ac_cd_META
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 2, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 2, $dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 5, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 5, $dpt_lvl_cd, value);
	}


	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 6, $dpt_lvl_nm);
	}

	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 6, $dpt_lvl_nm, value);
	}


	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public String up_lv_dpt_cd() {
		return getConstString(offset + 7, $up_lv_dpt_cd);
	}

	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public void up_lv_dpt_cd(String value) {
		setConstString(offset + 7, $up_lv_dpt_cd, value);
	}


	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public String up_lv_dpt_nm() {
		return getConstString(offset + 8, $up_lv_dpt_nm);
	}

	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public void up_lv_dpt_nm(String value) {
		setConstString(offset + 8, $up_lv_dpt_nm, value);
	}


	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public String new_dpt_cd() {
		return getConstString(offset + 9, $new_dpt_cd);
	}

	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public void new_dpt_cd(String value) {
		setConstString(offset + 9, $new_dpt_cd, value);
	}


	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public boolean ar_dpt_flg() {
		return getConstBoolean(offset + 10, $ar_dpt_flg);
	}

	/**
	 * AR dept. flg. 債権部門ＦＬＧ.<p>
	 *
	 */
	public void ar_dpt_flg(boolean value) {
		setConstBoolean(offset + 10, $ar_dpt_flg, value);
	}


	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 11, $ap_dpt_flg);
	}

	/**
	 * AP dept. flg. 債務部門ＦＬＧ.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 11, $ap_dpt_flg, value);
	}


	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public boolean sls_dpt_flg() {
		return getConstBoolean(offset + 12, $sls_dpt_flg);
	}

	/**
	 * Sales dept. flg. 営業部門ＦＬＧ.<p>
	 *
	 */
	public void sls_dpt_flg(boolean value) {
		setConstBoolean(offset + 12, $sls_dpt_flg, value);
	}


	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public boolean purc_dpt_flg() {
		return getConstBoolean(offset + 13, $purc_dpt_flg);
	}

	/**
	 * Purchasing dept. flg. 購買部門ＦＬＧ.<p>
	 *
	 */
	public void purc_dpt_flg(boolean value) {
		setConstBoolean(offset + 13, $purc_dpt_flg, value);
	}


	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public boolean asst_dpt_flg() {
		return getConstBoolean(offset + 14, $asst_dpt_flg);
	}

	/**
	 * Asset management dept. flg. 資産管理部門ＦＬＧ.<p>
	 *
	 */
	public void asst_dpt_flg(boolean value) {
		setConstBoolean(offset + 14, $asst_dpt_flg, value);
	}


	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public boolean ship_dpt_flg() {
		return getConstBoolean(offset + 15, $ship_dpt_flg);
	}

	/**
	 * Shipping dept. flg. 出荷部門ＦＬＧ.<p>
	 *
	 */
	public void ship_dpt_flg(boolean value) {
		setConstBoolean(offset + 15, $ship_dpt_flg, value);
	}


	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public boolean arr_dpt_flg() {
		return getConstBoolean(offset + 16, $arr_dpt_flg);
	}

	/**
	 * Receipt dept. flg. 入荷部門ＦＬＧ.<p>
	 *
	 */
	public void arr_dpt_flg(boolean value) {
		setConstBoolean(offset + 16, $arr_dpt_flg, value);
	}


	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public boolean mfg_dpt_flg() {
		return getConstBoolean(offset + 17, $mfg_dpt_flg);
	}

	/**
	 * Mfg. dept. flg. 製造部門ＦＬＧ.<p>
	 *
	 */
	public void mfg_dpt_flg(boolean value) {
		setConstBoolean(offset + 17, $mfg_dpt_flg, value);
	}


	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public boolean insp_dpt_flg() {
		return getConstBoolean(offset + 18, $insp_dpt_flg);
	}

	/**
	 * Inspection dept. flg. 検査部門ＦＬＧ.<p>
	 *
	 */
	public void insp_dpt_flg(boolean value) {
		setConstBoolean(offset + 18, $insp_dpt_flg, value);
	}


	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public boolean bd_dpt_flg() {
		return getConstBoolean(offset + 19, $bd_dpt_flg);
	}

	/**
	 * Charged dept. flg. 負担部門ＦＬＧ.<p>
	 *
	 */
	public void bd_dpt_flg(boolean value) {
		setConstBoolean(offset + 19, $bd_dpt_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 20, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 20, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 21, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 21, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 22, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 22, $memo3, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 23, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 24, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $upd_ts, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 25, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 25, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 26, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 26, $end_dt, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 27, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 27, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 28, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 28, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 29, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 29, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 30, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 30, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 31, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 31, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 32, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 32, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 33, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 33, $fax, value);
	}


	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public String ac_dpt_cd() {
		return getConstString(offset + 34, $ac_dpt_cd);
	}

	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public void ac_dpt_cd(String value) {
		setConstString(offset + 34, $ac_dpt_cd, value);
	}


	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public String cost_dpt_cd() {
		return getConstString(offset + 35, $cost_dpt_cd);
	}

	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public void cost_dpt_cd(String value) {
		setConstString(offset + 35, $cost_dpt_cd, value);
	}


	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public String rcv_bank_ac_cd() {
		return getConstString(offset + 36, $rcv_bank_ac_cd);
	}

	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public void rcv_bank_ac_cd(String value) {
		setConstString(offset + 36, $rcv_bank_ac_cd, value);
	}


	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 37, $pay_bank_ac_cd);
	}

	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 37, $pay_bank_ac_cd, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			return ac_dpt_cd();
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			return cost_dpt_cd();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			return ac_dpt_cd();
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			return cost_dpt_cd();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			ac_dpt_cd(value);
			return;
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			cost_dpt_cd(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			ac_dpt_cd(value);
			return;
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			cost_dpt_cd(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

