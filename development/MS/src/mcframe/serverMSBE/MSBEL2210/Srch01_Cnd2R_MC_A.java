package mcframe.serverMSBE.MSBEL2210;

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
 * ブロック"Srch01_Cnd2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Cnd2R_MC_A extends MCConstRow {

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Aggregation target まとめ対象.<p>
	 *
	 */
	public static final String $bndl_tgt_flg = "bndl_tgt_flg";


	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta bndl_tgt_flg_META = createCommonMeta($bndl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_Cnd2R> constMetas = new ConstMetaList<Srch01_Cnd2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			purc_schd_no_META,
			arr_act_no_META,
			bndl_tgt_flg_META
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected Srch01_Cnd2R_MC_A(ConstMetaList<? extends Srch01_Cnd2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Cnd2R clone() {
		return (Srch01_Cnd2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Cnd2R createInstance() {
		return (Srch01_Cnd2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Cnd2R getValues(String... names) {
		return (Srch01_Cnd2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 0, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 0, $purc_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 1, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 1, $arr_act_no, value);
	}


	/**
	 * Aggregation target まとめ対象.<p>
	 *
	 */
	public boolean bndl_tgt_flg() {
		return getConstBoolean(offset + 2, $bndl_tgt_flg);
	}

	/**
	 * Aggregation target まとめ対象.<p>
	 *
	 */
	public void bndl_tgt_flg(boolean value) {
		setConstBoolean(offset + 2, $bndl_tgt_flg, value);
	}


	public String getString(String name) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($bndl_tgt_flg.equalsIgnoreCase(name)) {
			return bndl_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bndl_tgt_flg.equalsIgnoreCase(name)) {
			return bndl_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bndl_tgt_flg.equalsIgnoreCase(name)) {
			bndl_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bndl_tgt_flg.equalsIgnoreCase(name)) {
			bndl_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

