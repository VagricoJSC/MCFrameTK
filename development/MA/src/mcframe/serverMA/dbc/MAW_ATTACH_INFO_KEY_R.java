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
 * "品目付加情報マスタ // Item additional info. master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>attach_info_key1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>付加情報キー１</td>
 *  	<td>Additional info. key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>attach_info_key2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>付加情報キー２</td>
 *  	<td>Additional info. key 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>attach_info_key3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>付加情報キー３</td>
 *  	<td>Additional info. key 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>attach_info_key4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>付加情報キー４</td>
 *  	<td>Additional info. key 4</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>attach_info_key5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>付加情報キー５</td>
 *  	<td>Additional info. key 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>attach_info_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>付加情報ＩＤ</td>
 *  	<td>Additional info. ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>attach_info_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>付加情報区分</td>
 *  	<td>Additional info. type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_ATTACH_INFO_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_ATTACH_INFO_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
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
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 付加情報キー１. Additional info. key 1.<p>
	 *
	 */
	public static final String $attach_info_key1 = "attach_info_key1";
	private static final MCPermColumnInfo _attach_info_key1 = createColumnInfo("attach_info_key1");
	public final MCStringPermColumn attach_info_key1 = createStringColumn(_attach_info_key1);
	
	/**
	 * 付加情報キー２. Additional info. key 2.<p>
	 *
	 */
	public static final String $attach_info_key2 = "attach_info_key2";
	private static final MCPermColumnInfo _attach_info_key2 = createColumnInfo("attach_info_key2");
	public final MCStringPermColumn attach_info_key2 = createStringColumn(_attach_info_key2);
	
	/**
	 * 付加情報キー３. Additional info. key 3.<p>
	 *
	 */
	public static final String $attach_info_key3 = "attach_info_key3";
	private static final MCPermColumnInfo _attach_info_key3 = createColumnInfo("attach_info_key3");
	public final MCStringPermColumn attach_info_key3 = createStringColumn(_attach_info_key3);
	
	/**
	 * 付加情報キー４. Additional info. key 4.<p>
	 *
	 */
	public static final String $attach_info_key4 = "attach_info_key4";
	private static final MCPermColumnInfo _attach_info_key4 = createColumnInfo("attach_info_key4");
	public final MCStringPermColumn attach_info_key4 = createStringColumn(_attach_info_key4);
	
	/**
	 * 付加情報キー５. Additional info. key 5.<p>
	 *
	 */
	public static final String $attach_info_key5 = "attach_info_key5";
	private static final MCPermColumnInfo _attach_info_key5 = createColumnInfo("attach_info_key5");
	public final MCStringPermColumn attach_info_key5 = createStringColumn(_attach_info_key5);
	
	/**
	 * 付加情報ＩＤ. Additional info. ID.<p>
	 *
	 */
	public static final String $attach_info_id = "attach_info_id";
	private static final MCPermColumnInfo _attach_info_id = createColumnInfo("attach_info_id");
	public final MCStringPermColumn attach_info_id = createStringColumn(_attach_info_id);
	
	/**
	 * 付加情報区分. Additional info. type.<p>
	 *
	 */
	public static final String $attach_info_typ = "attach_info_typ";
	private static final MCPermColumnInfo _attach_info_typ = createColumnInfo("attach_info_typ");
	public final MCStringPermColumn attach_info_typ = createStringColumn(_attach_info_typ);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta attach_info_key1_META = createCommonMeta($attach_info_key1, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY1);
	public static final MCMeta attach_info_key2_META = createCommonMeta($attach_info_key2, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY2);
	public static final MCMeta attach_info_key3_META = createCommonMeta($attach_info_key3, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY3);
	public static final MCMeta attach_info_key4_META = createCommonMeta($attach_info_key4, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY4);
	public static final MCMeta attach_info_key5_META = createCommonMeta($attach_info_key5, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY5);
	public static final MCMeta attach_info_id_META = createCommonMeta($attach_info_id, mcframe.commonMA.meta.MA_META.ATTACH_INFO_ID);
	public static final MCMeta attach_info_typ_META = createCommonMeta($attach_info_typ, mcframe.commonMA.meta.MA_META.ATTACH_INFO_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_ATTACH_INFO_KEY_R> constMetas = new ConstMetaList<MAW_ATTACH_INFO_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wg_cd_META,
			attach_info_key1_META,
			attach_info_key2_META,
			attach_info_key3_META,
			attach_info_key4_META,
			attach_info_key5_META,
			attach_info_id_META,
			attach_info_typ_META
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
	protected MAW_ATTACH_INFO_KEY_R(ConstMetaList<? extends MAW_ATTACH_INFO_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_ATTACH_INFO_KEY_R(ConstMetaList<? extends MAW_ATTACH_INFO_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$itm_cd,
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
			MAW_ATTACH_INFO_KEY_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$itm_sub1,
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
			MAW_ATTACH_INFO_KEY_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$itm_sub2,
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
			MAW_ATTACH_INFO_KEY_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$itm_sub3,
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
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$sno1,
				"sno1",
				sno1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$sno2,
				"sno2",
				sno2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$sno3,
				"sno3",
				sno3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$sno4,
				"sno4",
				sno4,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_key1,
				"attach_info_key1",
				attach_info_key1,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_key2,
				"attach_info_key2",
				attach_info_key2,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_key3,
				"attach_info_key3",
				attach_info_key3,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_key4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_key4,
				"attach_info_key4",
				attach_info_key4,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_key5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_key5,
				"attach_info_key5",
				attach_info_key5,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_id,
				"attach_info_id",
				attach_info_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ATTACH_INFO_KEY_R.$attach_info_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ATTACH_INFO_KEY_R.$attach_info_typ,
				"attach_info_typ",
				attach_info_typ,
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
	public static MAW_ATTACH_INFO_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_ATTACH_INFO_KEY_R create(String alias) {
		MAW_ATTACH_INFO_KEY_R row = new MAW_ATTACH_INFO_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_ATTACH_INFO_KEY_R createByName(T proto) {
		MAW_ATTACH_INFO_KEY_R row = MAW_ATTACH_INFO_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ATTACH_INFO_KEY_R clone() {
		return (MAW_ATTACH_INFO_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ATTACH_INFO_KEY_R createInstance() {
		return (MAW_ATTACH_INFO_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ATTACH_INFO_KEY_R getValues(String... names) {
		return (MAW_ATTACH_INFO_KEY_R) super.getValues(names);
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 4, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 4, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 5, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 5, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 6, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 6, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 7, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 7, $sno4, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}

	/**
	 * 付加情報キー１. Additional info. key 1.<p>
	 *
	 */
	public String attach_info_key1() {
		return getConstString(offset + 9, $attach_info_key1);
	}

	/**
	 * 付加情報キー１. Additional info. key 1.<p>
	 *
	 */
	public void attach_info_key1(String value) {
		setConstString(offset + 9, $attach_info_key1, value);
	}

	/**
	 * 付加情報キー２. Additional info. key 2.<p>
	 *
	 */
	public String attach_info_key2() {
		return getConstString(offset + 10, $attach_info_key2);
	}

	/**
	 * 付加情報キー２. Additional info. key 2.<p>
	 *
	 */
	public void attach_info_key2(String value) {
		setConstString(offset + 10, $attach_info_key2, value);
	}

	/**
	 * 付加情報キー３. Additional info. key 3.<p>
	 *
	 */
	public String attach_info_key3() {
		return getConstString(offset + 11, $attach_info_key3);
	}

	/**
	 * 付加情報キー３. Additional info. key 3.<p>
	 *
	 */
	public void attach_info_key3(String value) {
		setConstString(offset + 11, $attach_info_key3, value);
	}

	/**
	 * 付加情報キー４. Additional info. key 4.<p>
	 *
	 */
	public String attach_info_key4() {
		return getConstString(offset + 12, $attach_info_key4);
	}

	/**
	 * 付加情報キー４. Additional info. key 4.<p>
	 *
	 */
	public void attach_info_key4(String value) {
		setConstString(offset + 12, $attach_info_key4, value);
	}

	/**
	 * 付加情報キー５. Additional info. key 5.<p>
	 *
	 */
	public String attach_info_key5() {
		return getConstString(offset + 13, $attach_info_key5);
	}

	/**
	 * 付加情報キー５. Additional info. key 5.<p>
	 *
	 */
	public void attach_info_key5(String value) {
		setConstString(offset + 13, $attach_info_key5, value);
	}

	/**
	 * 付加情報ＩＤ. Additional info. ID.<p>
	 *
	 */
	public String attach_info_id() {
		return getConstString(offset + 14, $attach_info_id);
	}

	/**
	 * 付加情報ＩＤ. Additional info. ID.<p>
	 *
	 */
	public void attach_info_id(String value) {
		setConstString(offset + 14, $attach_info_id, value);
	}

	/**
	 * 付加情報区分. Additional info. type.<p>
	 *
	 */
	public String attach_info_typ() {
		return getConstString(offset + 15, $attach_info_typ);
	}

	/**
	 * 付加情報区分. Additional info. type.<p>
	 *
	 */
	public void attach_info_typ(String value) {
		setConstString(offset + 15, $attach_info_typ, value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			return attach_info_key1();
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			return attach_info_key2();
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			return attach_info_key3();
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			return attach_info_key4();
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			return attach_info_key5();
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			return attach_info_id();
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			return attach_info_typ();
		}
		return super.getString(name);
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			return attach_info_key1();
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			return attach_info_key2();
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			return attach_info_key3();
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			return attach_info_key4();
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			return attach_info_key5();
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			return attach_info_id();
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			return attach_info_typ();
		}
		return super.getStringNE(name);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			attach_info_key1(value);
			return;
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			attach_info_key2(value);
			return;
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			attach_info_key3(value);
			return;
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			attach_info_key4(value);
			return;
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			attach_info_key5(value);
			return;
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			attach_info_id(value);
			return;
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			attach_info_typ(value);
			return;
		}
		super.setString(name, value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			attach_info_key1(value);
			return;
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			attach_info_key2(value);
			return;
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			attach_info_key3(value);
			return;
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			attach_info_key4(value);
			return;
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			attach_info_key5(value);
			return;
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			attach_info_id(value);
			return;
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			attach_info_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
