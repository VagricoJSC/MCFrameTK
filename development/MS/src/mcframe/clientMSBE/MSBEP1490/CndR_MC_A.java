package mcframe.clientMSBE.MSBEP1490;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * DLV_SLIP,View shipping delivery slip,1;PURC_DLV_SLIP,View purchase delivery slip,2 DLV_SLIP,出荷納品伝票参照,1;PURC_DLV_SLIP,購買納品伝票参照,2.<p>
	 *
	 */
	public static final String $ope = "ope";
	public static final String $ship_dt_p = "ship_dt_p";
	public static final String $dlv_rqst_dt_p = "dlv_rqst_dt_p";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
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
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_inst_no = "dlv_slip_inst_no";
	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_act_no = "dlv_slip_act_no";
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public static final String $inc_past_flg = "inc_past_flg";

	public static final String $ship_dt_fr = $ship_dt_p + ".ymd_fr";
	public static final String $ship_hm_fr = $ship_dt_p + ".hm_fr";
	public static final String $ship_dt_to = $ship_dt_p + ".ymd_to";
	public static final String $ship_hm_to = $ship_dt_p + ".hm_to";
	public static final String $dlv_rqst_dt_fr = $dlv_rqst_dt_p + ".ymd_fr";
	public static final String $dlv_rqst_hm_fr = $dlv_rqst_dt_p + ".hm_fr";
	public static final String $dlv_rqst_dt_to = $dlv_rqst_dt_p + ".ymd_to";
	public static final String $dlv_rqst_hm_to = $dlv_rqst_dt_p + ".hm_to";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta ship_dt_p_META = createInnerRowMeta($ship_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta dlv_rqst_dt_p_META = createInnerRowMeta($dlv_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta dlv_slip_inst_no_META = createCommonMeta($dlv_slip_inst_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_INST_NO);
	public static final MCMeta dlv_slip_act_no_META = createCommonMeta($dlv_slip_act_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_ACT_NO);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inc_past_flg_META = createCommonMeta($inc_past_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			ship_dt_p_META,
			dlv_rqst_dt_p_META,
			bp_cd_META,
			bp_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			dlv_slip_no_META,
			slo_no_META,
			dlv_slip_inst_no_META,
			dlv_slip_act_no_META,
			ship_dlv_slip_no_META,
			po_no_META,
			trd_rmrks_META,
			inc_past_flg_META
		},
		new String[][]{
			{
				"ship_dt_fr",
				"ship_hm_fr",
				"ship_dt_to",
				"ship_hm_to",
				"dlv_rqst_dt_fr",
				"dlv_rqst_hm_fr",
				"dlv_rqst_dt_to",
				"dlv_rqst_hm_to"
			},
			{
				$ship_dt_fr,
				$ship_hm_fr,
				$ship_dt_to,
				$ship_hm_to,
				$dlv_rqst_dt_fr,
				$dlv_rqst_hm_fr,
				$dlv_rqst_dt_to,
				$dlv_rqst_hm_to
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$bp_cd, "bp_nm"},	// bp_cd
				{$dpt_cd, "dpt_nm"},	// dpt_cd
				{$wg_cd, "wg_nm"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "true;true"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "mode_today_flg;dpt_nm_rem_flg"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ship_dt_p + ".hm_fr", "TM"},	// ship_dt_p.hm_fr
				{$ship_dt_p + ".hm_to", "TM"},	// ship_dt_p.hm_to
				{$dlv_rqst_dt_p + ".hm_fr", "TM"},	// dlv_rqst_dt_p.hm_fr
				{$dlv_rqst_dt_p + ".hm_to", "TM"},	// dlv_rqst_dt_p.hm_to
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * DLV_SLIP,View shipping delivery slip,1;PURC_DLV_SLIP,View purchase delivery slip,2 DLV_SLIP,出荷納品伝票参照,1;PURC_DLV_SLIP,購買納品伝票参照,2.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * DLV_SLIP,View shipping delivery slip,1;PURC_DLV_SLIP,View purchase delivery slip,2 DLV_SLIP,出荷納品伝票参照,1;PURC_DLV_SLIP,購買納品伝票参照,2.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 1, $ship_dt_p);
	}
	
	public void ship_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 1, $ship_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 2, $dlv_rqst_dt_p);
	}
	
	public void dlv_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 2, $dlv_rqst_dt_p, row);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 3, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 3, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 4, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 4, $bp_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 6, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 6, $dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 9, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 9, $dlv_slip_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 10, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 10, $slo_no, value);
	}


	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public String dlv_slip_inst_no() {
		return getConstString(offset + 11, $dlv_slip_inst_no);
	}

	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public void dlv_slip_inst_no(String value) {
		setConstString(offset + 11, $dlv_slip_inst_no, value);
	}


	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public String dlv_slip_act_no() {
		return getConstString(offset + 12, $dlv_slip_act_no);
	}

	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public void dlv_slip_act_no(String value) {
		setConstString(offset + 12, $dlv_slip_act_no, value);
	}


	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 13, $ship_dlv_slip_no);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 13, $ship_dlv_slip_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 14, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 14, $po_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 15, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 15, $trd_rmrks, value);
	}


	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public boolean inc_past_flg() {
		return getConstBoolean(offset + 16, $inc_past_flg);
	}

	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public void inc_past_flg(boolean value) {
		setConstBoolean(offset + 16, $inc_past_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			return dlv_slip_inst_no();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			return dlv_slip_inst_no();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			dlv_slip_inst_no(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			dlv_slip_inst_no(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_dt_p.equalsIgnoreCase(name)) {
			return ship_dt_p();
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_dt_p.equalsIgnoreCase(name)) {
			ship_dt_p(
				((MCContainerMeta) ship_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			dlv_rqst_dt_p(
				((MCContainerMeta) dlv_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_dt_fr() {
		return ship_dt_p().ymd_fr();
	}

	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_dt_fr(MCDate value) {
		ship_dt_p().ymd_fr(value);
	}

	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_hm_fr() {
		return ship_dt_p().hm_fr();
	}

	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_hm_fr(MCDate value) {
		ship_dt_p().hm_fr(value);
	}

	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public MCDate ship_dt_to() {
		return ship_dt_p().ymd_to();
	}

	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public void ship_dt_to(MCDate value) {
		ship_dt_p().ymd_to(value);
	}

	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_hm_to() {
		return ship_dt_p().hm_to();
	}

	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public void ship_hm_to(MCDate value) {
		ship_dt_p().hm_to(value);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_fr() {
		return dlv_rqst_dt_p().ymd_fr();
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_dt_fr(MCDate value) {
		dlv_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_fr() {
		return dlv_rqst_dt_p().hm_fr();
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_hm_fr(MCDate value) {
		dlv_rqst_dt_p().hm_fr(value);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_to() {
		return dlv_rqst_dt_p().ymd_to();
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_dt_to(MCDate value) {
		dlv_rqst_dt_p().ymd_to(value);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_to() {
		return dlv_rqst_dt_p().hm_to();
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_hm_to(MCDate value) {
		dlv_rqst_dt_p().hm_to(value);
	}

}

