package mcframe.serverMSBC.MSBCL5050;

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
 * ブロック"Mrp_Upd03_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Mrp_Upd03_RsltR_MC_A extends MCConstRow {

	/**
	 * Route ID ルートＩＤ.<p>
	 *
	 */
	public static final String $root_id = "root_id";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $sort_no = "sort_no";
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public static final String $hrrchy = "hrrchy";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Item order type 品目オーダ区分.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	/**
	 * Scheduled mfg. start date 製造開始予定日.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";


	public static final MCMeta root_id_META = createCommonMeta($root_id, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta sort_no_META = createCommonMeta($sort_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Mrp_Upd03_RsltR> constMetas = new ConstMetaList<Mrp_Upd03_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			root_id_META,
			sort_no_META,
			hrrchy_META,
			itm_ord_no_META,
			io_schd_pr_no_META,
			lot_no_META,
			sublot_no_META,
			wg_cd_META,
			itm_ord_typ_META,
			po_schd_dt_META,
			mfg_st_schd_dt_META,
			gi_schd_dt_META
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
	protected Mrp_Upd03_RsltR_MC_A(ConstMetaList<? extends Mrp_Upd03_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Mrp_Upd03_RsltR clone() {
		return (Mrp_Upd03_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Mrp_Upd03_RsltR createInstance() {
		return (Mrp_Upd03_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Mrp_Upd03_RsltR getValues(String... names) {
		return (Mrp_Upd03_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Route ID ルートＩＤ.<p>
	 *
	 */
	public String root_id() {
		return getConstString(offset + 0, $root_id);
	}

	/**
	 * Route ID ルートＩＤ.<p>
	 *
	 */
	public void root_id(String value) {
		setConstString(offset + 0, $root_id, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber sort_no() {
		return getConstNumber(offset + 1, $sort_no);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_no(MCNumber value) {
		setConstNumber(offset + 1, $sort_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_no(int value) {
		setConstNumber(offset + 1, $sort_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_no(long value) {
		setConstNumber(offset + 1, $sort_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_no(float value) {
		setConstNumber(offset + 1, $sort_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void sort_no(double value) {
		setConstNumber(offset + 1, $sort_no, value);
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCNumber hrrchy() {
		return getConstNumber(offset + 2, $hrrchy);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(int value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(long value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(float value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void hrrchy(double value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 3, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 3, $itm_ord_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 4, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 4, $io_schd_pr_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 5, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 5, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 6, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 6, $sublot_no, value);
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
	 * Item order type 品目オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 8, $itm_ord_typ);
	}

	/**
	 * Item order type 品目オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 8, $itm_ord_typ, value);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 9, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 9, $po_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date 製造開始予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 10, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造開始予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 10, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 11, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 11, $gi_schd_dt, value);
	}


	public String getString(String name) {
		if ($root_id.equalsIgnoreCase(name)) {
			return root_id();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($root_id.equalsIgnoreCase(name)) {
			return root_id();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($root_id.equalsIgnoreCase(name)) {
			root_id(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($root_id.equalsIgnoreCase(name)) {
			root_id(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

