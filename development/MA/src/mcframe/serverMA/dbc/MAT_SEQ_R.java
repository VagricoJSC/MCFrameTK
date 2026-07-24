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
 * "発番情報 // Numbering info."DBコンテナRowクラスです。<p>
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
 *  	<td>num_biz_typ</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番業務区分</td>
 *  	<td>Numbering operation type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>num_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番パタンＣＤ</td>
 *  	<td>Numbering pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key_elm</td>
 *  	<td>C</td>
 *  	<td>45</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー要素</td>
 *  	<td>Key element</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>seq_typ</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>シーケンス区分</td>
 *  	<td>Sequence type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ora_seq_nm</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>シーケンス名</td>
 *  	<td>Sequence name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_val</td>
 *  	<td>N</td>
 *  	<td>20,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最小値</td>
 *  	<td>Min. value</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_val</td>
 *  	<td>N</td>
 *  	<td>20,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最大値</td>
 *  	<td>Max. value</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>increment_by</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>増加量</td>
 *  	<td>Increment</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cycl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動リセット許可ＦＬＧ</td>
 *  	<td>Allow auto-reset flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_val</td>
 *  	<td>N</td>
 *  	<td>20,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>現在値</td>
 *  	<td>Current value</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>num_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>NUM_PTN1.NUM_PTN_NM</td>
 *  	<td>発番パタン名</td>
 *  	<td>Numbering pattern name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAT_SEQ_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAT_SEQ";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	private static final MCPermColumnInfo _num_biz_typ = createColumnInfo("num_biz_typ");
	public final MCStringPermColumn num_biz_typ = createStringColumn(_num_biz_typ);
	
	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	private static final MCPermColumnInfo _num_ptn_cd = createColumnInfo("num_ptn_cd");
	public final MCStringPermColumn num_ptn_cd = createStringColumn(_num_ptn_cd);
	
	/**
	 * キー要素. Key element.<p>
	 *
	 */
	public static final String $key_elm = "key_elm";
	private static final MCPermColumnInfo _key_elm = createColumnInfo("key_elm");
	public final MCStringPermColumn key_elm = createStringColumn(_key_elm);
	
	/**
	 * シーケンス区分. Sequence type.<p>
	 *
	 */
	public static final String $seq_typ = "seq_typ";
	private static final MCPermColumnInfo _seq_typ = createColumnInfo("seq_typ");
	public final MCStringPermColumn seq_typ = createStringColumn(_seq_typ);
	
	/**
	 * シーケンス名. Sequence name.<p>
	 *
	 */
	public static final String $ora_seq_nm = "ora_seq_nm";
	private static final MCPermColumnInfo _ora_seq_nm = createColumnInfo("ora_seq_nm");
	public final MCStringPermColumn ora_seq_nm = createStringColumn(_ora_seq_nm);
	
	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public static final String $min_val = "min_val";
	private static final MCPermColumnInfo _min_val = createColumnInfo("min_val");
	public final MCNumberPermColumn min_val = createNumberColumn(_min_val);
	
	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public static final String $max_val = "max_val";
	private static final MCPermColumnInfo _max_val = createColumnInfo("max_val");
	public final MCNumberPermColumn max_val = createNumberColumn(_max_val);
	
	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public static final String $increment_by = "increment_by";
	private static final MCPermColumnInfo _increment_by = createColumnInfo("increment_by");
	public final MCNumberPermColumn increment_by = createNumberColumn(_increment_by);
	
	/**
	 * 自動リセット許可ＦＬＧ. Allow auto-reset flg..<p>
	 *
	 */
	public static final String $cycl_flg = "cycl_flg";
	private static final MCPermColumnInfo _cycl_flg = createColumnInfo("cycl_flg");
	public final MCBooleanPermColumn cycl_flg = createBooleanColumn(_cycl_flg);
	
	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public static final String $last_val = "last_val";
	private static final MCPermColumnInfo _last_val = createColumnInfo("last_val");
	public final MCNumberPermColumn last_val = createNumberColumn(_last_val);
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	private static final MCPermColumnInfo _ins_usr_id = createColumnInfo("ins_usr_id");
	public final MCStringPermColumn ins_usr_id = createStringColumn(_ins_usr_id);
	
	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	private static final MCPermColumnInfo _ins_usr_nm = createColumnInfo("ins_usr_nm");
	public final MCStringPermColumn ins_usr_nm = createStringColumn(_ins_usr_nm);
	
	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	private static final MCPermColumnInfo _ins_ts = createColumnInfo("ins_ts");
	public final MCTimestampPermColumn ins_ts = createTimestampColumn(_ins_ts);
	
	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	private static final MCPermColumnInfo _ins_func_id = createColumnInfo("ins_func_id");
	public final MCStringPermColumn ins_func_id = createStringColumn(_ins_func_id);
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	private static final MCPermColumnInfo _upd_cntr = createColumnInfo("upd_cntr");
	public final MCNumberPermColumn upd_cntr = createNumberColumn(_upd_cntr);
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	private static final MCPermColumnInfo _upd_usr_id = createColumnInfo("upd_usr_id");
	public final MCStringPermColumn upd_usr_id = createStringColumn(_upd_usr_id);
	
	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	private static final MCPermColumnInfo _upd_usr_nm = createColumnInfo("upd_usr_nm");
	public final MCStringPermColumn upd_usr_nm = createStringColumn(_upd_usr_nm);
	
	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	private static final MCPermColumnInfo _upd_ts = createColumnInfo("upd_ts");
	public final MCTimestampPermColumn upd_ts = createTimestampColumn(_upd_ts);
	
	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	private static final MCPermColumnInfo _upd_func_id = createColumnInfo("upd_func_id");
	public final MCStringPermColumn upd_func_id = createStringColumn(_upd_func_id);
	
	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	private static final MCPermColumnInfo _upd_srv_req_no = createColumnInfo("upd_srv_req_no");
	public final MCStringPermColumn upd_srv_req_no = createStringColumn(_upd_srv_req_no);
	
	/**
	 * 発番パタン名. Numbering pattern name.<p>
	 *
	 */
	public static final String $num_ptn_nm = "num_ptn_nm";
	
	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta key_elm_META = createCommonMeta($key_elm, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta seq_typ_META = createCommonMeta($seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta ora_seq_nm_META = createCommonMeta($ora_seq_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta min_val_META = createCommonMeta($min_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta max_val_META = createCommonMeta($max_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta increment_by_META = createCommonMeta($increment_by, mcframe.commonMA.meta.MA_META.NUM_INC);
	public static final MCMeta cycl_flg_META = createCommonMeta($cycl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_val_META = createCommonMeta($last_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta num_ptn_nm_META = createCommonMeta($num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $NUM_PTN1 = "NUM_PTN1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_NUM_PTN",
				$NUM_PTN1,
				new String[][]{
						{"num_biz_typ", "num_biz_typ"},
						{"num_ptn_cd", "num_ptn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_NUM_PTN_R.create("NUM_PTN1");
				},
				(alias) -> {
					MAT_SEQ_R own = MAT_SEQ_R.create(alias);
					mcframe.serverMA.dbc.MAM_NUM_PTN_R ref = mcframe.serverMA.dbc.MAM_NUM_PTN_R.create("NUM_PTN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.num_biz_typ.eq(ref.num_biz_typ));
					cond = cond.and(own.num_ptn_cd.eq(ref.num_ptn_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAT_SEQ_R> constMetas = new ConstMetaList<MAT_SEQ_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_ptn_cd_META,
			key_elm_META,
			seq_typ_META,
			ora_seq_nm_META,
			min_val_META,
			max_val_META,
			increment_by_META,
			cycl_flg_META,
			last_val_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META,
			num_ptn_nm_META
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
	protected MAT_SEQ_R(ConstMetaList<? extends MAT_SEQ_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAT_SEQ_R(ConstMetaList<? extends MAT_SEQ_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAT_SEQ_R.$num_biz_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$num_biz_typ,
				"num_biz_typ",
				num_biz_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$num_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$num_ptn_cd,
				"num_ptn_cd",
				num_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$key_elm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$key_elm,
				"key_elm",
				key_elm,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$seq_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$seq_typ,
				"seq_typ",
				seq_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$ora_seq_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$ora_seq_nm,
				"ora_seq_nm",
				ora_seq_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$min_val,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_SEQ_R.$min_val,
				"min_val",
				min_val,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$max_val,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_SEQ_R.$max_val,
				"max_val",
				max_val,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$increment_by,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_SEQ_R.$increment_by,
				"increment_by",
				increment_by,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$cycl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAT_SEQ_R.$cycl_flg,
				"cycl_flg",
				cycl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$last_val,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_SEQ_R.$last_val,
				"last_val",
				last_val,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAT_SEQ_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_SEQ_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAT_SEQ_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_SEQ_R.$num_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_SEQ_R.$num_ptn_nm,
				"num_ptn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"NUM_PTN1.NUM_PTN_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAT_SEQ_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAT_SEQ_R create(String alias) {
		MAT_SEQ_R row = new MAT_SEQ_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAT_SEQ_R createByName(T proto) {
		MAT_SEQ_R row = MAT_SEQ_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAT_SEQ_R clone() {
		return (MAT_SEQ_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAT_SEQ_R createInstance() {
		return (MAT_SEQ_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAT_SEQ_R getValues(String... names) {
		return (MAT_SEQ_R) super.getValues(names);
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
		return true;
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
	 public MAW_SEQ_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_SEQ_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_SEQ_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_SEQ_KEY_R.TABLE_NAME);
	 }

	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 0, $num_biz_typ);
	}

	/**
	 * 発番業務区分. Numbering operation type.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 0, $num_biz_typ, value);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 1, $num_ptn_cd);
	}

	/**
	 * 発番パタンＣＤ. Numbering pattern cd..<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 1, $num_ptn_cd, value);
	}

	/**
	 * キー要素. Key element.<p>
	 *
	 */
	public String key_elm() {
		return getConstString(offset + 2, $key_elm);
	}

	/**
	 * キー要素. Key element.<p>
	 *
	 */
	public void key_elm(String value) {
		setConstString(offset + 2, $key_elm, value);
	}

	/**
	 * シーケンス区分. Sequence type.<p>
	 *
	 */
	public String seq_typ() {
		return getConstString(offset + 3, $seq_typ);
	}

	/**
	 * シーケンス区分. Sequence type.<p>
	 *
	 */
	public void seq_typ(String value) {
		setConstString(offset + 3, $seq_typ, value);
	}

	/**
	 * シーケンス名. Sequence name.<p>
	 *
	 */
	public String ora_seq_nm() {
		return getConstString(offset + 4, $ora_seq_nm);
	}

	/**
	 * シーケンス名. Sequence name.<p>
	 *
	 */
	public void ora_seq_nm(String value) {
		setConstString(offset + 4, $ora_seq_nm, value);
	}

	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public MCNumber min_val() {
		return getConstNumber(offset + 5, $min_val);
	}

	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public void min_val(MCNumber value) {
		setConstNumber(offset + 5, $min_val, value);
	}
	
	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public void min_val(int value) {
		setConstNumber(offset + 5, $min_val, value);
	}
	
	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public void min_val(long value) {
		setConstNumber(offset + 5, $min_val, value);
	}
	
	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public void min_val(float value) {
		setConstNumber(offset + 5, $min_val, value);
	}
	
	/**
	 * 最小値. Min. value.<p>
	 *
	 */
	public void min_val(double value) {
		setConstNumber(offset + 5, $min_val, value);
	}
	
	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public MCNumber max_val() {
		return getConstNumber(offset + 6, $max_val);
	}

	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public void max_val(MCNumber value) {
		setConstNumber(offset + 6, $max_val, value);
	}
	
	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public void max_val(int value) {
		setConstNumber(offset + 6, $max_val, value);
	}
	
	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public void max_val(long value) {
		setConstNumber(offset + 6, $max_val, value);
	}
	
	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public void max_val(float value) {
		setConstNumber(offset + 6, $max_val, value);
	}
	
	/**
	 * 最大値. Max. value.<p>
	 *
	 */
	public void max_val(double value) {
		setConstNumber(offset + 6, $max_val, value);
	}
	
	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public MCNumber increment_by() {
		return getConstNumber(offset + 7, $increment_by);
	}

	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public void increment_by(MCNumber value) {
		setConstNumber(offset + 7, $increment_by, value);
	}
	
	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public void increment_by(int value) {
		setConstNumber(offset + 7, $increment_by, value);
	}
	
	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public void increment_by(long value) {
		setConstNumber(offset + 7, $increment_by, value);
	}
	
	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public void increment_by(float value) {
		setConstNumber(offset + 7, $increment_by, value);
	}
	
	/**
	 * 増加量. Increment.<p>
	 *
	 */
	public void increment_by(double value) {
		setConstNumber(offset + 7, $increment_by, value);
	}
	
	/**
	 * 自動リセット許可ＦＬＧ. Allow auto-reset flg..<p>
	 *
	 */
	public boolean cycl_flg() {
		return getConstBoolean(offset + 8, $cycl_flg);
	}

	/**
	 * 自動リセット許可ＦＬＧ. Allow auto-reset flg..<p>
	 *
	 */
	public void cycl_flg(boolean value) {
		setConstBoolean(offset + 8, $cycl_flg, value);
	}

	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public MCNumber last_val() {
		return getConstNumber(offset + 9, $last_val);
	}

	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public void last_val(MCNumber value) {
		setConstNumber(offset + 9, $last_val, value);
	}
	
	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public void last_val(int value) {
		setConstNumber(offset + 9, $last_val, value);
	}
	
	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public void last_val(long value) {
		setConstNumber(offset + 9, $last_val, value);
	}
	
	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public void last_val(float value) {
		setConstNumber(offset + 9, $last_val, value);
	}
	
	/**
	 * 現在値. Current value.<p>
	 *
	 */
	public void last_val(double value) {
		setConstNumber(offset + 9, $last_val, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 10, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 10, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 11, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 11, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 12, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 12, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 13, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 13, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 14, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 14, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 14, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 14, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 14, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 14, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 15, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 15, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 16, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 16, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 17, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 17, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 18, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 18, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 19, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 19, $upd_srv_req_no, value);
	}

	/**
	 * 発番パタン名. Numbering pattern name.<p>
	 *
	 */
	public String num_ptn_nm() {
		return getConstString(offset + 20, $num_ptn_nm);
	}

	/**
	 * 発番パタン名. Numbering pattern name.<p>
	 *
	 */
	public void num_ptn_nm(String value) {
		setConstString(offset + 20, $num_ptn_nm, value);
	}

	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			return seq_typ();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($min_val.equalsIgnoreCase(name)) {
			return min_val();
		}
		if ($max_val.equalsIgnoreCase(name)) {
			return max_val();
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			return increment_by();
		}
		if ($last_val.equalsIgnoreCase(name)) {
			return last_val();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			return cycl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			return seq_typ();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($min_val.equalsIgnoreCase(name)) {
			return min_val();
		}
		if ($max_val.equalsIgnoreCase(name)) {
			return max_val();
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			return increment_by();
		}
		if ($last_val.equalsIgnoreCase(name)) {
			return last_val();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			return cycl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			seq_typ(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			cycl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			seq_typ(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($cycl_flg.equalsIgnoreCase(name)) {
			cycl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
