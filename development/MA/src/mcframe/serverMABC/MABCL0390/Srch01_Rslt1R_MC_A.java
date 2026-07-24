package mcframe.serverMABC.MABCL0390;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public static final String $base_itm_nm = "base_itm_nm";
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public static final String $base_itm_alt_nm1 = "base_itm_alt_nm1";
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public static final String $base_itm_alt_nm2 = "base_itm_alt_nm2";
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public static final String $base_itm_alt_nm3 = "base_itm_alt_nm3";
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public static final String $base_itm_alt_nm4 = "base_itm_alt_nm4";
	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public static final String $th_image_flg = "th_image_flg";
	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public static final String $stk_mng_typ_nm = "stk_mng_typ_nm";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public static final String $rnd_typ_nm = "rnd_typ_nm";
	/**
	 * Volume unit cd. 容積単位ＣＤ.<p>
	 *
	 */
	public static final String $dim_unit_cd = "dim_unit_cd";
	/**
	 * Volume unit name 容積単位名.<p>
	 *
	 */
	public static final String $dim_unit_nm = "dim_unit_nm";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $dim = "dim";
	/**
	 * Weight unit cd. 重量単位ＣＤ.<p>
	 *
	 */
	public static final String $wt_unit_cd = "wt_unit_cd";
	/**
	 * Weight unit name 重量単位名.<p>
	 *
	 */
	public static final String $wt_unit_nm = "wt_unit_nm";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $wt = "wt";
	/**
	 * Conversion unit cd. 入り目単位ＣＤ.<p>
	 *
	 */
	public static final String $conts_unit_cd = "conts_unit_cd";
	/**
	 * Conversion unit name 入り目単位名.<p>
	 *
	 */
	public static final String $conts_unit_nm = "conts_unit_nm";
	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public static final String $conts_qty = "conts_qty";
	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public static final String $unit_dim = "unit_dim";
	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public static final String $unit_wt = "unit_wt";
	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public static final String $sls_itm_grp_nm = "sls_itm_grp_nm";
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
	/**
	 * HSCD ＨＳＣＤ.<p>
	 *
	 */
	public static final String $hs_cd = "hs_cd";
	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public static final String $hs_nm = "hs_nm";
	/**
	 * JAN type ＪＡＮ区分.<p>
	 *
	 */
	public static final String $jan_typ = "jan_typ";
	/**
	 * JAN type name ＪＡＮ区分名.<p>
	 *
	 */
	public static final String $jan_typ_nm = "jan_typ_nm";
	/**
	 * JAN cd. ＪＡＮ ＣＤ.<p>
	 *
	 */
	public static final String $jan_cd = "jan_cd";
	/**
	 * ITF cd. ＩＴＦ ＣＤ.<p>
	 *
	 */
	public static final String $itf_cd = "itf_cd";
	/**
	 * GTIN cd. ＧＴＩＮ ＣＤ.<p>
	 *
	 */
	public static final String $gtin_cd = "gtin_cd";
	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public static final String $memo1_c = "memo1_c";
	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public static final String $memo2_c = "memo2_c";
	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public static final String $memo3_c = "memo3_c";
	/**
	 * Entry user ID (Common) 登録ユーザＩＤ（共通）.<p>
	 *
	 */
	public static final String $ins_usr_id_c = "ins_usr_id_c";
	/**
	 * Entry user name (Common) 登録ユーザ名（共通）.<p>
	 *
	 */
	public static final String $ins_usr_nm_c = "ins_usr_nm_c";
	/**
	 * Entry date and time (Common) 登録日時（共通）.<p>
	 *
	 */
	public static final String $ins_ts_c = "ins_ts_c";
	/**
	 * Entry function ID (Common) 登録機能ＩＤ（共通）.<p>
	 *
	 */
	public static final String $ins_func_id_c = "ins_func_id_c";
	/**
	 * Entry function name (Common) 登録機能名（共通）.<p>
	 *
	 */
	public static final String $ins_func_nm_c = "ins_func_nm_c";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr_c = "upd_cntr_c";
	/**
	 * Update user ID (Common) 更新ユーザＩＤ（共通）.<p>
	 *
	 */
	public static final String $upd_usr_id_c = "upd_usr_id_c";
	/**
	 * Update user name (Common) 更新ユーザ名（共通）.<p>
	 *
	 */
	public static final String $upd_usr_nm_c = "upd_usr_nm_c";
	/**
	 * Update date and time (Common) 更新日時（共通）.<p>
	 *
	 */
	public static final String $upd_ts_c = "upd_ts_c";
	/**
	 * Update function ID (Common) 更新機能ＩＤ（共通）.<p>
	 *
	 */
	public static final String $upd_func_id_c = "upd_func_id_c";
	/**
	 * Update function name (Common) 更新機能名（共通）.<p>
	 *
	 */
	public static final String $upd_func_nm_c = "upd_func_nm_c";
	/**
	 * Update request No. (Common) 更新リクエストＮＯ（共通）.<p>
	 *
	 */
	public static final String $upd_srv_req_no_c = "upd_srv_req_no_c";
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public static final String $ac_itm_grp_cd = "ac_itm_grp_cd";
	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public static final String $ac_itm_grp_nm = "ac_itm_grp_nm";
	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public static final String $minus_stk_flg = "minus_stk_flg";
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public static final String $not_new_lot_flg = "not_new_lot_flg";
	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public static final String $gi_alloc_flg = "gi_alloc_flg";
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public static final String $sls_tax_nm = "sls_tax_nm";
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public static final String $purc_tax_nm = "purc_tax_nm";
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public static final String $prov_tax_nm = "prov_tax_nm";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public static final String $ship_unit_cd = "ship_unit_cd";
	/**
	 * Shipping unit name 出荷単位名.<p>
	 *
	 */
	public static final String $ship_unit_nm = "ship_unit_nm";
	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public static final String $mfg_unit_cd = "mfg_unit_cd";
	/**
	 * Mfg. unit name 製造単位名.<p>
	 *
	 */
	public static final String $mfg_unit_nm = "mfg_unit_nm";
	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_unit_cd = "purc_unit_cd";
	/**
	 * PO unit name 発注単位名.<p>
	 *
	 */
	public static final String $purc_unit_nm = "purc_unit_nm";
	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public static final String $pckg_unit_nm = "pckg_unit_nm";
	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public static final String $pack_alloc_flg = "pack_alloc_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public static final String $lot_mng_typ_nm = "lot_mng_typ_nm";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public static final String $lot_no_typ_nm = "lot_no_typ_nm";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public static final String $lot_no_ptn_nm = "lot_no_ptn_nm";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public static final String $sublot_mng_typ_nm = "sublot_mng_typ_nm";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public static final String $sublot_no_typ_nm = "sublot_no_typ_nm";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public static final String $sublot_no_ptn_nm = "sublot_no_ptn_nm";
	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public static final String $bp_lot_flg = "bp_lot_flg";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public static final String $insp_bind_typ_nm = "insp_bind_typ_nm";
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";
	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public static final String $mrkt_judg_role_nm = "mrkt_judg_role_nm";
	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_upd_role_cd = "mrkt_judg_upd_role_cd";
	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public static final String $mrkt_judg_upd_role_nm = "mrkt_judg_upd_role_nm";
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public static final String $lmt_ctl_flg = "lmt_ctl_flg";
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public static final String $lmt_ctl_categ = "lmt_ctl_categ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Rounding type name (Active ingredient conversion) 有効成分換算端数処理区分名.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ_nm = "cont_fctr_rnd_typ_nm";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public static final String $sno1_mng_typ_nm = "sno1_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $slo_sno1_flg = "slo_sno1_flg";
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $rqmt_sno1_flg = "rqmt_sno1_flg";
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public static final String $sno1_num_typ_nm = "sno1_num_typ_nm";
	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno1_ptn_cd = "sno1_ptn_cd";
	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public static final String $sno1_ptn_nm = "sno1_ptn_nm";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public static final String $sno2_mng_typ_nm = "sno2_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $slo_sno2_flg = "slo_sno2_flg";
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $rqmt_sno2_flg = "rqmt_sno2_flg";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public static final String $sno2_num_typ_nm = "sno2_num_typ_nm";
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno2_ptn_cd = "sno2_ptn_cd";
	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public static final String $sno2_ptn_nm = "sno2_ptn_nm";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public static final String $sno3_mng_typ_nm = "sno3_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $slo_sno3_flg = "slo_sno3_flg";
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $rqmt_sno3_flg = "rqmt_sno3_flg";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public static final String $sno3_num_typ_nm = "sno3_num_typ_nm";
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno3_ptn_cd = "sno3_ptn_cd";
	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public static final String $sno3_ptn_nm = "sno3_ptn_nm";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public static final String $sno4_mng_typ_nm = "sno4_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $slo_sno4_flg = "slo_sno4_flg";
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $rqmt_sno4_flg = "rqmt_sno4_flg";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public static final String $sno4_num_typ_nm = "sno4_num_typ_nm";
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno4_ptn_cd = "sno4_ptn_cd";
	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public static final String $sno4_ptn_nm = "sno4_ptn_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $def_bom_ptn = "def_bom_ptn";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public static final String $mrp_proc_typ = "mrp_proc_typ";
	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public static final String $mrp_proc_typ_nm = "mrp_proc_typ_nm";
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public static final String $rqmt_typ = "rqmt_typ";
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public static final String $rqmt_typ_nm = "rqmt_typ_nm";
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public static final String $prod_pln_typ = "prod_pln_typ";
	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public static final String $prod_pln_typ_nm = "prod_pln_typ_nm";
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days = "mrp_alloc_margin_days";
	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days = "mrp_opn_xfr_days";
	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public static final String $rqmt_rstr_qty = "rqmt_rstr_qty";
	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public static final String $inpt_itm_add_flg = "inpt_itm_add_flg";
	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public static final String $inpt_itm_del_flg = "inpt_itm_del_flg";
	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public static final String $sch_flg = "sch_flg";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public static final String $comp_spec_typ_nm = "comp_spec_typ_nm";
	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public static final String $comp_rev_at_slo_flg = "comp_rev_at_slo_flg";
	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public static final String $comp_core_itm_flg = "comp_core_itm_flg";
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_spec_grp_cd = "itm_spec_grp_cd";
	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public static final String $itm_spec_grp_nm = "itm_spec_grp_nm";
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public static final String $sls_upri_grp_nm = "sls_upri_grp_nm";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public static final String $slo_proc_flg = "slo_proc_flg";
	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public static final String $slo_proc_typ = "slo_proc_typ";
	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public static final String $slo_proc_typ_nm = "slo_proc_typ_nm";
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public static final String $ship_inst_typ_nm = "ship_inst_typ_nm";
	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public static final String $ship_lot_back_stop_flg = "ship_lot_back_stop_flg";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public static final String $itm_ship_grp_nm = "itm_ship_grp_nm";
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public static final String $ship_valid_grp_cd = "ship_valid_grp_cd";
	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public static final String $ship_valid_grp_nm = "ship_valid_grp_nm";
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public static final String $purc_dlv_slip_flg = "purc_dlv_slip_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public static final String $exim_xpns_typ = "exim_xpns_typ";
	/**
	 * Import/export charges type name 輸出入諸掛区分名.<p>
	 *
	 */
	public static final String $exim_xpns_typ_nm = "exim_xpns_typ_nm";
	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public static final String $stk_lst_flg = "stk_lst_flg";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 * Reference item cd. 参照品目ＣＤ.<p>
	 *
	 */
	public static final String $ref_itm_cd = "ref_itm_cd";
	/**
	 * Reference branch No. 1 参照枝番１.<p>
	 *
	 */
	public static final String $ref_itm_sub1 = "ref_itm_sub1";
	/**
	 * Reference branch No. 2 参照枝番２.<p>
	 *
	 */
	public static final String $ref_itm_sub2 = "ref_itm_sub2";
	/**
	 * Reference branch No. 3 参照枝番３.<p>
	 *
	 */
	public static final String $ref_itm_sub3 = "ref_itm_sub3";
	/**
	 * Reference item name 参照品名.<p>
	 *
	 */
	public static final String $ref_itm_nm = "ref_itm_nm";
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public static final String $ext_sys_no_itm = "ext_sys_no_itm";
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public static final String $calc_ptn_cd = "calc_ptn_cd";
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public static final String $calc_ptn_nm = "calc_ptn_nm";
	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public static final String $cost_std_qty = "cost_std_qty";
	/**
	 * Item allocation group 品目配賦グループ.<p>
	 *
	 */
	public static final String $itm_alc_grp = "itm_alc_grp";
	/**
	 * Sales 販売.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public static final String $sls_input_flg = "sls_input_flg";
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public static final String $mfg_input_flg = "mfg_input_flg";
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public static final String $purc_input_flg = "purc_input_flg";
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public static final String $insp_input_flg = "insp_input_flg";
	/**
	 * Release リリース.<p>
	 *
	 */
	public static final String $release_flg = "release_flg";
	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public static final String $release_tm = "release_tm";
	/**
	 * Release PIC リリース担当者.<p>
	 *
	 */
	public static final String $release_usr_cd = "release_usr_cd";
	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public static final String $release_usr_nm = "release_usr_nm";
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
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta base_itm_nm_META = createCommonMeta($base_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta base_itm_alt_nm1_META = createCommonMeta($base_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta base_itm_alt_nm2_META = createCommonMeta($base_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta base_itm_alt_nm3_META = createCommonMeta($base_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta base_itm_alt_nm4_META = createCommonMeta($base_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta th_image_flg_META = createCommonMeta($th_image_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta stk_mng_typ_nm_META = createCommonMeta($stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rnd_typ_nm_META = createCommonMeta($rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta dim_unit_cd_META = createCommonMeta($dim_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dim_unit_nm_META = createCommonMeta($dim_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta wt_unit_cd_META = createCommonMeta($wt_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta wt_unit_nm_META = createCommonMeta($wt_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta conts_unit_cd_META = createCommonMeta($conts_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta conts_unit_nm_META = createCommonMeta($conts_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta conts_qty_META = createCommonMeta($conts_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_dim_META = createCommonMeta($unit_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta unit_wt_META = createCommonMeta($unit_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta sls_itm_grp_nm_META = createCommonMeta($sls_itm_grp_nm, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
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
	public static final MCMeta hs_cd_META = createCommonMeta($hs_cd, mcframe.commonMA.meta.MA_META.HS_CD);
	public static final MCMeta hs_nm_META = createCommonMeta($hs_nm, mcframe.commonMA.meta.MA_META.HS_NM);
	public static final MCMeta jan_typ_META = createCommonMeta($jan_typ, mcframe.commonMA.meta.MA_META.JAN_TYP);
	public static final MCMeta jan_typ_nm_META = createCommonMeta($jan_typ_nm, mcframe.commonMA.meta.MA_META.JAN_TYP_NM);
	public static final MCMeta jan_cd_META = createCommonMeta($jan_cd, mcframe.commonMA.meta.MA_META.JAN_CD);
	public static final MCMeta itf_cd_META = createCommonMeta($itf_cd, mcframe.commonMA.meta.MA_META.ITF_CD);
	public static final MCMeta gtin_cd_META = createCommonMeta($gtin_cd, mcframe.commonMA.meta.MA_META.GTIN_CD);
	public static final MCMeta memo1_c_META = createCommonMeta($memo1_c, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_c_META = createCommonMeta($memo2_c, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_c_META = createCommonMeta($memo3_c, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_c_META = createCommonMeta($ins_usr_id_c, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_c_META = createCommonMeta($ins_usr_nm_c, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_c_META = createCommonMeta($ins_ts_c, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_c_META = createCommonMeta($ins_func_id_c, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_c_META = createCommonMeta($ins_func_nm_c, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_c_META = createCommonMeta($upd_cntr_c, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_c_META = createCommonMeta($upd_usr_id_c, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_c_META = createCommonMeta($upd_usr_nm_c, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_c_META = createCommonMeta($upd_ts_c, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_c_META = createCommonMeta($upd_func_id_c, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_c_META = createCommonMeta($upd_func_nm_c, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_c_META = createCommonMeta($upd_srv_req_no_c, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ac_itm_grp_cd_META = createCommonMeta($ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta ac_itm_grp_nm_META = createCommonMeta($ac_itm_grp_nm, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta minus_stk_flg_META = createCommonMeta($minus_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_new_lot_flg_META = createCommonMeta($not_new_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_alloc_flg_META = createCommonMeta($gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_nm_META = createCommonMeta($sls_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_nm_META = createCommonMeta($purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_nm_META = createCommonMeta($prov_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta ship_unit_cd_META = createCommonMeta($ship_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ship_unit_nm_META = createCommonMeta($ship_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta mfg_unit_cd_META = createCommonMeta($mfg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta mfg_unit_nm_META = createCommonMeta($mfg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta purc_unit_cd_META = createCommonMeta($purc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_unit_nm_META = createCommonMeta($purc_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_nm_META = createCommonMeta($pckg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_alloc_flg_META = createCommonMeta($pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_mng_typ_nm_META = createCommonMeta($lot_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP_NM);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_typ_nm_META = createCommonMeta($lot_no_typ_nm, mcframe.commonMA.meta.MA_META.LOT_NO_TYP_NM);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta lot_no_ptn_nm_META = createCommonMeta($lot_no_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_nm_META = createCommonMeta($sublot_mng_typ_nm, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP_NM);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_typ_nm_META = createCommonMeta($sublot_no_typ_nm, mcframe.commonMA.meta.MA_META.LOT_NO_TYP_NM);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_no_ptn_nm_META = createCommonMeta($sublot_no_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta insp_bind_typ_nm_META = createCommonMeta($insp_bind_typ_nm, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP_NM);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mrkt_judg_role_nm_META = createCommonMeta($mrkt_judg_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta mrkt_judg_upd_role_cd_META = createCommonMeta($mrkt_judg_upd_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mrkt_judg_upd_role_nm_META = createCommonMeta($mrkt_judg_upd_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_categ_META = createCommonMeta($lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_rnd_typ_nm_META = createCommonMeta($cont_fctr_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_mng_typ_nm_META = createCommonMeta($sno1_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno1_flg_META = createCommonMeta($rqmt_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno1_num_typ_nm_META = createCommonMeta($sno1_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta sno1_ptn_cd_META = createCommonMeta($sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno1_ptn_nm_META = createCommonMeta($sno1_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_nm_META = createCommonMeta($sno2_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno2_flg_META = createCommonMeta($rqmt_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_nm_META = createCommonMeta($sno2_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta sno2_ptn_cd_META = createCommonMeta($sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno2_ptn_nm_META = createCommonMeta($sno2_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_nm_META = createCommonMeta($sno3_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno3_flg_META = createCommonMeta($rqmt_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_nm_META = createCommonMeta($sno3_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta sno3_ptn_cd_META = createCommonMeta($sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno3_ptn_nm_META = createCommonMeta($sno3_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_nm_META = createCommonMeta($sno4_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqmt_sno4_flg_META = createCommonMeta($rqmt_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_nm_META = createCommonMeta($sno4_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta sno4_ptn_cd_META = createCommonMeta($sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno4_ptn_nm_META = createCommonMeta($sno4_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_bom_ptn_META = createCommonMeta($def_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_META = createCommonMeta($mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta mrp_proc_typ_META = createCommonMeta($mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_nm_META = createCommonMeta($mrp_proc_typ_nm, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP_NM);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_nm_META = createCommonMeta($rqmt_typ_nm, mcframe.commonMA.meta.MA_META.RQMT_TYP_NM);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_nm_META = createCommonMeta($prod_pln_typ_nm, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP_NM);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_META = createCommonMeta($mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_META = createCommonMeta($mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta rqmt_rstr_qty_META = createCommonMeta($rqmt_rstr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_itm_add_flg_META = createCommonMeta($inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_itm_del_flg_META = createCommonMeta($inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sch_flg_META = createCommonMeta($sch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta comp_spec_typ_nm_META = createCommonMeta($comp_spec_typ_nm, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP_NM);
	public static final MCMeta comp_rev_at_slo_flg_META = createCommonMeta($comp_rev_at_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_core_itm_flg_META = createCommonMeta($comp_core_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_spec_grp_cd_META = createCommonMeta($itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta itm_spec_grp_nm_META = createCommonMeta($itm_spec_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_NM);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta sls_upri_grp_nm_META = createCommonMeta($sls_upri_grp_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_NM);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta slo_proc_flg_META = createCommonMeta($slo_proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_proc_typ_META = createCommonMeta($slo_proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta slo_proc_typ_nm_META = createCommonMeta($slo_proc_typ_nm, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP_NM);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_inst_typ_nm_META = createCommonMeta($ship_inst_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP_NM);
	public static final MCMeta ship_lot_back_stop_flg_META = createCommonMeta($ship_lot_back_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta itm_ship_grp_nm_META = createCommonMeta($itm_ship_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_NM);
	public static final MCMeta ship_valid_grp_cd_META = createCommonMeta($ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta ship_valid_grp_nm_META = createCommonMeta($ship_valid_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_NM);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dlv_slip_flg_META = createCommonMeta($purc_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta exim_xpns_typ_META = createCommonMeta($exim_xpns_typ, mcframe.commonMA.meta.MA_META.EXIM_XPNS_TYP);
	public static final MCMeta exim_xpns_typ_nm_META = createCommonMeta($exim_xpns_typ_nm, mcframe.commonMA.meta.MA_META.EXIM_XPNS_TYP_NM);
	public static final MCMeta stk_lst_flg_META = createCommonMeta($stk_lst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_itm_cd_META = createCommonMeta($ref_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta ref_itm_sub1_META = createCommonMeta($ref_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta ref_itm_sub2_META = createCommonMeta($ref_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta ref_itm_sub3_META = createCommonMeta($ref_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ref_itm_nm_META = createCommonMeta($ref_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ext_sys_no_itm_META = createCommonMeta($ext_sys_no_itm, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_ITM);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta calc_ptn_cd_META = createCommonMeta($calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta calc_ptn_nm_META = createCommonMeta($calc_ptn_nm, mcframe.commonMA.meta.MA_META.CALC_PTN_NM);
	public static final MCMeta cost_std_qty_META = createCommonMeta($cost_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_alc_grp_META = createCommonMeta($itm_alc_grp, mcframe.commonMA.meta.MA_META.ITM_ALC_GRP);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_input_flg_META = createCommonMeta($sls_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_input_flg_META = createCommonMeta($mfg_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_input_flg_META = createCommonMeta($purc_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_input_flg_META = createCommonMeta($insp_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta release_flg_META = createCommonMeta($release_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta release_tm_META = createCommonMeta($release_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta release_usr_cd_META = createCommonMeta($release_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta release_usr_nm_META = createCommonMeta($release_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			base_itm_nm_META,
			base_itm_alt_nm1_META,
			base_itm_alt_nm2_META,
			base_itm_alt_nm3_META,
			base_itm_alt_nm4_META,
			th_image_flg_META,
			th_image_META,
			stk_mng_typ_META,
			stk_mng_typ_nm_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			rnd_typ_META,
			rnd_typ_nm_META,
			dim_unit_cd_META,
			dim_unit_nm_META,
			dim_META,
			wt_unit_cd_META,
			wt_unit_nm_META,
			wt_META,
			conts_unit_cd_META,
			conts_unit_nm_META,
			conts_qty_META,
			unit_dim_META,
			unit_wt_META,
			sls_itm_grp_cd_META,
			sls_itm_grp_nm_META,
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
			itm_grp_nm10_META,
			hs_cd_META,
			hs_nm_META,
			jan_typ_META,
			jan_typ_nm_META,
			jan_cd_META,
			itf_cd_META,
			gtin_cd_META,
			memo1_c_META,
			memo2_c_META,
			memo3_c_META,
			ins_usr_id_c_META,
			ins_usr_nm_c_META,
			ins_ts_c_META,
			ins_func_id_c_META,
			ins_func_nm_c_META,
			upd_cntr_c_META,
			upd_usr_id_c_META,
			upd_usr_nm_c_META,
			upd_ts_c_META,
			upd_func_id_c_META,
			upd_func_nm_c_META,
			upd_srv_req_no_c_META,
			co_cd_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			ac_itm_grp_cd_META,
			ac_itm_grp_nm_META,
			minus_stk_flg_META,
			not_new_lot_flg_META,
			gi_alloc_flg_META,
			sls_tax_cd_META,
			sls_tax_nm_META,
			purc_tax_cd_META,
			purc_tax_nm_META,
			prov_tax_cd_META,
			prov_tax_nm_META,
			wtax_rate_META,
			ship_unit_cd_META,
			ship_unit_nm_META,
			mfg_unit_cd_META,
			mfg_unit_nm_META,
			purc_unit_cd_META,
			purc_unit_nm_META,
			pckg_unit_cd_META,
			pckg_unit_nm_META,
			pack_alloc_flg_META,
			lot_mng_typ_META,
			lot_mng_typ_nm_META,
			lot_no_typ_META,
			lot_no_typ_nm_META,
			lot_no_ptn_cd_META,
			lot_no_ptn_nm_META,
			sublot_mng_typ_META,
			sublot_mng_typ_nm_META,
			sublot_no_typ_META,
			sublot_no_typ_nm_META,
			sublot_no_ptn_cd_META,
			sublot_no_ptn_nm_META,
			bp_lot_flg_META,
			insp_bind_typ_META,
			insp_bind_typ_nm_META,
			skip_chk_ship_flg_META,
			mrkt_judg_flg_META,
			mrkt_judg_role_cd_META,
			mrkt_judg_role_nm_META,
			mrkt_judg_upd_role_cd_META,
			mrkt_judg_upd_role_nm_META,
			lmt_ctl_flg_META,
			lmt_ctl_categ_META,
			cont_fctr_flg_META,
			std_cont_fctr_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_rnd_typ_nm_META,
			cont_fctr_dec_place_META,
			sno1_mng_typ_META,
			sno1_mng_typ_nm_META,
			slo_sno1_flg_META,
			rqmt_sno1_flg_META,
			sno1_num_typ_META,
			sno1_num_typ_nm_META,
			sno1_ptn_cd_META,
			sno1_ptn_nm_META,
			sno2_mng_typ_META,
			sno2_mng_typ_nm_META,
			slo_sno2_flg_META,
			rqmt_sno2_flg_META,
			sno2_num_typ_META,
			sno2_num_typ_nm_META,
			sno2_ptn_cd_META,
			sno2_ptn_nm_META,
			sno3_mng_typ_META,
			sno3_mng_typ_nm_META,
			slo_sno3_flg_META,
			rqmt_sno3_flg_META,
			sno3_num_typ_META,
			sno3_num_typ_nm_META,
			sno3_ptn_cd_META,
			sno3_ptn_nm_META,
			sno4_mng_typ_META,
			sno4_mng_typ_nm_META,
			slo_sno4_flg_META,
			rqmt_sno4_flg_META,
			sno4_num_typ_META,
			sno4_num_typ_nm_META,
			sno4_ptn_cd_META,
			sno4_ptn_nm_META,
			def_bom_ptn_META,
			mfg_inst_unit_typ_META,
			mfg_inst_unit_typ_nm_META,
			mrp_proc_typ_META,
			mrp_proc_typ_nm_META,
			rqmt_typ_META,
			rqmt_typ_nm_META,
			prod_pln_typ_META,
			prod_pln_typ_nm_META,
			dmnd_date_div_mons_META,
			alloc_margin_days_META,
			mrp_alloc_margin_days_META,
			mrp_opn_xfr_days_META,
			rqmt_rstr_qty_META,
			inpt_itm_add_flg_META,
			inpt_itm_del_flg_META,
			sch_flg_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			comp_spec_typ_META,
			comp_spec_typ_nm_META,
			comp_rev_at_slo_flg_META,
			comp_core_itm_flg_META,
			itm_spec_grp_cd_META,
			itm_spec_grp_nm_META,
			sls_upri_grp_cd_META,
			sls_upri_grp_nm_META,
			bill_crryovr_times_META,
			pay_crryovr_times_META,
			slo_proc_flg_META,
			slo_proc_typ_META,
			slo_proc_typ_nm_META,
			ship_inst_typ_META,
			ship_inst_typ_nm_META,
			ship_lot_back_stop_flg_META,
			itm_ship_grp_cd_META,
			itm_ship_grp_nm_META,
			ship_valid_grp_cd_META,
			ship_valid_grp_nm_META,
			arr_skip_flg_META,
			purc_dlv_slip_flg_META,
			ship_term_cd_META,
			ship_term_nm_META,
			exim_xpns_typ_META,
			exim_xpns_typ_nm_META,
			stk_lst_flg_META,
			ver_flg_META,
			sls_upri_cng_flg_META,
			purc_upri_cng_flg_META,
			prov_upri_cng_flg_META,
			ref_itm_cd_META,
			ref_itm_sub1_META,
			ref_itm_sub2_META,
			ref_itm_sub3_META,
			ref_itm_nm_META,
			ext_sys_no_itm_META,
			chng_no_META,
			calc_ptn_cd_META,
			calc_ptn_nm_META,
			cost_std_qty_META,
			itm_alc_grp_META,
			sls_flg_META,
			sls_input_flg_META,
			mfg_flg_META,
			mfg_input_flg_META,
			purc_flg_META,
			purc_input_flg_META,
			insp_flg_META,
			insp_input_flg_META,
			release_flg_META,
			release_tm_META,
			release_usr_cd_META,
			release_usr_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_mng_typ, "MAC_STK_MNG_TYP"},	// stk_mng_typ
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"},	// asset_mng_typ
				{$rnd_typ, "MAC_RND_TYP"},	// rnd_typ
				{$jan_typ, "MAC_JAN_TYP"},	// jan_typ
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$lot_mng_typ, "MAC_LOT_MNG_TYP"},	// lot_mng_typ
				{$lot_no_typ, "MAC_SNO_NO_TYP"},	// lot_no_typ
				{$sublot_mng_typ, "MAC_SUBLOT_MNG_TYP"},	// sublot_mng_typ
				{$sublot_no_typ, "MAC_SNO_NO_TYP"},	// sublot_no_typ
				{$insp_bind_typ, "MAC_INSP_BIND_TYP"},	// insp_bind_typ
				{$cont_fctr_rnd_typ, "MAC_RND_TYP"},	// cont_fctr_rnd_typ
				{$sno1_mng_typ, "MAC_SNO_MNG_TYP"},	// sno1_mng_typ
				{$sno1_num_typ, "MAC_SNO_NO_TYP"},	// sno1_num_typ
				{$sno2_mng_typ, "MAC_SNO_MNG_TYP"},	// sno2_mng_typ
				{$sno2_num_typ, "MAC_SNO_NO_TYP"},	// sno2_num_typ
				{$sno3_mng_typ, "MAC_SNO_MNG_TYP"},	// sno3_mng_typ
				{$sno3_num_typ, "MAC_SNO_NO_TYP"},	// sno3_num_typ
				{$sno4_mng_typ, "MAC_SNO_MNG_TYP"},	// sno4_mng_typ
				{$sno4_num_typ, "MAC_SNO_NO_TYP"},	// sno4_num_typ
				{$mfg_inst_unit_typ, "MAC_MFG_INST_UNIT_TYP"},	// mfg_inst_unit_typ
				{$mrp_proc_typ, "MAC_MRP_PROC_TYP"},	// mrp_proc_typ
				{$rqmt_typ, "MAC_RQMT_TYP"},	// rqmt_typ
				{$prod_pln_typ, "MAC_PROD_PLN_TYP"},	// prod_pln_typ
				{$comp_spec_typ, "MAC_COMP_SPEC_TYP"},	// comp_spec_typ
				{$slo_proc_typ, "MAC_SLO_PROC_TYP"},	// slo_proc_typ
				{$ship_inst_typ, "MAC_SHIP_INST_TYP"},	// ship_inst_typ
				{$exim_xpns_typ, "MAC_EXIM_XPNS_TYP"}	// exim_xpns_typ
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public String base_itm_nm() {
		return getConstString(offset + 6, $base_itm_nm);
	}

	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public void base_itm_nm(String value) {
		setConstString(offset + 6, $base_itm_nm, value);
	}


	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public String base_itm_alt_nm1() {
		return getConstString(offset + 7, $base_itm_alt_nm1);
	}

	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public void base_itm_alt_nm1(String value) {
		setConstString(offset + 7, $base_itm_alt_nm1, value);
	}


	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public String base_itm_alt_nm2() {
		return getConstString(offset + 8, $base_itm_alt_nm2);
	}

	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public void base_itm_alt_nm2(String value) {
		setConstString(offset + 8, $base_itm_alt_nm2, value);
	}


	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public String base_itm_alt_nm3() {
		return getConstString(offset + 9, $base_itm_alt_nm3);
	}

	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public void base_itm_alt_nm3(String value) {
		setConstString(offset + 9, $base_itm_alt_nm3, value);
	}


	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public String base_itm_alt_nm4() {
		return getConstString(offset + 10, $base_itm_alt_nm4);
	}

	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public void base_itm_alt_nm4(String value) {
		setConstString(offset + 10, $base_itm_alt_nm4, value);
	}


	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public boolean th_image_flg() {
		return getConstBoolean(offset + 11, $th_image_flg);
	}

	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public void th_image_flg(boolean value) {
		setConstBoolean(offset + 11, $th_image_flg, value);
	}


	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 12, $th_image);
	}

	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 12, $th_image, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 13, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 13, $stk_mng_typ, value);
	}


	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public String stk_mng_typ_nm() {
		return getConstString(offset + 14, $stk_mng_typ_nm);
	}

	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public void stk_mng_typ_nm(String value) {
		setConstString(offset + 14, $stk_mng_typ_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 15, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 15, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 16, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 16, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 17, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 17, $sundry_itm_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 18, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 18, $dscnt_itm_flg, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 19, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 19, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 20, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 20, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 21, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 21, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 22, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 22, $rnd_typ, value);
	}


	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public String rnd_typ_nm() {
		return getConstString(offset + 23, $rnd_typ_nm);
	}

	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public void rnd_typ_nm(String value) {
		setConstString(offset + 23, $rnd_typ_nm, value);
	}


	/**
	 * Volume unit cd. 容積単位ＣＤ.<p>
	 *
	 */
	public String dim_unit_cd() {
		return getConstString(offset + 24, $dim_unit_cd);
	}

	/**
	 * Volume unit cd. 容積単位ＣＤ.<p>
	 *
	 */
	public void dim_unit_cd(String value) {
		setConstString(offset + 24, $dim_unit_cd, value);
	}


	/**
	 * Volume unit name 容積単位名.<p>
	 *
	 */
	public String dim_unit_nm() {
		return getConstString(offset + 25, $dim_unit_nm);
	}

	/**
	 * Volume unit name 容積単位名.<p>
	 *
	 */
	public void dim_unit_nm(String value) {
		setConstString(offset + 25, $dim_unit_nm, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 26, $dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 26, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 26, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 26, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 26, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 26, $dim, value);
	}


	/**
	 * Weight unit cd. 重量単位ＣＤ.<p>
	 *
	 */
	public String wt_unit_cd() {
		return getConstString(offset + 27, $wt_unit_cd);
	}

	/**
	 * Weight unit cd. 重量単位ＣＤ.<p>
	 *
	 */
	public void wt_unit_cd(String value) {
		setConstString(offset + 27, $wt_unit_cd, value);
	}


	/**
	 * Weight unit name 重量単位名.<p>
	 *
	 */
	public String wt_unit_nm() {
		return getConstString(offset + 28, $wt_unit_nm);
	}

	/**
	 * Weight unit name 重量単位名.<p>
	 *
	 */
	public void wt_unit_nm(String value) {
		setConstString(offset + 28, $wt_unit_nm, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 29, $wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 29, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 29, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 29, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 29, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 29, $wt, value);
	}


	/**
	 * Conversion unit cd. 入り目単位ＣＤ.<p>
	 *
	 */
	public String conts_unit_cd() {
		return getConstString(offset + 30, $conts_unit_cd);
	}

	/**
	 * Conversion unit cd. 入り目単位ＣＤ.<p>
	 *
	 */
	public void conts_unit_cd(String value) {
		setConstString(offset + 30, $conts_unit_cd, value);
	}


	/**
	 * Conversion unit name 入り目単位名.<p>
	 *
	 */
	public String conts_unit_nm() {
		return getConstString(offset + 31, $conts_unit_nm);
	}

	/**
	 * Conversion unit name 入り目単位名.<p>
	 *
	 */
	public void conts_unit_nm(String value) {
		setConstString(offset + 31, $conts_unit_nm, value);
	}


	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public MCNumber conts_qty() {
		return getConstNumber(offset + 32, $conts_qty);
	}

	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public void conts_qty(MCNumber value) {
		setConstNumber(offset + 32, $conts_qty, value);
	}

	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public void conts_qty(int value) {
		setConstNumber(offset + 32, $conts_qty, value);
	}

	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public void conts_qty(long value) {
		setConstNumber(offset + 32, $conts_qty, value);
	}

	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public void conts_qty(float value) {
		setConstNumber(offset + 32, $conts_qty, value);
	}

	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public void conts_qty(double value) {
		setConstNumber(offset + 32, $conts_qty, value);
	}


	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public MCNumber unit_dim() {
		return getConstNumber(offset + 33, $unit_dim);
	}

	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public void unit_dim(MCNumber value) {
		setConstNumber(offset + 33, $unit_dim, value);
	}

	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public void unit_dim(int value) {
		setConstNumber(offset + 33, $unit_dim, value);
	}

	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public void unit_dim(long value) {
		setConstNumber(offset + 33, $unit_dim, value);
	}

	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public void unit_dim(float value) {
		setConstNumber(offset + 33, $unit_dim, value);
	}

	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public void unit_dim(double value) {
		setConstNumber(offset + 33, $unit_dim, value);
	}


	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public MCNumber unit_wt() {
		return getConstNumber(offset + 34, $unit_wt);
	}

	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public void unit_wt(MCNumber value) {
		setConstNumber(offset + 34, $unit_wt, value);
	}

	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public void unit_wt(int value) {
		setConstNumber(offset + 34, $unit_wt, value);
	}

	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public void unit_wt(long value) {
		setConstNumber(offset + 34, $unit_wt, value);
	}

	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public void unit_wt(float value) {
		setConstNumber(offset + 34, $unit_wt, value);
	}

	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public void unit_wt(double value) {
		setConstNumber(offset + 34, $unit_wt, value);
	}


	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 35, $sls_itm_grp_cd);
	}

	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 35, $sls_itm_grp_cd, value);
	}


	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public String sls_itm_grp_nm() {
		return getConstString(offset + 36, $sls_itm_grp_nm);
	}

	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public void sls_itm_grp_nm(String value) {
		setConstString(offset + 36, $sls_itm_grp_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 37, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 37, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 38, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 38, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 39, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 39, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 40, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 40, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 41, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 41, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 42, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 42, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 43, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 43, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 44, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 44, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 45, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 45, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 46, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 46, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 47, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 47, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 48, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 48, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 49, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 49, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 50, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 50, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 51, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 51, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 52, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 52, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 53, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 53, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 54, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 54, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 55, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 55, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 56, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 56, $itm_grp_nm10, value);
	}


	/**
	 * HSCD ＨＳＣＤ.<p>
	 *
	 */
	public String hs_cd() {
		return getConstString(offset + 57, $hs_cd);
	}

	/**
	 * HSCD ＨＳＣＤ.<p>
	 *
	 */
	public void hs_cd(String value) {
		setConstString(offset + 57, $hs_cd, value);
	}


	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public String hs_nm() {
		return getConstString(offset + 58, $hs_nm);
	}

	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public void hs_nm(String value) {
		setConstString(offset + 58, $hs_nm, value);
	}


	/**
	 * JAN type ＪＡＮ区分.<p>
	 *
	 */
	public String jan_typ() {
		return getConstString(offset + 59, $jan_typ);
	}

	/**
	 * JAN type ＪＡＮ区分.<p>
	 *
	 */
	public void jan_typ(String value) {
		setConstString(offset + 59, $jan_typ, value);
	}


	/**
	 * JAN type name ＪＡＮ区分名.<p>
	 *
	 */
	public String jan_typ_nm() {
		return getConstString(offset + 60, $jan_typ_nm);
	}

	/**
	 * JAN type name ＪＡＮ区分名.<p>
	 *
	 */
	public void jan_typ_nm(String value) {
		setConstString(offset + 60, $jan_typ_nm, value);
	}


	/**
	 * JAN cd. ＪＡＮ ＣＤ.<p>
	 *
	 */
	public String jan_cd() {
		return getConstString(offset + 61, $jan_cd);
	}

	/**
	 * JAN cd. ＪＡＮ ＣＤ.<p>
	 *
	 */
	public void jan_cd(String value) {
		setConstString(offset + 61, $jan_cd, value);
	}


	/**
	 * ITF cd. ＩＴＦ ＣＤ.<p>
	 *
	 */
	public String itf_cd() {
		return getConstString(offset + 62, $itf_cd);
	}

	/**
	 * ITF cd. ＩＴＦ ＣＤ.<p>
	 *
	 */
	public void itf_cd(String value) {
		setConstString(offset + 62, $itf_cd, value);
	}


	/**
	 * GTIN cd. ＧＴＩＮ ＣＤ.<p>
	 *
	 */
	public String gtin_cd() {
		return getConstString(offset + 63, $gtin_cd);
	}

	/**
	 * GTIN cd. ＧＴＩＮ ＣＤ.<p>
	 *
	 */
	public void gtin_cd(String value) {
		setConstString(offset + 63, $gtin_cd, value);
	}


	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public String memo1_c() {
		return getConstString(offset + 64, $memo1_c);
	}

	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public void memo1_c(String value) {
		setConstString(offset + 64, $memo1_c, value);
	}


	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public String memo2_c() {
		return getConstString(offset + 65, $memo2_c);
	}

	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public void memo2_c(String value) {
		setConstString(offset + 65, $memo2_c, value);
	}


	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public String memo3_c() {
		return getConstString(offset + 66, $memo3_c);
	}

	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public void memo3_c(String value) {
		setConstString(offset + 66, $memo3_c, value);
	}


	/**
	 * Entry user ID (Common) 登録ユーザＩＤ（共通）.<p>
	 *
	 */
	public String ins_usr_id_c() {
		return getConstString(offset + 67, $ins_usr_id_c);
	}

	/**
	 * Entry user ID (Common) 登録ユーザＩＤ（共通）.<p>
	 *
	 */
	public void ins_usr_id_c(String value) {
		setConstString(offset + 67, $ins_usr_id_c, value);
	}


	/**
	 * Entry user name (Common) 登録ユーザ名（共通）.<p>
	 *
	 */
	public String ins_usr_nm_c() {
		return getConstString(offset + 68, $ins_usr_nm_c);
	}

	/**
	 * Entry user name (Common) 登録ユーザ名（共通）.<p>
	 *
	 */
	public void ins_usr_nm_c(String value) {
		setConstString(offset + 68, $ins_usr_nm_c, value);
	}


	/**
	 * Entry date and time (Common) 登録日時（共通）.<p>
	 *
	 */
	public MCTimestamp ins_ts_c() {
		return getConstTimestamp(offset + 69, $ins_ts_c);
	}

	/**
	 * Entry date and time (Common) 登録日時（共通）.<p>
	 *
	 */
	public void ins_ts_c(MCTimestamp value) {
		setConstTimestamp(offset + 69, $ins_ts_c, value);
	}


	/**
	 * Entry function ID (Common) 登録機能ＩＤ（共通）.<p>
	 *
	 */
	public String ins_func_id_c() {
		return getConstString(offset + 70, $ins_func_id_c);
	}

	/**
	 * Entry function ID (Common) 登録機能ＩＤ（共通）.<p>
	 *
	 */
	public void ins_func_id_c(String value) {
		setConstString(offset + 70, $ins_func_id_c, value);
	}


	/**
	 * Entry function name (Common) 登録機能名（共通）.<p>
	 *
	 */
	public String ins_func_nm_c() {
		return getConstString(offset + 71, $ins_func_nm_c);
	}

	/**
	 * Entry function name (Common) 登録機能名（共通）.<p>
	 *
	 */
	public void ins_func_nm_c(String value) {
		setConstString(offset + 71, $ins_func_nm_c, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr_c() {
		return getConstNumber(offset + 72, $upd_cntr_c);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(MCNumber value) {
		setConstNumber(offset + 72, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(int value) {
		setConstNumber(offset + 72, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(long value) {
		setConstNumber(offset + 72, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(float value) {
		setConstNumber(offset + 72, $upd_cntr_c, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr_c(double value) {
		setConstNumber(offset + 72, $upd_cntr_c, value);
	}


	/**
	 * Update user ID (Common) 更新ユーザＩＤ（共通）.<p>
	 *
	 */
	public String upd_usr_id_c() {
		return getConstString(offset + 73, $upd_usr_id_c);
	}

	/**
	 * Update user ID (Common) 更新ユーザＩＤ（共通）.<p>
	 *
	 */
	public void upd_usr_id_c(String value) {
		setConstString(offset + 73, $upd_usr_id_c, value);
	}


	/**
	 * Update user name (Common) 更新ユーザ名（共通）.<p>
	 *
	 */
	public String upd_usr_nm_c() {
		return getConstString(offset + 74, $upd_usr_nm_c);
	}

	/**
	 * Update user name (Common) 更新ユーザ名（共通）.<p>
	 *
	 */
	public void upd_usr_nm_c(String value) {
		setConstString(offset + 74, $upd_usr_nm_c, value);
	}


	/**
	 * Update date and time (Common) 更新日時（共通）.<p>
	 *
	 */
	public MCTimestamp upd_ts_c() {
		return getConstTimestamp(offset + 75, $upd_ts_c);
	}

	/**
	 * Update date and time (Common) 更新日時（共通）.<p>
	 *
	 */
	public void upd_ts_c(MCTimestamp value) {
		setConstTimestamp(offset + 75, $upd_ts_c, value);
	}


	/**
	 * Update function ID (Common) 更新機能ＩＤ（共通）.<p>
	 *
	 */
	public String upd_func_id_c() {
		return getConstString(offset + 76, $upd_func_id_c);
	}

	/**
	 * Update function ID (Common) 更新機能ＩＤ（共通）.<p>
	 *
	 */
	public void upd_func_id_c(String value) {
		setConstString(offset + 76, $upd_func_id_c, value);
	}


	/**
	 * Update function name (Common) 更新機能名（共通）.<p>
	 *
	 */
	public String upd_func_nm_c() {
		return getConstString(offset + 77, $upd_func_nm_c);
	}

	/**
	 * Update function name (Common) 更新機能名（共通）.<p>
	 *
	 */
	public void upd_func_nm_c(String value) {
		setConstString(offset + 77, $upd_func_nm_c, value);
	}


	/**
	 * Update request No. (Common) 更新リクエストＮＯ（共通）.<p>
	 *
	 */
	public String upd_srv_req_no_c() {
		return getConstString(offset + 78, $upd_srv_req_no_c);
	}

	/**
	 * Update request No. (Common) 更新リクエストＮＯ（共通）.<p>
	 *
	 */
	public void upd_srv_req_no_c(String value) {
		setConstString(offset + 78, $upd_srv_req_no_c, value);
	}


	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 79, $co_cd);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 79, $co_cd, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 80, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 80, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 81, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 81, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 82, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 82, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 83, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 83, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 84, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 84, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 85, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 85, $itm_jnl_nm, value);
	}


	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return getConstString(offset + 86, $ac_itm_grp_cd);
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		setConstString(offset + 86, $ac_itm_grp_cd, value);
	}


	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public String ac_itm_grp_nm() {
		return getConstString(offset + 87, $ac_itm_grp_nm);
	}

	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public void ac_itm_grp_nm(String value) {
		setConstString(offset + 87, $ac_itm_grp_nm, value);
	}


	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public boolean minus_stk_flg() {
		return getConstBoolean(offset + 88, $minus_stk_flg);
	}

	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public void minus_stk_flg(boolean value) {
		setConstBoolean(offset + 88, $minus_stk_flg, value);
	}


	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public boolean not_new_lot_flg() {
		return getConstBoolean(offset + 89, $not_new_lot_flg);
	}

	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public void not_new_lot_flg(boolean value) {
		setConstBoolean(offset + 89, $not_new_lot_flg, value);
	}


	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public boolean gi_alloc_flg() {
		return getConstBoolean(offset + 90, $gi_alloc_flg);
	}

	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public void gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 90, $gi_alloc_flg, value);
	}


	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 91, $sls_tax_cd);
	}

	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 91, $sls_tax_cd, value);
	}


	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public String sls_tax_nm() {
		return getConstString(offset + 92, $sls_tax_nm);
	}

	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public void sls_tax_nm(String value) {
		setConstString(offset + 92, $sls_tax_nm, value);
	}


	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 93, $purc_tax_cd);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 93, $purc_tax_cd, value);
	}


	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public String purc_tax_nm() {
		return getConstString(offset + 94, $purc_tax_nm);
	}

	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		setConstString(offset + 94, $purc_tax_nm, value);
	}


	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 95, $prov_tax_cd);
	}

	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 95, $prov_tax_cd, value);
	}


	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public String prov_tax_nm() {
		return getConstString(offset + 96, $prov_tax_nm);
	}

	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public void prov_tax_nm(String value) {
		setConstString(offset + 96, $prov_tax_nm, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 97, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 97, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 97, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 97, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 97, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 97, $wtax_rate, value);
	}


	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public String ship_unit_cd() {
		return getConstString(offset + 98, $ship_unit_cd);
	}

	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public void ship_unit_cd(String value) {
		setConstString(offset + 98, $ship_unit_cd, value);
	}


	/**
	 * Shipping unit name 出荷単位名.<p>
	 *
	 */
	public String ship_unit_nm() {
		return getConstString(offset + 99, $ship_unit_nm);
	}

	/**
	 * Shipping unit name 出荷単位名.<p>
	 *
	 */
	public void ship_unit_nm(String value) {
		setConstString(offset + 99, $ship_unit_nm, value);
	}


	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public String mfg_unit_cd() {
		return getConstString(offset + 100, $mfg_unit_cd);
	}

	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public void mfg_unit_cd(String value) {
		setConstString(offset + 100, $mfg_unit_cd, value);
	}


	/**
	 * Mfg. unit name 製造単位名.<p>
	 *
	 */
	public String mfg_unit_nm() {
		return getConstString(offset + 101, $mfg_unit_nm);
	}

	/**
	 * Mfg. unit name 製造単位名.<p>
	 *
	 */
	public void mfg_unit_nm(String value) {
		setConstString(offset + 101, $mfg_unit_nm, value);
	}


	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public String purc_unit_cd() {
		return getConstString(offset + 102, $purc_unit_cd);
	}

	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public void purc_unit_cd(String value) {
		setConstString(offset + 102, $purc_unit_cd, value);
	}


	/**
	 * PO unit name 発注単位名.<p>
	 *
	 */
	public String purc_unit_nm() {
		return getConstString(offset + 103, $purc_unit_nm);
	}

	/**
	 * PO unit name 発注単位名.<p>
	 *
	 */
	public void purc_unit_nm(String value) {
		setConstString(offset + 103, $purc_unit_nm, value);
	}


	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 104, $pckg_unit_cd);
	}

	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 104, $pckg_unit_cd, value);
	}


	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public String pckg_unit_nm() {
		return getConstString(offset + 105, $pckg_unit_nm);
	}

	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public void pckg_unit_nm(String value) {
		setConstString(offset + 105, $pckg_unit_nm, value);
	}


	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public boolean pack_alloc_flg() {
		return getConstBoolean(offset + 106, $pack_alloc_flg);
	}

	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public void pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 106, $pack_alloc_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 107, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 107, $lot_mng_typ, value);
	}


	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public String lot_mng_typ_nm() {
		return getConstString(offset + 108, $lot_mng_typ_nm);
	}

	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public void lot_mng_typ_nm(String value) {
		setConstString(offset + 108, $lot_mng_typ_nm, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 109, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 109, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public String lot_no_typ_nm() {
		return getConstString(offset + 110, $lot_no_typ_nm);
	}

	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public void lot_no_typ_nm(String value) {
		setConstString(offset + 110, $lot_no_typ_nm, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 111, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 111, $lot_no_ptn_cd, value);
	}


	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public String lot_no_ptn_nm() {
		return getConstString(offset + 112, $lot_no_ptn_nm);
	}

	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public void lot_no_ptn_nm(String value) {
		setConstString(offset + 112, $lot_no_ptn_nm, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 113, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 113, $sublot_mng_typ, value);
	}


	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public String sublot_mng_typ_nm() {
		return getConstString(offset + 114, $sublot_mng_typ_nm);
	}

	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public void sublot_mng_typ_nm(String value) {
		setConstString(offset + 114, $sublot_mng_typ_nm, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 115, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 115, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public String sublot_no_typ_nm() {
		return getConstString(offset + 116, $sublot_no_typ_nm);
	}

	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public void sublot_no_typ_nm(String value) {
		setConstString(offset + 116, $sublot_no_typ_nm, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 117, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 117, $sublot_no_ptn_cd, value);
	}


	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public String sublot_no_ptn_nm() {
		return getConstString(offset + 118, $sublot_no_ptn_nm);
	}

	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public void sublot_no_ptn_nm(String value) {
		setConstString(offset + 118, $sublot_no_ptn_nm, value);
	}


	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 119, $bp_lot_flg);
	}

	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 119, $bp_lot_flg, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 120, $insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 120, $insp_bind_typ, value);
	}


	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public String insp_bind_typ_nm() {
		return getConstString(offset + 121, $insp_bind_typ_nm);
	}

	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public void insp_bind_typ_nm(String value) {
		setConstString(offset + 121, $insp_bind_typ_nm, value);
	}


	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 122, $skip_chk_ship_flg);
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 122, $skip_chk_ship_flg, value);
	}


	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 123, $mrkt_judg_flg);
	}

	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 123, $mrkt_judg_flg, value);
	}


	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 124, $mrkt_judg_role_cd);
	}

	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 124, $mrkt_judg_role_cd, value);
	}


	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public String mrkt_judg_role_nm() {
		return getConstString(offset + 125, $mrkt_judg_role_nm);
	}

	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public void mrkt_judg_role_nm(String value) {
		setConstString(offset + 125, $mrkt_judg_role_nm, value);
	}


	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_upd_role_cd() {
		return getConstString(offset + 126, $mrkt_judg_upd_role_cd);
	}

	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_upd_role_cd(String value) {
		setConstString(offset + 126, $mrkt_judg_upd_role_cd, value);
	}


	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public String mrkt_judg_upd_role_nm() {
		return getConstString(offset + 127, $mrkt_judg_upd_role_nm);
	}

	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public void mrkt_judg_upd_role_nm(String value) {
		setConstString(offset + 127, $mrkt_judg_upd_role_nm, value);
	}


	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 128, $lmt_ctl_flg);
	}

	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 128, $lmt_ctl_flg, value);
	}


	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public String lmt_ctl_categ() {
		return getConstString(offset + 129, $lmt_ctl_categ);
	}

	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public void lmt_ctl_categ(String value) {
		setConstString(offset + 129, $lmt_ctl_categ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 130, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 130, $cont_fctr_flg, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 131, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 131, $std_cont_fctr, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 132, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 132, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 133, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 133, $cont_fctr_unit_nm, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 134, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 134, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Rounding type name (Active ingredient conversion) 有効成分換算端数処理区分名.<p>
	 *
	 */
	public String cont_fctr_rnd_typ_nm() {
		return getConstString(offset + 135, $cont_fctr_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Active ingredient conversion) 有効成分換算端数処理区分名.<p>
	 *
	 */
	public void cont_fctr_rnd_typ_nm(String value) {
		setConstString(offset + 135, $cont_fctr_rnd_typ_nm, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 136, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 136, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 136, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 136, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 136, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 136, $cont_fctr_dec_place, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 137, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 137, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public String sno1_mng_typ_nm() {
		return getConstString(offset + 138, $sno1_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public void sno1_mng_typ_nm(String value) {
		setConstString(offset + 138, $sno1_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 139, $slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 139, $slo_sno1_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public boolean rqmt_sno1_flg() {
		return getConstBoolean(offset + 140, $rqmt_sno1_flg);
	}

	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public void rqmt_sno1_flg(boolean value) {
		setConstBoolean(offset + 140, $rqmt_sno1_flg, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 141, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 141, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public String sno1_num_typ_nm() {
		return getConstString(offset + 142, $sno1_num_typ_nm);
	}

	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public void sno1_num_typ_nm(String value) {
		setConstString(offset + 142, $sno1_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public String sno1_ptn_cd() {
		return getConstString(offset + 143, $sno1_ptn_cd);
	}

	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public void sno1_ptn_cd(String value) {
		setConstString(offset + 143, $sno1_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public String sno1_ptn_nm() {
		return getConstString(offset + 144, $sno1_ptn_nm);
	}

	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public void sno1_ptn_nm(String value) {
		setConstString(offset + 144, $sno1_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 145, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 145, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public String sno2_mng_typ_nm() {
		return getConstString(offset + 146, $sno2_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public void sno2_mng_typ_nm(String value) {
		setConstString(offset + 146, $sno2_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 147, $slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 147, $slo_sno2_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public boolean rqmt_sno2_flg() {
		return getConstBoolean(offset + 148, $rqmt_sno2_flg);
	}

	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public void rqmt_sno2_flg(boolean value) {
		setConstBoolean(offset + 148, $rqmt_sno2_flg, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 149, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 149, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public String sno2_num_typ_nm() {
		return getConstString(offset + 150, $sno2_num_typ_nm);
	}

	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public void sno2_num_typ_nm(String value) {
		setConstString(offset + 150, $sno2_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public String sno2_ptn_cd() {
		return getConstString(offset + 151, $sno2_ptn_cd);
	}

	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public void sno2_ptn_cd(String value) {
		setConstString(offset + 151, $sno2_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public String sno2_ptn_nm() {
		return getConstString(offset + 152, $sno2_ptn_nm);
	}

	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public void sno2_ptn_nm(String value) {
		setConstString(offset + 152, $sno2_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 153, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 153, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public String sno3_mng_typ_nm() {
		return getConstString(offset + 154, $sno3_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public void sno3_mng_typ_nm(String value) {
		setConstString(offset + 154, $sno3_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 155, $slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 155, $slo_sno3_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public boolean rqmt_sno3_flg() {
		return getConstBoolean(offset + 156, $rqmt_sno3_flg);
	}

	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public void rqmt_sno3_flg(boolean value) {
		setConstBoolean(offset + 156, $rqmt_sno3_flg, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 157, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 157, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public String sno3_num_typ_nm() {
		return getConstString(offset + 158, $sno3_num_typ_nm);
	}

	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public void sno3_num_typ_nm(String value) {
		setConstString(offset + 158, $sno3_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public String sno3_ptn_cd() {
		return getConstString(offset + 159, $sno3_ptn_cd);
	}

	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public void sno3_ptn_cd(String value) {
		setConstString(offset + 159, $sno3_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public String sno3_ptn_nm() {
		return getConstString(offset + 160, $sno3_ptn_nm);
	}

	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public void sno3_ptn_nm(String value) {
		setConstString(offset + 160, $sno3_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 161, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 161, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public String sno4_mng_typ_nm() {
		return getConstString(offset + 162, $sno4_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public void sno4_mng_typ_nm(String value) {
		setConstString(offset + 162, $sno4_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 163, $slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 163, $slo_sno4_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public boolean rqmt_sno4_flg() {
		return getConstBoolean(offset + 164, $rqmt_sno4_flg);
	}

	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public void rqmt_sno4_flg(boolean value) {
		setConstBoolean(offset + 164, $rqmt_sno4_flg, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 165, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 165, $sno4_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public String sno4_num_typ_nm() {
		return getConstString(offset + 166, $sno4_num_typ_nm);
	}

	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public void sno4_num_typ_nm(String value) {
		setConstString(offset + 166, $sno4_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public String sno4_ptn_cd() {
		return getConstString(offset + 167, $sno4_ptn_cd);
	}

	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public void sno4_ptn_cd(String value) {
		setConstString(offset + 167, $sno4_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public String sno4_ptn_nm() {
		return getConstString(offset + 168, $sno4_ptn_nm);
	}

	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public void sno4_ptn_nm(String value) {
		setConstString(offset + 168, $sno4_ptn_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String def_bom_ptn() {
		return getConstString(offset + 169, $def_bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void def_bom_ptn(String value) {
		setConstString(offset + 169, $def_bom_ptn, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 170, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 170, $mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm() {
		return getConstString(offset + 171, $mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 171, $mfg_inst_unit_typ_nm, value);
	}


	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public String mrp_proc_typ() {
		return getConstString(offset + 172, $mrp_proc_typ);
	}

	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public void mrp_proc_typ(String value) {
		setConstString(offset + 172, $mrp_proc_typ, value);
	}


	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public String mrp_proc_typ_nm() {
		return getConstString(offset + 173, $mrp_proc_typ_nm);
	}

	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public void mrp_proc_typ_nm(String value) {
		setConstString(offset + 173, $mrp_proc_typ_nm, value);
	}


	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 174, $rqmt_typ);
	}

	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 174, $rqmt_typ, value);
	}


	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public String rqmt_typ_nm() {
		return getConstString(offset + 175, $rqmt_typ_nm);
	}

	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public void rqmt_typ_nm(String value) {
		setConstString(offset + 175, $rqmt_typ_nm, value);
	}


	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 176, $prod_pln_typ);
	}

	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 176, $prod_pln_typ, value);
	}


	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public String prod_pln_typ_nm() {
		return getConstString(offset + 177, $prod_pln_typ_nm);
	}

	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public void prod_pln_typ_nm(String value) {
		setConstString(offset + 177, $prod_pln_typ_nm, value);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 178, $dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 178, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 178, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 178, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 178, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 178, $dmnd_date_div_mons, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 179, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 179, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 179, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 179, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 179, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 179, $alloc_margin_days, value);
	}


	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days() {
		return getConstNumber(offset + 180, $mrp_alloc_margin_days);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 180, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 180, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 180, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 180, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 180, $mrp_alloc_margin_days, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days() {
		return getConstNumber(offset + 181, $mrp_opn_xfr_days);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 181, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 181, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 181, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 181, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 181, $mrp_opn_xfr_days, value);
	}


	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public MCNumber rqmt_rstr_qty() {
		return getConstNumber(offset + 182, $rqmt_rstr_qty);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(MCNumber value) {
		setConstNumber(offset + 182, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(int value) {
		setConstNumber(offset + 182, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(long value) {
		setConstNumber(offset + 182, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(float value) {
		setConstNumber(offset + 182, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(double value) {
		setConstNumber(offset + 182, $rqmt_rstr_qty, value);
	}


	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public boolean inpt_itm_add_flg() {
		return getConstBoolean(offset + 183, $inpt_itm_add_flg);
	}

	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public void inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 183, $inpt_itm_add_flg, value);
	}


	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public boolean inpt_itm_del_flg() {
		return getConstBoolean(offset + 184, $inpt_itm_del_flg);
	}

	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public void inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 184, $inpt_itm_del_flg, value);
	}


	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public boolean sch_flg() {
		return getConstBoolean(offset + 185, $sch_flg);
	}

	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public void sch_flg(boolean value) {
		setConstBoolean(offset + 185, $sch_flg, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 186, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 186, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 187, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 187, $cntry_org_nm, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 188, $comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 188, $comp_spec_typ, value);
	}


	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public String comp_spec_typ_nm() {
		return getConstString(offset + 189, $comp_spec_typ_nm);
	}

	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public void comp_spec_typ_nm(String value) {
		setConstString(offset + 189, $comp_spec_typ_nm, value);
	}


	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public boolean comp_rev_at_slo_flg() {
		return getConstBoolean(offset + 190, $comp_rev_at_slo_flg);
	}

	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public void comp_rev_at_slo_flg(boolean value) {
		setConstBoolean(offset + 190, $comp_rev_at_slo_flg, value);
	}


	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public boolean comp_core_itm_flg() {
		return getConstBoolean(offset + 191, $comp_core_itm_flg);
	}

	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public void comp_core_itm_flg(boolean value) {
		setConstBoolean(offset + 191, $comp_core_itm_flg, value);
	}


	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public String itm_spec_grp_cd() {
		return getConstString(offset + 192, $itm_spec_grp_cd);
	}

	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public void itm_spec_grp_cd(String value) {
		setConstString(offset + 192, $itm_spec_grp_cd, value);
	}


	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public String itm_spec_grp_nm() {
		return getConstString(offset + 193, $itm_spec_grp_nm);
	}

	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public void itm_spec_grp_nm(String value) {
		setConstString(offset + 193, $itm_spec_grp_nm, value);
	}


	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 194, $sls_upri_grp_cd);
	}

	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 194, $sls_upri_grp_cd, value);
	}


	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public String sls_upri_grp_nm() {
		return getConstString(offset + 195, $sls_upri_grp_nm);
	}

	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public void sls_upri_grp_nm(String value) {
		setConstString(offset + 195, $sls_upri_grp_nm, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 196, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 196, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 196, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 196, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 196, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 196, $bill_crryovr_times, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 197, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 197, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 197, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 197, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 197, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 197, $pay_crryovr_times, value);
	}


	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public boolean slo_proc_flg() {
		return getConstBoolean(offset + 198, $slo_proc_flg);
	}

	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public void slo_proc_flg(boolean value) {
		setConstBoolean(offset + 198, $slo_proc_flg, value);
	}


	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public String slo_proc_typ() {
		return getConstString(offset + 199, $slo_proc_typ);
	}

	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public void slo_proc_typ(String value) {
		setConstString(offset + 199, $slo_proc_typ, value);
	}


	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public String slo_proc_typ_nm() {
		return getConstString(offset + 200, $slo_proc_typ_nm);
	}

	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public void slo_proc_typ_nm(String value) {
		setConstString(offset + 200, $slo_proc_typ_nm, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 201, $ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 201, $ship_inst_typ, value);
	}


	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public String ship_inst_typ_nm() {
		return getConstString(offset + 202, $ship_inst_typ_nm);
	}

	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public void ship_inst_typ_nm(String value) {
		setConstString(offset + 202, $ship_inst_typ_nm, value);
	}


	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public boolean ship_lot_back_stop_flg() {
		return getConstBoolean(offset + 203, $ship_lot_back_stop_flg);
	}

	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public void ship_lot_back_stop_flg(boolean value) {
		setConstBoolean(offset + 203, $ship_lot_back_stop_flg, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 204, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 204, $itm_ship_grp_cd, value);
	}


	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public String itm_ship_grp_nm() {
		return getConstString(offset + 205, $itm_ship_grp_nm);
	}

	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public void itm_ship_grp_nm(String value) {
		setConstString(offset + 205, $itm_ship_grp_nm, value);
	}


	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public String ship_valid_grp_cd() {
		return getConstString(offset + 206, $ship_valid_grp_cd);
	}

	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public void ship_valid_grp_cd(String value) {
		setConstString(offset + 206, $ship_valid_grp_cd, value);
	}


	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public String ship_valid_grp_nm() {
		return getConstString(offset + 207, $ship_valid_grp_nm);
	}

	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public void ship_valid_grp_nm(String value) {
		setConstString(offset + 207, $ship_valid_grp_nm, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 208, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 208, $arr_skip_flg, value);
	}


	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public boolean purc_dlv_slip_flg() {
		return getConstBoolean(offset + 209, $purc_dlv_slip_flg);
	}

	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public void purc_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 209, $purc_dlv_slip_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 210, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 210, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 211, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 211, $ship_term_nm, value);
	}


	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public String exim_xpns_typ() {
		return getConstString(offset + 212, $exim_xpns_typ);
	}

	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public void exim_xpns_typ(String value) {
		setConstString(offset + 212, $exim_xpns_typ, value);
	}


	/**
	 * Import/export charges type name 輸出入諸掛区分名.<p>
	 *
	 */
	public String exim_xpns_typ_nm() {
		return getConstString(offset + 213, $exim_xpns_typ_nm);
	}

	/**
	 * Import/export charges type name 輸出入諸掛区分名.<p>
	 *
	 */
	public void exim_xpns_typ_nm(String value) {
		setConstString(offset + 213, $exim_xpns_typ_nm, value);
	}


	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public boolean stk_lst_flg() {
		return getConstBoolean(offset + 214, $stk_lst_flg);
	}

	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public void stk_lst_flg(boolean value) {
		setConstBoolean(offset + 214, $stk_lst_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 215, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 215, $ver_flg, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 216, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 216, $sls_upri_cng_flg, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 217, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 217, $purc_upri_cng_flg, value);
	}


	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 218, $prov_upri_cng_flg);
	}

	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 218, $prov_upri_cng_flg, value);
	}


	/**
	 * Reference item cd. 参照品目ＣＤ.<p>
	 *
	 */
	public String ref_itm_cd() {
		return getConstString(offset + 219, $ref_itm_cd);
	}

	/**
	 * Reference item cd. 参照品目ＣＤ.<p>
	 *
	 */
	public void ref_itm_cd(String value) {
		setConstString(offset + 219, $ref_itm_cd, value);
	}


	/**
	 * Reference branch No. 1 参照枝番１.<p>
	 *
	 */
	public String ref_itm_sub1() {
		return getConstString(offset + 220, $ref_itm_sub1);
	}

	/**
	 * Reference branch No. 1 参照枝番１.<p>
	 *
	 */
	public void ref_itm_sub1(String value) {
		setConstString(offset + 220, $ref_itm_sub1, value);
	}


	/**
	 * Reference branch No. 2 参照枝番２.<p>
	 *
	 */
	public String ref_itm_sub2() {
		return getConstString(offset + 221, $ref_itm_sub2);
	}

	/**
	 * Reference branch No. 2 参照枝番２.<p>
	 *
	 */
	public void ref_itm_sub2(String value) {
		setConstString(offset + 221, $ref_itm_sub2, value);
	}


	/**
	 * Reference branch No. 3 参照枝番３.<p>
	 *
	 */
	public String ref_itm_sub3() {
		return getConstString(offset + 222, $ref_itm_sub3);
	}

	/**
	 * Reference branch No. 3 参照枝番３.<p>
	 *
	 */
	public void ref_itm_sub3(String value) {
		setConstString(offset + 222, $ref_itm_sub3, value);
	}


	/**
	 * Reference item name 参照品名.<p>
	 *
	 */
	public String ref_itm_nm() {
		return getConstString(offset + 223, $ref_itm_nm);
	}

	/**
	 * Reference item name 参照品名.<p>
	 *
	 */
	public void ref_itm_nm(String value) {
		setConstString(offset + 223, $ref_itm_nm, value);
	}


	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public String ext_sys_no_itm() {
		return getConstString(offset + 224, $ext_sys_no_itm);
	}

	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public void ext_sys_no_itm(String value) {
		setConstString(offset + 224, $ext_sys_no_itm, value);
	}


	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 225, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 225, $chng_no, value);
	}


	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public String calc_ptn_cd() {
		return getConstString(offset + 226, $calc_ptn_cd);
	}

	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public void calc_ptn_cd(String value) {
		setConstString(offset + 226, $calc_ptn_cd, value);
	}


	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public String calc_ptn_nm() {
		return getConstString(offset + 227, $calc_ptn_nm);
	}

	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public void calc_ptn_nm(String value) {
		setConstString(offset + 227, $calc_ptn_nm, value);
	}


	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public MCNumber cost_std_qty() {
		return getConstNumber(offset + 228, $cost_std_qty);
	}

	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public void cost_std_qty(MCNumber value) {
		setConstNumber(offset + 228, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public void cost_std_qty(int value) {
		setConstNumber(offset + 228, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public void cost_std_qty(long value) {
		setConstNumber(offset + 228, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public void cost_std_qty(float value) {
		setConstNumber(offset + 228, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数量.<p>
	 *
	 */
	public void cost_std_qty(double value) {
		setConstNumber(offset + 228, $cost_std_qty, value);
	}


	/**
	 * Item allocation group 品目配賦グループ.<p>
	 *
	 */
	public String itm_alc_grp() {
		return getConstString(offset + 229, $itm_alc_grp);
	}

	/**
	 * Item allocation group 品目配賦グループ.<p>
	 *
	 */
	public void itm_alc_grp(String value) {
		setConstString(offset + 229, $itm_alc_grp, value);
	}


	/**
	 * Sales 販売.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 230, $sls_flg);
	}

	/**
	 * Sales 販売.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 230, $sls_flg, value);
	}


	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public boolean sls_input_flg() {
		return getConstBoolean(offset + 231, $sls_input_flg);
	}

	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public void sls_input_flg(boolean value) {
		setConstBoolean(offset + 231, $sls_input_flg, value);
	}


	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 232, $mfg_flg);
	}

	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 232, $mfg_flg, value);
	}


	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public boolean mfg_input_flg() {
		return getConstBoolean(offset + 233, $mfg_input_flg);
	}

	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public void mfg_input_flg(boolean value) {
		setConstBoolean(offset + 233, $mfg_input_flg, value);
	}


	/**
	 * Purchase 購買.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 234, $purc_flg);
	}

	/**
	 * Purchase 購買.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 234, $purc_flg, value);
	}


	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public boolean purc_input_flg() {
		return getConstBoolean(offset + 235, $purc_input_flg);
	}

	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public void purc_input_flg(boolean value) {
		setConstBoolean(offset + 235, $purc_input_flg, value);
	}


	/**
	 * Inspection 検査.<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 236, $insp_flg);
	}

	/**
	 * Inspection 検査.<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 236, $insp_flg, value);
	}


	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public boolean insp_input_flg() {
		return getConstBoolean(offset + 237, $insp_input_flg);
	}

	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public void insp_input_flg(boolean value) {
		setConstBoolean(offset + 237, $insp_input_flg, value);
	}


	/**
	 * Release リリース.<p>
	 *
	 */
	public boolean release_flg() {
		return getConstBoolean(offset + 238, $release_flg);
	}

	/**
	 * Release リリース.<p>
	 *
	 */
	public void release_flg(boolean value) {
		setConstBoolean(offset + 238, $release_flg, value);
	}


	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public MCDate release_tm() {
		return getConstDate(offset + 239, $release_tm);
	}

	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public void release_tm(MCDate value) {
		setConstDate(offset + 239, $release_tm, value);
	}


	/**
	 * Release PIC リリース担当者.<p>
	 *
	 */
	public String release_usr_cd() {
		return getConstString(offset + 240, $release_usr_cd);
	}

	/**
	 * Release PIC リリース担当者.<p>
	 *
	 */
	public void release_usr_cd(String value) {
		setConstString(offset + 240, $release_usr_cd, value);
	}


	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public String release_usr_nm() {
		return getConstString(offset + 241, $release_usr_nm);
	}

	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public void release_usr_nm(String value) {
		setConstString(offset + 241, $release_usr_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 242, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 242, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 243, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 243, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 244, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 244, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 245, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 245, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 246, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 246, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 247, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 247, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 248, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 248, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 249, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 249, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 250, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 250, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 250, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 250, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 250, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 250, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 251, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 251, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 252, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 252, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 253, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 253, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 254, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 254, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 255, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 255, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 256, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 256, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 257, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 257, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 258, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 258, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 259, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 259, $del_ts, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			return base_itm_alt_nm1();
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			return base_itm_alt_nm2();
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			return base_itm_alt_nm3();
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			return base_itm_alt_nm4();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			return rnd_typ_nm();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			return conts_unit_nm();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
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
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			return hs_nm();
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			return jan_typ();
		}
		if ($jan_typ_nm.equalsIgnoreCase(name)) {
			return jan_typ_nm();
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			return jan_cd();
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			return itf_cd();
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			return gtin_cd();
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			return memo1_c();
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			return memo2_c();
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			return memo3_c();
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			return ins_usr_id_c();
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			return ins_usr_nm_c();
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			return ins_func_id_c();
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			return ins_func_nm_c();
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			return upd_usr_id_c();
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			return upd_usr_nm_c();
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			return upd_func_id_c();
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			return upd_func_nm_c();
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			return upd_srv_req_no_c();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			return ship_unit_cd();
		}
		if ($ship_unit_nm.equalsIgnoreCase(name)) {
			return ship_unit_nm();
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			return mfg_unit_cd();
		}
		if ($mfg_unit_nm.equalsIgnoreCase(name)) {
			return mfg_unit_nm();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($purc_unit_nm.equalsIgnoreCase(name)) {
			return purc_unit_nm();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return lot_mng_typ_nm();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_typ_nm.equalsIgnoreCase(name)) {
			return lot_no_typ_nm();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($lot_no_ptn_nm.equalsIgnoreCase(name)) {
			return lot_no_ptn_nm();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return sublot_mng_typ_nm();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_typ_nm.equalsIgnoreCase(name)) {
			return sublot_no_typ_nm();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			return sublot_no_ptn_nm();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return insp_bind_typ_nm();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_role_nm();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_nm();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($cont_fctr_rnd_typ_nm.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno1_mng_typ_nm();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno1_num_typ_nm.equalsIgnoreCase(name)) {
			return sno1_num_typ_nm();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno1_ptn_nm.equalsIgnoreCase(name)) {
			return sno1_ptn_nm();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno2_mng_typ_nm();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno2_num_typ_nm.equalsIgnoreCase(name)) {
			return sno2_num_typ_nm();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno2_ptn_nm.equalsIgnoreCase(name)) {
			return sno2_ptn_nm();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno3_mng_typ_nm();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno3_num_typ_nm.equalsIgnoreCase(name)) {
			return sno3_num_typ_nm();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno3_ptn_nm.equalsIgnoreCase(name)) {
			return sno3_ptn_nm();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno4_mng_typ_nm();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno4_num_typ_nm.equalsIgnoreCase(name)) {
			return sno4_num_typ_nm();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($sno4_ptn_nm.equalsIgnoreCase(name)) {
			return sno4_ptn_nm();
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			return def_bom_ptn();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_nm();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			return prod_pln_typ_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return itm_spec_grp_nm();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			return slo_proc_typ();
		}
		if ($slo_proc_typ_nm.equalsIgnoreCase(name)) {
			return slo_proc_typ_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return itm_ship_grp_nm();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return ship_valid_grp_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($exim_xpns_typ_nm.equalsIgnoreCase(name)) {
			return exim_xpns_typ_nm();
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			return ref_itm_cd();
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			return ref_itm_sub1();
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			return ref_itm_sub2();
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			return ref_itm_sub3();
		}
		if ($ref_itm_nm.equalsIgnoreCase(name)) {
			return ref_itm_nm();
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			return ext_sys_no_itm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			return calc_ptn_nm();
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			return itm_alc_grp();
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			return release_usr_cd();
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			return release_usr_nm();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			return upd_cntr_c();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($release_tm.equalsIgnoreCase(name)) {
			return release_tm();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			return ins_ts_c();
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			return upd_ts_c();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			return not_new_lot_flg();
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return comp_rev_at_slo_flg();
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			return comp_core_itm_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return ship_lot_back_stop_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			return purc_dlv_slip_flg();
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			return stk_lst_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			return release_flg();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			return base_itm_alt_nm1();
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			return base_itm_alt_nm2();
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			return base_itm_alt_nm3();
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			return base_itm_alt_nm4();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			return rnd_typ_nm();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			return conts_unit_nm();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
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
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			return hs_nm();
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			return jan_typ();
		}
		if ($jan_typ_nm.equalsIgnoreCase(name)) {
			return jan_typ_nm();
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			return jan_cd();
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			return itf_cd();
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			return gtin_cd();
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			return memo1_c();
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			return memo2_c();
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			return memo3_c();
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			return ins_usr_id_c();
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			return ins_usr_nm_c();
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			return ins_func_id_c();
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			return ins_func_nm_c();
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			return upd_usr_id_c();
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			return upd_usr_nm_c();
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			return upd_func_id_c();
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			return upd_func_nm_c();
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			return upd_srv_req_no_c();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			return ship_unit_cd();
		}
		if ($ship_unit_nm.equalsIgnoreCase(name)) {
			return ship_unit_nm();
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			return mfg_unit_cd();
		}
		if ($mfg_unit_nm.equalsIgnoreCase(name)) {
			return mfg_unit_nm();
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			return purc_unit_cd();
		}
		if ($purc_unit_nm.equalsIgnoreCase(name)) {
			return purc_unit_nm();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return lot_mng_typ_nm();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_typ_nm.equalsIgnoreCase(name)) {
			return lot_no_typ_nm();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($lot_no_ptn_nm.equalsIgnoreCase(name)) {
			return lot_no_ptn_nm();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return sublot_mng_typ_nm();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_typ_nm.equalsIgnoreCase(name)) {
			return sublot_no_typ_nm();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			return sublot_no_ptn_nm();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return insp_bind_typ_nm();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_role_nm();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_nm();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($cont_fctr_rnd_typ_nm.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno1_mng_typ_nm();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno1_num_typ_nm.equalsIgnoreCase(name)) {
			return sno1_num_typ_nm();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno1_ptn_nm.equalsIgnoreCase(name)) {
			return sno1_ptn_nm();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno2_mng_typ_nm();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno2_num_typ_nm.equalsIgnoreCase(name)) {
			return sno2_num_typ_nm();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno2_ptn_nm.equalsIgnoreCase(name)) {
			return sno2_ptn_nm();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno3_mng_typ_nm();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno3_num_typ_nm.equalsIgnoreCase(name)) {
			return sno3_num_typ_nm();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno3_ptn_nm.equalsIgnoreCase(name)) {
			return sno3_ptn_nm();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			return sno4_mng_typ_nm();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno4_num_typ_nm.equalsIgnoreCase(name)) {
			return sno4_num_typ_nm();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($sno4_ptn_nm.equalsIgnoreCase(name)) {
			return sno4_ptn_nm();
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			return def_bom_ptn();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_nm();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			return prod_pln_typ_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return itm_spec_grp_nm();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			return slo_proc_typ();
		}
		if ($slo_proc_typ_nm.equalsIgnoreCase(name)) {
			return slo_proc_typ_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return itm_ship_grp_nm();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return ship_valid_grp_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($exim_xpns_typ_nm.equalsIgnoreCase(name)) {
			return exim_xpns_typ_nm();
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			return ref_itm_cd();
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			return ref_itm_sub1();
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			return ref_itm_sub2();
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			return ref_itm_sub3();
		}
		if ($ref_itm_nm.equalsIgnoreCase(name)) {
			return ref_itm_nm();
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			return ext_sys_no_itm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			return calc_ptn_nm();
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			return itm_alc_grp();
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			return release_usr_cd();
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			return release_usr_nm();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			return upd_cntr_c();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($release_tm.equalsIgnoreCase(name)) {
			return release_tm();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			return ins_ts_c();
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			return upd_ts_c();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			return minus_stk_flg();
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			return not_new_lot_flg();
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			return pack_alloc_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return rqmt_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return rqmt_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return rqmt_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return rqmt_sno4_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return comp_rev_at_slo_flg();
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			return comp_core_itm_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return ship_lot_back_stop_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			return purc_dlv_slip_flg();
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			return stk_lst_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			return release_flg();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
			return;
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			base_itm_alt_nm1(value);
			return;
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			base_itm_alt_nm2(value);
			return;
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			base_itm_alt_nm3(value);
			return;
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			base_itm_alt_nm4(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			rnd_typ_nm(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			conts_unit_nm(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
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
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			hs_nm(value);
			return;
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			jan_typ(value);
			return;
		}
		if ($jan_typ_nm.equalsIgnoreCase(name)) {
			jan_typ_nm(value);
			return;
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			jan_cd(value);
			return;
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			itf_cd(value);
			return;
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			gtin_cd(value);
			return;
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			memo1_c(value);
			return;
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			memo2_c(value);
			return;
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			memo3_c(value);
			return;
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			ins_usr_id_c(value);
			return;
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			ins_usr_nm_c(value);
			return;
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			ins_func_id_c(value);
			return;
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			ins_func_nm_c(value);
			return;
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			upd_usr_id_c(value);
			return;
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			upd_usr_nm_c(value);
			return;
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			upd_func_id_c(value);
			return;
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			upd_func_nm_c(value);
			return;
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			upd_srv_req_no_c(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			ship_unit_cd(value);
			return;
		}
		if ($ship_unit_nm.equalsIgnoreCase(name)) {
			ship_unit_nm(value);
			return;
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			mfg_unit_cd(value);
			return;
		}
		if ($mfg_unit_nm.equalsIgnoreCase(name)) {
			mfg_unit_nm(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($purc_unit_nm.equalsIgnoreCase(name)) {
			purc_unit_nm(value);
			return;
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			lot_mng_typ_nm(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_typ_nm.equalsIgnoreCase(name)) {
			lot_no_typ_nm(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($lot_no_ptn_nm.equalsIgnoreCase(name)) {
			lot_no_ptn_nm(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			sublot_mng_typ_nm(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_typ_nm.equalsIgnoreCase(name)) {
			sublot_no_typ_nm(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			sublot_no_ptn_nm(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			insp_bind_typ_nm(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			mrkt_judg_role_nm(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_nm(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ_nm.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			sno1_mng_typ_nm(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno1_num_typ_nm.equalsIgnoreCase(name)) {
			sno1_num_typ_nm(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno1_ptn_nm.equalsIgnoreCase(name)) {
			sno1_ptn_nm(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			sno2_mng_typ_nm(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno2_num_typ_nm.equalsIgnoreCase(name)) {
			sno2_num_typ_nm(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_nm.equalsIgnoreCase(name)) {
			sno2_ptn_nm(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			sno3_mng_typ_nm(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno3_num_typ_nm.equalsIgnoreCase(name)) {
			sno3_num_typ_nm(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_nm.equalsIgnoreCase(name)) {
			sno3_ptn_nm(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			sno4_mng_typ_nm(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno4_num_typ_nm.equalsIgnoreCase(name)) {
			sno4_num_typ_nm(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_nm.equalsIgnoreCase(name)) {
			sno4_ptn_nm(value);
			return;
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			def_bom_ptn(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			mrp_proc_typ_nm(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			rqmt_typ_nm(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			prod_pln_typ_nm(value);
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
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			itm_spec_grp_nm(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			slo_proc_typ(value);
			return;
		}
		if ($slo_proc_typ_nm.equalsIgnoreCase(name)) {
			slo_proc_typ_nm(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			itm_ship_grp_nm(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			ship_valid_grp_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($exim_xpns_typ_nm.equalsIgnoreCase(name)) {
			exim_xpns_typ_nm(value);
			return;
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			ref_itm_cd(value);
			return;
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			ref_itm_sub1(value);
			return;
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			ref_itm_sub2(value);
			return;
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			ref_itm_sub3(value);
			return;
		}
		if ($ref_itm_nm.equalsIgnoreCase(name)) {
			ref_itm_nm(value);
			return;
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			ext_sys_no_itm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			calc_ptn_nm(value);
			return;
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			itm_alc_grp(value);
			return;
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			release_usr_cd(value);
			return;
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			release_usr_nm(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($release_tm.equalsIgnoreCase(name)) {
			release_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			ins_ts_c(value);
			return;
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			upd_ts_c(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			not_new_lot_flg(value);
			return;
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			comp_rev_at_slo_flg(value);
			return;
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			comp_core_itm_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			ship_lot_back_stop_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			purc_dlv_slip_flg(value);
			return;
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			stk_lst_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			release_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
			return;
		}
		if ($base_itm_alt_nm1.equalsIgnoreCase(name)) {
			base_itm_alt_nm1(value);
			return;
		}
		if ($base_itm_alt_nm2.equalsIgnoreCase(name)) {
			base_itm_alt_nm2(value);
			return;
		}
		if ($base_itm_alt_nm3.equalsIgnoreCase(name)) {
			base_itm_alt_nm3(value);
			return;
		}
		if ($base_itm_alt_nm4.equalsIgnoreCase(name)) {
			base_itm_alt_nm4(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			rnd_typ_nm(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			conts_unit_nm(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
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
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			hs_nm(value);
			return;
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			jan_typ(value);
			return;
		}
		if ($jan_typ_nm.equalsIgnoreCase(name)) {
			jan_typ_nm(value);
			return;
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			jan_cd(value);
			return;
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			itf_cd(value);
			return;
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			gtin_cd(value);
			return;
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			memo1_c(value);
			return;
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			memo2_c(value);
			return;
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			memo3_c(value);
			return;
		}
		if ($ins_usr_id_c.equalsIgnoreCase(name)) {
			ins_usr_id_c(value);
			return;
		}
		if ($ins_usr_nm_c.equalsIgnoreCase(name)) {
			ins_usr_nm_c(value);
			return;
		}
		if ($ins_func_id_c.equalsIgnoreCase(name)) {
			ins_func_id_c(value);
			return;
		}
		if ($ins_func_nm_c.equalsIgnoreCase(name)) {
			ins_func_nm_c(value);
			return;
		}
		if ($upd_usr_id_c.equalsIgnoreCase(name)) {
			upd_usr_id_c(value);
			return;
		}
		if ($upd_usr_nm_c.equalsIgnoreCase(name)) {
			upd_usr_nm_c(value);
			return;
		}
		if ($upd_func_id_c.equalsIgnoreCase(name)) {
			upd_func_id_c(value);
			return;
		}
		if ($upd_func_nm_c.equalsIgnoreCase(name)) {
			upd_func_nm_c(value);
			return;
		}
		if ($upd_srv_req_no_c.equalsIgnoreCase(name)) {
			upd_srv_req_no_c(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		if ($ship_unit_cd.equalsIgnoreCase(name)) {
			ship_unit_cd(value);
			return;
		}
		if ($ship_unit_nm.equalsIgnoreCase(name)) {
			ship_unit_nm(value);
			return;
		}
		if ($mfg_unit_cd.equalsIgnoreCase(name)) {
			mfg_unit_cd(value);
			return;
		}
		if ($mfg_unit_nm.equalsIgnoreCase(name)) {
			mfg_unit_nm(value);
			return;
		}
		if ($purc_unit_cd.equalsIgnoreCase(name)) {
			purc_unit_cd(value);
			return;
		}
		if ($purc_unit_nm.equalsIgnoreCase(name)) {
			purc_unit_nm(value);
			return;
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			lot_mng_typ_nm(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($lot_no_typ_nm.equalsIgnoreCase(name)) {
			lot_no_typ_nm(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($lot_no_ptn_nm.equalsIgnoreCase(name)) {
			lot_no_ptn_nm(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			sublot_mng_typ_nm(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($sublot_no_typ_nm.equalsIgnoreCase(name)) {
			sublot_no_typ_nm(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			sublot_no_ptn_nm(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			insp_bind_typ_nm(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			mrkt_judg_role_nm(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_nm(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ_nm.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			sno1_mng_typ_nm(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno1_num_typ_nm.equalsIgnoreCase(name)) {
			sno1_num_typ_nm(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno1_ptn_nm.equalsIgnoreCase(name)) {
			sno1_ptn_nm(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			sno2_mng_typ_nm(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno2_num_typ_nm.equalsIgnoreCase(name)) {
			sno2_num_typ_nm(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_nm.equalsIgnoreCase(name)) {
			sno2_ptn_nm(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			sno3_mng_typ_nm(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno3_num_typ_nm.equalsIgnoreCase(name)) {
			sno3_num_typ_nm(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_nm.equalsIgnoreCase(name)) {
			sno3_ptn_nm(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			sno4_mng_typ_nm(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno4_num_typ_nm.equalsIgnoreCase(name)) {
			sno4_num_typ_nm(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_nm.equalsIgnoreCase(name)) {
			sno4_ptn_nm(value);
			return;
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			def_bom_ptn(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			mrp_proc_typ_nm(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			rqmt_typ_nm(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			prod_pln_typ_nm(value);
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
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			itm_spec_grp_nm(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($slo_proc_typ.equalsIgnoreCase(name)) {
			slo_proc_typ(value);
			return;
		}
		if ($slo_proc_typ_nm.equalsIgnoreCase(name)) {
			slo_proc_typ_nm(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			itm_ship_grp_nm(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			ship_valid_grp_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($exim_xpns_typ_nm.equalsIgnoreCase(name)) {
			exim_xpns_typ_nm(value);
			return;
		}
		if ($ref_itm_cd.equalsIgnoreCase(name)) {
			ref_itm_cd(value);
			return;
		}
		if ($ref_itm_sub1.equalsIgnoreCase(name)) {
			ref_itm_sub1(value);
			return;
		}
		if ($ref_itm_sub2.equalsIgnoreCase(name)) {
			ref_itm_sub2(value);
			return;
		}
		if ($ref_itm_sub3.equalsIgnoreCase(name)) {
			ref_itm_sub3(value);
			return;
		}
		if ($ref_itm_nm.equalsIgnoreCase(name)) {
			ref_itm_nm(value);
			return;
		}
		if ($ext_sys_no_itm.equalsIgnoreCase(name)) {
			ext_sys_no_itm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			calc_ptn_nm(value);
			return;
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			itm_alc_grp(value);
			return;
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			release_usr_cd(value);
			return;
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			release_usr_nm(value);
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr_c.equalsIgnoreCase(name)) {
			upd_cntr_c(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($release_tm.equalsIgnoreCase(name)) {
			release_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts_c.equalsIgnoreCase(name)) {
			ins_ts_c(value);
			return;
		}
		if ($upd_ts_c.equalsIgnoreCase(name)) {
			upd_ts_c(value);
			return;
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($minus_stk_flg.equalsIgnoreCase(name)) {
			minus_stk_flg(value);
			return;
		}
		if ($not_new_lot_flg.equalsIgnoreCase(name)) {
			not_new_lot_flg(value);
			return;
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		if ($pack_alloc_flg.equalsIgnoreCase(name)) {
			pack_alloc_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($rqmt_sno1_flg.equalsIgnoreCase(name)) {
			rqmt_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($rqmt_sno2_flg.equalsIgnoreCase(name)) {
			rqmt_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($rqmt_sno3_flg.equalsIgnoreCase(name)) {
			rqmt_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($rqmt_sno4_flg.equalsIgnoreCase(name)) {
			rqmt_sno4_flg(value);
			return;
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		if ($comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			comp_rev_at_slo_flg(value);
			return;
		}
		if ($comp_core_itm_flg.equalsIgnoreCase(name)) {
			comp_core_itm_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			ship_lot_back_stop_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			purc_dlv_slip_flg(value);
			return;
		}
		if ($stk_lst_flg.equalsIgnoreCase(name)) {
			stk_lst_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		if ($release_flg.equalsIgnoreCase(name)) {
			release_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

