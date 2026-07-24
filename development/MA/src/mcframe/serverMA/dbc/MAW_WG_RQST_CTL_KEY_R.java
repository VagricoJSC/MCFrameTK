package mcframe.serverMA.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "ワーキンググループ間依頼制御マスタ // Inventory request from other WG control master"PKワークテーブルDBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>to_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼先ワーキンググループＣＤ</td>
 *  	<td>Requested WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>fr_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼元ワーキンググループＣＤ</td>
 *  	<td>Requesting WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_rqst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループ間依頼種類区分</td>
 *  	<td>Type of inventory request from other WG</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>fr_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>依頼元部門ＣＤ</td>
 *  	<td>Requesting dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_WG_RQST_CTL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_WG_RQST_CTL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 依頼先ワーキンググループＣＤ. Requested WG cd..<p>
	 *
	 */
	public static final String $to_wg_cd = "to_wg_cd";
	private static final MCPermColumnInfo _to_wg_cd = createColumnInfo("to_wg_cd");
	public final MCStringPermColumn to_wg_cd = createStringColumn(_to_wg_cd);
	
	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public static final String $fr_wg_cd = "fr_wg_cd";
	private static final MCPermColumnInfo _fr_wg_cd = createColumnInfo("fr_wg_cd");
	public final MCStringPermColumn fr_wg_cd = createStringColumn(_fr_wg_cd);
	
	/**
	 * ワーキンググループ間依頼種類区分. Type of inventory request from other WG.<p>
	 *
	 */
	public static final String $wg_rqst_typ = "wg_rqst_typ";
	private static final MCPermColumnInfo _wg_rqst_typ = createColumnInfo("wg_rqst_typ");
	public final MCStringPermColumn wg_rqst_typ = createStringColumn(_wg_rqst_typ);
	
	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public static final String $fr_dpt_cd = "fr_dpt_cd";
	private static final MCPermColumnInfo _fr_dpt_cd = createColumnInfo("fr_dpt_cd");
	public final MCStringPermColumn fr_dpt_cd = createStringColumn(_fr_dpt_cd);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	public static final MCMeta to_wg_cd_META = createCommonMeta($to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta fr_wg_cd_META = createCommonMeta($fr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_rqst_typ_META = createCommonMeta($wg_rqst_typ, mcframe.commonMA.meta.MA_META.WG_RQST_TYP);
	public static final MCMeta fr_dpt_cd_META = createCommonMeta($fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_WG_RQST_CTL_KEY_R> constMetas = new ConstMetaList<MAW_WG_RQST_CTL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			to_wg_cd_META,
			fr_wg_cd_META,
			wg_rqst_typ_META,
			fr_dpt_cd_META,
			cst_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected MAW_WG_RQST_CTL_KEY_R(ConstMetaList<? extends MAW_WG_RQST_CTL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_WG_RQST_CTL_KEY_R(ConstMetaList<? extends MAW_WG_RQST_CTL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$to_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$to_wg_cd,
				"to_wg_cd",
				to_wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$fr_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$fr_wg_cd,
				"fr_wg_cd",
				fr_wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$wg_rqst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$wg_rqst_typ,
				"wg_rqst_typ",
				wg_rqst_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$fr_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$fr_dpt_cd,
				"fr_dpt_cd",
				fr_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$cst_cd,
				"cst_cd",
				cst_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_WG_RQST_CTL_KEY_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_WG_RQST_CTL_KEY_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_WG_RQST_CTL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_WG_RQST_CTL_KEY_R create(String alias) {
		MAW_WG_RQST_CTL_KEY_R row = new MAW_WG_RQST_CTL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_WG_RQST_CTL_KEY_R createByName(T proto) {
		MAW_WG_RQST_CTL_KEY_R row = MAW_WG_RQST_CTL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_WG_RQST_CTL_KEY_R clone() {
		return (MAW_WG_RQST_CTL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_WG_RQST_CTL_KEY_R createInstance() {
		return (MAW_WG_RQST_CTL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_WG_RQST_CTL_KEY_R getValues(String... names) {
		return (MAW_WG_RQST_CTL_KEY_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 依頼先ワーキンググループＣＤ. Requested WG cd..<p>
	 *
	 */
	public String to_wg_cd() {
		return getConstString(offset + 0, $to_wg_cd);
	}

	/**
	 * 依頼先ワーキンググループＣＤ. Requested WG cd..<p>
	 *
	 */
	public void to_wg_cd(String value) {
		setConstString(offset + 0, $to_wg_cd, value);
	}

	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public String fr_wg_cd() {
		return getConstString(offset + 1, $fr_wg_cd);
	}

	/**
	 * 依頼元ワーキンググループＣＤ. Requesting WG cd..<p>
	 *
	 */
	public void fr_wg_cd(String value) {
		setConstString(offset + 1, $fr_wg_cd, value);
	}

	/**
	 * ワーキンググループ間依頼種類区分. Type of inventory request from other WG.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return getConstString(offset + 2, $wg_rqst_typ);
	}

	/**
	 * ワーキンググループ間依頼種類区分. Type of inventory request from other WG.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		setConstString(offset + 2, $wg_rqst_typ, value);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public String fr_dpt_cd() {
		return getConstString(offset + 3, $fr_dpt_cd);
	}

	/**
	 * 依頼元部門ＣＤ. Requesting dept. cd..<p>
	 *
	 */
	public void fr_dpt_cd(String value) {
		setConstString(offset + 3, $fr_dpt_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 4, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 4, $cst_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}

	public String getString(String name) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			return to_wg_cd();
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			return fr_wg_cd();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($fr_dpt_cd.equalsIgnoreCase(name)) {
			return fr_dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			return to_wg_cd();
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			return fr_wg_cd();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($fr_dpt_cd.equalsIgnoreCase(name)) {
			return fr_dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			to_wg_cd(value);
			return;
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			fr_wg_cd(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($fr_dpt_cd.equalsIgnoreCase(name)) {
			fr_dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($to_wg_cd.equalsIgnoreCase(name)) {
			to_wg_cd(value);
			return;
		}
		if ($fr_wg_cd.equalsIgnoreCase(name)) {
			fr_wg_cd(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($fr_dpt_cd.equalsIgnoreCase(name)) {
			fr_dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		super.setStringNE(name, value);
	}

}
