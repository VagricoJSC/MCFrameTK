package mcframe.serverMSBE.MSBEL5500;

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
 * ブロック"Alloc_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Alloc_RsltR_MC_A extends MCConstRow {

	public static final String $alloc = "alloc";
	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public static final String $peg_seq = "peg_seq";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public static final String $alloc_wait_flg = "alloc_wait_flg";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public static final String $ent_unit_cd = "ent_unit_cd";
	/**
	 * Order 並び順.<p>
	 *
	 */
	public static final String $seq = "seq";
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";

	public static final String $peg_no = $alloc + ".peg_no";
	public static final String $itm_cd = $alloc + ".itm_cd";
	public static final String $itm_sub1 = $alloc + ".itm_sub1";
	public static final String $itm_sub2 = $alloc + ".itm_sub2";
	public static final String $itm_sub3 = $alloc + ".itm_sub3";
	public static final String $stk_loc_cd = $alloc + ".stk_loc_cd";
	public static final String $stk_str_ln_cd = $alloc + ".stk_str_ln_cd";
	public static final String $stk_lg_grp_cd = $alloc + ".stk_lg_grp_cd";
	public static final String $quality_typ = $alloc + ".quality_typ";
	public static final String $stk_insp_typ = $alloc + ".stk_insp_typ";
	public static final String $stk_id_typ = $alloc + ".stk_id_typ";
	public static final String $stk_arrv_bp_cd = $alloc + ".stk_arrv_bp_cd";
	public static final String $stk_bp_cd = $alloc + ".stk_bp_cd";
	public static final String $gd_cd = $alloc + ".gd_cd";
	public static final String $lot_no = $alloc + ".lot_no";
	public static final String $sublot_no = $alloc + ".sublot_no";
	public static final String $sno1 = $alloc + ".sno1";
	public static final String $sno2 = $alloc + ".sno2";
	public static final String $sno3 = $alloc + ".sno3";
	public static final String $sno4 = $alloc + ".sno4";
	public static final String $ver_no = $alloc + ".ver_no";
	public static final String $pack_unit_cd = $alloc + ".pack_unit_cd";
	public static final String $pack_unit_qty = $alloc + ".pack_unit_qty";
	public static final String $base_unit_cd = $alloc + ".base_unit_cd";
	public static final String $base_unit_qty = $alloc + ".base_unit_qty";
	public static final String $vld_dt_fr = $alloc + ".vld_dt_fr";
	public static final String $vld_dt_to = $alloc + ".vld_dt_to";

	public static final MCMeta alloc_META = createInnerRowMeta($alloc, mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
	public static final MCMeta peg_seq_META = createCommonMeta($peg_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_wait_flg_META = createCommonMeta($alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta ent_unit_cd_META = createCommonMeta($ent_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Alloc_RsltR> constMetas = new ConstMetaList<Alloc_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			alloc_META,
			peg_seq_META,
			alloc_flg_META,
			alloc_wait_flg_META,
			alloc_scope_typ_META,
			ent_unit_cd_META,
			seq_META,
			wms_flg_META
		},
		new String[][]{
			{
				"peg_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"stk_loc_cd",
				"stk_str_ln_cd",
				"stk_lg_grp_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_arrv_bp_cd",
				"stk_bp_cd",
				"gd_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"ver_no",
				"pack_unit_cd",
				"pack_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"vld_dt_fr",
				"vld_dt_to"
			},
			{
				$peg_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$stk_loc_cd,
				$stk_str_ln_cd,
				$stk_lg_grp_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_arrv_bp_cd,
				$stk_bp_cd,
				$gd_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$ver_no,
				$pack_unit_cd,
				$pack_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$vld_dt_fr,
				$vld_dt_to
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
	protected Alloc_RsltR_MC_A(ConstMetaList<? extends Alloc_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_RsltR clone() {
		return (Alloc_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_RsltR createInstance() {
		return (Alloc_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_RsltR getValues(String... names) {
		return (Alloc_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMSBE.MSBEL5040.Srch_RsltR alloc(){
		return (mcframe.serverMSBE.MSBEL5040.Srch_RsltR) getConstInnerRow(offset + 0, $alloc);
	}
	
	public void alloc(mcframe.serverMSBE.MSBEL5040.Srch_RsltR row){
		setConstInnerRow(offset + 0, $alloc, row);
	}


	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public MCNumber peg_seq() {
		return getConstNumber(offset + 1, $peg_seq);
	}

	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public void peg_seq(MCNumber value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public void peg_seq(int value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public void peg_seq(long value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public void peg_seq(float value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}

	/**
	 * Data pegged branch number データ紐付き枝番.<p>
	 *
	 */
	public void peg_seq(double value) {
		setConstNumber(offset + 1, $peg_seq, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 2, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 2, $alloc_flg, value);
	}


	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public boolean alloc_wait_flg() {
		return getConstBoolean(offset + 3, $alloc_wait_flg);
	}

	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public void alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 3, $alloc_wait_flg, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 4, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 4, $alloc_scope_typ, value);
	}


	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public String ent_unit_cd() {
		return getConstString(offset + 5, $ent_unit_cd);
	}

	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public void ent_unit_cd(String value) {
		setConstString(offset + 5, $ent_unit_cd, value);
	}


	/**
	 * Order 並び順.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 6, $seq);
	}

	/**
	 * Order 並び順.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 6, $seq, value);
	}

	/**
	 * Order 並び順.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 6, $seq, value);
	}

	/**
	 * Order 並び順.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 6, $seq, value);
	}

	/**
	 * Order 並び順.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 6, $seq, value);
	}

	/**
	 * Order 並び順.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 6, $seq, value);
	}


	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 7, $wms_flg);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 7, $wms_flg, value);
	}


	public String getString(String name) {
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			return ent_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			return peg_seq();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($alloc_wait_flg.equalsIgnoreCase(name)) {
			return alloc_wait_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			return ent_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			return peg_seq();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($alloc_wait_flg.equalsIgnoreCase(name)) {
			return alloc_wait_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			ent_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($alloc_wait_flg.equalsIgnoreCase(name)) {
			alloc_wait_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($ent_unit_cd.equalsIgnoreCase(name)) {
			ent_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_seq.equalsIgnoreCase(name)) {
			peg_seq(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($alloc_wait_flg.equalsIgnoreCase(name)) {
			alloc_wait_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($alloc.equalsIgnoreCase(name)) {
			return alloc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($alloc.equalsIgnoreCase(name)) {
			alloc(
				((MCContainerMeta) alloc_META).castInnerRow(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return alloc().peg_no();
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		alloc().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		alloc().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		alloc().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		alloc().peg_no(value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		alloc().peg_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return alloc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		alloc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return alloc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		alloc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return alloc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		alloc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return alloc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		alloc().itm_sub3(value);
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return alloc().stk_loc_cd();
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		alloc().stk_loc_cd(value);
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return alloc().stk_str_ln_cd();
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		alloc().stk_str_ln_cd(value);
	}

	/**
	 * Inventory distribution group cd. 在庫物流グループＣＤ.<p>
	 *
	 */
	public String stk_lg_grp_cd() {
		return alloc().stk_lg_grp_cd();
	}

	/**
	 * Inventory distribution group cd. 在庫物流グループＣＤ.<p>
	 *
	 */
	public void stk_lg_grp_cd(String value) {
		alloc().stk_lg_grp_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return alloc().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		alloc().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return alloc().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		alloc().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return alloc().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		alloc().stk_id_typ(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return alloc().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		alloc().stk_arrv_bp_cd(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return alloc().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		alloc().stk_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return alloc().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		alloc().gd_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return alloc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		alloc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return alloc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		alloc().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return alloc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		alloc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return alloc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		alloc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return alloc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		alloc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return alloc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		alloc().sno4(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return alloc().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		alloc().ver_no(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return alloc().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		alloc().pack_unit_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return alloc().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		alloc().pack_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return alloc().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		alloc().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return alloc().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		alloc().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		alloc().base_unit_qty(value);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return alloc().vld_dt_fr();
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		alloc().vld_dt_fr(value);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return alloc().vld_dt_to();
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		alloc().vld_dt_to(value);
	}

}

