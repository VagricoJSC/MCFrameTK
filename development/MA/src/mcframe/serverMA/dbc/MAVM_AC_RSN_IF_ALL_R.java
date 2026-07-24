package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "会計理由マスタ送信ＩＦ // Accounting reason master"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名</td>
 *  	<td>Accounting reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール１）</td>
 *  	<td>Accounting reason name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール２）</td>
 *  	<td>Accounting reason name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール３）</td>
 *  	<td>Accounting reason name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール４）</td>
 *  	<td>Accounting reason name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由名（ロケール５）</td>
 *  	<td>Accounting reason name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権区分</td>
 *  	<td>AR type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務区分</td>
 *  	<td>AP type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳対象外ＦＬＧ</td>
 *  	<td>Not for journal flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価対象外ＦＬＧ</td>
 *  	<td>Not costing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_AC_RSN_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_AC_RSN_IF_ALL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	private static final MCPermColumnInfo _ac_rsn_nm = createColumnInfo("ac_rsn_nm");
	public final MCStringPermColumn ac_rsn_nm = createStringColumn(_ac_rsn_nm);
	
	/**
	 * 会計理由名（ロケール１）. Accounting reason name (Locale 1).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl1 = "ac_rsn_nm_lcl1";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl1 = createColumnInfo("ac_rsn_nm_lcl1");
	public final MCStringPermColumn ac_rsn_nm_lcl1 = createStringColumn(_ac_rsn_nm_lcl1);
	
	/**
	 * 会計理由名（ロケール２）. Accounting reason name (Locale 2).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl2 = "ac_rsn_nm_lcl2";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl2 = createColumnInfo("ac_rsn_nm_lcl2");
	public final MCStringPermColumn ac_rsn_nm_lcl2 = createStringColumn(_ac_rsn_nm_lcl2);
	
	/**
	 * 会計理由名（ロケール３）. Accounting reason name (Locale 3).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl3 = "ac_rsn_nm_lcl3";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl3 = createColumnInfo("ac_rsn_nm_lcl3");
	public final MCStringPermColumn ac_rsn_nm_lcl3 = createStringColumn(_ac_rsn_nm_lcl3);
	
	/**
	 * 会計理由名（ロケール４）. Accounting reason name (Locale 4).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl4 = "ac_rsn_nm_lcl4";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl4 = createColumnInfo("ac_rsn_nm_lcl4");
	public final MCStringPermColumn ac_rsn_nm_lcl4 = createStringColumn(_ac_rsn_nm_lcl4);
	
	/**
	 * 会計理由名（ロケール５）. Accounting reason name (Locale 5).<p>
	 *
	 */
	public static final String $ac_rsn_nm_lcl5 = "ac_rsn_nm_lcl5";
	private static final MCPermColumnInfo _ac_rsn_nm_lcl5 = createColumnInfo("ac_rsn_nm_lcl5");
	public final MCStringPermColumn ac_rsn_nm_lcl5 = createStringColumn(_ac_rsn_nm_lcl5);
	
	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	private static final MCPermColumnInfo _ar_typ = createColumnInfo("ar_typ");
	public final MCStringPermColumn ar_typ = createStringColumn(_ar_typ);
	
	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	private static final MCPermColumnInfo _ap_typ = createColumnInfo("ap_typ");
	public final MCStringPermColumn ap_typ = createStringColumn(_ap_typ);
	
	/**
	 * 仕訳対象外ＦＬＧ. Not for journal flg..<p>
	 *
	 */
	public static final String $ac_invalid_flg = "ac_invalid_flg";
	private static final MCPermColumnInfo _ac_invalid_flg = createColumnInfo("ac_invalid_flg");
	public final MCBooleanPermColumn ac_invalid_flg = createBooleanColumn(_ac_invalid_flg);
	
	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public static final String $cost_invalid_flg = "cost_invalid_flg";
	private static final MCPermColumnInfo _cost_invalid_flg = createColumnInfo("cost_invalid_flg");
	public final MCBooleanPermColumn cost_invalid_flg = createBooleanColumn(_cost_invalid_flg);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl1_META = createCommonMeta($ac_rsn_nm_lcl1, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl2_META = createCommonMeta($ac_rsn_nm_lcl2, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl3_META = createCommonMeta($ac_rsn_nm_lcl3, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl4_META = createCommonMeta($ac_rsn_nm_lcl4, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ac_rsn_nm_lcl5_META = createCommonMeta($ac_rsn_nm_lcl5, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ac_invalid_flg_META = createCommonMeta($ac_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_invalid_flg_META = createCommonMeta($cost_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_AC_RSN_IF_ALL_R> constMetas = new ConstMetaList<MAVM_AC_RSN_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			ac_rsn_nm_lcl1_META,
			ac_rsn_nm_lcl2_META,
			ac_rsn_nm_lcl3_META,
			ac_rsn_nm_lcl4_META,
			ac_rsn_nm_lcl5_META,
			ar_typ_META,
			ap_typ_META,
			ac_invalid_flg_META,
			cost_invalid_flg_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected MAVM_AC_RSN_IF_ALL_R(ConstMetaList<? extends MAVM_AC_RSN_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_AC_RSN_IF_ALL_R(ConstMetaList<? extends MAVM_AC_RSN_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm,
				"ac_rsn_nm",
				ac_rsn_nm,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl1,
				"ac_rsn_nm_lcl1",
				ac_rsn_nm_lcl1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl2,
				"ac_rsn_nm_lcl2",
				ac_rsn_nm_lcl2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl3,
				"ac_rsn_nm_lcl3",
				ac_rsn_nm_lcl3,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl4,
				"ac_rsn_nm_lcl4",
				ac_rsn_nm_lcl4,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ac_rsn_nm_lcl5,
				"ac_rsn_nm_lcl5",
				ac_rsn_nm_lcl5,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ar_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ar_typ,
				"ar_typ",
				ar_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ap_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$ap_typ,
				"ap_typ",
				ap_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$ac_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_AC_RSN_IF_ALL_R.$ac_invalid_flg,
				"ac_invalid_flg",
				ac_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$cost_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_AC_RSN_IF_ALL_R.$cost_invalid_flg,
				"cost_invalid_flg",
				cost_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_AC_RSN_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_AC_RSN_IF_ALL_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
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
	public static MAVM_AC_RSN_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_AC_RSN_IF_ALL_R create(String alias) {
		MAVM_AC_RSN_IF_ALL_R row = new MAVM_AC_RSN_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_AC_RSN_IF_ALL_R createByName(T proto) {
		MAVM_AC_RSN_IF_ALL_R row = MAVM_AC_RSN_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_AC_RSN_IF_ALL_R clone() {
		return (MAVM_AC_RSN_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_AC_RSN_IF_ALL_R createInstance() {
		return (MAVM_AC_RSN_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_AC_RSN_IF_ALL_R getValues(String... names) {
		return (MAVM_AC_RSN_IF_ALL_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 1, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 1, $ac_rsn_cd, value);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 2, $ac_rsn_nm);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 2, $ac_rsn_nm, value);
	}

	/**
	 * 会計理由名（ロケール１）. Accounting reason name (Locale 1).<p>
	 *
	 */
	public String ac_rsn_nm_lcl1() {
		return getConstString(offset + 3, $ac_rsn_nm_lcl1);
	}

	/**
	 * 会計理由名（ロケール１）. Accounting reason name (Locale 1).<p>
	 *
	 */
	public void ac_rsn_nm_lcl1(String value) {
		setConstString(offset + 3, $ac_rsn_nm_lcl1, value);
	}

	/**
	 * 会計理由名（ロケール２）. Accounting reason name (Locale 2).<p>
	 *
	 */
	public String ac_rsn_nm_lcl2() {
		return getConstString(offset + 4, $ac_rsn_nm_lcl2);
	}

	/**
	 * 会計理由名（ロケール２）. Accounting reason name (Locale 2).<p>
	 *
	 */
	public void ac_rsn_nm_lcl2(String value) {
		setConstString(offset + 4, $ac_rsn_nm_lcl2, value);
	}

	/**
	 * 会計理由名（ロケール３）. Accounting reason name (Locale 3).<p>
	 *
	 */
	public String ac_rsn_nm_lcl3() {
		return getConstString(offset + 5, $ac_rsn_nm_lcl3);
	}

	/**
	 * 会計理由名（ロケール３）. Accounting reason name (Locale 3).<p>
	 *
	 */
	public void ac_rsn_nm_lcl3(String value) {
		setConstString(offset + 5, $ac_rsn_nm_lcl3, value);
	}

	/**
	 * 会計理由名（ロケール４）. Accounting reason name (Locale 4).<p>
	 *
	 */
	public String ac_rsn_nm_lcl4() {
		return getConstString(offset + 6, $ac_rsn_nm_lcl4);
	}

	/**
	 * 会計理由名（ロケール４）. Accounting reason name (Locale 4).<p>
	 *
	 */
	public void ac_rsn_nm_lcl4(String value) {
		setConstString(offset + 6, $ac_rsn_nm_lcl4, value);
	}

	/**
	 * 会計理由名（ロケール５）. Accounting reason name (Locale 5).<p>
	 *
	 */
	public String ac_rsn_nm_lcl5() {
		return getConstString(offset + 7, $ac_rsn_nm_lcl5);
	}

	/**
	 * 会計理由名（ロケール５）. Accounting reason name (Locale 5).<p>
	 *
	 */
	public void ac_rsn_nm_lcl5(String value) {
		setConstString(offset + 7, $ac_rsn_nm_lcl5, value);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 8, $ar_typ);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 8, $ar_typ, value);
	}

	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 9, $ap_typ);
	}

	/**
	 * 債務区分. AP type.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 9, $ap_typ, value);
	}

	/**
	 * 仕訳対象外ＦＬＧ. Not for journal flg..<p>
	 *
	 */
	public boolean ac_invalid_flg() {
		return getConstBoolean(offset + 10, $ac_invalid_flg);
	}

	/**
	 * 仕訳対象外ＦＬＧ. Not for journal flg..<p>
	 *
	 */
	public void ac_invalid_flg(boolean value) {
		setConstBoolean(offset + 10, $ac_invalid_flg, value);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public boolean cost_invalid_flg() {
		return getConstBoolean(offset + 11, $cost_invalid_flg);
	}

	/**
	 * 原価対象外ＦＬＧ. Not costing flg..<p>
	 *
	 */
	public void cost_invalid_flg(boolean value) {
		setConstBoolean(offset + 11, $cost_invalid_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 12, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 12, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 13, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 13, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 14, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 14, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl1();
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl2();
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl3();
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl4();
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl5();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
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
		return super.getString(name);
	}

	public boolean getBoolean(String name) {
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			return ac_invalid_flg();
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			return cost_invalid_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl1();
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl2();
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl3();
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl4();
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			return ac_rsn_nm_lcl5();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
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
		return super.getStringNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			return ac_invalid_flg();
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			return cost_invalid_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl1(value);
			return;
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl2(value);
			return;
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl3(value);
			return;
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl4(value);
			return;
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl5(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
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
		super.setString(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			ac_invalid_flg(value);
			return;
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			cost_invalid_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($ac_rsn_nm_lcl1.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl1(value);
			return;
		}
		if ($ac_rsn_nm_lcl2.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl2(value);
			return;
		}
		if ($ac_rsn_nm_lcl3.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl3(value);
			return;
		}
		if ($ac_rsn_nm_lcl4.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl4(value);
			return;
		}
		if ($ac_rsn_nm_lcl5.equalsIgnoreCase(name)) {
			ac_rsn_nm_lcl5(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
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
		super.setStringNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($ac_invalid_flg.equalsIgnoreCase(name)) {
			ac_invalid_flg(value);
			return;
		}
		if ($cost_invalid_flg.equalsIgnoreCase(name)) {
			cost_invalid_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
