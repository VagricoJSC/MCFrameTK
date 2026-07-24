package mcframe.serverMBBA.MBBAL5010;

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
 * ブロック"Aprv_Upd01_Wk1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Aprv_Upd01_Wk1R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public static final String $itm_grp_typ = "itm_grp_typ";
	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_grp_cd = "itm_grp_cd";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * BP classification type 取引先分類区分.<p>
	 *
	 */
	public static final String $bp_grp_typ = "bp_grp_typ";
	/**
	 * BP classification cd. 取引先分類ＣＤ.<p>
	 *
	 */
	public static final String $bp_grp_cd = "bp_grp_cd";
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public static final String $val_min1 = "val_min1";
	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public static final String $val_max1 = "val_max1";
	/**
	 * Join criteria type 1 結合条件区分１.<p>
	 *
	 */
	public static final String $bind_cond1 = "bind_cond1";
	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public static final String $val_min2 = "val_min2";
	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public static final String $val_max2 = "val_max2";
	/**
	 * Join criteria type 2 結合条件区分２.<p>
	 *
	 */
	public static final String $bind_cond2 = "bind_cond2";
	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public static final String $val_min3 = "val_min3";
	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public static final String $val_max3 = "val_max3";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public static final String $aprv_no_seq = "aprv_no_seq";
	/**
	 * Approval route pattern 承認ルートパタン.<p>
	 *
	 */
	public static final String $aprv_rt_ptn = "aprv_rt_ptn";
	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public static final String $aprv_row_num = "aprv_row_num";
	/**
	 * Updatable flg. 更新可能ＦＬＧ.<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	/**
	 * Cancelable flg. 取消可能ＦＬＧ.<p>
	 *
	 */
	public static final String $aprv_can_flg = "aprv_can_flg";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public static final String $aprv_seq = "aprv_seq";
	/**
	 * Non-updatable flg. 更新不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_upd_flg = "not_upd_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_grp_typ_META = createCommonMeta($itm_grp_typ, mcframe.commonMA.meta.MA_META.ITM_GRP_TYP);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta bp_grp_typ_META = createCommonMeta($bp_grp_typ, mcframe.commonMA.meta.MA_META.BP_GRP_TYP);
	public static final MCMeta bp_grp_cd_META = createCommonMeta($bp_grp_cd, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta val_min1_META = createCommonMeta($val_min1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max1_META = createCommonMeta($val_max1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bind_cond1_META = createCommonMeta($bind_cond1, mcframe.commonMA.meta.MA_META.BIND_COND_TYP);
	public static final MCMeta val_min2_META = createCommonMeta($val_min2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max2_META = createCommonMeta($val_max2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bind_cond2_META = createCommonMeta($bind_cond2, mcframe.commonMA.meta.MA_META.BIND_COND_TYP);
	public static final MCMeta val_min3_META = createCommonMeta($val_min3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max3_META = createCommonMeta($val_max3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_rt_ptn_META = createCommonMeta($aprv_rt_ptn, mcframe.commonMA.meta.MA_META.APRV_RT_PTN);
	public static final MCMeta aprv_row_num_META = createCommonMeta($aprv_row_num, mcframe.commonMA.meta.MA_META.APRV_ROW_NUM);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_seq_META = createCommonMeta($aprv_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_upd_flg_META = createCommonMeta($not_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Aprv_Upd01_Wk1R> constMetas = new ConstMetaList<Aprv_Upd01_Wk1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			prio_META,
			itm_grp_typ_META,
			itm_grp_cd_META,
			itm_grp_cd1_META,
			itm_grp_cd2_META,
			itm_grp_cd3_META,
			itm_grp_cd4_META,
			itm_grp_cd5_META,
			itm_grp_cd6_META,
			itm_grp_cd7_META,
			itm_grp_cd8_META,
			itm_grp_cd9_META,
			itm_grp_cd10_META,
			bp_grp_typ_META,
			bp_grp_cd_META,
			bp_grp_cd1_META,
			bp_grp_cd2_META,
			bp_grp_cd3_META,
			bp_grp_cd4_META,
			bp_grp_cd5_META,
			bp_grp_cd6_META,
			bp_grp_cd7_META,
			bp_grp_cd8_META,
			bp_grp_cd9_META,
			bp_grp_cd10_META,
			val_min1_META,
			val_max1_META,
			bind_cond1_META,
			val_min2_META,
			val_max2_META,
			bind_cond2_META,
			val_min3_META,
			val_max3_META,
			aprv_no_META,
			aprv_no_seq_META,
			aprv_rt_ptn_META,
			aprv_row_num_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
			aprv_role_cd_META,
			aprv_usr_cd_META,
			aprv_seq_META,
			not_upd_flg_META
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
	protected Aprv_Upd01_Wk1R_MC_A(ConstMetaList<? extends Aprv_Upd01_Wk1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_Upd01_Wk1R clone() {
		return (Aprv_Upd01_Wk1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_Upd01_Wk1R createInstance() {
		return (Aprv_Upd01_Wk1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_Upd01_Wk1R getValues(String... names) {
		return (Aprv_Upd01_Wk1R) super.getValues(names);
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
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 1, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 1, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 1, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 1, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 1, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 1, $prio, value);
	}


	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public String itm_grp_typ() {
		return getConstString(offset + 2, $itm_grp_typ);
	}

	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public void itm_grp_typ(String value) {
		setConstString(offset + 2, $itm_grp_typ, value);
	}


	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public String itm_grp_cd() {
		return getConstString(offset + 3, $itm_grp_cd);
	}

	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public void itm_grp_cd(String value) {
		setConstString(offset + 3, $itm_grp_cd, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 4, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 4, $itm_grp_cd1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 5, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 5, $itm_grp_cd2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 6, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 6, $itm_grp_cd3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 7, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 7, $itm_grp_cd4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 8, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 8, $itm_grp_cd5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 9, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 9, $itm_grp_cd6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 10, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 10, $itm_grp_cd7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 11, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 11, $itm_grp_cd8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 12, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 12, $itm_grp_cd9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 13, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 13, $itm_grp_cd10, value);
	}


	/**
	 * BP classification type 取引先分類区分.<p>
	 *
	 */
	public String bp_grp_typ() {
		return getConstString(offset + 14, $bp_grp_typ);
	}

	/**
	 * BP classification type 取引先分類区分.<p>
	 *
	 */
	public void bp_grp_typ(String value) {
		setConstString(offset + 14, $bp_grp_typ, value);
	}


	/**
	 * BP classification cd. 取引先分類ＣＤ.<p>
	 *
	 */
	public String bp_grp_cd() {
		return getConstString(offset + 15, $bp_grp_cd);
	}

	/**
	 * BP classification cd. 取引先分類ＣＤ.<p>
	 *
	 */
	public void bp_grp_cd(String value) {
		setConstString(offset + 15, $bp_grp_cd, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 16, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 16, $bp_grp_cd1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 17, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 17, $bp_grp_cd2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 18, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 18, $bp_grp_cd3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 19, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 19, $bp_grp_cd4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 20, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 20, $bp_grp_cd5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 21, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 21, $bp_grp_cd6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 22, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 22, $bp_grp_cd7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 23, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 23, $bp_grp_cd8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 24, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 24, $bp_grp_cd9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 25, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 25, $bp_grp_cd10, value);
	}


	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public MCNumber val_min1() {
		return getConstNumber(offset + 26, $val_min1);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(MCNumber value) {
		setConstNumber(offset + 26, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(int value) {
		setConstNumber(offset + 26, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(long value) {
		setConstNumber(offset + 26, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(float value) {
		setConstNumber(offset + 26, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(double value) {
		setConstNumber(offset + 26, $val_min1, value);
	}


	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public MCNumber val_max1() {
		return getConstNumber(offset + 27, $val_max1);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(MCNumber value) {
		setConstNumber(offset + 27, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(int value) {
		setConstNumber(offset + 27, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(long value) {
		setConstNumber(offset + 27, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(float value) {
		setConstNumber(offset + 27, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(double value) {
		setConstNumber(offset + 27, $val_max1, value);
	}


	/**
	 * Join criteria type 1 結合条件区分１.<p>
	 *
	 */
	public String bind_cond1() {
		return getConstString(offset + 28, $bind_cond1);
	}

	/**
	 * Join criteria type 1 結合条件区分１.<p>
	 *
	 */
	public void bind_cond1(String value) {
		setConstString(offset + 28, $bind_cond1, value);
	}


	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public MCNumber val_min2() {
		return getConstNumber(offset + 29, $val_min2);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(MCNumber value) {
		setConstNumber(offset + 29, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(int value) {
		setConstNumber(offset + 29, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(long value) {
		setConstNumber(offset + 29, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(float value) {
		setConstNumber(offset + 29, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(double value) {
		setConstNumber(offset + 29, $val_min2, value);
	}


	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public MCNumber val_max2() {
		return getConstNumber(offset + 30, $val_max2);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(MCNumber value) {
		setConstNumber(offset + 30, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(int value) {
		setConstNumber(offset + 30, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(long value) {
		setConstNumber(offset + 30, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(float value) {
		setConstNumber(offset + 30, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(double value) {
		setConstNumber(offset + 30, $val_max2, value);
	}


	/**
	 * Join criteria type 2 結合条件区分２.<p>
	 *
	 */
	public String bind_cond2() {
		return getConstString(offset + 31, $bind_cond2);
	}

	/**
	 * Join criteria type 2 結合条件区分２.<p>
	 *
	 */
	public void bind_cond2(String value) {
		setConstString(offset + 31, $bind_cond2, value);
	}


	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public MCNumber val_min3() {
		return getConstNumber(offset + 32, $val_min3);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(MCNumber value) {
		setConstNumber(offset + 32, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(int value) {
		setConstNumber(offset + 32, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(long value) {
		setConstNumber(offset + 32, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(float value) {
		setConstNumber(offset + 32, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(double value) {
		setConstNumber(offset + 32, $val_min3, value);
	}


	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public MCNumber val_max3() {
		return getConstNumber(offset + 33, $val_max3);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(MCNumber value) {
		setConstNumber(offset + 33, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(int value) {
		setConstNumber(offset + 33, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(long value) {
		setConstNumber(offset + 33, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(float value) {
		setConstNumber(offset + 33, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(double value) {
		setConstNumber(offset + 33, $val_max3, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 34, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 34, $aprv_no, value);
	}


	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 35, $aprv_no_seq);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 35, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		setConstNumber(offset + 35, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		setConstNumber(offset + 35, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		setConstNumber(offset + 35, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		setConstNumber(offset + 35, $aprv_no_seq, value);
	}


	/**
	 * Approval route pattern 承認ルートパタン.<p>
	 *
	 */
	public String aprv_rt_ptn() {
		return getConstString(offset + 36, $aprv_rt_ptn);
	}

	/**
	 * Approval route pattern 承認ルートパタン.<p>
	 *
	 */
	public void aprv_rt_ptn(String value) {
		setConstString(offset + 36, $aprv_rt_ptn, value);
	}


	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public MCNumber aprv_row_num() {
		return getConstNumber(offset + 37, $aprv_row_num);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(MCNumber value) {
		setConstNumber(offset + 37, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(int value) {
		setConstNumber(offset + 37, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(long value) {
		setConstNumber(offset + 37, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(float value) {
		setConstNumber(offset + 37, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(double value) {
		setConstNumber(offset + 37, $aprv_row_num, value);
	}


	/**
	 * Updatable flg. 更新可能ＦＬＧ.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 38, $aprv_upd_flg);
	}

	/**
	 * Updatable flg. 更新可能ＦＬＧ.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 38, $aprv_upd_flg, value);
	}


	/**
	 * Cancelable flg. 取消可能ＦＬＧ.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 39, $aprv_can_flg);
	}

	/**
	 * Cancelable flg. 取消可能ＦＬＧ.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 39, $aprv_can_flg, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 40, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 40, $aprv_role_cd, value);
	}


	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 41, $aprv_usr_cd);
	}

	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 41, $aprv_usr_cd, value);
	}


	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public MCNumber aprv_seq() {
		return getConstNumber(offset + 42, $aprv_seq);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(MCNumber value) {
		setConstNumber(offset + 42, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(int value) {
		setConstNumber(offset + 42, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(long value) {
		setConstNumber(offset + 42, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(float value) {
		setConstNumber(offset + 42, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(double value) {
		setConstNumber(offset + 42, $aprv_seq, value);
	}


	/**
	 * Non-updatable flg. 更新不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_upd_flg() {
		return getConstBoolean(offset + 43, $not_upd_flg);
	}

	/**
	 * Non-updatable flg. 更新不可ＦＬＧ.<p>
	 *
	 */
	public void not_upd_flg(boolean value) {
		setConstBoolean(offset + 43, $not_upd_flg, value);
	}


	public String getString(String name) {
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			return bp_grp_typ();
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			return bp_grp_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			return bind_cond1();
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			return bind_cond2();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			return val_min1();
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			return val_max1();
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			return val_min2();
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			return val_max2();
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			return val_min3();
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			return val_max3();
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			return aprv_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			return not_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			return bp_grp_typ();
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			return bp_grp_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			return bind_cond1();
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			return bind_cond2();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			return val_min1();
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			return val_max1();
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			return val_min2();
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			return val_max2();
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			return val_min3();
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			return val_max3();
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			return aprv_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			return not_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			bp_grp_typ(value);
			return;
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			bp_grp_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			bind_cond1(value);
			return;
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			bind_cond2(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			not_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			bp_grp_typ(value);
			return;
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			bp_grp_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			bind_cond1(value);
			return;
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			bind_cond2(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			not_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

