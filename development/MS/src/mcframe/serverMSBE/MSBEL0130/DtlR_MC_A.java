package mcframe.serverMSBE.MSBEL0130;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public static final String $alloc_rel_qty = "alloc_rel_qty";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta alloc_rel_qty_META = createCommonMeta($alloc_rel_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			ship_alloc_sts_no_META,
			alloc_rel_qty_META,
			ship_pr_upd_cntr_META,
			ship_loc_cd_META,
			ship_fr_lg_grp_cd_META,
			alloc_grp_cd_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			slo_d_no_META,
			err_flg_META,
			ship_pr_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$ship_alloc_sts_no, "E"}	// ship_alloc_sts_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ship_alloc_sts_no, "E"},	// ship_alloc_sts_no
				{$alloc_rel_qty, "E"}	// alloc_rel_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$alloc_rel_qty, "positive"}	// alloc_rel_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$alloc_rel_qty, "qty:S"},	// alloc_rel_qty
				{$pack_unit_qty, "qty:L"}	// pack_unit_qty
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
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
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 1, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 1, $ship_alloc_sts_no, value);
	}


	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public MCNumber alloc_rel_qty() {
		return getConstNumber(offset + 2, $alloc_rel_qty);
	}

	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public void alloc_rel_qty(MCNumber value) {
		setConstNumber(offset + 2, $alloc_rel_qty, value);
	}

	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public void alloc_rel_qty(int value) {
		setConstNumber(offset + 2, $alloc_rel_qty, value);
	}

	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public void alloc_rel_qty(long value) {
		setConstNumber(offset + 2, $alloc_rel_qty, value);
	}

	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public void alloc_rel_qty(float value) {
		setConstNumber(offset + 2, $alloc_rel_qty, value);
	}

	/**
	 * Released qty. 解除数量.<p>
	 *
	 */
	public void alloc_rel_qty(double value) {
		setConstNumber(offset + 2, $alloc_rel_qty, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 3, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 3, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 3, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 3, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 3, $ship_pr_upd_cntr, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 4, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 4, $ship_loc_cd, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 5, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 5, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 6, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 6, $alloc_grp_cd, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 7, $pack_unit_qty);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 7, $pack_unit_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 7, $pack_unit_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 7, $pack_unit_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 7, $pack_unit_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 7, $pack_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 8, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 8, $pack_unit_cd, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 9, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 9, $slo_d_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 10, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 10, $err_flg, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 11, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 11, $ship_pr_no, value);
	}


	public String getString(String name) {
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			return alloc_rel_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			return alloc_rel_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_rel_qty.equalsIgnoreCase(name)) {
			alloc_rel_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

