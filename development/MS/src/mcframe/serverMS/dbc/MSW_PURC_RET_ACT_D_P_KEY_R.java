package mcframe.serverMS.dbc;

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
 * "仕入返品実績明細（改訂履歴） // Purchase return result details (Rev. history)"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>purc_ret_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品実績明細ＮＯ</td>
 *  	<td>Purchase return result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>purc_ret_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品実績改訂番号</td>
 *  	<td>Purchase return result rev. number</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_PURC_RET_ACT_D_P_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_PURC_RET_ACT_D_P_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕入返品実績明細ＮＯ. Purchase return result details No..<p>
	 *
	 */
	public static final String $purc_ret_act_d_no = "purc_ret_act_d_no";
	private static final MCPermColumnInfo _purc_ret_act_d_no = createColumnInfo("purc_ret_act_d_no");
	public final MCStringPermColumn purc_ret_act_d_no = createStringColumn(_purc_ret_act_d_no);
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public static final String $purc_ret_act_rev = "purc_ret_act_rev";
	private static final MCPermColumnInfo _purc_ret_act_rev = createColumnInfo("purc_ret_act_rev");
	public final MCNumberPermColumn purc_ret_act_rev = createNumberColumn(_purc_ret_act_rev);
	
	public static final MCMeta purc_ret_act_d_no_META = createCommonMeta($purc_ret_act_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_D_NO);
	public static final MCMeta purc_ret_act_rev_META = createCommonMeta($purc_ret_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_PURC_RET_ACT_D_P_KEY_R> constMetas = new ConstMetaList<MSW_PURC_RET_ACT_D_P_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			purc_ret_act_d_no_META,
			purc_ret_act_rev_META
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
	protected MSW_PURC_RET_ACT_D_P_KEY_R(ConstMetaList<? extends MSW_PURC_RET_ACT_D_P_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_PURC_RET_ACT_D_P_KEY_R(ConstMetaList<? extends MSW_PURC_RET_ACT_D_P_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_PURC_RET_ACT_D_P_KEY_R.$purc_ret_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_PURC_RET_ACT_D_P_KEY_R.$purc_ret_act_d_no,
				"purc_ret_act_d_no",
				purc_ret_act_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_PURC_RET_ACT_D_P_KEY_R.$purc_ret_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_PURC_RET_ACT_D_P_KEY_R.$purc_ret_act_rev,
				"purc_ret_act_rev",
				purc_ret_act_rev,
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
	public static MSW_PURC_RET_ACT_D_P_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_PURC_RET_ACT_D_P_KEY_R create(String alias) {
		MSW_PURC_RET_ACT_D_P_KEY_R row = new MSW_PURC_RET_ACT_D_P_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_PURC_RET_ACT_D_P_KEY_R createByName(T proto) {
		MSW_PURC_RET_ACT_D_P_KEY_R row = MSW_PURC_RET_ACT_D_P_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_PURC_RET_ACT_D_P_KEY_R clone() {
		return (MSW_PURC_RET_ACT_D_P_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_PURC_RET_ACT_D_P_KEY_R createInstance() {
		return (MSW_PURC_RET_ACT_D_P_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_PURC_RET_ACT_D_P_KEY_R getValues(String... names) {
		return (MSW_PURC_RET_ACT_D_P_KEY_R) super.getValues(names);
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
	 * 仕入返品実績明細ＮＯ. Purchase return result details No..<p>
	 *
	 */
	public String purc_ret_act_d_no() {
		return getConstString(offset + 0, $purc_ret_act_d_no);
	}

	/**
	 * 仕入返品実績明細ＮＯ. Purchase return result details No..<p>
	 *
	 */
	public void purc_ret_act_d_no(String value) {
		setConstString(offset + 0, $purc_ret_act_d_no, value);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return getConstNumber(offset + 1, $purc_ret_act_rev);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	public String getString(String name) {
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
