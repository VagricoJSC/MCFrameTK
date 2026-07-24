package mcframe.commonMA.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.MCAppConst;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCAppException;
//settingSheetのCUSTOM_IMPORT_LISTの文字列を出力
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MAC_NUM_SYS_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "NUM_SYS_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_NUM_SYS_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "num_sys_typ";

	public static final String $NAME = "num_sys_typ_nm";

	public static final String $LENGTH = "length";

	public static final String $PREFIX = "prefix";

	/*
	 * 定数の定義です。
	 */
	/** 発番システム区分：ＢＯＭキー
	 */
	public static final MAC_NUM_SYS_TYP BOM_KEY = create("MAS_BOM_KEY", "BOM_KEY", new MCNumber(15), null);

	/** 発番システム区分：汎用ＢＯＭキー
	 */
	public static final MAC_NUM_SYS_TYP GP_BOM_KEY = create("MAS_GP_BOM_KEY", "GP_BOM_KEY", new MCNumber(15), null);

	/** 発番システム区分：業務データダウンロード履歴ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BIZ_DAT_DL_HST = create("MAS_BIZ_DAT_DL_HST", "BIZ_DAT_DL_HST", new MCNumber(15), null);

	/** 発番システム区分：バッチデータＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BATCH_DATA = create("MAS_BATCH_DATA", "BATCH_DATA", new MCNumber(20), null);

	/** 発番システム区分：プッシュ通知ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP PUSH_NTC_NO = create("MAS_PUSH_NTC", "PUSH_NTC_NO", new MCNumber(15), null);

	/** 発番システム区分：付加情報ＩＤ
	 */
	public static final MAC_NUM_SYS_TYP ATTACH_INFO_ID = create("MAS_ATTACH_INFO_ID", "ATTACH_INFO_ID", new MCNumber(20), null);

	/** 発番システム区分：ＥＳＢファイルＩＤ
	 */
	public static final MAC_NUM_SYS_TYP ESB_FILE_ID = create("MAS_ESB_FILE_ID", "ESB_FILE_ID", new MCNumber(15), null);

	/** 発番システム区分：ＥＳＢデータＮＯ
	 */
	public static final MAC_NUM_SYS_TYP ESB_DATA_NO = create("MAS_ESB_DATA_NO", "ESB_DATA_NO", new MCNumber(15), null);

	/** 発番システム区分：会計原価のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_COST = create("MBS_AC_COST", "AC_COST", new MCNumber(15), null);

	/** 発番システム区分：会計受払のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_IO = create("MBS_AC_IO", "AC_IO", new MCNumber(15), null);

	/** 発番システム区分：会計在庫のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_STK = create("MBS_AC_STK", "AC_STK", new MCNumber(15), null);

	/** 発番システム区分：会計入金のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_RCV = create("MBS_AC_RCV", "AC_RCV", new MCNumber(15), null);

	/** 発番システム区分：会計手形のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_NOTE = create("MBS_AC_NOTE", "AC_NOTE", new MCNumber(15), null);

	/** 発番システム区分：仕訳送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP JOURNAL_SND_IF_DATA_LNO = create("MBS_JOURNAL_SND_IF_DATA_LNO", "JOURNAL_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：手形送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP NOTE_SND_IF_DATA_LNO = create("MBS_NOTE_SND_IF_DATA_LNO", "NOTE_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：取引先マスタ送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BP_SND_IF_DATA_LNO = create("MBS_BP_SND_IF_DATA_LNO", "BP_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：勘定科目マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP ACCOUNT_IF_DATA_LNO = create("MBS_ACCOUNT_IF_DATA_LNO", "ACCOUNT_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：補助勘定科目マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP SUB_ACCOUNT_IF_DATA_LNO = create("MBS_SUB_ACCOUNT_IF_DATA_LNO", "SUB_ACCOUNT_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：会計部門マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP AC_DPT_IF_DATA_LNO = create("MBS_AC_DPT_IF_DATA_LNO", "AC_DPT_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：銀行マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BANK_IF_DATA_LNO = create("MBS_BANK_IF_DATA_LNO", "BANK_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：銀行支店マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BANK_BRANCH_IF_DATA_LNO = create("MBS_BANK_BRANCH_IF_DATA_LNO", "BANK_BRANCH_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：口座マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BANK_AC_IF_DATA_LNO = create("MBS_BANK_AC_IF_DATA_LNO", "BANK_AC_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：為替レートマスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP CUR_XRATE_IF_DATA_LNO = create("MBS_CUR_XRATE_IF_DATA_LNO", "CUR_XRATE_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：会計税マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP AC_TAX_IF_DATA_LNO = create("MBS_AC_TAX_IF_DATA_LNO", "AC_TAX_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：口座科目設定マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BAC_AC_IF_DATA_LNO = create("MBS_BAC_AC_IF_DATA_LNO", "BAC_AC_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：会計支払のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_PAY = create("MBS_AC_PAY", "AC_PAY", new MCNumber(15), null);

	/** 発番システム区分：会計支払依頼のデータNO
	 */
	public static final MAC_NUM_SYS_TYP AC_SCHD_PAY = create("MBS_AC_SCHD_PAY", "AC_SCHD_PAY", new MCNumber(15), null);

	/** 発番システム区分：支払依頼送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP SCHD_PAY_SND_IF_DATA_LNO = create("MBS_SCHD_PAY_SND_IF_DATA_LNO", "SCHD_PAY_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：取引先マスタ送信ＩＦ（外部システム連携）のデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BP_SND_IF_EXT_DATA_LNO = create("MBS_BP_SND_IF_EXT_DATA_LNO", "BP_SND_IF_EXT_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：品目マスタ送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP ITM_SND_IF_DATA_LNO = create("MBS_ITM_SND_IF_DATA_LNO", "ITM_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：取引先禁止マスタ送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BP_STOP_SND_IF_DATA_LNO = create("MBS_BP_STOP_SND_IF_DATA_LNO", "BP_STOP_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：品目禁止マスタ送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP ITM_STOP_SND_IF_DATA_LNO = create("MBS_ITM_STOP_SND_IF_DATA_LNO", "ITM_STOP_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：輸出規制マスタ送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP EX_CTRL_SND_IF_DATA_LNO = create("MBS_EX_CTRL_SND_IF_DATA_LNO", "EX_CTRL_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：マスタ送信ＩＦのデータＮＯ
	 */
	public static final MAC_NUM_SYS_TYP MST_SND_IF_DATA_NO = create("MAS_MST_SND_IF_DATA_NO", "MST_SND_IF_DATA_NO", new MCNumber(15), null);

	/** 発番システム区分：売上伝票ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP SLS_SLIP = create("MBS_SLS_SLIP", "SLS_SLIP", new MCNumber(15), null);

	/** 発番システム区分：仕入伝票ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP PURC_SLIP = create("MBS_PURC_SLIP", "PURC_SLIP", new MCNumber(15), null);

	/** 発番システム区分：売上伝票送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP SLS_SLIP_SND_IF_DATA_LNO = create("MBS_SLS_SLIP_SND_IF_DATA_LNO", "SLS_SLIP_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：仕入伝票送信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP PURC_SLIP_SND_IF_DATA_LNO = create("MBS_PURC_SLIP_SND_IF_DATA_LNO", "PURC_SLIP_SND_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：購買単価マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP PURC_UPRI_IF_DATA_LNO = create("MBS_PURC_UPRI_IF_DATA_LNO", "PURC_UPRI_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：加工単価マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP PROC_UPRI_IF_DATA_LNO = create("MBS_PROC_UPRI_IF_DATA_LNO", "PROC_UPRI_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：取引先マスタ受信ＩＦのデータ行ＮＯ
	 */
	public static final MAC_NUM_SYS_TYP BP_IF_DATA_LNO = create("MBS_BP_IF_DATA_LNO", "BP_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：添付ファイル情報の帳票管理ＩＤ
	 */
	public static final MAC_NUM_SYS_TYP ATTACHMENT = create("MBS_ATTACHMENT", "ATTACHMENT", new MCNumber(15), null);

	/** 発番システム区分：帳票名称に使用する連番
	 */
	public static final MAC_NUM_SYS_TYP FILENM_SEQ = create("MBS_FILENM_SEQ", "FILENM_SEQ", new MCNumber(15), null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_NUM_SYS_TYP create() {
		return new MAC_NUM_SYS_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_NUM_SYS_TYP get(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		if (type == null) {
			throw MAC_NUM_SYS_TYP.invalidValue(value);
		}
		return type;
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * valueが定数グループに属している場合は、valueと一致した定数インスタンスを返します。
	 * 定数グループに属していない場合はnullを返します。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 */
	public static MAC_NUM_SYS_TYP getNE(String value) {
		for (MAC_NUM_SYS_TYP me : MAC_NUM_SYS_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_NUM_SYS_TYP create(String value, String xmlKey, MCNumber attr1, String attr2) {
		MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addNumberColumn($LENGTH, attr1);
		me.constR.addStringColumn($PREFIX, attr2);
		return me;
	}

	/*
	 * 各フィールドのgetterです。
	 */
	@Override
	protected String moduleID() {
		return moduleID;
	}

	@Override
	protected String typeID() {
		return typeID;
	}

	/**
	 * DB保存する場合などに使用するプリミティブな値を取得します。
	 * ロジックが保持している値が定数と同値であるかどうかを判断する場合には、
	 * <pre>  [定数クラス].is[定数名]([値を保持している変数])</pre>。
	 * を使用してください。
	 * <pre>  [定数クラス].[定数名].value.equals([値を保持している変数])</pre>
	 * という実装は推奨しません。
	 * @return 定数値
	 */
	public String value() {
		return constR.getString($VALUE);
	}

	/** 
	 * lengthの値を返します。
	 * @return lengthの値
	 */
	public MCNumber length() {
		return constR.getNumberNE($LENGTH);
	}

	/** 
	 * valueに対応する定数のlengthの値を返します。
	 * @param value 定数値
	 * @return lengthの値
	 */
	public static MCNumber length(String value) {
		MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.length();
	}

	/** 
	 * prefixの値を返します。
	 * @return prefixの値
	 */
	public String prefix() {
		return constR.getStringNE($PREFIX);
	}

	/** 
	 * valueに対応する定数のprefixの値を返します。
	 * @param value 定数値
	 * @return prefixの値
	 */
	public static String prefix(String value) {
		MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.prefix();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.getNE(value);
		if (me != null) {
			return true;
		}
		else {
			return false;
		}
	}

	/** 
	 * 指定されたvalueが定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 値
	 */
	public static void containsEx(String value) {
		MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.getNE(value);
		if (me == null) {
			throw MAC_NUM_SYS_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.getNE(value);
		if (me == null) {
			if (binds == null) {
				throw new MCAppException(msgid, value);
			}else{
				throw new MCAppException(msgid, binds);
			}
		}
	}


	/*
	 * toStringメソッドのオーバーライドです。
	 */
	public String toString() {
		return createStringPath(value(), name(), length(), prefix());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_NUM_SYS_TYP[] array() {
		if (array == null) {
			array = new MAC_NUM_SYS_TYP[] {
					MAC_NUM_SYS_TYP.BOM_KEY, MAC_NUM_SYS_TYP.GP_BOM_KEY, MAC_NUM_SYS_TYP.BIZ_DAT_DL_HST, MAC_NUM_SYS_TYP.BATCH_DATA, MAC_NUM_SYS_TYP.PUSH_NTC_NO, 
					 MAC_NUM_SYS_TYP.ATTACH_INFO_ID, MAC_NUM_SYS_TYP.ESB_FILE_ID, MAC_NUM_SYS_TYP.ESB_DATA_NO, MAC_NUM_SYS_TYP.AC_COST, MAC_NUM_SYS_TYP.AC_IO, MAC_NUM_SYS_TYP.AC_STK, 
					 MAC_NUM_SYS_TYP.AC_RCV, MAC_NUM_SYS_TYP.AC_NOTE, MAC_NUM_SYS_TYP.JOURNAL_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.NOTE_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.ACCOUNT_IF_DATA_LNO, 
					 MAC_NUM_SYS_TYP.SUB_ACCOUNT_IF_DATA_LNO, MAC_NUM_SYS_TYP.AC_DPT_IF_DATA_LNO, MAC_NUM_SYS_TYP.BANK_IF_DATA_LNO, MAC_NUM_SYS_TYP.BANK_BRANCH_IF_DATA_LNO, MAC_NUM_SYS_TYP.BANK_AC_IF_DATA_LNO, MAC_NUM_SYS_TYP.CUR_XRATE_IF_DATA_LNO, 
					 MAC_NUM_SYS_TYP.AC_TAX_IF_DATA_LNO, MAC_NUM_SYS_TYP.BAC_AC_IF_DATA_LNO, MAC_NUM_SYS_TYP.AC_PAY, MAC_NUM_SYS_TYP.AC_SCHD_PAY, MAC_NUM_SYS_TYP.SCHD_PAY_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.BP_SND_IF_EXT_DATA_LNO, 
					 MAC_NUM_SYS_TYP.ITM_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.BP_STOP_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.ITM_STOP_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.EX_CTRL_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.MST_SND_IF_DATA_NO, MAC_NUM_SYS_TYP.SLS_SLIP, 
					 MAC_NUM_SYS_TYP.PURC_SLIP, MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.PURC_SLIP_SND_IF_DATA_LNO, MAC_NUM_SYS_TYP.PURC_UPRI_IF_DATA_LNO, MAC_NUM_SYS_TYP.PROC_UPRI_IF_DATA_LNO, MAC_NUM_SYS_TYP.BP_IF_DATA_LNO, 
					 MAC_NUM_SYS_TYP.ATTACHMENT, MAC_NUM_SYS_TYP.FILENM_SEQ
			};
		}
		return array;
	}

	/**
	 * 定数の値と名称のListを返します。
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list() {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MAC_NUM_SYS_TYP me : MAC_NUM_SYS_TYP.array()) {
			MCRow r = MCRow.create();
			r.addStringColumn($VALUE, me.value());
			r.addStringColumn($NAME, me.name());
			list.add(r);
		}
		return list;
	}

	/**
	 * キーに対応する値を取得します。
	 * @return 値
	 */
	protected static String value(String key) {
		for (MAC_NUM_SYS_TYP me : MAC_NUM_SYS_TYP.array()) {
			if(me.key().equals(key)){
				return me.value();
			}
		}
		return null;
	}

	/**
	 * キーの配列を取得します。
	 * @return キーの配列
	 */
	protected static List<String> getKeys() {
		List<String> keys = new ArrayList<String>();
		for (MAC_NUM_SYS_TYP me : MAC_NUM_SYS_TYP.array()) {
			keys.add(me.key());
		}
		return keys;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(MCRow row) {
		Map<String, Boolean> kl = new HashMap<String, Boolean>();
		for(String s : row.getColumnPathArray()){
			if(MAC_NUM_SYS_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_NUM_SYS_TYP me = MAC_NUM_SYS_TYP.get(MAC_NUM_SYS_TYP.value(e.getKey()));
				MCRow r = list.createRow();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_NUM_SYS_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_NUM_SYS_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_NUM_SYS_TYP.list();
			}
			return list;
		}
	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数 cols と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(String[] cols, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MAC_NUM_SYS_TYP me : MAC_NUM_SYS_TYP.array()) {
			if(MAC_NUM_SYS_TYP.isSameVals(me, cols, vals)){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数colValMapの、キーを定数カラム、値を定数カラムに対応する値、とみなし、それに一致する定数のリストを返します。
	 * @param colValMap キーにカラム名、値に定数カラムに対応する値を持つマップ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(Map<String, Comparable<?>> colValMap) {
		MCList<MCRow> list;
		if(colValMap != null && 0 < colValMap.size()){
			int s = colValMap.size();
			String[] cols = new String[s];
			Comparable<?>[] vals =new Comparable<?>[s];
			int i = 0;
			for(Map.Entry<String, Comparable<?>> e : colValMap.entrySet()){
				cols[i] = e.getKey();
				vals[i] = e.getValue();
				i =+ 1;
			}
			list = MAC_NUM_SYS_TYP.subList(cols, vals);
		}
		else{
			list = MCList.create(MCRow.class);
		}
		return list;
	}

	/**
	 * 指定されたカラムの値がひとつも一致しない範囲の値と名称のListを返します。<p>
	 * 定数インスタンスの保持するconstR に存在しないカラムを指定した場合、例外をthrowします。
	 * @param col カラム名
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> exptSubList(String col, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		String[] cols = {col};
		Comparable<?>[] val = new Comparable<?>[1];
		for (MAC_NUM_SYS_TYP me : MAC_NUM_SYS_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_NUM_SYS_TYP.isSameVals(me, cols, val)){
					f = false;
					break;
				}
			}
			if(f){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 定数の保持するconstR のカラム(引数 cols)の値が、引数 valsと一致する場合、trueを返します。<p>
	 * 引数 keys と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param me 定数インスタンス
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 */
	protected static boolean isSameVals(MAC_NUM_SYS_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_NUM_SYS_TYP", col);}
			Comparable<?> rVal = me.constR.getValue(col);
			if(!isSame(rVal, val)){
				f = false;
				break;
			}
		}
		return f;
	}

	/**
	 * デフォルトの比較メソッド
	 * staticオブジェクト同士の比較なので、==演算子を使用している。
	 * @param type 定数インスタンス
	 * @return 一致していればtrue
	 */
	protected boolean isSame(MAC_NUM_SYS_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 発番システム区分：ＢＯＭキーかどうか
	 * @param value 定数値
	 * @return 定数値がＢＯＭキーの値の場合true
	 */
	public static boolean isBOM_KEY(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BOM_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：ＢＯＭキーかどうか
	 * @param type 属性値
	 * @return 属性値がＢＯＭキーの値の場合true
	 */
	public static boolean isBOM_KEY(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BOM_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：汎用ＢＯＭキーかどうか
	 * @param value 定数値
	 * @return 定数値が汎用ＢＯＭキーの値の場合true
	 */
	public static boolean isGP_BOM_KEY(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.GP_BOM_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：汎用ＢＯＭキーかどうか
	 * @param type 属性値
	 * @return 属性値が汎用ＢＯＭキーの値の場合true
	 */
	public static boolean isGP_BOM_KEY(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.GP_BOM_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：業務データダウンロード履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が業務データダウンロード履歴ＮＯの値の場合true
	 */
	public static boolean isBIZ_DAT_DL_HST(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BIZ_DAT_DL_HST.isSame(type);
	}

	/**
	 * 発番システム区分：業務データダウンロード履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が業務データダウンロード履歴ＮＯの値の場合true
	 */
	public static boolean isBIZ_DAT_DL_HST(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BIZ_DAT_DL_HST.isSame(type);
	}

	/**
	 * 発番システム区分：バッチデータＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がバッチデータＮＯの値の場合true
	 */
	public static boolean isBATCH_DATA(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BATCH_DATA.isSame(type);
	}

	/**
	 * 発番システム区分：バッチデータＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がバッチデータＮＯの値の場合true
	 */
	public static boolean isBATCH_DATA(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BATCH_DATA.isSame(type);
	}

	/**
	 * 発番システム区分：プッシュ通知ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がプッシュ通知ＮＯの値の場合true
	 */
	public static boolean isPUSH_NTC_NO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.PUSH_NTC_NO.isSame(type);
	}

	/**
	 * 発番システム区分：プッシュ通知ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がプッシュ通知ＮＯの値の場合true
	 */
	public static boolean isPUSH_NTC_NO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.PUSH_NTC_NO.isSame(type);
	}

	/**
	 * 発番システム区分：付加情報ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が付加情報ＩＤの値の場合true
	 */
	public static boolean isATTACH_INFO_ID(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ATTACH_INFO_ID.isSame(type);
	}

	/**
	 * 発番システム区分：付加情報ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が付加情報ＩＤの値の場合true
	 */
	public static boolean isATTACH_INFO_ID(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ATTACH_INFO_ID.isSame(type);
	}

	/**
	 * 発番システム区分：ＥＳＢファイルＩＤかどうか
	 * @param value 定数値
	 * @return 定数値がＥＳＢファイルＩＤの値の場合true
	 */
	public static boolean isESB_FILE_ID(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ESB_FILE_ID.isSame(type);
	}

	/**
	 * 発番システム区分：ＥＳＢファイルＩＤかどうか
	 * @param type 属性値
	 * @return 属性値がＥＳＢファイルＩＤの値の場合true
	 */
	public static boolean isESB_FILE_ID(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ESB_FILE_ID.isSame(type);
	}

	/**
	 * 発番システム区分：ＥＳＢデータＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がＥＳＢデータＮＯの値の場合true
	 */
	public static boolean isESB_DATA_NO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ESB_DATA_NO.isSame(type);
	}

	/**
	 * 発番システム区分：ＥＳＢデータＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がＥＳＢデータＮＯの値の場合true
	 */
	public static boolean isESB_DATA_NO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ESB_DATA_NO.isSame(type);
	}

	/**
	 * 発番システム区分：会計原価のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計原価のデータNOの値の場合true
	 */
	public static boolean isAC_COST(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_COST.isSame(type);
	}

	/**
	 * 発番システム区分：会計原価のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計原価のデータNOの値の場合true
	 */
	public static boolean isAC_COST(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_COST.isSame(type);
	}

	/**
	 * 発番システム区分：会計受払のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計受払のデータNOの値の場合true
	 */
	public static boolean isAC_IO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_IO.isSame(type);
	}

	/**
	 * 発番システム区分：会計受払のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計受払のデータNOの値の場合true
	 */
	public static boolean isAC_IO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_IO.isSame(type);
	}

	/**
	 * 発番システム区分：会計在庫のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計在庫のデータNOの値の場合true
	 */
	public static boolean isAC_STK(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_STK.isSame(type);
	}

	/**
	 * 発番システム区分：会計在庫のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計在庫のデータNOの値の場合true
	 */
	public static boolean isAC_STK(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_STK.isSame(type);
	}

	/**
	 * 発番システム区分：会計入金のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計入金のデータNOの値の場合true
	 */
	public static boolean isAC_RCV(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_RCV.isSame(type);
	}

	/**
	 * 発番システム区分：会計入金のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計入金のデータNOの値の場合true
	 */
	public static boolean isAC_RCV(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_RCV.isSame(type);
	}

	/**
	 * 発番システム区分：会計手形のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計手形のデータNOの値の場合true
	 */
	public static boolean isAC_NOTE(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_NOTE.isSame(type);
	}

	/**
	 * 発番システム区分：会計手形のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計手形のデータNOの値の場合true
	 */
	public static boolean isAC_NOTE(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_NOTE.isSame(type);
	}

	/**
	 * 発番システム区分：仕訳送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕訳送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isJOURNAL_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.JOURNAL_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：仕訳送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕訳送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isJOURNAL_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.JOURNAL_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：手形送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が手形送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isNOTE_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.NOTE_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：手形送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が手形送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isNOTE_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.NOTE_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：勘定科目マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が勘定科目マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isACCOUNT_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ACCOUNT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：勘定科目マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が勘定科目マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isACCOUNT_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ACCOUNT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：補助勘定科目マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が補助勘定科目マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isSUB_ACCOUNT_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.SUB_ACCOUNT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：補助勘定科目マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が補助勘定科目マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isSUB_ACCOUNT_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.SUB_ACCOUNT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：会計部門マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が会計部門マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isAC_DPT_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_DPT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：会計部門マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が会計部門マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isAC_DPT_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_DPT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：銀行マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が銀行マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBANK_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BANK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：銀行マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が銀行マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBANK_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BANK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：銀行支店マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が銀行支店マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBANK_BRANCH_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BANK_BRANCH_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：銀行支店マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が銀行支店マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBANK_BRANCH_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BANK_BRANCH_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：口座マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が口座マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBANK_AC_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BANK_AC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：口座マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が口座マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBANK_AC_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BANK_AC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：為替レートマスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が為替レートマスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isCUR_XRATE_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.CUR_XRATE_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：為替レートマスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が為替レートマスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isCUR_XRATE_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.CUR_XRATE_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：会計税マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が会計税マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isAC_TAX_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_TAX_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：会計税マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が会計税マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isAC_TAX_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_TAX_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：口座科目設定マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が口座科目設定マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBAC_AC_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BAC_AC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：口座科目設定マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が口座科目設定マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBAC_AC_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BAC_AC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：会計支払のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計支払のデータNOの値の場合true
	 */
	public static boolean isAC_PAY(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_PAY.isSame(type);
	}

	/**
	 * 発番システム区分：会計支払のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計支払のデータNOの値の場合true
	 */
	public static boolean isAC_PAY(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_PAY.isSame(type);
	}

	/**
	 * 発番システム区分：会計支払依頼のデータNOかどうか
	 * @param value 定数値
	 * @return 定数値が会計支払依頼のデータNOの値の場合true
	 */
	public static boolean isAC_SCHD_PAY(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.AC_SCHD_PAY.isSame(type);
	}

	/**
	 * 発番システム区分：会計支払依頼のデータNOかどうか
	 * @param type 属性値
	 * @return 属性値が会計支払依頼のデータNOの値の場合true
	 */
	public static boolean isAC_SCHD_PAY(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.AC_SCHD_PAY.isSame(type);
	}

	/**
	 * 発番システム区分：支払依頼送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払依頼送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isSCHD_PAY_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.SCHD_PAY_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：支払依頼送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払依頼送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isSCHD_PAY_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.SCHD_PAY_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先マスタ送信ＩＦ（外部システム連携）のデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ送信ＩＦ（外部システム連携）のデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_SND_IF_EXT_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BP_SND_IF_EXT_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先マスタ送信ＩＦ（外部システム連携）のデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ送信ＩＦ（外部システム連携）のデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_SND_IF_EXT_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BP_SND_IF_EXT_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：品目マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isITM_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ITM_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：品目マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isITM_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ITM_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先禁止マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が取引先禁止マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_STOP_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BP_STOP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先禁止マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が取引先禁止マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_STOP_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BP_STOP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：品目禁止マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が品目禁止マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isITM_STOP_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ITM_STOP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：品目禁止マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が品目禁止マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isITM_STOP_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ITM_STOP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：輸出規制マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が輸出規制マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isEX_CTRL_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.EX_CTRL_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：輸出規制マスタ送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が輸出規制マスタ送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isEX_CTRL_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.EX_CTRL_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：マスタ送信ＩＦのデータＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がマスタ送信ＩＦのデータＮＯの値の場合true
	 */
	public static boolean isMST_SND_IF_DATA_NO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.MST_SND_IF_DATA_NO.isSame(type);
	}

	/**
	 * 発番システム区分：マスタ送信ＩＦのデータＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がマスタ送信ＩＦのデータＮＯの値の場合true
	 */
	public static boolean isMST_SND_IF_DATA_NO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.MST_SND_IF_DATA_NO.isSame(type);
	}

	/**
	 * 発番システム区分：売上伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上伝票ＮＯの値の場合true
	 */
	public static boolean isSLS_SLIP(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.SLS_SLIP.isSame(type);
	}

	/**
	 * 発番システム区分：売上伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上伝票ＮＯの値の場合true
	 */
	public static boolean isSLS_SLIP(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.SLS_SLIP.isSame(type);
	}

	/**
	 * 発番システム区分：仕入伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入伝票ＮＯの値の場合true
	 */
	public static boolean isPURC_SLIP(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.PURC_SLIP.isSame(type);
	}

	/**
	 * 発番システム区分：仕入伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入伝票ＮＯの値の場合true
	 */
	public static boolean isPURC_SLIP(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.PURC_SLIP.isSame(type);
	}

	/**
	 * 発番システム区分：売上伝票送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上伝票送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isSLS_SLIP_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：売上伝票送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上伝票送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isSLS_SLIP_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入伝票送信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入伝票送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isPURC_SLIP_SND_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.PURC_SLIP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入伝票送信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入伝票送信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isPURC_SLIP_SND_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.PURC_SLIP_SND_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：購買単価マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買単価マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isPURC_UPRI_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.PURC_UPRI_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：購買単価マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買単価マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isPURC_UPRI_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.PURC_UPRI_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：加工単価マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が加工単価マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isPROC_UPRI_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.PROC_UPRI_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：加工単価マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が加工単価マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isPROC_UPRI_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.PROC_UPRI_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_IF_DATA_LNO(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.BP_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：取引先マスタ受信ＩＦのデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ受信ＩＦのデータ行ＮＯの値の場合true
	 */
	public static boolean isBP_IF_DATA_LNO(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.BP_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：添付ファイル情報の帳票管理ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が添付ファイル情報の帳票管理ＩＤの値の場合true
	 */
	public static boolean isATTACHMENT(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.ATTACHMENT.isSame(type);
	}

	/**
	 * 発番システム区分：添付ファイル情報の帳票管理ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が添付ファイル情報の帳票管理ＩＤの値の場合true
	 */
	public static boolean isATTACHMENT(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.ATTACHMENT.isSame(type);
	}

	/**
	 * 発番システム区分：帳票名称に使用する連番かどうか
	 * @param value 定数値
	 * @return 定数値が帳票名称に使用する連番の値の場合true
	 */
	public static boolean isFILENM_SEQ(String value) {
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		return MAC_NUM_SYS_TYP.FILENM_SEQ.isSame(type);
	}

	/**
	 * 発番システム区分：帳票名称に使用する連番かどうか
	 * @param type 属性値
	 * @return 属性値が帳票名称に使用する連番の値の場合true
	 */
	public static boolean isFILENM_SEQ(MAC_NUM_SYS_TYP type) {
		return MAC_NUM_SYS_TYP.FILENM_SEQ.isSame(type);
	}

	/**
	 * 定数グループの名称を返します。
	 */
	public static String getGrpName() {
		return getGrpName(moduleID, typeID);
	}

	/**
	 * 定数グループの名称を返します。
	 * @param lc ロケール
	 */
	public static String getGrpName(Locale lcl) {
		return getGrpName(lcl, moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 */
	public static String getGrpRmrks() {
		return getGrpRmrks(moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 * @param lc ロケール
	 */
	public static String getGrpRmrks(Locale lcl) {
		return getGrpRmrks(lcl, moduleID, typeID);
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.get(value);
		row.setString(nameColumn, type.name());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn , Locale lcl) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.get(value);
		row.setString(nameColumn, type.name());
		row.setString(rmrksColumn, type.rmrks());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
			row.setString(rmrksColumn, type.rmrks());
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
		row.setString(rmrksColumn, type.rmrks(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_NUM_SYS_TYP type = MAC_NUM_SYS_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
			row.setString(rmrksColumn, type.rmrks(lcl));
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

}
