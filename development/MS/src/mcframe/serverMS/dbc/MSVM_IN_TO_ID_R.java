package mcframe.serverMS.dbc;

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
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "納入先識別ビュー // Delivery destination identification view"DBコンテナRowクラスです。<p>
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
 *  	<td>in_to_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入先識別区分</td>
 *  	<td>Delivery destination identification type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>in_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入先識別ＣＤ</td>
 *  	<td>Delivery destination identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_id_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先識別名</td>
 *  	<td>Delivery destination identification name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_id_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先識別別名１</td>
 *  	<td>Delivery destination identification alias name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_id_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先識別別名２</td>
 *  	<td>Delivery destination identification alias name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_id_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先識別別名３</td>
 *  	<td>Delivery destination identification alias name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_id_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先識別別名４</td>
 *  	<td>Delivery destination identification alias name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous delivery destination flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国ＣＤ</td>
 *  	<td>Country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名</td>
 *  	<td>Country name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVM_IN_TO_ID_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVM_IN_TO_ID";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 納入先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	private static final MCPermColumnInfo _in_to_id_typ = createColumnInfo("in_to_id_typ");
	public final MCStringPermColumn in_to_id_typ = createStringColumn(_in_to_id_typ);
	
	/**
	 * 納入先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	private static final MCPermColumnInfo _in_to_id_cd = createColumnInfo("in_to_id_cd");
	public final MCStringPermColumn in_to_id_cd = createStringColumn(_in_to_id_cd);
	
	/**
	 * 納入先識別名. Delivery destination identification name.<p>
	 *
	 */
	public static final String $in_to_id_nm = "in_to_id_nm";
	private static final MCPermColumnInfo _in_to_id_nm = createColumnInfo("in_to_id_nm");
	public final MCStringPermColumn in_to_id_nm = createStringColumn(_in_to_id_nm);
	
	/**
	 * 納入先識別別名１. Delivery destination identification alias name 1.<p>
	 *
	 */
	public static final String $in_to_id_alt_nm1 = "in_to_id_alt_nm1";
	private static final MCPermColumnInfo _in_to_id_alt_nm1 = createColumnInfo("in_to_id_alt_nm1");
	public final MCStringPermColumn in_to_id_alt_nm1 = createStringColumn(_in_to_id_alt_nm1);
	
	/**
	 * 納入先識別別名２. Delivery destination identification alias name 2.<p>
	 *
	 */
	public static final String $in_to_id_alt_nm2 = "in_to_id_alt_nm2";
	private static final MCPermColumnInfo _in_to_id_alt_nm2 = createColumnInfo("in_to_id_alt_nm2");
	public final MCStringPermColumn in_to_id_alt_nm2 = createStringColumn(_in_to_id_alt_nm2);
	
	/**
	 * 納入先識別別名３. Delivery destination identification alias name 3.<p>
	 *
	 */
	public static final String $in_to_id_alt_nm3 = "in_to_id_alt_nm3";
	private static final MCPermColumnInfo _in_to_id_alt_nm3 = createColumnInfo("in_to_id_alt_nm3");
	public final MCStringPermColumn in_to_id_alt_nm3 = createStringColumn(_in_to_id_alt_nm3);
	
	/**
	 * 納入先識別別名４. Delivery destination identification alias name 4.<p>
	 *
	 */
	public static final String $in_to_id_alt_nm4 = "in_to_id_alt_nm4";
	private static final MCPermColumnInfo _in_to_id_alt_nm4 = createColumnInfo("in_to_id_alt_nm4");
	public final MCStringPermColumn in_to_id_alt_nm4 = createStringColumn(_in_to_id_alt_nm4);
	
	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public static final String $in_to_sundry_flg = "in_to_sundry_flg";
	private static final MCPermColumnInfo _in_to_sundry_flg = createColumnInfo("in_to_sundry_flg");
	public final MCBooleanPermColumn in_to_sundry_flg = createBooleanColumn(_in_to_sundry_flg);
	
	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	private static final MCPermColumnInfo _cntry_cd = createColumnInfo("cntry_cd");
	public final MCStringPermColumn cntry_cd = createStringColumn(_cntry_cd);
	
	/**
	 * 国名. Country name.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	private static final MCPermColumnInfo _cntry_nm = createColumnInfo("cntry_nm");
	public final MCStringPermColumn cntry_nm = createStringColumn(_cntry_nm);
	
	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta in_to_id_nm_META = createCommonMeta($in_to_id_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_NM);
	public static final MCMeta in_to_id_alt_nm1_META = createCommonMeta($in_to_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta in_to_id_alt_nm2_META = createCommonMeta($in_to_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta in_to_id_alt_nm3_META = createCommonMeta($in_to_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta in_to_id_alt_nm4_META = createCommonMeta($in_to_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta in_to_sundry_flg_META = createCommonMeta($in_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVM_IN_TO_ID_R> constMetas = new ConstMetaList<MSVM_IN_TO_ID_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			in_to_id_typ_META,
			in_to_id_cd_META,
			in_to_id_nm_META,
			in_to_id_alt_nm1_META,
			in_to_id_alt_nm2_META,
			in_to_id_alt_nm3_META,
			in_to_id_alt_nm4_META,
			in_to_sundry_flg_META,
			cntry_cd_META,
			cntry_nm_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
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
	protected MSVM_IN_TO_ID_R(ConstMetaList<? extends MSVM_IN_TO_ID_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVM_IN_TO_ID_R(ConstMetaList<? extends MSVM_IN_TO_ID_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_typ,
				"in_to_id_typ",
				in_to_id_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_cd,
				"in_to_id_cd",
				in_to_id_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_nm,
				"in_to_id_nm",
				in_to_id_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_alt_nm1,
				"in_to_id_alt_nm1",
				in_to_id_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_alt_nm2,
				"in_to_id_alt_nm2",
				in_to_id_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_alt_nm3,
				"in_to_id_alt_nm3",
				in_to_id_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_id_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$in_to_id_alt_nm4,
				"in_to_id_alt_nm4",
				in_to_id_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$in_to_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_IN_TO_ID_R.$in_to_sundry_flg,
				"in_to_sundry_flg",
				in_to_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$cntry_cd,
				"cntry_cd",
				cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$cntry_nm,
				"cntry_nm",
				cntry_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_IN_TO_ID_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_IN_TO_ID_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_IN_TO_ID_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MSVM_IN_TO_ID_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
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
	public static MSVM_IN_TO_ID_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVM_IN_TO_ID_R create(String alias) {
		MSVM_IN_TO_ID_R row = new MSVM_IN_TO_ID_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVM_IN_TO_ID_R createByName(T proto) {
		MSVM_IN_TO_ID_R row = MSVM_IN_TO_ID_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_IN_TO_ID_R clone() {
		return (MSVM_IN_TO_ID_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_IN_TO_ID_R createInstance() {
		return (MSVM_IN_TO_ID_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_IN_TO_ID_R getValues(String... names) {
		return (MSVM_IN_TO_ID_R) super.getValues(names);
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
	 * 納入先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 0, $in_to_id_typ);
	}

	/**
	 * 納入先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 0, $in_to_id_typ, value);
	}

	/**
	 * 納入先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 1, $in_to_id_cd);
	}

	/**
	 * 納入先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 1, $in_to_id_cd, value);
	}

	/**
	 * 納入先識別名. Delivery destination identification name.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 2, $in_to_id_nm);
	}

	/**
	 * 納入先識別名. Delivery destination identification name.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 2, $in_to_id_nm, value);
	}

	/**
	 * 納入先識別別名１. Delivery destination identification alias name 1.<p>
	 *
	 */
	public String in_to_id_alt_nm1() {
		return getConstString(offset + 3, $in_to_id_alt_nm1);
	}

	/**
	 * 納入先識別別名１. Delivery destination identification alias name 1.<p>
	 *
	 */
	public void in_to_id_alt_nm1(String value) {
		setConstString(offset + 3, $in_to_id_alt_nm1, value);
	}

	/**
	 * 納入先識別別名２. Delivery destination identification alias name 2.<p>
	 *
	 */
	public String in_to_id_alt_nm2() {
		return getConstString(offset + 4, $in_to_id_alt_nm2);
	}

	/**
	 * 納入先識別別名２. Delivery destination identification alias name 2.<p>
	 *
	 */
	public void in_to_id_alt_nm2(String value) {
		setConstString(offset + 4, $in_to_id_alt_nm2, value);
	}

	/**
	 * 納入先識別別名３. Delivery destination identification alias name 3.<p>
	 *
	 */
	public String in_to_id_alt_nm3() {
		return getConstString(offset + 5, $in_to_id_alt_nm3);
	}

	/**
	 * 納入先識別別名３. Delivery destination identification alias name 3.<p>
	 *
	 */
	public void in_to_id_alt_nm3(String value) {
		setConstString(offset + 5, $in_to_id_alt_nm3, value);
	}

	/**
	 * 納入先識別別名４. Delivery destination identification alias name 4.<p>
	 *
	 */
	public String in_to_id_alt_nm4() {
		return getConstString(offset + 6, $in_to_id_alt_nm4);
	}

	/**
	 * 納入先識別別名４. Delivery destination identification alias name 4.<p>
	 *
	 */
	public void in_to_id_alt_nm4(String value) {
		setConstString(offset + 6, $in_to_id_alt_nm4, value);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean in_to_sundry_flg() {
		return getConstBoolean(offset + 7, $in_to_sundry_flg);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void in_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 7, $in_to_sundry_flg, value);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 8, $cntry_cd);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 8, $cntry_cd, value);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 9, $cntry_nm);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 9, $cntry_nm, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 10, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 10, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 11, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 11, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 12, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 12, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 13, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 13, $del_ts, value);
	}

	public String getString(String name) {
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm1();
		}
		if ($in_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm2();
		}
		if ($in_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm3();
		}
		if ($in_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm4();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_id_alt_nm1.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm1();
		}
		if ($in_to_id_alt_nm2.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm2();
		}
		if ($in_to_id_alt_nm3.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm3();
		}
		if ($in_to_id_alt_nm4.equalsIgnoreCase(name)) {
			return in_to_id_alt_nm4();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_id_alt_nm1.equalsIgnoreCase(name)) {
			in_to_id_alt_nm1(value);
			return;
		}
		if ($in_to_id_alt_nm2.equalsIgnoreCase(name)) {
			in_to_id_alt_nm2(value);
			return;
		}
		if ($in_to_id_alt_nm3.equalsIgnoreCase(name)) {
			in_to_id_alt_nm3(value);
			return;
		}
		if ($in_to_id_alt_nm4.equalsIgnoreCase(name)) {
			in_to_id_alt_nm4(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_id_alt_nm1.equalsIgnoreCase(name)) {
			in_to_id_alt_nm1(value);
			return;
		}
		if ($in_to_id_alt_nm2.equalsIgnoreCase(name)) {
			in_to_id_alt_nm2(value);
			return;
		}
		if ($in_to_id_alt_nm3.equalsIgnoreCase(name)) {
			in_to_id_alt_nm3(value);
			return;
		}
		if ($in_to_id_alt_nm4.equalsIgnoreCase(name)) {
			in_to_id_alt_nm4(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
