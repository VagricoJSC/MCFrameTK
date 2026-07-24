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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "税マスタ送信ＩＦ // Tax master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名</td>
 *  	<td>Tax name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名（ロケール１）</td>
 *  	<td>Tax name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名（ロケール２）</td>
 *  	<td>Tax name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名（ロケール３）</td>
 *  	<td>Tax name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名（ロケール４）</td>
 *  	<td>Tax name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名（ロケール５）</td>
 *  	<td>Tax name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税区分</td>
 *  	<td>Tax type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inc_tax_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税ＦＬＧ</td>
 *  	<td>Tax inclusive flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税率</td>
 *  	<td>Tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上ＦＬＧ</td>
 *  	<td>Sales flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入ＦＬＧ</td>
 *  	<td>Purchase flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給ＦＬＧ</td>
 *  	<td>Supply flg.</td>
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
public class MAVM_TAX_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_TAX_IF_ALL";

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
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	private static final MCPermColumnInfo _tax_nm = createColumnInfo("tax_nm");
	public final MCStringPermColumn tax_nm = createStringColumn(_tax_nm);
	
	/**
	 * 税名（ロケール１）. Tax name (Locale 1).<p>
	 *
	 */
	public static final String $tax_nm_lcl1 = "tax_nm_lcl1";
	private static final MCPermColumnInfo _tax_nm_lcl1 = createColumnInfo("tax_nm_lcl1");
	public final MCStringPermColumn tax_nm_lcl1 = createStringColumn(_tax_nm_lcl1);
	
	/**
	 * 税名（ロケール２）. Tax name (Locale 2).<p>
	 *
	 */
	public static final String $tax_nm_lcl2 = "tax_nm_lcl2";
	private static final MCPermColumnInfo _tax_nm_lcl2 = createColumnInfo("tax_nm_lcl2");
	public final MCStringPermColumn tax_nm_lcl2 = createStringColumn(_tax_nm_lcl2);
	
	/**
	 * 税名（ロケール３）. Tax name (Locale 3).<p>
	 *
	 */
	public static final String $tax_nm_lcl3 = "tax_nm_lcl3";
	private static final MCPermColumnInfo _tax_nm_lcl3 = createColumnInfo("tax_nm_lcl3");
	public final MCStringPermColumn tax_nm_lcl3 = createStringColumn(_tax_nm_lcl3);
	
	/**
	 * 税名（ロケール４）. Tax name (Locale 4).<p>
	 *
	 */
	public static final String $tax_nm_lcl4 = "tax_nm_lcl4";
	private static final MCPermColumnInfo _tax_nm_lcl4 = createColumnInfo("tax_nm_lcl4");
	public final MCStringPermColumn tax_nm_lcl4 = createStringColumn(_tax_nm_lcl4);
	
	/**
	 * 税名（ロケール５）. Tax name (Locale 5).<p>
	 *
	 */
	public static final String $tax_nm_lcl5 = "tax_nm_lcl5";
	private static final MCPermColumnInfo _tax_nm_lcl5 = createColumnInfo("tax_nm_lcl5");
	public final MCStringPermColumn tax_nm_lcl5 = createStringColumn(_tax_nm_lcl5);
	
	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	private static final MCPermColumnInfo _tax_typ = createColumnInfo("tax_typ");
	public final MCStringPermColumn tax_typ = createStringColumn(_tax_typ);
	
	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	private static final MCPermColumnInfo _inc_tax_flg = createColumnInfo("inc_tax_flg");
	public final MCBooleanPermColumn inc_tax_flg = createBooleanColumn(_inc_tax_flg);
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	private static final MCPermColumnInfo _tax_rate = createColumnInfo("tax_rate");
	public final MCNumberPermColumn tax_rate = createNumberColumn(_tax_rate);
	
	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	private static final MCPermColumnInfo _sls_flg = createColumnInfo("sls_flg");
	public final MCBooleanPermColumn sls_flg = createBooleanColumn(_sls_flg);
	
	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	private static final MCPermColumnInfo _purc_flg = createColumnInfo("purc_flg");
	public final MCBooleanPermColumn purc_flg = createBooleanColumn(_purc_flg);
	
	/**
	 * 支給ＦＬＧ. Supply flg..<p>
	 *
	 */
	public static final String $prov_flg = "prov_flg";
	private static final MCPermColumnInfo _prov_flg = createColumnInfo("prov_flg");
	public final MCBooleanPermColumn prov_flg = createBooleanColumn(_prov_flg);
	
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
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_nm_lcl1_META = createCommonMeta($tax_nm_lcl1, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_nm_lcl2_META = createCommonMeta($tax_nm_lcl2, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_nm_lcl3_META = createCommonMeta($tax_nm_lcl3, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_nm_lcl4_META = createCommonMeta($tax_nm_lcl4, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_nm_lcl5_META = createCommonMeta($tax_nm_lcl5, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_TAX_IF_ALL_R> constMetas = new ConstMetaList<MAVM_TAX_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			tax_cd_META,
			tax_nm_META,
			tax_nm_lcl1_META,
			tax_nm_lcl2_META,
			tax_nm_lcl3_META,
			tax_nm_lcl4_META,
			tax_nm_lcl5_META,
			tax_typ_META,
			inc_tax_flg_META,
			tax_rate_META,
			sls_flg_META,
			purc_flg_META,
			prov_flg_META,
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
	protected MAVM_TAX_IF_ALL_R(ConstMetaList<? extends MAVM_TAX_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_TAX_IF_ALL_R(ConstMetaList<? extends MAVM_TAX_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$co_cd,
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
			MAVM_TAX_IF_ALL_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_cd,
				"tax_cd",
				tax_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_nm,
				"tax_nm",
				tax_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_nm_lcl1,
				"tax_nm_lcl1",
				tax_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_nm_lcl2,
				"tax_nm_lcl2",
				tax_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_nm_lcl3,
				"tax_nm_lcl3",
				tax_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_nm_lcl4,
				"tax_nm_lcl4",
				tax_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_nm_lcl5,
				"tax_nm_lcl5",
				tax_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$tax_typ,
				"tax_typ",
				tax_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$inc_tax_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_TAX_IF_ALL_R.$inc_tax_flg,
				"inc_tax_flg",
				inc_tax_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$tax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_TAX_IF_ALL_R.$tax_rate,
				"tax_rate",
				tax_rate,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_TAX_IF_ALL_R.$sls_flg,
				"sls_flg",
				sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$purc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_TAX_IF_ALL_R.$purc_flg,
				"purc_flg",
				purc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$prov_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_TAX_IF_ALL_R.$prov_flg,
				"prov_flg",
				prov_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TAX_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$memo1,
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
			MAVM_TAX_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$memo2,
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
			MAVM_TAX_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TAX_IF_ALL_R.$memo3,
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
	public static MAVM_TAX_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_TAX_IF_ALL_R create(String alias) {
		MAVM_TAX_IF_ALL_R row = new MAVM_TAX_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_TAX_IF_ALL_R createByName(T proto) {
		MAVM_TAX_IF_ALL_R row = MAVM_TAX_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_TAX_IF_ALL_R clone() {
		return (MAVM_TAX_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_TAX_IF_ALL_R createInstance() {
		return (MAVM_TAX_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_TAX_IF_ALL_R getValues(String... names) {
		return (MAVM_TAX_IF_ALL_R) super.getValues(names);
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
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 1, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 1, $tax_cd, value);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 2, $tax_nm);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 2, $tax_nm, value);
	}

	/**
	 * 税名（ロケール１）. Tax name (Locale 1).<p>
	 *
	 */
	public String tax_nm_lcl1() {
		return getConstString(offset + 3, $tax_nm_lcl1);
	}

	/**
	 * 税名（ロケール１）. Tax name (Locale 1).<p>
	 *
	 */
	public void tax_nm_lcl1(String value) {
		setConstString(offset + 3, $tax_nm_lcl1, value);
	}

	/**
	 * 税名（ロケール２）. Tax name (Locale 2).<p>
	 *
	 */
	public String tax_nm_lcl2() {
		return getConstString(offset + 4, $tax_nm_lcl2);
	}

	/**
	 * 税名（ロケール２）. Tax name (Locale 2).<p>
	 *
	 */
	public void tax_nm_lcl2(String value) {
		setConstString(offset + 4, $tax_nm_lcl2, value);
	}

	/**
	 * 税名（ロケール３）. Tax name (Locale 3).<p>
	 *
	 */
	public String tax_nm_lcl3() {
		return getConstString(offset + 5, $tax_nm_lcl3);
	}

	/**
	 * 税名（ロケール３）. Tax name (Locale 3).<p>
	 *
	 */
	public void tax_nm_lcl3(String value) {
		setConstString(offset + 5, $tax_nm_lcl3, value);
	}

	/**
	 * 税名（ロケール４）. Tax name (Locale 4).<p>
	 *
	 */
	public String tax_nm_lcl4() {
		return getConstString(offset + 6, $tax_nm_lcl4);
	}

	/**
	 * 税名（ロケール４）. Tax name (Locale 4).<p>
	 *
	 */
	public void tax_nm_lcl4(String value) {
		setConstString(offset + 6, $tax_nm_lcl4, value);
	}

	/**
	 * 税名（ロケール５）. Tax name (Locale 5).<p>
	 *
	 */
	public String tax_nm_lcl5() {
		return getConstString(offset + 7, $tax_nm_lcl5);
	}

	/**
	 * 税名（ロケール５）. Tax name (Locale 5).<p>
	 *
	 */
	public void tax_nm_lcl5(String value) {
		setConstString(offset + 7, $tax_nm_lcl5, value);
	}

	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 8, $tax_typ);
	}

	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 8, $tax_typ, value);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 9, $inc_tax_flg);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 9, $inc_tax_flg, value);
	}

	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 10, $tax_rate);
	}

	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 10, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 10, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 10, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 10, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 10, $tax_rate, value);
	}
	
	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 11, $sls_flg);
	}

	/**
	 * 売上ＦＬＧ. Sales flg..<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 11, $sls_flg, value);
	}

	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 12, $purc_flg);
	}

	/**
	 * 仕入ＦＬＧ. Purchase flg..<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 12, $purc_flg, value);
	}

	/**
	 * 支給ＦＬＧ. Supply flg..<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 13, $prov_flg);
	}

	/**
	 * 支給ＦＬＧ. Supply flg..<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 13, $prov_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 14, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 14, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 15, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 15, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 16, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 16, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_nm_lcl1.equalsIgnoreCase(name)) {
			return tax_nm_lcl1();
		}
		if ($tax_nm_lcl2.equalsIgnoreCase(name)) {
			return tax_nm_lcl2();
		}
		if ($tax_nm_lcl3.equalsIgnoreCase(name)) {
			return tax_nm_lcl3();
		}
		if ($tax_nm_lcl4.equalsIgnoreCase(name)) {
			return tax_nm_lcl4();
		}
		if ($tax_nm_lcl5.equalsIgnoreCase(name)) {
			return tax_nm_lcl5();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
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

	public MCNumber getNumber(String name) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_nm_lcl1.equalsIgnoreCase(name)) {
			return tax_nm_lcl1();
		}
		if ($tax_nm_lcl2.equalsIgnoreCase(name)) {
			return tax_nm_lcl2();
		}
		if ($tax_nm_lcl3.equalsIgnoreCase(name)) {
			return tax_nm_lcl3();
		}
		if ($tax_nm_lcl4.equalsIgnoreCase(name)) {
			return tax_nm_lcl4();
		}
		if ($tax_nm_lcl5.equalsIgnoreCase(name)) {
			return tax_nm_lcl5();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
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

	public MCNumber getNumberNE(String name) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_nm_lcl1.equalsIgnoreCase(name)) {
			tax_nm_lcl1(value);
			return;
		}
		if ($tax_nm_lcl2.equalsIgnoreCase(name)) {
			tax_nm_lcl2(value);
			return;
		}
		if ($tax_nm_lcl3.equalsIgnoreCase(name)) {
			tax_nm_lcl3(value);
			return;
		}
		if ($tax_nm_lcl4.equalsIgnoreCase(name)) {
			tax_nm_lcl4(value);
			return;
		}
		if ($tax_nm_lcl5.equalsIgnoreCase(name)) {
			tax_nm_lcl5(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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

	public void setNumber(String name, MCNumber value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_nm_lcl1.equalsIgnoreCase(name)) {
			tax_nm_lcl1(value);
			return;
		}
		if ($tax_nm_lcl2.equalsIgnoreCase(name)) {
			tax_nm_lcl2(value);
			return;
		}
		if ($tax_nm_lcl3.equalsIgnoreCase(name)) {
			tax_nm_lcl3(value);
			return;
		}
		if ($tax_nm_lcl4.equalsIgnoreCase(name)) {
			tax_nm_lcl4(value);
			return;
		}
		if ($tax_nm_lcl5.equalsIgnoreCase(name)) {
			tax_nm_lcl5(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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

	public void setNumberNE(String name, MCNumber value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
