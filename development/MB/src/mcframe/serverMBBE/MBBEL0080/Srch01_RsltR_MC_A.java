package mcframe.serverMBBE.MBBEL0080;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public static final String $seq = "seq";
	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public static final String $log_sub_key1 = "log_sub_key1";
	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public static final String $log_sub_key2 = "log_sub_key2";
	/**
	 * Log type ログ区分.<p>
	 *
	 */
	public static final String $batch_log_typ = "batch_log_typ";
	/**
	 * Log type name ログ区分名.<p>
	 *
	 */
	public static final String $batch_log_typ_nm = "batch_log_typ_nm";
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public static final String $msg_id = "msg_id";
	/**
	 * Message level メッセージレベル.<p>
	 *
	 */
	public static final String $msg_lvl = "msg_lvl";
	/**
	 * Message メッセージ.<p>
	 *
	 */
	public static final String $msg_txt = "msg_txt";
	/**
	 * Log output date and time ログ出力日時.<p>
	 *
	 */
	public static final String $log_ts = "log_ts";


	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta seq_META = createNumberMeta($seq, 22, 0, false);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
	public static final MCMeta batch_log_typ_META = createCommonMeta($batch_log_typ, mcframe.commonMA.meta.MA_META.BATCH_LOG_TYP);
	public static final MCMeta batch_log_typ_nm_META = createCommonMeta($batch_log_typ_nm, mcframe.commonMA.meta.MA_META.BATCH_LOG_TYP_NM);
	public static final MCMeta msg_id_META = createCommonMeta($msg_id, mcframe.commonMA.meta.MA_META.MSG_ID);
	public static final MCMeta msg_lvl_META = createCommonMeta($msg_lvl, mcframe.commonMA.meta.MA_META.MSG_LVL);
	public static final MCMeta msg_txt_META = createCommonMeta($msg_txt, mcframe.commonMA.meta.MA_META.MSG);
	public static final MCMeta log_ts_META = createCommonMeta($log_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			batch_log_no_META,
			seq_META,
			log_sub_key1_META,
			log_sub_key2_META,
			batch_log_typ_META,
			batch_log_typ_nm_META,
			msg_id_META,
			msg_lvl_META,
			msg_txt_META,
			log_ts_META
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
				{$batch_log_typ, "FXC_BATCH_LOG_TYP"}	// batch_log_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 0, $batch_log_no);
	}

	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 0, $batch_log_no, value);
	}


	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 1, $seq);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 1, $seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 1, $seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 1, $seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 1, $seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 1, $seq, value);
	}


	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 2, $log_sub_key1);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}


	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 3, $log_sub_key2);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}


	/**
	 * Log type ログ区分.<p>
	 *
	 */
	public String batch_log_typ() {
		return getConstString(offset + 4, $batch_log_typ);
	}

	/**
	 * Log type ログ区分.<p>
	 *
	 */
	public void batch_log_typ(String value) {
		setConstString(offset + 4, $batch_log_typ, value);
	}


	/**
	 * Log type name ログ区分名.<p>
	 *
	 */
	public String batch_log_typ_nm() {
		return getConstString(offset + 5, $batch_log_typ_nm);
	}

	/**
	 * Log type name ログ区分名.<p>
	 *
	 */
	public void batch_log_typ_nm(String value) {
		setConstString(offset + 5, $batch_log_typ_nm, value);
	}


	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return getConstString(offset + 6, $msg_id);
	}

	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		setConstString(offset + 6, $msg_id, value);
	}


	/**
	 * Message level メッセージレベル.<p>
	 *
	 */
	public String msg_lvl() {
		return getConstString(offset + 7, $msg_lvl);
	}

	/**
	 * Message level メッセージレベル.<p>
	 *
	 */
	public void msg_lvl(String value) {
		setConstString(offset + 7, $msg_lvl, value);
	}


	/**
	 * Message メッセージ.<p>
	 *
	 */
	public String msg_txt() {
		return getConstString(offset + 8, $msg_txt);
	}

	/**
	 * Message メッセージ.<p>
	 *
	 */
	public void msg_txt(String value) {
		setConstString(offset + 8, $msg_txt, value);
	}


	/**
	 * Log output date and time ログ出力日時.<p>
	 *
	 */
	public MCTimestamp log_ts() {
		return getConstTimestamp(offset + 9, $log_ts);
	}

	/**
	 * Log output date and time ログ出力日時.<p>
	 *
	 */
	public void log_ts(MCTimestamp value) {
		setConstTimestamp(offset + 9, $log_ts, value);
	}


	public String getString(String name) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($batch_log_typ.equalsIgnoreCase(name)) {
			return batch_log_typ();
		}
		if ($batch_log_typ_nm.equalsIgnoreCase(name)) {
			return batch_log_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg_lvl.equalsIgnoreCase(name)) {
			return msg_lvl();
		}
		if ($msg_txt.equalsIgnoreCase(name)) {
			return msg_txt();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($log_ts.equalsIgnoreCase(name)) {
			return log_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($batch_log_typ.equalsIgnoreCase(name)) {
			return batch_log_typ();
		}
		if ($batch_log_typ_nm.equalsIgnoreCase(name)) {
			return batch_log_typ_nm();
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			return msg_id();
		}
		if ($msg_lvl.equalsIgnoreCase(name)) {
			return msg_lvl();
		}
		if ($msg_txt.equalsIgnoreCase(name)) {
			return msg_txt();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($log_ts.equalsIgnoreCase(name)) {
			return log_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($batch_log_typ.equalsIgnoreCase(name)) {
			batch_log_typ(value);
			return;
		}
		if ($batch_log_typ_nm.equalsIgnoreCase(name)) {
			batch_log_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg_lvl.equalsIgnoreCase(name)) {
			msg_lvl(value);
			return;
		}
		if ($msg_txt.equalsIgnoreCase(name)) {
			msg_txt(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($log_ts.equalsIgnoreCase(name)) {
			log_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($batch_log_typ.equalsIgnoreCase(name)) {
			batch_log_typ(value);
			return;
		}
		if ($batch_log_typ_nm.equalsIgnoreCase(name)) {
			batch_log_typ_nm(value);
			return;
		}
		if ($msg_id.equalsIgnoreCase(name)) {
			msg_id(value);
			return;
		}
		if ($msg_lvl.equalsIgnoreCase(name)) {
			msg_lvl(value);
			return;
		}
		if ($msg_txt.equalsIgnoreCase(name)) {
			msg_txt(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($log_ts.equalsIgnoreCase(name)) {
			log_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}



}

