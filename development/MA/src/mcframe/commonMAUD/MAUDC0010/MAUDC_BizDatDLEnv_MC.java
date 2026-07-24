package mcframe.commonMAUD.MAUDC0010;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.report.container.MCReportInfoR;

public class MAUDC_BizDatDLEnv_MC {

	/**
	 * 自身のクラス
	 */
	public static Class<MAUDC_BizDatDLEnv> BIZ_DAT_DL_ENV_CLAZZ =
			MAUDC_BizDatDLEnv.class;

	/**
	 * インスタンスを取得します。
	 */
	protected static MAUDC_BizDatDLEnv me() {
		return new MAUDC_BizDatDLEnv();
	}

	/**
	 * ファイル情報を取り扱うクラス
	 */
	public static class FileInfo {

		/**
		 * XLS形式
		 */
		public static final String XLS = "xls";

		/**
		 * XLSX形式
		 */
		public static final String XLSX = "xlsx";

		/**
		 * CSV形式
		 */
		public static final String CSV = "csv";

		/**
		 * 区切り文字
		 */
		public static final String SEP = ".";

		/**
		 * XLS形式の最大行数
		 */
		public static final int MAX_ROW_XLS = 65536;

		/**
		 * XLS形式の最大列数
		 */
		public static final int MAX_COL_XLS = 256;

		/**
		 * XLSX形式の最大行数
		 */
		public static final int MAX_ROW_XLSX = 1048576;

		/**
		 * XLSX形式の最大列数
		 */
		public static final int MAX_COL_XLSX = 16384;

		/**
		 * ファイルパスに対応する拡張子を取得します。
		 */
		public static String getExt(String path) {
			return me()._getExt(path);
		}

		/**
		 * ファイルパスに対応するファイルタイプを取得します。
		 */
		public static String getTyp(String path) {
			return me()._getTyp(path);
		}

		/**
		 * 連番を加味したファイルパスを取得します。
		 */
		public static String getRevPath(String path, int cnt) {
			return me()._getRevPath(path, cnt);
		}

	}

	/**
	 * ファイルパスに対応する拡張子を取得します。
	 */
	protected String _getExt(String path) {
		String ret = null;
		if (path != null) {
			int p = path.lastIndexOf(FileInfo.SEP);
			if (p != -1) {
				ret = path.substring(p);
			}
		}
		return ret;
	}

	/**
	 * ファイルパスに対応するファイルタイプを取得します。
	 */
	protected String _getTyp(String path) {
		String ext = _getExt(path);
		if (ext != null) {
			switch (ext.substring(FileInfo.SEP.length()).toLowerCase()) {
				case FileInfo.XLS :
					return FileInfo.XLS;
				case FileInfo.XLSX :
					return FileInfo.XLSX;
				case FileInfo.CSV :
					return FileInfo.CSV;
			}
		}
		return null;
	}

	/**
	 * 連番を加味したファイルパスを取得します。
	 */
	public String _getRevPath(String path, int cnt) {
		String ret = path;
		if (cnt > 0) {
			String ext = FileInfo.getExt(path);
			if (ext != null) {
				int n = path.length() - ext.length();
				ret = path.substring(0, n) + "_" + (cnt + 1) + ext;
			}
		}
		return ret;
	}

	/**
	 * 上りのファイルダウンロード制御情報を取り扱うクラス
	 */
	public static class UpDLInfo {

		/**
		 * ファイルダウンロード先を管理する拡張引数のキー
		 */
		public static final String PATH = "BIZ_DAT_DL_PATH";

		/**
		 * ダウンロードファイルの拡張子を管理する拡張引数のキー
		 */
		public static final String EXT = "BIZ_DAT_DL_EXT";

		/**
		 * ダウンロード対象の機能を管理する拡張引数のキー
		 */
		public static final String FUNC = "BIZ_DAT_DL_FUNC";

	}

	/**
	 * 下りのファイルダウンロード制御情報を取り扱うクラス
	 */
	public static class DownDLInfo {

		/**
		 * 機能名
		 */
		protected String funcName;

		/**
		 * ファイル名
		 */
		protected String fileName;

		/**
		 * ファイル連番
		 */
		protected int fileSeq;

		/**
		 * 上書きを行うか
		 */
		protected boolean overWrite;

		/**
		 * 上限検索件数
		 */
		protected int limRowCnt;

		/**
		 * 総検索件数
		 */
		protected int ttlCnt;

		public DownDLInfo() {

		}

		public DownDLInfo(String param) {
			String[] arr = MCReportInfoR.strToArray(param);
			// 設定に過不足は無い想定
			funcName = arr[0];
			fileName = arr[1];
			fileSeq = Integer.valueOf(arr[2]);
			overWrite = MCBooleanUtil.dbStringToBoolean(arr[3]);
			limRowCnt = Integer.valueOf(arr[4]);
			ttlCnt = Integer.valueOf(arr[5]);
			hstNo = arr[6];
			reqSrcId = arr[7];
		}

		/**
		 * 機能名を設定します。
		 */
		public void setFuncName(String name) {
			funcName = name;
		}

		/**
		 * 機能名を取得します。
		 */
		public String getFuncName() {
			return funcName;
		}

		/**
		 * ファイル名を設定します。
		 */
		public void setFileName(String name) {
			fileName = name;
		}

		/**
		 * ファイル名を取得します。
		 */
		public String getFileName() {
			return fileName;
		}

		/**
		 * ファイル連番を設定します。
		 */
		public void setFileSeq(int seq) {
			fileSeq = seq;
		}

		/**
		 * ファイル連番を取得します。
		 */
		public int getFileSeq() {
			return fileSeq;
		}

		/**
		 * 上書きを行う場合にtrueを設定します。
		 */
		public void overWrite(boolean flg) {
			overWrite = flg;
		}

		/**
		 * 上書きを行う場合にtrueが返ります。
		 */
		public boolean overWrite() {
			return overWrite;
		}

		/**
		 * 上限検索件数を設定します。
		 */
		public void setLimRowCnt(int cnt) {
			limRowCnt = cnt;
		}

		/**
		 * 上限検索件数を取得します。
		 */
		public int getLimRowCnt() {
			return limRowCnt;
		}

		/**
		 * 総検索件数を設定します。
		 */
		public void setTtlCnt(int cnt) {
			ttlCnt = cnt;
		}

		/**
		 * 総検索件数を取得します。
		 */
		public int getTtlCnt() {
			return ttlCnt;
		}

		/**
		 * 業務データダウンロード実行履歴ＮＯ
		 */
		protected String hstNo;

		/**
		 * 業務データダウンロード実行履歴ＮＯを設定します。
		 */
		public void setHstNo(String no) {
			hstNo = no;
		}

		/**
		 * 業務データダウンロード実行履歴ＮＯを取得します。
		 */
		public String getHstNo() {
			return hstNo;
		}

		/**
		 * 業務データダウンロード実行画面ＩＤ
		 */
		protected String reqSrcId;

		/**
		 * 業務データダウンロード実行画面ＩＤを設定します。
		 */
		public void setReqSrcId(String id) {
			reqSrcId = id;
		}

		/**
		 * 業務データダウンロード実行画面ＩＤを取得します。
		 */
		public String getReqSrcId() {
			return reqSrcId;
		}
		/**
		 * パラメータ文字列を取得します。
		 */
		public String getParam() {
			List<String> list = new ArrayList<>();
			list.add(funcName);
			list.add(fileName);
			list.add(String.valueOf(fileSeq));
			list.add(MCBooleanUtil.booleanToDBString(overWrite));
			list.add(String.valueOf(limRowCnt));
			list.add(String.valueOf(ttlCnt));
			list.add(hstNo);
			list.add(reqSrcId);
			return MCReportInfoR.arrayToStr(list.toArray(new String[0]));
		}

	}

	/**
	 * 下りのファイルダウンロード制御情報を取得します。
	 */
	public static DownDLInfo getDownDLInfo() {
		return new MAUDC_BizDatDLEnv.DownDLInfo();
	}

	/**
	 * 下りのファイルダウンロード制御情報を取得します。
	 */
	public static DownDLInfo getDownDLInfo(String param) {
		return new MAUDC_BizDatDLEnv.DownDLInfo(param);
	}

	/**
	 * クライアントのファイルダウンロード制御情報を取り扱うクラス
	 */
	public static class CltDLInfo {

		/**
		 * デフォルトのファイルタイプを管理するリソースのキー
		 */
		public static String DEF_FILE_TYP = "MA.biz_dat_dl.def_file_typ";

		/**
		 * ファイルダウンロードに使用するカートリッジの名称
		 */
		public static final String CRTG = "BizDatDL";

		/**
		 * ファイルダウンロードの権限文字列
		 */
		public static final String AUTH = "dwnld";

		/**
		 * 業務データダウンロード機能ののリソースのベースキー
		 */
		public static final String BIZ_DAT_DL = "MA.biz_dat_dl";

		/**
		 * 業務データダウンロード機能の初期値設定のリソースのキー
		 */
		public static final String DWNLD = "MA.biz_dat_dl.dwnld";

		/**
		 * 業務画面のダウンロード機能の初期値設定のリソースのキー
		 */
		public static final String BIZ_SCREEN = "MA.biz_dat_dl.biz_screen";

		/**
		 * ファイル名の初期値のリソースのキー
		 */
		public static final String FILE_NM = "file_nm";

		/**
		 * ファイルのタイプの初期値のリソースのキー
		 */
		public static final String FILE_TYP = "file_typ";

		/**
		 * ファイル名置き換え前文字列のリソースのキー
		 */
		public static final String REP_BF_STR = "replace_before_str";

		/**
		 * ファイル名置き換え後文字列のリソースのキー
		 */
		public static final String REP_AF_STR = "replace_after_str";

		/**
		 * ファイル名の日付フォーマットのリソースのキー
		 */
		public static final String TIMESTAMP_FORMAT = "timestamp_format";

		/**
		 * プレースフォルダの業務データID
		 */
		public static final String PH_DAT_DL_ID = "\\{biz_dat_dl_id\\}";

		/**
		 * プレースフォルダの業務データ名
		 */
		public static final String PH_DAT_DL_NM = "\\{biz_dat_dl_nm\\}";

		/**
		 * プレースフォルダの画面ID
		 */
		public static final String PH_SCREEN_ID = "\\{screen_id\\}";

		/**
		 * プレースフォルダの画面名
		 */
		public static final String PH_SCREEN_NM = "\\{screen_nm\\}";

		/**
		 * プレースフォルダのタイムスタンプ
		 */
		public static final String PH_TIMESTAMP = "\\{timestamp\\}";

		/**
		 * デフォルトのファイルタイプを取得します。
		 */
		public static String getDefTyp() {
			return me()._getDefTyp();
		}

		/**
		 * ファイルタイプの候補を取得します。
		 */
		public static String[] getAvlTyps() {
			return me()._getAvlTyps();
		}

	}

	/**
	 * デフォルトのファイルタイプを取得します。
	 */
	protected String _getDefTyp() {
		return FileInfo.XLSX;
	}

	/**
	 * ファイルタイプの候補を取得します。
	 */
	protected String[] _getAvlTyps() {
		return new String[] {
			FileInfo.CSV.toUpperCase(),
			FileInfo.XLSX.toUpperCase()
		};
	}

	/**
	 * サーバのファイルダウンロード制御情報を取り扱うクラス
	 */
	public static class SvrDLInfo {

		/**
		 * オペレーション単位のファイルダウンロード制御リソースの名称
		 */
		public static final String OPE_RES = "MCBizDatDL";

		/**
		 * ダウンロードファイルのカラムを管理するリソースのキー
		 */
		public static final String COLUMN = "column";

		/**
		 * フェッチサイズを管理するリソースのキー
		 */
		public static final String FETCH_SIZE = "MA.biz_dat_dl.fetch_size";

		/**
		 * ガジェット連携用のファイルの拡張子を取得します。
		 */
		public static String getMiningExt() {
			return me()._getMiningExt();
		}

	}

	/**
	 * ガジェット連携用のファイルの拡張子を取得します。
	 */
	protected String _getMiningExt() {
		return FileInfo.SEP + FileInfo.CSV;
	}

	/**
	 * リクエスト単位の情報を取り扱うクラス
	 */
	public static class RequestInfo {

		/**
		 * 初期オペレーション情報
		 */
		protected MCOperationInfo initOpeInfo;

		/**
		 * マイニング用ファイルの出力ディレクトリ
		 */
		protected File miningDir;

		/**
		 * マイニング用ファイルの出力カラム
		 */
		protected String[] miningCols;

		/**
		 * マイニング用ファイル
		 */
		protected File miningFile;

		/**
		 * 初期オペレーション情報を設定します。
		 */
		public void setInitOpeInfo(MCOperationInfo info) {
			if (initOpeInfo == null) {
				initOpeInfo = info;
			}
		}

		/**
		 * 初期オペレーション情報を取得します。
		 */
		public MCOperationInfo getInitOpeInfo() {
			return initOpeInfo;
		}

		/**
		 * マイニング用ファイルの出力ディレクトリを設定します。
		 */
		public void setMiningDir(File file) {
			miningDir = file;
		}

		/**
		 * マイニング用ファイルの出力ディレクトリを取得します。
		 */
		public File getMiningDir() {
			return miningDir;
		}

		/**
		 * マイニング用ファイルの出力カラムを設定します。
		 */
		public void setMiningCols(String[] cols) {
			miningCols = cols;
		}

		/**
		 * マイニング用ファイルの出力カラムを取得します。
		 */
		public String[] getMiningCols() {
			return miningCols;
		}

		/**
		 * マイニング用ファイルを設定します。
		 */
		public void setMiningFile(File file) {
			miningFile = file;
		}

		/**
		 * マイニング用ファイルを取得します。
		 */
		public File getMiningFile() {
			return miningFile;
		}

	}

	/**
	 * リクエスト単位の情報
	 */
	protected RequestInfo requestInfo = null;

	/**
	 * リクエスト単位の情報を取得します。
	 */
	public RequestInfo getRequestInfo() {
		if (requestInfo == null) {
			requestInfo = new MAUDC_BizDatDLEnv.RequestInfo();
		}
		return requestInfo;
	}

}
