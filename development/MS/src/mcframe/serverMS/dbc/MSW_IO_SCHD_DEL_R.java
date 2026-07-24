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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "受払予定削除ワーク // GR/GI schedule delete work"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>io_schd_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定区分</td>
 *  	<td>GR/GI schedule type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定状況区分</td>
 *  	<td>GR/GI schedule status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定ＮＯ</td>
 *  	<td>GR/GI schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定連番</td>
 *  	<td>GR/GI schedule sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ1</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分１</td>
 *  	<td>GR/GI schedule spare type 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_no1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ１</td>
 *  	<td>GR/GI schedule spare No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_seq1</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番１</td>
 *  	<td>GR/GI schedule spare sequence No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ2</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分２</td>
 *  	<td>GR/GI schedule spare type 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_no2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ２</td>
 *  	<td>GR/GI schedule spare No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_seq2</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番２</td>
 *  	<td>GR/GI schedule spare sequence No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ3</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分３</td>
 *  	<td>GR/GI schedule spare type 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_no3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ３</td>
 *  	<td>GR/GI schedule spare No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_seq3</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番３</td>
 *  	<td>GR/GI schedule spare sequence No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_typ4</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備区分４</td>
 *  	<td>GR/GI schedule spare type 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_sub_no4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備ＮＯ４</td>
 *  	<td>GR/GI schedule spare No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sub_seq4</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払予定予備連番４</td>
 *  	<td>GR/GI schedule spare sequence No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_IO_SCHD_DEL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_IO_SCHD_DEL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	private static final MCPermColumnInfo _io_schd_typ = createColumnInfo("io_schd_typ");
	public final MCStringPermColumn io_schd_typ = createStringColumn(_io_schd_typ);
	
	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	private static final MCPermColumnInfo _io_schd_sts_typ = createColumnInfo("io_schd_sts_typ");
	public final MCStringPermColumn io_schd_sts_typ = createStringColumn(_io_schd_sts_typ);
	
	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	private static final MCPermColumnInfo _io_schd_no = createColumnInfo("io_schd_no");
	public final MCStringPermColumn io_schd_no = createStringColumn(_io_schd_no);
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public static final String $io_schd_seq = "io_schd_seq";
	private static final MCPermColumnInfo _io_schd_seq = createColumnInfo("io_schd_seq");
	public final MCNumberPermColumn io_schd_seq = createNumberColumn(_io_schd_seq);
	
	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public static final String $io_schd_sub_typ1 = "io_schd_sub_typ1";
	private static final MCPermColumnInfo _io_schd_sub_typ1 = createColumnInfo("io_schd_sub_typ1");
	public final MCStringPermColumn io_schd_sub_typ1 = createStringColumn(_io_schd_sub_typ1);
	
	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public static final String $io_schd_sub_no1 = "io_schd_sub_no1";
	private static final MCPermColumnInfo _io_schd_sub_no1 = createColumnInfo("io_schd_sub_no1");
	public final MCStringPermColumn io_schd_sub_no1 = createStringColumn(_io_schd_sub_no1);
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public static final String $io_schd_sub_seq1 = "io_schd_sub_seq1";
	private static final MCPermColumnInfo _io_schd_sub_seq1 = createColumnInfo("io_schd_sub_seq1");
	public final MCNumberPermColumn io_schd_sub_seq1 = createNumberColumn(_io_schd_sub_seq1);
	
	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public static final String $io_schd_sub_typ2 = "io_schd_sub_typ2";
	private static final MCPermColumnInfo _io_schd_sub_typ2 = createColumnInfo("io_schd_sub_typ2");
	public final MCStringPermColumn io_schd_sub_typ2 = createStringColumn(_io_schd_sub_typ2);
	
	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public static final String $io_schd_sub_no2 = "io_schd_sub_no2";
	private static final MCPermColumnInfo _io_schd_sub_no2 = createColumnInfo("io_schd_sub_no2");
	public final MCStringPermColumn io_schd_sub_no2 = createStringColumn(_io_schd_sub_no2);
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public static final String $io_schd_sub_seq2 = "io_schd_sub_seq2";
	private static final MCPermColumnInfo _io_schd_sub_seq2 = createColumnInfo("io_schd_sub_seq2");
	public final MCNumberPermColumn io_schd_sub_seq2 = createNumberColumn(_io_schd_sub_seq2);
	
	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public static final String $io_schd_sub_typ3 = "io_schd_sub_typ3";
	private static final MCPermColumnInfo _io_schd_sub_typ3 = createColumnInfo("io_schd_sub_typ3");
	public final MCStringPermColumn io_schd_sub_typ3 = createStringColumn(_io_schd_sub_typ3);
	
	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public static final String $io_schd_sub_no3 = "io_schd_sub_no3";
	private static final MCPermColumnInfo _io_schd_sub_no3 = createColumnInfo("io_schd_sub_no3");
	public final MCStringPermColumn io_schd_sub_no3 = createStringColumn(_io_schd_sub_no3);
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public static final String $io_schd_sub_seq3 = "io_schd_sub_seq3";
	private static final MCPermColumnInfo _io_schd_sub_seq3 = createColumnInfo("io_schd_sub_seq3");
	public final MCNumberPermColumn io_schd_sub_seq3 = createNumberColumn(_io_schd_sub_seq3);
	
	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public static final String $io_schd_sub_typ4 = "io_schd_sub_typ4";
	private static final MCPermColumnInfo _io_schd_sub_typ4 = createColumnInfo("io_schd_sub_typ4");
	public final MCStringPermColumn io_schd_sub_typ4 = createStringColumn(_io_schd_sub_typ4);
	
	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public static final String $io_schd_sub_no4 = "io_schd_sub_no4";
	private static final MCPermColumnInfo _io_schd_sub_no4 = createColumnInfo("io_schd_sub_no4");
	public final MCStringPermColumn io_schd_sub_no4 = createStringColumn(_io_schd_sub_no4);
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public static final String $io_schd_sub_seq4 = "io_schd_sub_seq4";
	private static final MCPermColumnInfo _io_schd_sub_seq4 = createColumnInfo("io_schd_sub_seq4");
	public final MCNumberPermColumn io_schd_sub_seq4 = createNumberColumn(_io_schd_sub_seq4);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_seq_META = createCommonMeta($io_schd_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ1_META = createCommonMeta($io_schd_sub_typ1, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no1_META = createCommonMeta($io_schd_sub_no1, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq1_META = createCommonMeta($io_schd_sub_seq1, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ2_META = createCommonMeta($io_schd_sub_typ2, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no2_META = createCommonMeta($io_schd_sub_no2, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq2_META = createCommonMeta($io_schd_sub_seq2, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ3_META = createCommonMeta($io_schd_sub_typ3, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no3_META = createCommonMeta($io_schd_sub_no3, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq3_META = createCommonMeta($io_schd_sub_seq3, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_sub_typ4_META = createCommonMeta($io_schd_sub_typ4, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_no4_META = createCommonMeta($io_schd_sub_no4, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_seq4_META = createCommonMeta($io_schd_sub_seq4, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_IO_SCHD_DEL_R> constMetas = new ConstMetaList<MSW_IO_SCHD_DEL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			io_schd_typ_META,
			io_schd_sts_typ_META,
			io_schd_no_META,
			io_schd_seq_META,
			io_schd_sub_typ1_META,
			io_schd_sub_no1_META,
			io_schd_sub_seq1_META,
			io_schd_sub_typ2_META,
			io_schd_sub_no2_META,
			io_schd_sub_seq2_META,
			io_schd_sub_typ3_META,
			io_schd_sub_no3_META,
			io_schd_sub_seq3_META,
			io_schd_sub_typ4_META,
			io_schd_sub_no4_META,
			io_schd_sub_seq4_META,
			io_schd_pr_no_META
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
	protected MSW_IO_SCHD_DEL_R(ConstMetaList<? extends MSW_IO_SCHD_DEL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_IO_SCHD_DEL_R(ConstMetaList<? extends MSW_IO_SCHD_DEL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_typ,
				"io_schd_typ",
				io_schd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sts_typ,
				"io_schd_sts_typ",
				io_schd_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_no,
				"io_schd_no",
				io_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_IO_SCHD_DEL_R.$io_schd_seq,
				"io_schd_seq",
				io_schd_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_typ1,
				"io_schd_sub_typ1",
				io_schd_sub_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_no1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_no1,
				"io_schd_sub_no1",
				io_schd_sub_no1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_seq1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_seq1,
				"io_schd_sub_seq1",
				io_schd_sub_seq1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_typ2,
				"io_schd_sub_typ2",
				io_schd_sub_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_no2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_no2,
				"io_schd_sub_no2",
				io_schd_sub_no2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_seq2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_seq2,
				"io_schd_sub_seq2",
				io_schd_sub_seq2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_typ3,
				"io_schd_sub_typ3",
				io_schd_sub_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_no3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_no3,
				"io_schd_sub_no3",
				io_schd_sub_no3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_seq3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_seq3,
				"io_schd_sub_seq3",
				io_schd_sub_seq3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_typ4,
				"io_schd_sub_typ4",
				io_schd_sub_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_no4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_no4,
				"io_schd_sub_no4",
				io_schd_sub_no4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_sub_seq4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_IO_SCHD_DEL_R.$io_schd_sub_seq4,
				"io_schd_sub_seq4",
				io_schd_sub_seq4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_IO_SCHD_DEL_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_IO_SCHD_DEL_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				true,
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
	public static MSW_IO_SCHD_DEL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_IO_SCHD_DEL_R create(String alias) {
		MSW_IO_SCHD_DEL_R row = new MSW_IO_SCHD_DEL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_IO_SCHD_DEL_R createByName(T proto) {
		MSW_IO_SCHD_DEL_R row = MSW_IO_SCHD_DEL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_IO_SCHD_DEL_R clone() {
		return (MSW_IO_SCHD_DEL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_IO_SCHD_DEL_R createInstance() {
		return (MSW_IO_SCHD_DEL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_IO_SCHD_DEL_R getValues(String... names) {
		return (MSW_IO_SCHD_DEL_R) super.getValues(names);
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
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 0, $io_schd_typ);
	}

	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 0, $io_schd_typ, value);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 1, $io_schd_sts_typ);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 1, $io_schd_sts_typ, value);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 2, $io_schd_no);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 2, $io_schd_no, value);
	}

	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public MCNumber io_schd_seq() {
		return getConstNumber(offset + 3, $io_schd_seq);
	}

	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(MCNumber value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(int value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(long value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(float value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定連番. GR/GI schedule sequence number.<p>
	 *
	 */
	public void io_schd_seq(double value) {
		setConstNumber(offset + 3, $io_schd_seq, value);
	}
	
	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public String io_schd_sub_typ1() {
		return getConstString(offset + 4, $io_schd_sub_typ1);
	}

	/**
	 * 受払予定予備区分１. GR/GI schedule spare type 1.<p>
	 *
	 */
	public void io_schd_sub_typ1(String value) {
		setConstString(offset + 4, $io_schd_sub_typ1, value);
	}

	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public String io_schd_sub_no1() {
		return getConstString(offset + 5, $io_schd_sub_no1);
	}

	/**
	 * 受払予定予備ＮＯ１. GR/GI schedule spare No. 1.<p>
	 *
	 */
	public void io_schd_sub_no1(String value) {
		setConstString(offset + 5, $io_schd_sub_no1, value);
	}

	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq1() {
		return getConstNumber(offset + 6, $io_schd_sub_seq1);
	}

	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(MCNumber value) {
		setConstNumber(offset + 6, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(int value) {
		setConstNumber(offset + 6, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(long value) {
		setConstNumber(offset + 6, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(float value) {
		setConstNumber(offset + 6, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備連番１. GR/GI schedule spare sequence No. 1.<p>
	 *
	 */
	public void io_schd_sub_seq1(double value) {
		setConstNumber(offset + 6, $io_schd_sub_seq1, value);
	}
	
	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public String io_schd_sub_typ2() {
		return getConstString(offset + 7, $io_schd_sub_typ2);
	}

	/**
	 * 受払予定予備区分２. GR/GI schedule spare type 2.<p>
	 *
	 */
	public void io_schd_sub_typ2(String value) {
		setConstString(offset + 7, $io_schd_sub_typ2, value);
	}

	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public String io_schd_sub_no2() {
		return getConstString(offset + 8, $io_schd_sub_no2);
	}

	/**
	 * 受払予定予備ＮＯ２. GR/GI schedule spare No. 2.<p>
	 *
	 */
	public void io_schd_sub_no2(String value) {
		setConstString(offset + 8, $io_schd_sub_no2, value);
	}

	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq2() {
		return getConstNumber(offset + 9, $io_schd_sub_seq2);
	}

	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(MCNumber value) {
		setConstNumber(offset + 9, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(int value) {
		setConstNumber(offset + 9, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(long value) {
		setConstNumber(offset + 9, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(float value) {
		setConstNumber(offset + 9, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備連番２. GR/GI schedule spare sequence No. 2.<p>
	 *
	 */
	public void io_schd_sub_seq2(double value) {
		setConstNumber(offset + 9, $io_schd_sub_seq2, value);
	}
	
	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public String io_schd_sub_typ3() {
		return getConstString(offset + 10, $io_schd_sub_typ3);
	}

	/**
	 * 受払予定予備区分３. GR/GI schedule spare type 3.<p>
	 *
	 */
	public void io_schd_sub_typ3(String value) {
		setConstString(offset + 10, $io_schd_sub_typ3, value);
	}

	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public String io_schd_sub_no3() {
		return getConstString(offset + 11, $io_schd_sub_no3);
	}

	/**
	 * 受払予定予備ＮＯ３. GR/GI schedule spare No. 3.<p>
	 *
	 */
	public void io_schd_sub_no3(String value) {
		setConstString(offset + 11, $io_schd_sub_no3, value);
	}

	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq3() {
		return getConstNumber(offset + 12, $io_schd_sub_seq3);
	}

	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(MCNumber value) {
		setConstNumber(offset + 12, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(int value) {
		setConstNumber(offset + 12, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(long value) {
		setConstNumber(offset + 12, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(float value) {
		setConstNumber(offset + 12, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備連番３. GR/GI schedule spare sequence No. 3.<p>
	 *
	 */
	public void io_schd_sub_seq3(double value) {
		setConstNumber(offset + 12, $io_schd_sub_seq3, value);
	}
	
	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public String io_schd_sub_typ4() {
		return getConstString(offset + 13, $io_schd_sub_typ4);
	}

	/**
	 * 受払予定予備区分４. GR/GI schedule spare type 4.<p>
	 *
	 */
	public void io_schd_sub_typ4(String value) {
		setConstString(offset + 13, $io_schd_sub_typ4, value);
	}

	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public String io_schd_sub_no4() {
		return getConstString(offset + 14, $io_schd_sub_no4);
	}

	/**
	 * 受払予定予備ＮＯ４. GR/GI schedule spare No. 4.<p>
	 *
	 */
	public void io_schd_sub_no4(String value) {
		setConstString(offset + 14, $io_schd_sub_no4, value);
	}

	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public MCNumber io_schd_sub_seq4() {
		return getConstNumber(offset + 15, $io_schd_sub_seq4);
	}

	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(MCNumber value) {
		setConstNumber(offset + 15, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(int value) {
		setConstNumber(offset + 15, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(long value) {
		setConstNumber(offset + 15, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(float value) {
		setConstNumber(offset + 15, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払予定予備連番４. GR/GI schedule spare sequence No. 4.<p>
	 *
	 */
	public void io_schd_sub_seq4(double value) {
		setConstNumber(offset + 15, $io_schd_sub_seq4, value);
	}
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 16, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 16, $io_schd_pr_no, value);
	}

	public String getString(String name) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ1();
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			return io_schd_sub_no1();
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ2();
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			return io_schd_sub_no2();
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ3();
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			return io_schd_sub_no3();
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ4();
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			return io_schd_sub_no4();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			return io_schd_sub_seq1();
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			return io_schd_sub_seq2();
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			return io_schd_sub_seq3();
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			return io_schd_sub_seq4();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ1();
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			return io_schd_sub_no1();
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ2();
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			return io_schd_sub_no2();
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ3();
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			return io_schd_sub_no3();
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ4();
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			return io_schd_sub_no4();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			return io_schd_seq();
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			return io_schd_sub_seq1();
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			return io_schd_sub_seq2();
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			return io_schd_sub_seq3();
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			return io_schd_sub_seq4();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			io_schd_sub_typ1(value);
			return;
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			io_schd_sub_no1(value);
			return;
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			io_schd_sub_typ2(value);
			return;
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			io_schd_sub_no2(value);
			return;
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			io_schd_sub_typ3(value);
			return;
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			io_schd_sub_no3(value);
			return;
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			io_schd_sub_typ4(value);
			return;
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			io_schd_sub_no4(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			io_schd_sub_typ1(value);
			return;
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			io_schd_sub_no1(value);
			return;
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			io_schd_sub_typ2(value);
			return;
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			io_schd_sub_no2(value);
			return;
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			io_schd_sub_typ3(value);
			return;
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			io_schd_sub_no3(value);
			return;
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			io_schd_sub_typ4(value);
			return;
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			io_schd_sub_no4(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($io_schd_seq.equalsIgnoreCase(name)) {
			io_schd_seq(value);
			return;
		}
		if ($io_schd_sub_seq1.equalsIgnoreCase(name)) {
			io_schd_sub_seq1(value);
			return;
		}
		if ($io_schd_sub_seq2.equalsIgnoreCase(name)) {
			io_schd_sub_seq2(value);
			return;
		}
		if ($io_schd_sub_seq3.equalsIgnoreCase(name)) {
			io_schd_sub_seq3(value);
			return;
		}
		if ($io_schd_sub_seq4.equalsIgnoreCase(name)) {
			io_schd_sub_seq4(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
