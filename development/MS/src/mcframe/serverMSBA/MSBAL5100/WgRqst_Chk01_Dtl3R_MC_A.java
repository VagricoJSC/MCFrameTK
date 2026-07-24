package mcframe.serverMSBA.MSBAL5100;

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
 * ブロック"WgRqst_Chk01_Dtl3"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Chk01_Dtl3R_MC_A extends MCConstRow {

	public static final String $xfrSchdChk04 = "xfrSchdChk04";


	public static final MCMeta xfrSchdChk04_META = createInnerRowMeta($xfrSchdChk04, mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class);

	protected static final ConstMetaList<WgRqst_Chk01_Dtl3R> constMetas = new ConstMetaList<WgRqst_Chk01_Dtl3R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfrSchdChk04_META
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
		null
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
	protected WgRqst_Chk01_Dtl3R_MC_A(ConstMetaList<? extends WgRqst_Chk01_Dtl3R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_Dtl3R clone() {
		return (WgRqst_Chk01_Dtl3R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_Dtl3R createInstance() {
		return (WgRqst_Chk01_Dtl3R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_Dtl3R getValues(String... names) {
		return (WgRqst_Chk01_Dtl3R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR xfrSchdChk04(){
		return (mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR) getConstInnerRow(offset + 0, $xfrSchdChk04);
	}
	
	public void xfrSchdChk04(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR row){
		setConstInnerRow(offset + 0, $xfrSchdChk04, row);
	}






	public MCRow getInnerRow(String name) {
		if ($xfrSchdChk04.equalsIgnoreCase(name)) {
			return xfrSchdChk04();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xfrSchdChk04.equalsIgnoreCase(name)) {
			xfrSchdChk04(
				((MCContainerMeta) xfrSchdChk04_META).castInnerRow(mcframe.serverMSBE.MSBEL5200.XfrSchdChk04_DtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


}

