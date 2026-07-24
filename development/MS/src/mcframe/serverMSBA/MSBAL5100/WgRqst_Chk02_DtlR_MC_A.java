package mcframe.serverMSBA.MSBAL5100;

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
 * ブロック"WgRqst_Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Chk02_DtlR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public static final String $inst_po_flg = "inst_po_flg";
	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_prms_no = "wg_rqst_prms_no";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public static final String $wg_rqst_typ = "wg_rqst_typ";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public static final String $fix_dt = "fix_dt";
	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_trd_unit_cd = "prms_trd_unit_cd";
	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_qty = "prms_trd_unit_qty";
	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_base_unit_cd = "prms_base_unit_cd";
	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public static final String $prms_base_unit_qty = "prms_base_unit_qty";
	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public static final String $gr_schd_tm = "gr_schd_tm";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public static final String $gi_rqst_tm = "gi_rqst_tm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public static final String $last_fix_flg = "last_fix_flg";
	/**
	 * Change schedule 予定変更.<p>
	 *
	 */
	public static final String $schd_cng_flg = "schd_cng_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_po_flg_META = createCommonMeta($inst_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_prms_no_META = createCommonMeta($wg_rqst_prms_no, mcframe.commonMA.meta.MA_META.WG_RQST_PRMS_NO);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta wg_rqst_typ_META = createCommonMeta($wg_rqst_typ, mcframe.commonMS.meta.MS_META.WG_RQST_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_dt_META = createCommonMeta($fix_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_trd_unit_cd_META = createCommonMeta($prms_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_trd_unit_qty_META = createCommonMeta($prms_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_base_unit_cd_META = createCommonMeta($prms_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_base_unit_qty_META = createCommonMeta($prms_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_schd_tm_META = createCommonMeta($gr_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_rqst_tm_META = createCommonMeta($gi_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta last_fix_flg_META = createCommonMeta($last_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_cng_flg_META = createCommonMeta($schd_cng_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<WgRqst_Chk02_DtlR> constMetas = new ConstMetaList<WgRqst_Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			inst_po_flg_META,
			act_flg_META,
			wg_rqst_prms_no_META,
			wg_rqst_no_META,
			wg_rqst_typ_META,
			wg_cd_META,
			fix_flg_META,
			fix_dt_META,
			prms_trd_unit_cd_META,
			prms_trd_unit_qty_META,
			prms_base_unit_cd_META,
			prms_base_unit_qty_META,
			gr_schd_tm_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_rqst_tm_META,
			sppl_cd_META,
			maker_cd_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			can_flg_META,
			slo_no_META,
			slo_d_no_META,
			last_fix_flg_META,
			schd_cng_flg_META
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
	protected WgRqst_Chk02_DtlR_MC_A(ConstMetaList<? extends WgRqst_Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk02_DtlR clone() {
		return (WgRqst_Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk02_DtlR createInstance() {
		return (WgRqst_Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk02_DtlR getValues(String... names) {
		return (WgRqst_Chk02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging number 紐付け番号.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public boolean inst_po_flg() {
		return getConstBoolean(offset + 3, $inst_po_flg);
	}

	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public void inst_po_flg(boolean value) {
		setConstBoolean(offset + 3, $inst_po_flg, value);
	}


	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 4, $act_flg);
	}

	/**
	 * Resulted 実績済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 4, $act_flg, value);
	}


	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public String wg_rqst_prms_no() {
		return getConstString(offset + 5, $wg_rqst_prms_no);
	}

	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public void wg_rqst_prms_no(String value) {
		setConstString(offset + 5, $wg_rqst_prms_no, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 6, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 6, $wg_rqst_no, value);
	}


	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return getConstString(offset + 7, $wg_rqst_typ);
	}

	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		setConstString(offset + 7, $wg_rqst_typ, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 9, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 9, $fix_flg, value);
	}


	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 10, $fix_dt);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 10, $fix_dt, value);
	}


	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public String prms_trd_unit_cd() {
		return getConstString(offset + 11, $prms_trd_unit_cd);
	}

	/**
	 * Replied transaction unit cd. 回答取引単位ＣＤ.<p>
	 *
	 */
	public void prms_trd_unit_cd(String value) {
		setConstString(offset + 11, $prms_trd_unit_cd, value);
	}


	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_qty() {
		return getConstNumber(offset + 12, $prms_trd_unit_qty);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 12, $prms_trd_unit_qty, value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(int value) {
		setConstNumber(offset + 12, $prms_trd_unit_qty, value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(long value) {
		setConstNumber(offset + 12, $prms_trd_unit_qty, value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(float value) {
		setConstNumber(offset + 12, $prms_trd_unit_qty, value);
	}

	/**
	 * Replied transaction unit qty. 回答取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(double value) {
		setConstNumber(offset + 12, $prms_trd_unit_qty, value);
	}


	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public String prms_base_unit_cd() {
		return getConstString(offset + 13, $prms_base_unit_cd);
	}

	/**
	 * Replied base unit cd. 回答基準単位ＣＤ.<p>
	 *
	 */
	public void prms_base_unit_cd(String value) {
		setConstString(offset + 13, $prms_base_unit_cd, value);
	}


	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public MCNumber prms_base_unit_qty() {
		return getConstNumber(offset + 14, $prms_base_unit_qty);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 14, $prms_base_unit_qty, value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(int value) {
		setConstNumber(offset + 14, $prms_base_unit_qty, value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(long value) {
		setConstNumber(offset + 14, $prms_base_unit_qty, value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(float value) {
		setConstNumber(offset + 14, $prms_base_unit_qty, value);
	}

	/**
	 * Replied base unit qty. 回答基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(double value) {
		setConstNumber(offset + 14, $prms_base_unit_qty, value);
	}


	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public MCDate gr_schd_tm() {
		return getConstDate(offset + 15, $gr_schd_tm);
	}

	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public void gr_schd_tm(MCDate value) {
		setConstDate(offset + 15, $gr_schd_tm, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 16, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 16, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 17, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 17, $gi_str_ln_cd, value);
	}


	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return getConstDate(offset + 18, $gi_rqst_tm);
	}

	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		setConstDate(offset + 18, $gi_rqst_tm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 19, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 19, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 20, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 20, $maker_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 21, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 21, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 22, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 22, $bom_ptn, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 23, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 23, $can_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 24, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 24, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 25, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 25, $slo_d_no, value);
	}


	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public boolean last_fix_flg() {
		return getConstBoolean(offset + 26, $last_fix_flg);
	}

	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public void last_fix_flg(boolean value) {
		setConstBoolean(offset + 26, $last_fix_flg, value);
	}


	/**
	 * Change schedule 予定変更.<p>
	 *
	 */
	public boolean schd_cng_flg() {
		return getConstBoolean(offset + 27, $schd_cng_flg);
	}

	/**
	 * Change schedule 予定変更.<p>
	 *
	 */
	public void schd_cng_flg(boolean value) {
		setConstBoolean(offset + 27, $schd_cng_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty();
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			return prms_base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			return gr_schd_tm();
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			return inst_po_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			return schd_cng_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty();
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			return prms_base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			return gr_schd_tm();
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			return gi_rqst_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			return inst_po_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			return schd_cng_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			gr_schd_tm(value);
			return;
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			inst_po_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			schd_cng_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			gr_schd_tm(value);
			return;
		}
		if ($gi_rqst_tm.equalsIgnoreCase(name)) {
			gi_rqst_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($inst_po_flg.equalsIgnoreCase(name)) {
			inst_po_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		if ($schd_cng_flg.equalsIgnoreCase(name)) {
			schd_cng_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

