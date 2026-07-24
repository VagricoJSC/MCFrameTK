package mcframe.clientMGBB.MGBBP0200;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify,0;AUTO,Auto-set,1;DEL,Delete,2;REF,View,3 UPD,登録・訂正する,0;AUTO,自動設定する,1;DEL,削除する,2;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * INPT,Input,0;IO,GR/GI,1;SLS,Sales,2 INPT,投入,0;IO,入出庫,1;SLS,売上,2.<p>
	 *
	 */
	public static final String $tar = "tar";
	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public static final String $act_id = "act_id";
	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public static final String $act_id_sub = "act_id_sub";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta tar_META = createStringMeta($tar);
	public static final MCMeta act_id_META = createCommonMeta($act_id, mcframe.commonMG.meta.MG_META.ACT_ID);
	public static final MCMeta act_id_sub_META = createCommonMeta($act_id_sub, mcframe.commonMG.meta.MG_META.ACT_ID_SUB);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			tar_META,
			act_id_META,
			act_id_sub_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[SUM]のキー定数 */
	public static final String $$SUM = "SUM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SUM, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify,0;AUTO,Auto-set,1;DEL,Delete,2;REF,View,3 UPD,登録・訂正する,0;AUTO,自動設定する,1;DEL,削除する,2;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;AUTO,Auto-set,1;DEL,Delete,2;REF,View,3 UPD,登録・訂正する,0;AUTO,自動設定する,1;DEL,削除する,2;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * INPT,Input,0;IO,GR/GI,1;SLS,Sales,2 INPT,投入,0;IO,入出庫,1;SLS,売上,2.<p>
	 *
	 */
	public String tar() {
		return getConstString(offset + 1, $tar);
	}

	/**
	 * INPT,Input,0;IO,GR/GI,1;SLS,Sales,2 INPT,投入,0;IO,入出庫,1;SLS,売上,2.<p>
	 *
	 */
	public void tar(String value) {
		setConstString(offset + 1, $tar, value);
	}


	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public String act_id() {
		return getConstString(offset + 2, $act_id);
	}

	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public void act_id(String value) {
		setConstString(offset + 2, $act_id, value);
	}


	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public String act_id_sub() {
		return getConstString(offset + 3, $act_id_sub);
	}

	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public void act_id_sub(String value) {
		setConstString(offset + 3, $act_id_sub, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tar.equalsIgnoreCase(name)) {
			return tar();
		}
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tar.equalsIgnoreCase(name)) {
			return tar();
		}
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tar.equalsIgnoreCase(name)) {
			tar(value);
			return;
		}
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tar.equalsIgnoreCase(name)) {
			tar(value);
			return;
		}
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

