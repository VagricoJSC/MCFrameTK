package mcframe.serverMGBE.MGBEL0050;

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
 * ブロック"Srch01_Qty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_QtyR_MC_A extends MCConstRow {

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * BP classification master 1 (Customer) (Dummy for join) 取引先分類マスタ１（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp1 = "dummy_cst_grp1";
	/**
	 * BP classification master 2 (Customer) (Dummy for join) 取引先分類マスタ２（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp2 = "dummy_cst_grp2";
	/**
	 * BP classification master 3 (Customer) (Dummy for join) 取引先分類マスタ３（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp3 = "dummy_cst_grp3";
	/**
	 * BP classification master 4 (Customer) (Dummy for join) 取引先分類マスタ４（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp4 = "dummy_cst_grp4";
	/**
	 * BP classification master 5 (Customer) (Dummy for join) 取引先分類マスタ５（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp5 = "dummy_cst_grp5";
	/**
	 * BP classification master 6 (Customer) (Dummy for join) 取引先分類マスタ６（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp6 = "dummy_cst_grp6";
	/**
	 * BP classification master 7 (Customer) (Dummy for join) 取引先分類マスタ７（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp7 = "dummy_cst_grp7";
	/**
	 * BP classification master 8 (Customer) (Dummy for join) 取引先分類マスタ８（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp8 = "dummy_cst_grp8";
	/**
	 * BP classification master 9 (Customer) (Dummy for join) 取引先分類マスタ９（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp9 = "dummy_cst_grp9";
	/**
	 * BP classification master 10 (Customer) (Dummy for join) 取引先分類マスタ１０（得意先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cst_grp10 = "dummy_cst_grp10";
	/**
	 * BP classification master 1 (Delivery) (Dummy for join) 取引先分類マスタ１（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp1 = "dummy_dlv_grp1";
	/**
	 * BP classification master 2 (Delivery) (Dummy for join) 取引先分類マスタ２（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp2 = "dummy_dlv_grp2";
	/**
	 * BP classification master 3 (Delivery) (Dummy for join) 取引先分類マスタ３（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp3 = "dummy_dlv_grp3";
	/**
	 * BP classification master 4 (Delivery) (Dummy for join) 取引先分類マスタ４（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp4 = "dummy_dlv_grp4";
	/**
	 * BP classification master 5 (Delivery) (Dummy for join) 取引先分類マスタ５（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp5 = "dummy_dlv_grp5";
	/**
	 * BP classification master 6 (Delivery) (Dummy for join) 取引先分類マスタ６（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp6 = "dummy_dlv_grp6";
	/**
	 * BP classification master 7 (Delivery) (Dummy for join) 取引先分類マスタ７（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp7 = "dummy_dlv_grp7";
	/**
	 * BP classification master 8 (Delivery) (Dummy for join) 取引先分類マスタ８（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp8 = "dummy_dlv_grp8";
	/**
	 * BP classification master 9 (Delivery) (Dummy for join) 取引先分類マスタ９（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp9 = "dummy_dlv_grp9";
	/**
	 * BP classification master 10 (Delivery) (Dummy for join) 取引先分類マスタ１０（納品先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_dlv_grp10 = "dummy_dlv_grp10";


	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_cst_grp1_META = createCommonMeta($dummy_cst_grp1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp2_META = createCommonMeta($dummy_cst_grp2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp3_META = createCommonMeta($dummy_cst_grp3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp4_META = createCommonMeta($dummy_cst_grp4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp5_META = createCommonMeta($dummy_cst_grp5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp6_META = createCommonMeta($dummy_cst_grp6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp7_META = createCommonMeta($dummy_cst_grp7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp8_META = createCommonMeta($dummy_cst_grp8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp9_META = createCommonMeta($dummy_cst_grp9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_cst_grp10_META = createCommonMeta($dummy_cst_grp10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp1_META = createCommonMeta($dummy_dlv_grp1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp2_META = createCommonMeta($dummy_dlv_grp2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp3_META = createCommonMeta($dummy_dlv_grp3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp4_META = createCommonMeta($dummy_dlv_grp4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp5_META = createCommonMeta($dummy_dlv_grp5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp6_META = createCommonMeta($dummy_dlv_grp6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp7_META = createCommonMeta($dummy_dlv_grp7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp8_META = createCommonMeta($dummy_dlv_grp8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp9_META = createCommonMeta($dummy_dlv_grp9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_dlv_grp10_META = createCommonMeta($dummy_dlv_grp10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);

	protected static final ConstMetaList<Srch01_QtyR> constMetas = new ConstMetaList<Srch01_QtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			dpt_cd_META,
			cst_cd_META,
			dlv_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			qty_META,
			sls_amt_META,
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			dummy_cst_grp1_META,
			dummy_cst_grp2_META,
			dummy_cst_grp3_META,
			dummy_cst_grp4_META,
			dummy_cst_grp5_META,
			dummy_cst_grp6_META,
			dummy_cst_grp7_META,
			dummy_cst_grp8_META,
			dummy_cst_grp9_META,
			dummy_cst_grp10_META,
			dummy_dlv_grp1_META,
			dummy_dlv_grp2_META,
			dummy_dlv_grp3_META,
			dummy_dlv_grp4_META,
			dummy_dlv_grp5_META,
			dummy_dlv_grp6_META,
			dummy_dlv_grp7_META,
			dummy_dlv_grp8_META,
			dummy_dlv_grp9_META,
			dummy_dlv_grp10_META
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
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_flg"},	// dpt_cd
				{$cst_cd, "cst_flg"},	// cst_cd
				{$dlv_cd, "dlv_flg"},	// dlv_cd
				{$dest_cd1, "dest1_flg"},	// dest_cd1
				{$dest_cd2, "dest2_flg"},	// dest_cd2
				{$dest_cd3, "dest3_flg"}	// dest_cd3
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$wg_cd, "T.WG_CD"},	// wg_cd
				{$itm_cd, "T.ITM_CD"},	// itm_cd
				{$itm_sub1, "T.ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "T.ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "T.ITM_SUB3"},	// itm_sub3
				{$dpt_cd, "T.DPT_CD"},	// dpt_cd
				{$cst_cd, "T.CST_CD"},	// cst_cd
				{$dlv_cd, "T.DLV_CD"},	// dlv_cd
				{$dest_cd1, "T.DEST_CD1"},	// dest_cd1
				{$dest_cd2, "T.DEST_CD2"},	// dest_cd2
				{$dest_cd3, "T.DEST_CD3"}	// dest_cd3
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$qty, "SUM(T.QTY)"},	// qty
				{$sls_amt, "SUM(T.SLS_AMT)"}	// sls_amt
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
	protected Srch01_QtyR_MC_A(ConstMetaList<? extends Srch01_QtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_QtyR clone() {
		return (Srch01_QtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_QtyR createInstance() {
		return (Srch01_QtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_QtyR getValues(String... names) {
		return (Srch01_QtyR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 6, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 6, $cst_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 7, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 7, $dlv_cd, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 8, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 8, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 9, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 9, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 10, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 10, $dest_cd3, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 11, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 11, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 11, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 11, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 11, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 11, $qty, value);
	}


	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 12, $sls_amt);
	}

	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 12, $sls_amt, value);
	}

	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 12, $sls_amt, value);
	}

	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 12, $sls_amt, value);
	}

	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 12, $sls_amt, value);
	}

	/**
	 * Sales amount 販売金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 12, $sls_amt, value);
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 13, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 13, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 14, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 14, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 15, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 15, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 16, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 16, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 17, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 17, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 18, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 18, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 19, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 19, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 20, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 20, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 21, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 21, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 22, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 22, $dummy_itm_grp10, value);
	}


	/**
	 * BP classification master 1 (Customer) (Dummy for join) 取引先分類マスタ１（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp1() {
		return getConstString(offset + 23, $dummy_cst_grp1);
	}

	/**
	 * BP classification master 1 (Customer) (Dummy for join) 取引先分類マスタ１（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp1(String value) {
		setConstString(offset + 23, $dummy_cst_grp1, value);
	}


	/**
	 * BP classification master 2 (Customer) (Dummy for join) 取引先分類マスタ２（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp2() {
		return getConstString(offset + 24, $dummy_cst_grp2);
	}

	/**
	 * BP classification master 2 (Customer) (Dummy for join) 取引先分類マスタ２（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp2(String value) {
		setConstString(offset + 24, $dummy_cst_grp2, value);
	}


	/**
	 * BP classification master 3 (Customer) (Dummy for join) 取引先分類マスタ３（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp3() {
		return getConstString(offset + 25, $dummy_cst_grp3);
	}

	/**
	 * BP classification master 3 (Customer) (Dummy for join) 取引先分類マスタ３（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp3(String value) {
		setConstString(offset + 25, $dummy_cst_grp3, value);
	}


	/**
	 * BP classification master 4 (Customer) (Dummy for join) 取引先分類マスタ４（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp4() {
		return getConstString(offset + 26, $dummy_cst_grp4);
	}

	/**
	 * BP classification master 4 (Customer) (Dummy for join) 取引先分類マスタ４（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp4(String value) {
		setConstString(offset + 26, $dummy_cst_grp4, value);
	}


	/**
	 * BP classification master 5 (Customer) (Dummy for join) 取引先分類マスタ５（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp5() {
		return getConstString(offset + 27, $dummy_cst_grp5);
	}

	/**
	 * BP classification master 5 (Customer) (Dummy for join) 取引先分類マスタ５（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp5(String value) {
		setConstString(offset + 27, $dummy_cst_grp5, value);
	}


	/**
	 * BP classification master 6 (Customer) (Dummy for join) 取引先分類マスタ６（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp6() {
		return getConstString(offset + 28, $dummy_cst_grp6);
	}

	/**
	 * BP classification master 6 (Customer) (Dummy for join) 取引先分類マスタ６（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp6(String value) {
		setConstString(offset + 28, $dummy_cst_grp6, value);
	}


	/**
	 * BP classification master 7 (Customer) (Dummy for join) 取引先分類マスタ７（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp7() {
		return getConstString(offset + 29, $dummy_cst_grp7);
	}

	/**
	 * BP classification master 7 (Customer) (Dummy for join) 取引先分類マスタ７（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp7(String value) {
		setConstString(offset + 29, $dummy_cst_grp7, value);
	}


	/**
	 * BP classification master 8 (Customer) (Dummy for join) 取引先分類マスタ８（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp8() {
		return getConstString(offset + 30, $dummy_cst_grp8);
	}

	/**
	 * BP classification master 8 (Customer) (Dummy for join) 取引先分類マスタ８（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp8(String value) {
		setConstString(offset + 30, $dummy_cst_grp8, value);
	}


	/**
	 * BP classification master 9 (Customer) (Dummy for join) 取引先分類マスタ９（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp9() {
		return getConstString(offset + 31, $dummy_cst_grp9);
	}

	/**
	 * BP classification master 9 (Customer) (Dummy for join) 取引先分類マスタ９（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp9(String value) {
		setConstString(offset + 31, $dummy_cst_grp9, value);
	}


	/**
	 * BP classification master 10 (Customer) (Dummy for join) 取引先分類マスタ１０（得意先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_cst_grp10() {
		return getConstString(offset + 32, $dummy_cst_grp10);
	}

	/**
	 * BP classification master 10 (Customer) (Dummy for join) 取引先分類マスタ１０（得意先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cst_grp10(String value) {
		setConstString(offset + 32, $dummy_cst_grp10, value);
	}


	/**
	 * BP classification master 1 (Delivery) (Dummy for join) 取引先分類マスタ１（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp1() {
		return getConstString(offset + 33, $dummy_dlv_grp1);
	}

	/**
	 * BP classification master 1 (Delivery) (Dummy for join) 取引先分類マスタ１（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp1(String value) {
		setConstString(offset + 33, $dummy_dlv_grp1, value);
	}


	/**
	 * BP classification master 2 (Delivery) (Dummy for join) 取引先分類マスタ２（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp2() {
		return getConstString(offset + 34, $dummy_dlv_grp2);
	}

	/**
	 * BP classification master 2 (Delivery) (Dummy for join) 取引先分類マスタ２（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp2(String value) {
		setConstString(offset + 34, $dummy_dlv_grp2, value);
	}


	/**
	 * BP classification master 3 (Delivery) (Dummy for join) 取引先分類マスタ３（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp3() {
		return getConstString(offset + 35, $dummy_dlv_grp3);
	}

	/**
	 * BP classification master 3 (Delivery) (Dummy for join) 取引先分類マスタ３（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp3(String value) {
		setConstString(offset + 35, $dummy_dlv_grp3, value);
	}


	/**
	 * BP classification master 4 (Delivery) (Dummy for join) 取引先分類マスタ４（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp4() {
		return getConstString(offset + 36, $dummy_dlv_grp4);
	}

	/**
	 * BP classification master 4 (Delivery) (Dummy for join) 取引先分類マスタ４（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp4(String value) {
		setConstString(offset + 36, $dummy_dlv_grp4, value);
	}


	/**
	 * BP classification master 5 (Delivery) (Dummy for join) 取引先分類マスタ５（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp5() {
		return getConstString(offset + 37, $dummy_dlv_grp5);
	}

	/**
	 * BP classification master 5 (Delivery) (Dummy for join) 取引先分類マスタ５（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp5(String value) {
		setConstString(offset + 37, $dummy_dlv_grp5, value);
	}


	/**
	 * BP classification master 6 (Delivery) (Dummy for join) 取引先分類マスタ６（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp6() {
		return getConstString(offset + 38, $dummy_dlv_grp6);
	}

	/**
	 * BP classification master 6 (Delivery) (Dummy for join) 取引先分類マスタ６（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp6(String value) {
		setConstString(offset + 38, $dummy_dlv_grp6, value);
	}


	/**
	 * BP classification master 7 (Delivery) (Dummy for join) 取引先分類マスタ７（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp7() {
		return getConstString(offset + 39, $dummy_dlv_grp7);
	}

	/**
	 * BP classification master 7 (Delivery) (Dummy for join) 取引先分類マスタ７（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp7(String value) {
		setConstString(offset + 39, $dummy_dlv_grp7, value);
	}


	/**
	 * BP classification master 8 (Delivery) (Dummy for join) 取引先分類マスタ８（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp8() {
		return getConstString(offset + 40, $dummy_dlv_grp8);
	}

	/**
	 * BP classification master 8 (Delivery) (Dummy for join) 取引先分類マスタ８（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp8(String value) {
		setConstString(offset + 40, $dummy_dlv_grp8, value);
	}


	/**
	 * BP classification master 9 (Delivery) (Dummy for join) 取引先分類マスタ９（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp9() {
		return getConstString(offset + 41, $dummy_dlv_grp9);
	}

	/**
	 * BP classification master 9 (Delivery) (Dummy for join) 取引先分類マスタ９（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp9(String value) {
		setConstString(offset + 41, $dummy_dlv_grp9, value);
	}


	/**
	 * BP classification master 10 (Delivery) (Dummy for join) 取引先分類マスタ１０（納品先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_dlv_grp10() {
		return getConstString(offset + 42, $dummy_dlv_grp10);
	}

	/**
	 * BP classification master 10 (Delivery) (Dummy for join) 取引先分類マスタ１０（納品先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_dlv_grp10(String value) {
		setConstString(offset + 42, $dummy_dlv_grp10, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_cst_grp1.equalsIgnoreCase(name)) {
			return dummy_cst_grp1();
		}
		if ($dummy_cst_grp2.equalsIgnoreCase(name)) {
			return dummy_cst_grp2();
		}
		if ($dummy_cst_grp3.equalsIgnoreCase(name)) {
			return dummy_cst_grp3();
		}
		if ($dummy_cst_grp4.equalsIgnoreCase(name)) {
			return dummy_cst_grp4();
		}
		if ($dummy_cst_grp5.equalsIgnoreCase(name)) {
			return dummy_cst_grp5();
		}
		if ($dummy_cst_grp6.equalsIgnoreCase(name)) {
			return dummy_cst_grp6();
		}
		if ($dummy_cst_grp7.equalsIgnoreCase(name)) {
			return dummy_cst_grp7();
		}
		if ($dummy_cst_grp8.equalsIgnoreCase(name)) {
			return dummy_cst_grp8();
		}
		if ($dummy_cst_grp9.equalsIgnoreCase(name)) {
			return dummy_cst_grp9();
		}
		if ($dummy_cst_grp10.equalsIgnoreCase(name)) {
			return dummy_cst_grp10();
		}
		if ($dummy_dlv_grp1.equalsIgnoreCase(name)) {
			return dummy_dlv_grp1();
		}
		if ($dummy_dlv_grp2.equalsIgnoreCase(name)) {
			return dummy_dlv_grp2();
		}
		if ($dummy_dlv_grp3.equalsIgnoreCase(name)) {
			return dummy_dlv_grp3();
		}
		if ($dummy_dlv_grp4.equalsIgnoreCase(name)) {
			return dummy_dlv_grp4();
		}
		if ($dummy_dlv_grp5.equalsIgnoreCase(name)) {
			return dummy_dlv_grp5();
		}
		if ($dummy_dlv_grp6.equalsIgnoreCase(name)) {
			return dummy_dlv_grp6();
		}
		if ($dummy_dlv_grp7.equalsIgnoreCase(name)) {
			return dummy_dlv_grp7();
		}
		if ($dummy_dlv_grp8.equalsIgnoreCase(name)) {
			return dummy_dlv_grp8();
		}
		if ($dummy_dlv_grp9.equalsIgnoreCase(name)) {
			return dummy_dlv_grp9();
		}
		if ($dummy_dlv_grp10.equalsIgnoreCase(name)) {
			return dummy_dlv_grp10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_cst_grp1.equalsIgnoreCase(name)) {
			return dummy_cst_grp1();
		}
		if ($dummy_cst_grp2.equalsIgnoreCase(name)) {
			return dummy_cst_grp2();
		}
		if ($dummy_cst_grp3.equalsIgnoreCase(name)) {
			return dummy_cst_grp3();
		}
		if ($dummy_cst_grp4.equalsIgnoreCase(name)) {
			return dummy_cst_grp4();
		}
		if ($dummy_cst_grp5.equalsIgnoreCase(name)) {
			return dummy_cst_grp5();
		}
		if ($dummy_cst_grp6.equalsIgnoreCase(name)) {
			return dummy_cst_grp6();
		}
		if ($dummy_cst_grp7.equalsIgnoreCase(name)) {
			return dummy_cst_grp7();
		}
		if ($dummy_cst_grp8.equalsIgnoreCase(name)) {
			return dummy_cst_grp8();
		}
		if ($dummy_cst_grp9.equalsIgnoreCase(name)) {
			return dummy_cst_grp9();
		}
		if ($dummy_cst_grp10.equalsIgnoreCase(name)) {
			return dummy_cst_grp10();
		}
		if ($dummy_dlv_grp1.equalsIgnoreCase(name)) {
			return dummy_dlv_grp1();
		}
		if ($dummy_dlv_grp2.equalsIgnoreCase(name)) {
			return dummy_dlv_grp2();
		}
		if ($dummy_dlv_grp3.equalsIgnoreCase(name)) {
			return dummy_dlv_grp3();
		}
		if ($dummy_dlv_grp4.equalsIgnoreCase(name)) {
			return dummy_dlv_grp4();
		}
		if ($dummy_dlv_grp5.equalsIgnoreCase(name)) {
			return dummy_dlv_grp5();
		}
		if ($dummy_dlv_grp6.equalsIgnoreCase(name)) {
			return dummy_dlv_grp6();
		}
		if ($dummy_dlv_grp7.equalsIgnoreCase(name)) {
			return dummy_dlv_grp7();
		}
		if ($dummy_dlv_grp8.equalsIgnoreCase(name)) {
			return dummy_dlv_grp8();
		}
		if ($dummy_dlv_grp9.equalsIgnoreCase(name)) {
			return dummy_dlv_grp9();
		}
		if ($dummy_dlv_grp10.equalsIgnoreCase(name)) {
			return dummy_dlv_grp10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_cst_grp1.equalsIgnoreCase(name)) {
			dummy_cst_grp1(value);
			return;
		}
		if ($dummy_cst_grp2.equalsIgnoreCase(name)) {
			dummy_cst_grp2(value);
			return;
		}
		if ($dummy_cst_grp3.equalsIgnoreCase(name)) {
			dummy_cst_grp3(value);
			return;
		}
		if ($dummy_cst_grp4.equalsIgnoreCase(name)) {
			dummy_cst_grp4(value);
			return;
		}
		if ($dummy_cst_grp5.equalsIgnoreCase(name)) {
			dummy_cst_grp5(value);
			return;
		}
		if ($dummy_cst_grp6.equalsIgnoreCase(name)) {
			dummy_cst_grp6(value);
			return;
		}
		if ($dummy_cst_grp7.equalsIgnoreCase(name)) {
			dummy_cst_grp7(value);
			return;
		}
		if ($dummy_cst_grp8.equalsIgnoreCase(name)) {
			dummy_cst_grp8(value);
			return;
		}
		if ($dummy_cst_grp9.equalsIgnoreCase(name)) {
			dummy_cst_grp9(value);
			return;
		}
		if ($dummy_cst_grp10.equalsIgnoreCase(name)) {
			dummy_cst_grp10(value);
			return;
		}
		if ($dummy_dlv_grp1.equalsIgnoreCase(name)) {
			dummy_dlv_grp1(value);
			return;
		}
		if ($dummy_dlv_grp2.equalsIgnoreCase(name)) {
			dummy_dlv_grp2(value);
			return;
		}
		if ($dummy_dlv_grp3.equalsIgnoreCase(name)) {
			dummy_dlv_grp3(value);
			return;
		}
		if ($dummy_dlv_grp4.equalsIgnoreCase(name)) {
			dummy_dlv_grp4(value);
			return;
		}
		if ($dummy_dlv_grp5.equalsIgnoreCase(name)) {
			dummy_dlv_grp5(value);
			return;
		}
		if ($dummy_dlv_grp6.equalsIgnoreCase(name)) {
			dummy_dlv_grp6(value);
			return;
		}
		if ($dummy_dlv_grp7.equalsIgnoreCase(name)) {
			dummy_dlv_grp7(value);
			return;
		}
		if ($dummy_dlv_grp8.equalsIgnoreCase(name)) {
			dummy_dlv_grp8(value);
			return;
		}
		if ($dummy_dlv_grp9.equalsIgnoreCase(name)) {
			dummy_dlv_grp9(value);
			return;
		}
		if ($dummy_dlv_grp10.equalsIgnoreCase(name)) {
			dummy_dlv_grp10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_cst_grp1.equalsIgnoreCase(name)) {
			dummy_cst_grp1(value);
			return;
		}
		if ($dummy_cst_grp2.equalsIgnoreCase(name)) {
			dummy_cst_grp2(value);
			return;
		}
		if ($dummy_cst_grp3.equalsIgnoreCase(name)) {
			dummy_cst_grp3(value);
			return;
		}
		if ($dummy_cst_grp4.equalsIgnoreCase(name)) {
			dummy_cst_grp4(value);
			return;
		}
		if ($dummy_cst_grp5.equalsIgnoreCase(name)) {
			dummy_cst_grp5(value);
			return;
		}
		if ($dummy_cst_grp6.equalsIgnoreCase(name)) {
			dummy_cst_grp6(value);
			return;
		}
		if ($dummy_cst_grp7.equalsIgnoreCase(name)) {
			dummy_cst_grp7(value);
			return;
		}
		if ($dummy_cst_grp8.equalsIgnoreCase(name)) {
			dummy_cst_grp8(value);
			return;
		}
		if ($dummy_cst_grp9.equalsIgnoreCase(name)) {
			dummy_cst_grp9(value);
			return;
		}
		if ($dummy_cst_grp10.equalsIgnoreCase(name)) {
			dummy_cst_grp10(value);
			return;
		}
		if ($dummy_dlv_grp1.equalsIgnoreCase(name)) {
			dummy_dlv_grp1(value);
			return;
		}
		if ($dummy_dlv_grp2.equalsIgnoreCase(name)) {
			dummy_dlv_grp2(value);
			return;
		}
		if ($dummy_dlv_grp3.equalsIgnoreCase(name)) {
			dummy_dlv_grp3(value);
			return;
		}
		if ($dummy_dlv_grp4.equalsIgnoreCase(name)) {
			dummy_dlv_grp4(value);
			return;
		}
		if ($dummy_dlv_grp5.equalsIgnoreCase(name)) {
			dummy_dlv_grp5(value);
			return;
		}
		if ($dummy_dlv_grp6.equalsIgnoreCase(name)) {
			dummy_dlv_grp6(value);
			return;
		}
		if ($dummy_dlv_grp7.equalsIgnoreCase(name)) {
			dummy_dlv_grp7(value);
			return;
		}
		if ($dummy_dlv_grp8.equalsIgnoreCase(name)) {
			dummy_dlv_grp8(value);
			return;
		}
		if ($dummy_dlv_grp9.equalsIgnoreCase(name)) {
			dummy_dlv_grp9(value);
			return;
		}
		if ($dummy_dlv_grp10.equalsIgnoreCase(name)) {
			dummy_dlv_grp10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

