package mcframe.serverMSBD.MSBDL5090;

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
 * ブロック"PoSchd_Upd02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoSchd_Upd02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_schd_end_dt = "insp_schd_end_dt";
	/**
	 * Subcontracting location supplier cd. 外注場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * Location WG cd. 場所ＷＧ　ＣＤ.<p>
	 *
	 */
	public static final String $loc_wg_cd = "loc_wg_cd";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	public static final String $po_schd = "po_schd";

	public static final String $po_schd_no = $po_schd + ".po_schd_no";
	public static final String $po_no = $po_schd + ".po_no";
	public static final String $po_d_no = $po_schd + ".po_d_no";
	public static final String $po_flg = $po_schd + ".po_flg";
	public static final String $base_unit_po_qty = $po_schd + ".base_unit_po_qty";
	public static final String $io_schd_pr_no = $po_schd + ".io_schd_pr_no";
	public static final String $itm_cd = $po_schd + ".itm_cd";
	public static final String $itm_sub1 = $po_schd + ".itm_sub1";
	public static final String $itm_sub2 = $po_schd + ".itm_sub2";
	public static final String $itm_sub3 = $po_schd + ".itm_sub3";
	public static final String $ver_no = $po_schd + ".ver_no";
	public static final String $str_ln_cd = $po_schd + ".str_ln_cd";
	public static final String $sno1 = $po_schd + ".sno1";
	public static final String $sno2 = $po_schd + ".sno2";
	public static final String $sno3 = $po_schd + ".sno3";
	public static final String $sno4 = $po_schd + ".sno4";
	public static final String $in_to_loc_cd = $po_schd + ".in_to_loc_cd";
	public static final String $trd_unit_qty = $po_schd + ".trd_unit_qty";
	public static final String $trd_unit_cd = $po_schd + ".trd_unit_cd";
	public static final String $base_unit_qty = $po_schd + ".base_unit_qty";
	public static final String $base_unit_cd = $po_schd + ".base_unit_cd";
	public static final String $sppl_cd = $po_schd + ".sppl_cd";
	public static final String $maker_cd = $po_schd + ".maker_cd";
	public static final String $sub_char1 = $po_schd + ".sub_char1";
	public static final String $sub_char2 = $po_schd + ".sub_char2";
	public static final String $sub_char3 = $po_schd + ".sub_char3";
	public static final String $mfg_loc_cd = $po_schd + ".mfg_loc_cd";
	public static final String $dlv_cd = $po_schd + ".dlv_cd";
	public static final String $tdlv_cd = $po_schd + ".tdlv_cd";
	public static final String $trd_ptn_typ = $po_schd + ".trd_ptn_typ";
	public static final String $reg_dt = $po_schd + ".reg_dt";
	public static final String $trd_cur_cd = $po_schd + ".trd_cur_cd";
	public static final String $rqst_avl_rqst_dt = $po_schd + ".rqst_avl_rqst_dt";
	public static final String $dlv_rqst_tm = $po_schd + ".dlv_rqst_tm";
	public static final String $purc_schd_dt = $po_schd + ".purc_schd_dt";
	public static final String $abort_flg = $po_schd + ".abort_flg";
	public static final String $po_schd_dt = $po_schd + ".po_schd_dt";
	public static final String $rqst_fr_dpt_cd = $po_schd + ".rqst_fr_dpt_cd";
	public static final String $rqst_fr_usr_cd = $po_schd + ".rqst_fr_usr_cd";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta insp_schd_end_dt_META = createCommonMeta($insp_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta po_schd_META = createInnerRowMeta($po_schd, mcframe.serverMS.dbc.MST_PO_SCHD_R.class);

	protected static final ConstMetaList<PoSchd_Upd02_DtlR> constMetas = new ConstMetaList<PoSchd_Upd02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			insp_schd_end_dt_META,
			outsrc_sppl_cd_META,
			loc_wg_cd_META,
			prov_basis_typ_META,
			prov_typ_META,
			po_schd_META
		},
		new String[][]{
			{
				"po_schd_no",
				"po_no",
				"po_d_no",
				"po_flg",
				"base_unit_po_qty",
				"io_schd_pr_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"str_ln_cd",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"in_to_loc_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"sppl_cd",
				"maker_cd",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"mfg_loc_cd",
				"dlv_cd",
				"tdlv_cd",
				"trd_ptn_typ",
				"reg_dt",
				"trd_cur_cd",
				"rqst_avl_rqst_dt",
				"dlv_rqst_tm",
				"purc_schd_dt",
				"abort_flg",
				"po_schd_dt",
				"rqst_fr_dpt_cd",
				"rqst_fr_usr_cd"
			},
			{
				$po_schd_no,
				$po_no,
				$po_d_no,
				$po_flg,
				$base_unit_po_qty,
				$io_schd_pr_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$str_ln_cd,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$in_to_loc_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$sppl_cd,
				$maker_cd,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$mfg_loc_cd,
				$dlv_cd,
				$tdlv_cd,
				$trd_ptn_typ,
				$reg_dt,
				$trd_cur_cd,
				$rqst_avl_rqst_dt,
				$dlv_rqst_tm,
				$purc_schd_dt,
				$abort_flg,
				$po_schd_dt,
				$rqst_fr_dpt_cd,
				$rqst_fr_usr_cd
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
	protected PoSchd_Upd02_DtlR_MC_A(ConstMetaList<? extends PoSchd_Upd02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd02_DtlR clone() {
		return (PoSchd_Upd02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd02_DtlR createInstance() {
		return (PoSchd_Upd02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd02_DtlR getValues(String... names) {
		return (PoSchd_Upd02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_schd_end_dt() {
		return getConstDate(offset + 2, $insp_schd_end_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_schd_end_dt(MCDate value) {
		setConstDate(offset + 2, $insp_schd_end_dt, value);
	}


	/**
	 * Subcontracting location supplier cd. 外注場所発注先ＣＤ.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 3, $outsrc_sppl_cd);
	}

	/**
	 * Subcontracting location supplier cd. 外注場所発注先ＣＤ.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 3, $outsrc_sppl_cd, value);
	}


	/**
	 * Location WG cd. 場所ＷＧ　ＣＤ.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 4, $loc_wg_cd);
	}

	/**
	 * Location WG cd. 場所ＷＧ　ＣＤ.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 4, $loc_wg_cd, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 5, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 5, $prov_basis_typ, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 6, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 6, $prov_typ, value);
	}


	public mcframe.serverMS.dbc.MST_PO_SCHD_R po_schd(){
		return (mcframe.serverMS.dbc.MST_PO_SCHD_R) getConstInnerRow(offset + 7, $po_schd);
	}
	
	public void po_schd(mcframe.serverMS.dbc.MST_PO_SCHD_R row){
		setConstInnerRow(offset + 7, $po_schd, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			return insp_schd_end_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			return insp_schd_end_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			insp_schd_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($insp_schd_end_dt.equalsIgnoreCase(name)) {
			insp_schd_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($po_schd.equalsIgnoreCase(name)) {
			return po_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($po_schd.equalsIgnoreCase(name)) {
			po_schd(
				((MCContainerMeta) po_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return po_schd().po_schd_no();
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		po_schd().po_schd_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return po_schd().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		po_schd().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return po_schd().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		po_schd().po_d_no(value);
	}

	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public boolean po_flg() {
		return po_schd().po_flg();
	}

	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public void po_flg(boolean value) {
		po_schd().po_flg(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public MCNumber base_unit_po_qty() {
		return po_schd().base_unit_po_qty();
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(MCNumber value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(int value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(long value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(float value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(double value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return po_schd().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		po_schd().io_schd_pr_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return po_schd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		po_schd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return po_schd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		po_schd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return po_schd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		po_schd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return po_schd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		po_schd().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return po_schd().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		po_schd().ver_no(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return po_schd().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		po_schd().str_ln_cd(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return po_schd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		po_schd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return po_schd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		po_schd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return po_schd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		po_schd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return po_schd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		po_schd().sno4(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return po_schd().in_to_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		po_schd().in_to_loc_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return po_schd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return po_schd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		po_schd().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return po_schd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return po_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		po_schd().base_unit_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return po_schd().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		po_schd().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return po_schd().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		po_schd().maker_cd(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return po_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		po_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return po_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		po_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return po_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		po_schd().sub_char3(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return po_schd().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		po_schd().mfg_loc_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return po_schd().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		po_schd().dlv_cd(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return po_schd().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		po_schd().tdlv_cd(value);
	}

	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return po_schd().trd_ptn_typ();
	}

	/**
	 * Transaction type 取引区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		po_schd().trd_ptn_typ(value);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return po_schd().reg_dt();
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		po_schd().reg_dt(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return po_schd().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		po_schd().trd_cur_cd(value);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return po_schd().rqst_avl_rqst_dt();
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		po_schd().rqst_avl_rqst_dt(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return po_schd().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		po_schd().dlv_rqst_tm(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return po_schd().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		po_schd().purc_schd_dt(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return po_schd().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		po_schd().abort_flg(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return po_schd().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		po_schd().po_schd_dt(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return po_schd().rqst_fr_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		po_schd().rqst_fr_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return po_schd().rqst_fr_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		po_schd().rqst_fr_usr_cd(value);
	}

}

