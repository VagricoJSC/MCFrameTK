package mcframe.serverMSBE.MSBEB0050;

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
 * ブロック"ShipStkRplBatch_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipStkRplBatch_CndR_MC_A extends MCConstRow {

	/**
	 * Delete movement schedule 移動予定削除.<p>
	 *
	 */
	public static final String $xfr_schd_del_flg = "xfr_schd_del_flg";
	/**
	 * Create movement schedule 移動予定作成.<p>
	 *
	 */
	public static final String $xfr_schd_crt_flg = "xfr_schd_crt_flg";
	/**
	 * Delete shortage info. 不足情報削除.<p>
	 *
	 */
	public static final String $ship_stk_rpl_lst_del_flg = "ship_stk_rpl_lst_del_flg";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public static final String $slo_flg = "slo_flg";
	/**
	 * Order promising 納期回答.<p>
	 *
	 */
	public static final String $prms_flg = "prms_flg";
	/**
	 * Delivery order 納入指示.<p>
	 *
	 */
	public static final String $dlv_inst_flg = "dlv_inst_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $ord_flg = "ord_flg";
	/**
	 * Scheduled shipping date and time FROM 出荷予定日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $tm_fr = "tm_fr";
	/**
	 * Scheduled shipping date and time TO 出荷予定日時ＴＯ.<p>
	 *
	 */
	public static final String $tm_to = "tm_to";
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public static final String $not_alloc_flg = "not_alloc_flg";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";


	public static final MCMeta xfr_schd_del_flg_META = createCommonMeta($xfr_schd_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_schd_crt_flg_META = createCommonMeta($xfr_schd_crt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_stk_rpl_lst_del_flg_META = createCommonMeta($ship_stk_rpl_lst_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_flg_META = createCommonMeta($slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_flg_META = createCommonMeta($prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_flg_META = createCommonMeta($dlv_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_flg_META = createCommonMeta($ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tm_fr_META = createCommonMeta($tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta tm_to_META = createCommonMeta($tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta not_alloc_flg_META = createCommonMeta($not_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);

	protected static final ConstMetaList<ShipStkRplBatch_CndR> constMetas = new ConstMetaList<ShipStkRplBatch_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfr_schd_del_flg_META,
			xfr_schd_crt_flg_META,
			ship_stk_rpl_lst_del_flg_META,
			schd_flg_META,
			slo_flg_META,
			prms_flg_META,
			dlv_inst_flg_META,
			ord_flg_META,
			tm_fr_META,
			tm_to_META,
			not_alloc_flg_META,
			alloc_flg_META,
			ship_term_cd_META,
			ship_wk_cd_META,
			wg_cd_META,
			lg_grp_cd_META,
			loc_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected ShipStkRplBatch_CndR_MC_A(ConstMetaList<? extends ShipStkRplBatch_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipStkRplBatch_CndR clone() {
		return (ShipStkRplBatch_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipStkRplBatch_CndR createInstance() {
		return (ShipStkRplBatch_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipStkRplBatch_CndR getValues(String... names) {
		return (ShipStkRplBatch_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Delete movement schedule 移動予定削除.<p>
	 *
	 */
	public boolean xfr_schd_del_flg() {
		return getConstBoolean(offset + 0, $xfr_schd_del_flg);
	}

	/**
	 * Delete movement schedule 移動予定削除.<p>
	 *
	 */
	public void xfr_schd_del_flg(boolean value) {
		setConstBoolean(offset + 0, $xfr_schd_del_flg, value);
	}


	/**
	 * Create movement schedule 移動予定作成.<p>
	 *
	 */
	public boolean xfr_schd_crt_flg() {
		return getConstBoolean(offset + 1, $xfr_schd_crt_flg);
	}

	/**
	 * Create movement schedule 移動予定作成.<p>
	 *
	 */
	public void xfr_schd_crt_flg(boolean value) {
		setConstBoolean(offset + 1, $xfr_schd_crt_flg, value);
	}


	/**
	 * Delete shortage info. 不足情報削除.<p>
	 *
	 */
	public boolean ship_stk_rpl_lst_del_flg() {
		return getConstBoolean(offset + 2, $ship_stk_rpl_lst_del_flg);
	}

	/**
	 * Delete shortage info. 不足情報削除.<p>
	 *
	 */
	public void ship_stk_rpl_lst_del_flg(boolean value) {
		setConstBoolean(offset + 2, $ship_stk_rpl_lst_del_flg, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 3, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 3, $schd_flg, value);
	}


	/**
	 * Sales order 受注.<p>
	 *
	 */
	public boolean slo_flg() {
		return getConstBoolean(offset + 4, $slo_flg);
	}

	/**
	 * Sales order 受注.<p>
	 *
	 */
	public void slo_flg(boolean value) {
		setConstBoolean(offset + 4, $slo_flg, value);
	}


	/**
	 * Order promising 納期回答.<p>
	 *
	 */
	public boolean prms_flg() {
		return getConstBoolean(offset + 5, $prms_flg);
	}

	/**
	 * Order promising 納期回答.<p>
	 *
	 */
	public void prms_flg(boolean value) {
		setConstBoolean(offset + 5, $prms_flg, value);
	}


	/**
	 * Delivery order 納入指示.<p>
	 *
	 */
	public boolean dlv_inst_flg() {
		return getConstBoolean(offset + 6, $dlv_inst_flg);
	}

	/**
	 * Delivery order 納入指示.<p>
	 *
	 */
	public void dlv_inst_flg(boolean value) {
		setConstBoolean(offset + 6, $dlv_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean ord_flg() {
		return getConstBoolean(offset + 7, $ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void ord_flg(boolean value) {
		setConstBoolean(offset + 7, $ord_flg, value);
	}


	/**
	 * Scheduled shipping date and time FROM 出荷予定日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate tm_fr() {
		return getConstDate(offset + 8, $tm_fr);
	}

	/**
	 * Scheduled shipping date and time FROM 出荷予定日時ＦＲＯＭ.<p>
	 *
	 */
	public void tm_fr(MCDate value) {
		setConstDate(offset + 8, $tm_fr, value);
	}


	/**
	 * Scheduled shipping date and time TO 出荷予定日時ＴＯ.<p>
	 *
	 */
	public MCDate tm_to() {
		return getConstDate(offset + 9, $tm_to);
	}

	/**
	 * Scheduled shipping date and time TO 出荷予定日時ＴＯ.<p>
	 *
	 */
	public void tm_to(MCDate value) {
		setConstDate(offset + 9, $tm_to, value);
	}


	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public boolean not_alloc_flg() {
		return getConstBoolean(offset + 10, $not_alloc_flg);
	}

	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public void not_alloc_flg(boolean value) {
		setConstBoolean(offset + 10, $not_alloc_flg, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 11, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 11, $alloc_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 12, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 12, $ship_term_cd, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 13, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 13, $ship_wk_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 15, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 15, $lg_grp_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 16, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 16, $loc_cd, value);
	}


	public String getString(String name) {
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($tm_fr.equalsIgnoreCase(name)) {
			return tm_fr();
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			return tm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			return xfr_schd_del_flg();
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			return xfr_schd_crt_flg();
		}
		if ($ship_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			return ship_stk_rpl_lst_del_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($dlv_inst_flg.equalsIgnoreCase(name)) {
			return dlv_inst_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($tm_fr.equalsIgnoreCase(name)) {
			return tm_fr();
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			return tm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			return xfr_schd_del_flg();
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			return xfr_schd_crt_flg();
		}
		if ($ship_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			return ship_stk_rpl_lst_del_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($dlv_inst_flg.equalsIgnoreCase(name)) {
			return dlv_inst_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($tm_fr.equalsIgnoreCase(name)) {
			tm_fr(value);
			return;
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			tm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			xfr_schd_del_flg(value);
			return;
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			xfr_schd_crt_flg(value);
			return;
		}
		if ($ship_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			ship_stk_rpl_lst_del_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($dlv_inst_flg.equalsIgnoreCase(name)) {
			dlv_inst_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($tm_fr.equalsIgnoreCase(name)) {
			tm_fr(value);
			return;
		}
		if ($tm_to.equalsIgnoreCase(name)) {
			tm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($xfr_schd_del_flg.equalsIgnoreCase(name)) {
			xfr_schd_del_flg(value);
			return;
		}
		if ($xfr_schd_crt_flg.equalsIgnoreCase(name)) {
			xfr_schd_crt_flg(value);
			return;
		}
		if ($ship_stk_rpl_lst_del_flg.equalsIgnoreCase(name)) {
			ship_stk_rpl_lst_del_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($dlv_inst_flg.equalsIgnoreCase(name)) {
			dlv_inst_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

