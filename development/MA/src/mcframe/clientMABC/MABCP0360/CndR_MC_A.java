package mcframe.clientMABC.MABCP0360;

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Allow sales order 受注　許可.<p>
	 *
	 */
	public static final String $slo_stop_f_flg = "slo_stop_f_flg";
	/**
	 * Prohibit sales order 受注　禁止.<p>
	 *
	 */
	public static final String $slo_stop_t_flg = "slo_stop_t_flg";
	/**
	 * Sales order prohibit date FROM 受注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $slo_stop_dt_fr = "slo_stop_dt_fr";
	/**
	 * Sales order prohibit date TO 受注禁止日ＴＯ.<p>
	 *
	 */
	public static final String $slo_stop_dt_to = "slo_stop_dt_to";
	/**
	 * Allow PO placement 発注　許可.<p>
	 *
	 */
	public static final String $po_stop_f_flg = "po_stop_f_flg";
	/**
	 * Prohibit PO placement 発注　禁止.<p>
	 *
	 */
	public static final String $po_stop_t_flg = "po_stop_t_flg";
	/**
	 * PO prohibit date FROM 発注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_stop_dt_fr = "po_stop_dt_fr";
	/**
	 * PO prohibit date TO 発注禁止日ＴＯ.<p>
	 *
	 */
	public static final String $po_stop_dt_to = "po_stop_dt_to";
	/**
	 * Allow sales/shipment 売上・出荷　許可.<p>
	 *
	 */
	public static final String $sls_stop_f_flg = "sls_stop_f_flg";
	/**
	 * Prohibit sales/shipment 売上・出荷　禁止.<p>
	 *
	 */
	public static final String $sls_stop_t_flg = "sls_stop_t_flg";
	/**
	 * Sales/shipment prohibited date FROM 売上・出荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sls_stop_dt_fr = "sls_stop_dt_fr";
	/**
	 * Sales/shipment prohibited date TO 売上・出荷禁止日ＴＯ.<p>
	 *
	 */
	public static final String $sls_stop_dt_to = "sls_stop_dt_to";
	/**
	 * Allow purchase/receipt 仕入・入荷　許可.<p>
	 *
	 */
	public static final String $purc_stop_f_flg = "purc_stop_f_flg";
	/**
	 * Prohibit purchase/receipt 仕入・入荷　禁止.<p>
	 *
	 */
	public static final String $purc_stop_t_flg = "purc_stop_t_flg";
	/**
	 * Purchase/receipt prohibit date FROM 仕入・入荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $purc_stop_dt_fr = "purc_stop_dt_fr";
	/**
	 * Purchase/receipt prohibit date TO 仕入・入荷禁止日ＴＯ.<p>
	 *
	 */
	public static final String $purc_stop_dt_to = "purc_stop_dt_to";
	/**
	 * Allow requirement/order 所要・オーダ　許可.<p>
	 *
	 */
	public static final String $order_stop_f_flg = "order_stop_f_flg";
	/**
	 * Prohibit requirement/order 所要・オーダ　禁止.<p>
	 *
	 */
	public static final String $order_stop_t_flg = "order_stop_t_flg";
	/**
	 * Requirements/order prohibited date FROM 所要・オーダ禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $order_stop_dt_fr = "order_stop_dt_fr";
	/**
	 * Requirements/order prohibited date TO 所要・オーダ禁止日ＴＯ.<p>
	 *
	 */
	public static final String $order_stop_dt_to = "order_stop_dt_to";
	/**
	 * Allow mfg. order 製造指図　許可.<p>
	 *
	 */
	public static final String $mfg_inst_stop_f_flg = "mfg_inst_stop_f_flg";
	/**
	 * Prohibit mfg. order 製造指図　禁止.<p>
	 *
	 */
	public static final String $mfg_inst_stop_t_flg = "mfg_inst_stop_t_flg";
	/**
	 * Mfg. order prohibit date FROM 製造指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $mfg_inst_stop_dt_fr = "mfg_inst_stop_dt_fr";
	/**
	 * Mfg. order prohibit date TO 製造指図禁止日ＴＯ.<p>
	 *
	 */
	public static final String $mfg_inst_stop_dt_to = "mfg_inst_stop_dt_to";
	/**
	 * Allow shipping order 出荷指図　許可.<p>
	 *
	 */
	public static final String $ship_inst_stop_f_flg = "ship_inst_stop_f_flg";
	/**
	 * Prohibit shipping order 出荷指図　禁止.<p>
	 *
	 */
	public static final String $ship_inst_stop_t_flg = "ship_inst_stop_t_flg";
	/**
	 * Shipping order prohibit date FROM 出荷指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_inst_stop_dt_fr = "ship_inst_stop_dt_fr";
	/**
	 * Shipping order prohibit date TO 出荷指図禁止日ＴＯ.<p>
	 *
	 */
	public static final String $ship_inst_stop_dt_to = "ship_inst_stop_dt_to";
	/**
	 * Allow transport/movement 移送・移動　許可.<p>
	 *
	 */
	public static final String $xfr_stop_f_flg = "xfr_stop_f_flg";
	/**
	 * Prohibit transport/movement 移送・移動　禁止.<p>
	 *
	 */
	public static final String $xfr_stop_t_flg = "xfr_stop_t_flg";
	/**
	 * Transport/movement prohibit date FROM 移送・移動禁止日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $xfr_stop_dt_fr = "xfr_stop_dt_fr";
	/**
	 * Transport/movement prohibit date TO 移送・移動禁止日ＴＯ.<p>
	 *
	 */
	public static final String $xfr_stop_dt_to = "xfr_stop_dt_to";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
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
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta slo_stop_f_flg_META = createCommonMeta($slo_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_stop_t_flg_META = createCommonMeta($slo_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_stop_dt_fr_META = createCommonMeta($slo_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_stop_dt_to_META = createCommonMeta($slo_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_stop_f_flg_META = createCommonMeta($po_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_stop_t_flg_META = createCommonMeta($po_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_stop_dt_fr_META = createCommonMeta($po_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_stop_dt_to_META = createCommonMeta($po_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_stop_f_flg_META = createCommonMeta($sls_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_stop_t_flg_META = createCommonMeta($sls_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_stop_dt_fr_META = createCommonMeta($sls_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_stop_dt_to_META = createCommonMeta($sls_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_stop_f_flg_META = createCommonMeta($purc_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_stop_t_flg_META = createCommonMeta($purc_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_stop_dt_fr_META = createCommonMeta($purc_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_stop_dt_to_META = createCommonMeta($purc_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta order_stop_f_flg_META = createCommonMeta($order_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta order_stop_t_flg_META = createCommonMeta($order_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta order_stop_dt_fr_META = createCommonMeta($order_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta order_stop_dt_to_META = createCommonMeta($order_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_inst_stop_f_flg_META = createCommonMeta($mfg_inst_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_stop_t_flg_META = createCommonMeta($mfg_inst_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_stop_dt_fr_META = createCommonMeta($mfg_inst_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_inst_stop_dt_to_META = createCommonMeta($mfg_inst_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_inst_stop_f_flg_META = createCommonMeta($ship_inst_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_stop_t_flg_META = createCommonMeta($ship_inst_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_stop_dt_fr_META = createCommonMeta($ship_inst_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_inst_stop_dt_to_META = createCommonMeta($ship_inst_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_stop_f_flg_META = createCommonMeta($xfr_stop_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_stop_t_flg_META = createCommonMeta($xfr_stop_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_stop_dt_fr_META = createCommonMeta($xfr_stop_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_stop_dt_to_META = createCommonMeta($xfr_stop_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			slo_stop_f_flg_META,
			slo_stop_t_flg_META,
			slo_stop_dt_fr_META,
			slo_stop_dt_to_META,
			po_stop_f_flg_META,
			po_stop_t_flg_META,
			po_stop_dt_fr_META,
			po_stop_dt_to_META,
			sls_stop_f_flg_META,
			sls_stop_t_flg_META,
			sls_stop_dt_fr_META,
			sls_stop_dt_to_META,
			purc_stop_f_flg_META,
			purc_stop_t_flg_META,
			purc_stop_dt_fr_META,
			purc_stop_dt_to_META,
			order_stop_f_flg_META,
			order_stop_t_flg_META,
			order_stop_dt_fr_META,
			order_stop_dt_to_META,
			mfg_inst_stop_f_flg_META,
			mfg_inst_stop_t_flg_META,
			mfg_inst_stop_dt_fr_META,
			mfg_inst_stop_dt_to_META,
			ship_inst_stop_f_flg_META,
			ship_inst_stop_t_flg_META,
			ship_inst_stop_dt_fr_META,
			ship_inst_stop_dt_to_META,
			xfr_stop_f_flg_META,
			xfr_stop_t_flg_META,
			xfr_stop_dt_fr_META,
			xfr_stop_dt_to_META,
			itm_typ_p_META,
			itm_p_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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

	/** 項目属性情報のグループ[FLG_GRP]のキー定数 */
	public static final String $$FLG_GRP = "FLG_GRP";
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
		new MCExtMap.Entry($$FLG_GRP, new MCExtList(
			new String[][]{
				{$off_del_flg, "del_flg"},	// off_del_flg
				{$on_del_flg, "del_flg"}	// on_del_flg
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_grp_cd1, "itm_grp_nm"},	// itm_grp_cd1
				{$itm_grp_cd2, "itm_grp_nm"},	// itm_grp_cd2
				{$itm_grp_cd3, "itm_grp_nm"},	// itm_grp_cd3
				{$itm_grp_cd4, "itm_grp_nm"},	// itm_grp_cd4
				{$itm_grp_cd5, "itm_grp_nm"},	// itm_grp_cd5
				{$itm_grp_cd6, "itm_grp_nm"},	// itm_grp_cd6
				{$itm_grp_cd7, "itm_grp_nm"},	// itm_grp_cd7
				{$itm_grp_cd8, "itm_grp_nm"},	// itm_grp_cd8
				{$itm_grp_cd9, "itm_grp_nm"},	// itm_grp_cd9
				{$itm_grp_cd10, "itm_grp_nm"}	// itm_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"}	// itm_p.itm_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"}	// itm_p.itm_cd
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Allow sales order 受注　許可.<p>
	 *
	 */
	public boolean slo_stop_f_flg() {
		return getConstBoolean(offset + 1, $slo_stop_f_flg);
	}

	/**
	 * Allow sales order 受注　許可.<p>
	 *
	 */
	public void slo_stop_f_flg(boolean value) {
		setConstBoolean(offset + 1, $slo_stop_f_flg, value);
	}


	/**
	 * Prohibit sales order 受注　禁止.<p>
	 *
	 */
	public boolean slo_stop_t_flg() {
		return getConstBoolean(offset + 2, $slo_stop_t_flg);
	}

	/**
	 * Prohibit sales order 受注　禁止.<p>
	 *
	 */
	public void slo_stop_t_flg(boolean value) {
		setConstBoolean(offset + 2, $slo_stop_t_flg, value);
	}


	/**
	 * Sales order prohibit date FROM 受注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate slo_stop_dt_fr() {
		return getConstDate(offset + 3, $slo_stop_dt_fr);
	}

	/**
	 * Sales order prohibit date FROM 受注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void slo_stop_dt_fr(MCDate value) {
		setConstDate(offset + 3, $slo_stop_dt_fr, value);
	}


	/**
	 * Sales order prohibit date TO 受注禁止日ＴＯ.<p>
	 *
	 */
	public MCDate slo_stop_dt_to() {
		return getConstDate(offset + 4, $slo_stop_dt_to);
	}

	/**
	 * Sales order prohibit date TO 受注禁止日ＴＯ.<p>
	 *
	 */
	public void slo_stop_dt_to(MCDate value) {
		setConstDate(offset + 4, $slo_stop_dt_to, value);
	}


	/**
	 * Allow PO placement 発注　許可.<p>
	 *
	 */
	public boolean po_stop_f_flg() {
		return getConstBoolean(offset + 5, $po_stop_f_flg);
	}

	/**
	 * Allow PO placement 発注　許可.<p>
	 *
	 */
	public void po_stop_f_flg(boolean value) {
		setConstBoolean(offset + 5, $po_stop_f_flg, value);
	}


	/**
	 * Prohibit PO placement 発注　禁止.<p>
	 *
	 */
	public boolean po_stop_t_flg() {
		return getConstBoolean(offset + 6, $po_stop_t_flg);
	}

	/**
	 * Prohibit PO placement 発注　禁止.<p>
	 *
	 */
	public void po_stop_t_flg(boolean value) {
		setConstBoolean(offset + 6, $po_stop_t_flg, value);
	}


	/**
	 * PO prohibit date FROM 発注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_stop_dt_fr() {
		return getConstDate(offset + 7, $po_stop_dt_fr);
	}

	/**
	 * PO prohibit date FROM 発注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void po_stop_dt_fr(MCDate value) {
		setConstDate(offset + 7, $po_stop_dt_fr, value);
	}


	/**
	 * PO prohibit date TO 発注禁止日ＴＯ.<p>
	 *
	 */
	public MCDate po_stop_dt_to() {
		return getConstDate(offset + 8, $po_stop_dt_to);
	}

	/**
	 * PO prohibit date TO 発注禁止日ＴＯ.<p>
	 *
	 */
	public void po_stop_dt_to(MCDate value) {
		setConstDate(offset + 8, $po_stop_dt_to, value);
	}


	/**
	 * Allow sales/shipment 売上・出荷　許可.<p>
	 *
	 */
	public boolean sls_stop_f_flg() {
		return getConstBoolean(offset + 9, $sls_stop_f_flg);
	}

	/**
	 * Allow sales/shipment 売上・出荷　許可.<p>
	 *
	 */
	public void sls_stop_f_flg(boolean value) {
		setConstBoolean(offset + 9, $sls_stop_f_flg, value);
	}


	/**
	 * Prohibit sales/shipment 売上・出荷　禁止.<p>
	 *
	 */
	public boolean sls_stop_t_flg() {
		return getConstBoolean(offset + 10, $sls_stop_t_flg);
	}

	/**
	 * Prohibit sales/shipment 売上・出荷　禁止.<p>
	 *
	 */
	public void sls_stop_t_flg(boolean value) {
		setConstBoolean(offset + 10, $sls_stop_t_flg, value);
	}


	/**
	 * Sales/shipment prohibited date FROM 売上・出荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sls_stop_dt_fr() {
		return getConstDate(offset + 11, $sls_stop_dt_fr);
	}

	/**
	 * Sales/shipment prohibited date FROM 売上・出荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void sls_stop_dt_fr(MCDate value) {
		setConstDate(offset + 11, $sls_stop_dt_fr, value);
	}


	/**
	 * Sales/shipment prohibited date TO 売上・出荷禁止日ＴＯ.<p>
	 *
	 */
	public MCDate sls_stop_dt_to() {
		return getConstDate(offset + 12, $sls_stop_dt_to);
	}

	/**
	 * Sales/shipment prohibited date TO 売上・出荷禁止日ＴＯ.<p>
	 *
	 */
	public void sls_stop_dt_to(MCDate value) {
		setConstDate(offset + 12, $sls_stop_dt_to, value);
	}


	/**
	 * Allow purchase/receipt 仕入・入荷　許可.<p>
	 *
	 */
	public boolean purc_stop_f_flg() {
		return getConstBoolean(offset + 13, $purc_stop_f_flg);
	}

	/**
	 * Allow purchase/receipt 仕入・入荷　許可.<p>
	 *
	 */
	public void purc_stop_f_flg(boolean value) {
		setConstBoolean(offset + 13, $purc_stop_f_flg, value);
	}


	/**
	 * Prohibit purchase/receipt 仕入・入荷　禁止.<p>
	 *
	 */
	public boolean purc_stop_t_flg() {
		return getConstBoolean(offset + 14, $purc_stop_t_flg);
	}

	/**
	 * Prohibit purchase/receipt 仕入・入荷　禁止.<p>
	 *
	 */
	public void purc_stop_t_flg(boolean value) {
		setConstBoolean(offset + 14, $purc_stop_t_flg, value);
	}


	/**
	 * Purchase/receipt prohibit date FROM 仕入・入荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_stop_dt_fr() {
		return getConstDate(offset + 15, $purc_stop_dt_fr);
	}

	/**
	 * Purchase/receipt prohibit date FROM 仕入・入荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_stop_dt_fr(MCDate value) {
		setConstDate(offset + 15, $purc_stop_dt_fr, value);
	}


	/**
	 * Purchase/receipt prohibit date TO 仕入・入荷禁止日ＴＯ.<p>
	 *
	 */
	public MCDate purc_stop_dt_to() {
		return getConstDate(offset + 16, $purc_stop_dt_to);
	}

	/**
	 * Purchase/receipt prohibit date TO 仕入・入荷禁止日ＴＯ.<p>
	 *
	 */
	public void purc_stop_dt_to(MCDate value) {
		setConstDate(offset + 16, $purc_stop_dt_to, value);
	}


	/**
	 * Allow requirement/order 所要・オーダ　許可.<p>
	 *
	 */
	public boolean order_stop_f_flg() {
		return getConstBoolean(offset + 17, $order_stop_f_flg);
	}

	/**
	 * Allow requirement/order 所要・オーダ　許可.<p>
	 *
	 */
	public void order_stop_f_flg(boolean value) {
		setConstBoolean(offset + 17, $order_stop_f_flg, value);
	}


	/**
	 * Prohibit requirement/order 所要・オーダ　禁止.<p>
	 *
	 */
	public boolean order_stop_t_flg() {
		return getConstBoolean(offset + 18, $order_stop_t_flg);
	}

	/**
	 * Prohibit requirement/order 所要・オーダ　禁止.<p>
	 *
	 */
	public void order_stop_t_flg(boolean value) {
		setConstBoolean(offset + 18, $order_stop_t_flg, value);
	}


	/**
	 * Requirements/order prohibited date FROM 所要・オーダ禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate order_stop_dt_fr() {
		return getConstDate(offset + 19, $order_stop_dt_fr);
	}

	/**
	 * Requirements/order prohibited date FROM 所要・オーダ禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void order_stop_dt_fr(MCDate value) {
		setConstDate(offset + 19, $order_stop_dt_fr, value);
	}


	/**
	 * Requirements/order prohibited date TO 所要・オーダ禁止日ＴＯ.<p>
	 *
	 */
	public MCDate order_stop_dt_to() {
		return getConstDate(offset + 20, $order_stop_dt_to);
	}

	/**
	 * Requirements/order prohibited date TO 所要・オーダ禁止日ＴＯ.<p>
	 *
	 */
	public void order_stop_dt_to(MCDate value) {
		setConstDate(offset + 20, $order_stop_dt_to, value);
	}


	/**
	 * Allow mfg. order 製造指図　許可.<p>
	 *
	 */
	public boolean mfg_inst_stop_f_flg() {
		return getConstBoolean(offset + 21, $mfg_inst_stop_f_flg);
	}

	/**
	 * Allow mfg. order 製造指図　許可.<p>
	 *
	 */
	public void mfg_inst_stop_f_flg(boolean value) {
		setConstBoolean(offset + 21, $mfg_inst_stop_f_flg, value);
	}


	/**
	 * Prohibit mfg. order 製造指図　禁止.<p>
	 *
	 */
	public boolean mfg_inst_stop_t_flg() {
		return getConstBoolean(offset + 22, $mfg_inst_stop_t_flg);
	}

	/**
	 * Prohibit mfg. order 製造指図　禁止.<p>
	 *
	 */
	public void mfg_inst_stop_t_flg(boolean value) {
		setConstBoolean(offset + 22, $mfg_inst_stop_t_flg, value);
	}


	/**
	 * Mfg. order prohibit date FROM 製造指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mfg_inst_stop_dt_fr() {
		return getConstDate(offset + 23, $mfg_inst_stop_dt_fr);
	}

	/**
	 * Mfg. order prohibit date FROM 製造指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void mfg_inst_stop_dt_fr(MCDate value) {
		setConstDate(offset + 23, $mfg_inst_stop_dt_fr, value);
	}


	/**
	 * Mfg. order prohibit date TO 製造指図禁止日ＴＯ.<p>
	 *
	 */
	public MCDate mfg_inst_stop_dt_to() {
		return getConstDate(offset + 24, $mfg_inst_stop_dt_to);
	}

	/**
	 * Mfg. order prohibit date TO 製造指図禁止日ＴＯ.<p>
	 *
	 */
	public void mfg_inst_stop_dt_to(MCDate value) {
		setConstDate(offset + 24, $mfg_inst_stop_dt_to, value);
	}


	/**
	 * Allow shipping order 出荷指図　許可.<p>
	 *
	 */
	public boolean ship_inst_stop_f_flg() {
		return getConstBoolean(offset + 25, $ship_inst_stop_f_flg);
	}

	/**
	 * Allow shipping order 出荷指図　許可.<p>
	 *
	 */
	public void ship_inst_stop_f_flg(boolean value) {
		setConstBoolean(offset + 25, $ship_inst_stop_f_flg, value);
	}


	/**
	 * Prohibit shipping order 出荷指図　禁止.<p>
	 *
	 */
	public boolean ship_inst_stop_t_flg() {
		return getConstBoolean(offset + 26, $ship_inst_stop_t_flg);
	}

	/**
	 * Prohibit shipping order 出荷指図　禁止.<p>
	 *
	 */
	public void ship_inst_stop_t_flg(boolean value) {
		setConstBoolean(offset + 26, $ship_inst_stop_t_flg, value);
	}


	/**
	 * Shipping order prohibit date FROM 出荷指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_stop_dt_fr() {
		return getConstDate(offset + 27, $ship_inst_stop_dt_fr);
	}

	/**
	 * Shipping order prohibit date FROM 出荷指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_stop_dt_fr(MCDate value) {
		setConstDate(offset + 27, $ship_inst_stop_dt_fr, value);
	}


	/**
	 * Shipping order prohibit date TO 出荷指図禁止日ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_stop_dt_to() {
		return getConstDate(offset + 28, $ship_inst_stop_dt_to);
	}

	/**
	 * Shipping order prohibit date TO 出荷指図禁止日ＴＯ.<p>
	 *
	 */
	public void ship_inst_stop_dt_to(MCDate value) {
		setConstDate(offset + 28, $ship_inst_stop_dt_to, value);
	}


	/**
	 * Allow transport/movement 移送・移動　許可.<p>
	 *
	 */
	public boolean xfr_stop_f_flg() {
		return getConstBoolean(offset + 29, $xfr_stop_f_flg);
	}

	/**
	 * Allow transport/movement 移送・移動　許可.<p>
	 *
	 */
	public void xfr_stop_f_flg(boolean value) {
		setConstBoolean(offset + 29, $xfr_stop_f_flg, value);
	}


	/**
	 * Prohibit transport/movement 移送・移動　禁止.<p>
	 *
	 */
	public boolean xfr_stop_t_flg() {
		return getConstBoolean(offset + 30, $xfr_stop_t_flg);
	}

	/**
	 * Prohibit transport/movement 移送・移動　禁止.<p>
	 *
	 */
	public void xfr_stop_t_flg(boolean value) {
		setConstBoolean(offset + 30, $xfr_stop_t_flg, value);
	}


	/**
	 * Transport/movement prohibit date FROM 移送・移動禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate xfr_stop_dt_fr() {
		return getConstDate(offset + 31, $xfr_stop_dt_fr);
	}

	/**
	 * Transport/movement prohibit date FROM 移送・移動禁止日ＦＲＯＭ.<p>
	 *
	 */
	public void xfr_stop_dt_fr(MCDate value) {
		setConstDate(offset + 31, $xfr_stop_dt_fr, value);
	}


	/**
	 * Transport/movement prohibit date TO 移送・移動禁止日ＴＯ.<p>
	 *
	 */
	public MCDate xfr_stop_dt_to() {
		return getConstDate(offset + 32, $xfr_stop_dt_to);
	}

	/**
	 * Transport/movement prohibit date TO 移送・移動禁止日ＴＯ.<p>
	 *
	 */
	public void xfr_stop_dt_to(MCDate value) {
		setConstDate(offset + 32, $xfr_stop_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 33, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 33, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 34, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 34, $itm_p, row);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 35, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 35, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 36, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 36, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 37, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 37, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 38, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 38, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 39, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 39, $on_del_flg, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 40, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 40, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 41, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 41, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 42, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 42, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 43, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 43, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 44, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 44, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 45, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 45, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 46, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 46, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 47, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 47, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 48, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 48, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 49, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 49, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 50, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 50, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 51, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 51, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 52, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 52, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 53, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 53, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 54, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 54, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 55, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 55, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 56, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 56, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 57, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 57, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 58, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 58, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 59, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 59, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($slo_stop_dt_fr.equalsIgnoreCase(name)) {
			return slo_stop_dt_fr();
		}
		if ($slo_stop_dt_to.equalsIgnoreCase(name)) {
			return slo_stop_dt_to();
		}
		if ($po_stop_dt_fr.equalsIgnoreCase(name)) {
			return po_stop_dt_fr();
		}
		if ($po_stop_dt_to.equalsIgnoreCase(name)) {
			return po_stop_dt_to();
		}
		if ($sls_stop_dt_fr.equalsIgnoreCase(name)) {
			return sls_stop_dt_fr();
		}
		if ($sls_stop_dt_to.equalsIgnoreCase(name)) {
			return sls_stop_dt_to();
		}
		if ($purc_stop_dt_fr.equalsIgnoreCase(name)) {
			return purc_stop_dt_fr();
		}
		if ($purc_stop_dt_to.equalsIgnoreCase(name)) {
			return purc_stop_dt_to();
		}
		if ($order_stop_dt_fr.equalsIgnoreCase(name)) {
			return order_stop_dt_fr();
		}
		if ($order_stop_dt_to.equalsIgnoreCase(name)) {
			return order_stop_dt_to();
		}
		if ($mfg_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			return mfg_inst_stop_dt_fr();
		}
		if ($mfg_inst_stop_dt_to.equalsIgnoreCase(name)) {
			return mfg_inst_stop_dt_to();
		}
		if ($ship_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			return ship_inst_stop_dt_fr();
		}
		if ($ship_inst_stop_dt_to.equalsIgnoreCase(name)) {
			return ship_inst_stop_dt_to();
		}
		if ($xfr_stop_dt_fr.equalsIgnoreCase(name)) {
			return xfr_stop_dt_fr();
		}
		if ($xfr_stop_dt_to.equalsIgnoreCase(name)) {
			return xfr_stop_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($slo_stop_f_flg.equalsIgnoreCase(name)) {
			return slo_stop_f_flg();
		}
		if ($slo_stop_t_flg.equalsIgnoreCase(name)) {
			return slo_stop_t_flg();
		}
		if ($po_stop_f_flg.equalsIgnoreCase(name)) {
			return po_stop_f_flg();
		}
		if ($po_stop_t_flg.equalsIgnoreCase(name)) {
			return po_stop_t_flg();
		}
		if ($sls_stop_f_flg.equalsIgnoreCase(name)) {
			return sls_stop_f_flg();
		}
		if ($sls_stop_t_flg.equalsIgnoreCase(name)) {
			return sls_stop_t_flg();
		}
		if ($purc_stop_f_flg.equalsIgnoreCase(name)) {
			return purc_stop_f_flg();
		}
		if ($purc_stop_t_flg.equalsIgnoreCase(name)) {
			return purc_stop_t_flg();
		}
		if ($order_stop_f_flg.equalsIgnoreCase(name)) {
			return order_stop_f_flg();
		}
		if ($order_stop_t_flg.equalsIgnoreCase(name)) {
			return order_stop_t_flg();
		}
		if ($mfg_inst_stop_f_flg.equalsIgnoreCase(name)) {
			return mfg_inst_stop_f_flg();
		}
		if ($mfg_inst_stop_t_flg.equalsIgnoreCase(name)) {
			return mfg_inst_stop_t_flg();
		}
		if ($ship_inst_stop_f_flg.equalsIgnoreCase(name)) {
			return ship_inst_stop_f_flg();
		}
		if ($ship_inst_stop_t_flg.equalsIgnoreCase(name)) {
			return ship_inst_stop_t_flg();
		}
		if ($xfr_stop_f_flg.equalsIgnoreCase(name)) {
			return xfr_stop_f_flg();
		}
		if ($xfr_stop_t_flg.equalsIgnoreCase(name)) {
			return xfr_stop_t_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($slo_stop_dt_fr.equalsIgnoreCase(name)) {
			return slo_stop_dt_fr();
		}
		if ($slo_stop_dt_to.equalsIgnoreCase(name)) {
			return slo_stop_dt_to();
		}
		if ($po_stop_dt_fr.equalsIgnoreCase(name)) {
			return po_stop_dt_fr();
		}
		if ($po_stop_dt_to.equalsIgnoreCase(name)) {
			return po_stop_dt_to();
		}
		if ($sls_stop_dt_fr.equalsIgnoreCase(name)) {
			return sls_stop_dt_fr();
		}
		if ($sls_stop_dt_to.equalsIgnoreCase(name)) {
			return sls_stop_dt_to();
		}
		if ($purc_stop_dt_fr.equalsIgnoreCase(name)) {
			return purc_stop_dt_fr();
		}
		if ($purc_stop_dt_to.equalsIgnoreCase(name)) {
			return purc_stop_dt_to();
		}
		if ($order_stop_dt_fr.equalsIgnoreCase(name)) {
			return order_stop_dt_fr();
		}
		if ($order_stop_dt_to.equalsIgnoreCase(name)) {
			return order_stop_dt_to();
		}
		if ($mfg_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			return mfg_inst_stop_dt_fr();
		}
		if ($mfg_inst_stop_dt_to.equalsIgnoreCase(name)) {
			return mfg_inst_stop_dt_to();
		}
		if ($ship_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			return ship_inst_stop_dt_fr();
		}
		if ($ship_inst_stop_dt_to.equalsIgnoreCase(name)) {
			return ship_inst_stop_dt_to();
		}
		if ($xfr_stop_dt_fr.equalsIgnoreCase(name)) {
			return xfr_stop_dt_fr();
		}
		if ($xfr_stop_dt_to.equalsIgnoreCase(name)) {
			return xfr_stop_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($slo_stop_f_flg.equalsIgnoreCase(name)) {
			return slo_stop_f_flg();
		}
		if ($slo_stop_t_flg.equalsIgnoreCase(name)) {
			return slo_stop_t_flg();
		}
		if ($po_stop_f_flg.equalsIgnoreCase(name)) {
			return po_stop_f_flg();
		}
		if ($po_stop_t_flg.equalsIgnoreCase(name)) {
			return po_stop_t_flg();
		}
		if ($sls_stop_f_flg.equalsIgnoreCase(name)) {
			return sls_stop_f_flg();
		}
		if ($sls_stop_t_flg.equalsIgnoreCase(name)) {
			return sls_stop_t_flg();
		}
		if ($purc_stop_f_flg.equalsIgnoreCase(name)) {
			return purc_stop_f_flg();
		}
		if ($purc_stop_t_flg.equalsIgnoreCase(name)) {
			return purc_stop_t_flg();
		}
		if ($order_stop_f_flg.equalsIgnoreCase(name)) {
			return order_stop_f_flg();
		}
		if ($order_stop_t_flg.equalsIgnoreCase(name)) {
			return order_stop_t_flg();
		}
		if ($mfg_inst_stop_f_flg.equalsIgnoreCase(name)) {
			return mfg_inst_stop_f_flg();
		}
		if ($mfg_inst_stop_t_flg.equalsIgnoreCase(name)) {
			return mfg_inst_stop_t_flg();
		}
		if ($ship_inst_stop_f_flg.equalsIgnoreCase(name)) {
			return ship_inst_stop_f_flg();
		}
		if ($ship_inst_stop_t_flg.equalsIgnoreCase(name)) {
			return ship_inst_stop_t_flg();
		}
		if ($xfr_stop_f_flg.equalsIgnoreCase(name)) {
			return xfr_stop_f_flg();
		}
		if ($xfr_stop_t_flg.equalsIgnoreCase(name)) {
			return xfr_stop_t_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($slo_stop_dt_fr.equalsIgnoreCase(name)) {
			slo_stop_dt_fr(value);
			return;
		}
		if ($slo_stop_dt_to.equalsIgnoreCase(name)) {
			slo_stop_dt_to(value);
			return;
		}
		if ($po_stop_dt_fr.equalsIgnoreCase(name)) {
			po_stop_dt_fr(value);
			return;
		}
		if ($po_stop_dt_to.equalsIgnoreCase(name)) {
			po_stop_dt_to(value);
			return;
		}
		if ($sls_stop_dt_fr.equalsIgnoreCase(name)) {
			sls_stop_dt_fr(value);
			return;
		}
		if ($sls_stop_dt_to.equalsIgnoreCase(name)) {
			sls_stop_dt_to(value);
			return;
		}
		if ($purc_stop_dt_fr.equalsIgnoreCase(name)) {
			purc_stop_dt_fr(value);
			return;
		}
		if ($purc_stop_dt_to.equalsIgnoreCase(name)) {
			purc_stop_dt_to(value);
			return;
		}
		if ($order_stop_dt_fr.equalsIgnoreCase(name)) {
			order_stop_dt_fr(value);
			return;
		}
		if ($order_stop_dt_to.equalsIgnoreCase(name)) {
			order_stop_dt_to(value);
			return;
		}
		if ($mfg_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			mfg_inst_stop_dt_fr(value);
			return;
		}
		if ($mfg_inst_stop_dt_to.equalsIgnoreCase(name)) {
			mfg_inst_stop_dt_to(value);
			return;
		}
		if ($ship_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			ship_inst_stop_dt_fr(value);
			return;
		}
		if ($ship_inst_stop_dt_to.equalsIgnoreCase(name)) {
			ship_inst_stop_dt_to(value);
			return;
		}
		if ($xfr_stop_dt_fr.equalsIgnoreCase(name)) {
			xfr_stop_dt_fr(value);
			return;
		}
		if ($xfr_stop_dt_to.equalsIgnoreCase(name)) {
			xfr_stop_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($slo_stop_f_flg.equalsIgnoreCase(name)) {
			slo_stop_f_flg(value);
			return;
		}
		if ($slo_stop_t_flg.equalsIgnoreCase(name)) {
			slo_stop_t_flg(value);
			return;
		}
		if ($po_stop_f_flg.equalsIgnoreCase(name)) {
			po_stop_f_flg(value);
			return;
		}
		if ($po_stop_t_flg.equalsIgnoreCase(name)) {
			po_stop_t_flg(value);
			return;
		}
		if ($sls_stop_f_flg.equalsIgnoreCase(name)) {
			sls_stop_f_flg(value);
			return;
		}
		if ($sls_stop_t_flg.equalsIgnoreCase(name)) {
			sls_stop_t_flg(value);
			return;
		}
		if ($purc_stop_f_flg.equalsIgnoreCase(name)) {
			purc_stop_f_flg(value);
			return;
		}
		if ($purc_stop_t_flg.equalsIgnoreCase(name)) {
			purc_stop_t_flg(value);
			return;
		}
		if ($order_stop_f_flg.equalsIgnoreCase(name)) {
			order_stop_f_flg(value);
			return;
		}
		if ($order_stop_t_flg.equalsIgnoreCase(name)) {
			order_stop_t_flg(value);
			return;
		}
		if ($mfg_inst_stop_f_flg.equalsIgnoreCase(name)) {
			mfg_inst_stop_f_flg(value);
			return;
		}
		if ($mfg_inst_stop_t_flg.equalsIgnoreCase(name)) {
			mfg_inst_stop_t_flg(value);
			return;
		}
		if ($ship_inst_stop_f_flg.equalsIgnoreCase(name)) {
			ship_inst_stop_f_flg(value);
			return;
		}
		if ($ship_inst_stop_t_flg.equalsIgnoreCase(name)) {
			ship_inst_stop_t_flg(value);
			return;
		}
		if ($xfr_stop_f_flg.equalsIgnoreCase(name)) {
			xfr_stop_f_flg(value);
			return;
		}
		if ($xfr_stop_t_flg.equalsIgnoreCase(name)) {
			xfr_stop_t_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($slo_stop_dt_fr.equalsIgnoreCase(name)) {
			slo_stop_dt_fr(value);
			return;
		}
		if ($slo_stop_dt_to.equalsIgnoreCase(name)) {
			slo_stop_dt_to(value);
			return;
		}
		if ($po_stop_dt_fr.equalsIgnoreCase(name)) {
			po_stop_dt_fr(value);
			return;
		}
		if ($po_stop_dt_to.equalsIgnoreCase(name)) {
			po_stop_dt_to(value);
			return;
		}
		if ($sls_stop_dt_fr.equalsIgnoreCase(name)) {
			sls_stop_dt_fr(value);
			return;
		}
		if ($sls_stop_dt_to.equalsIgnoreCase(name)) {
			sls_stop_dt_to(value);
			return;
		}
		if ($purc_stop_dt_fr.equalsIgnoreCase(name)) {
			purc_stop_dt_fr(value);
			return;
		}
		if ($purc_stop_dt_to.equalsIgnoreCase(name)) {
			purc_stop_dt_to(value);
			return;
		}
		if ($order_stop_dt_fr.equalsIgnoreCase(name)) {
			order_stop_dt_fr(value);
			return;
		}
		if ($order_stop_dt_to.equalsIgnoreCase(name)) {
			order_stop_dt_to(value);
			return;
		}
		if ($mfg_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			mfg_inst_stop_dt_fr(value);
			return;
		}
		if ($mfg_inst_stop_dt_to.equalsIgnoreCase(name)) {
			mfg_inst_stop_dt_to(value);
			return;
		}
		if ($ship_inst_stop_dt_fr.equalsIgnoreCase(name)) {
			ship_inst_stop_dt_fr(value);
			return;
		}
		if ($ship_inst_stop_dt_to.equalsIgnoreCase(name)) {
			ship_inst_stop_dt_to(value);
			return;
		}
		if ($xfr_stop_dt_fr.equalsIgnoreCase(name)) {
			xfr_stop_dt_fr(value);
			return;
		}
		if ($xfr_stop_dt_to.equalsIgnoreCase(name)) {
			xfr_stop_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($slo_stop_f_flg.equalsIgnoreCase(name)) {
			slo_stop_f_flg(value);
			return;
		}
		if ($slo_stop_t_flg.equalsIgnoreCase(name)) {
			slo_stop_t_flg(value);
			return;
		}
		if ($po_stop_f_flg.equalsIgnoreCase(name)) {
			po_stop_f_flg(value);
			return;
		}
		if ($po_stop_t_flg.equalsIgnoreCase(name)) {
			po_stop_t_flg(value);
			return;
		}
		if ($sls_stop_f_flg.equalsIgnoreCase(name)) {
			sls_stop_f_flg(value);
			return;
		}
		if ($sls_stop_t_flg.equalsIgnoreCase(name)) {
			sls_stop_t_flg(value);
			return;
		}
		if ($purc_stop_f_flg.equalsIgnoreCase(name)) {
			purc_stop_f_flg(value);
			return;
		}
		if ($purc_stop_t_flg.equalsIgnoreCase(name)) {
			purc_stop_t_flg(value);
			return;
		}
		if ($order_stop_f_flg.equalsIgnoreCase(name)) {
			order_stop_f_flg(value);
			return;
		}
		if ($order_stop_t_flg.equalsIgnoreCase(name)) {
			order_stop_t_flg(value);
			return;
		}
		if ($mfg_inst_stop_f_flg.equalsIgnoreCase(name)) {
			mfg_inst_stop_f_flg(value);
			return;
		}
		if ($mfg_inst_stop_t_flg.equalsIgnoreCase(name)) {
			mfg_inst_stop_t_flg(value);
			return;
		}
		if ($ship_inst_stop_f_flg.equalsIgnoreCase(name)) {
			ship_inst_stop_f_flg(value);
			return;
		}
		if ($ship_inst_stop_t_flg.equalsIgnoreCase(name)) {
			ship_inst_stop_t_flg(value);
			return;
		}
		if ($xfr_stop_f_flg.equalsIgnoreCase(name)) {
			xfr_stop_f_flg(value);
			return;
		}
		if ($xfr_stop_t_flg.equalsIgnoreCase(name)) {
			xfr_stop_t_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

