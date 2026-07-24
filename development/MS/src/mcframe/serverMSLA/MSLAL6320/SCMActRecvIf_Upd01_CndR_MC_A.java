package mcframe.serverMSLA.MSLAL6320;

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
 * ブロック"SCMActRecvIf_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SCMActRecvIf_Upd01_CndR_MC_A extends mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR {

	/**
	 * Update request No. リクエストＮＯ更新.<p>
	 *
	 */
	public static final String $req_upd_flg = "req_upd_flg";


	public static final MCMeta req_upd_flg_META = createCommonMeta($req_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<SCMActRecvIf_Upd01_CndR> constMetas = new ConstMetaList<SCMActRecvIf_Upd01_CndR>(
		mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.constMetas,
		new MCMeta[]{
			req_upd_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.EXTMAP
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
	protected SCMActRecvIf_Upd01_CndR_MC_A(ConstMetaList<? extends SCMActRecvIf_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SCMActRecvIf_Upd01_CndR clone() {
		return (SCMActRecvIf_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SCMActRecvIf_Upd01_CndR createInstance() {
		return (SCMActRecvIf_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SCMActRecvIf_Upd01_CndR getValues(String... names) {
		return (SCMActRecvIf_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Update request No. リクエストＮＯ更新.<p>
	 *
	 */
	public boolean req_upd_flg() {
		return getConstBoolean(offset + 0, $req_upd_flg);
	}

	/**
	 * Update request No. リクエストＮＯ更新.<p>
	 *
	 */
	public void req_upd_flg(boolean value) {
		setConstBoolean(offset + 0, $req_upd_flg, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($req_upd_flg.equalsIgnoreCase(name)) {
			return req_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($req_upd_flg.equalsIgnoreCase(name)) {
			return req_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($req_upd_flg.equalsIgnoreCase(name)) {
			req_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($req_upd_flg.equalsIgnoreCase(name)) {
			req_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

