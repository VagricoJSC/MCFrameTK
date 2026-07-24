package mcframe.serverPFBZ.PFBZL5040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "PFBZL_FileRecv"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBZL_FileRecv_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBZ";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBZL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBZL_FileRecv.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.PF_PFBZL5040_Srch01_INFO;
		this.aSrch01 = ((PFBZL_FileRecv)this).new Srch01();
	}

	public static PFBZL_FileRecv.Srch01 crtSrch01() {
		PFBZL_FileRecv lgc = new PFBZL_FileRecv();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL5040.CndR createCndR(){
		return mcframe.serverPFBZ.PFBZL5040.CndR.create();
	}

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFBZ.PFBZL5040.DtlR createDtlR(){
		return mcframe.serverPFBZ.PFBZL5040.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> createDtlL(){
		return MCList.create(mcframe.serverPFBZ.PFBZL5040.DtlR.class);
	}
	protected PFBZL_FileRecv.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.PF_PFBZL5040_Srch02_INFO;
		this.aSrch02 = ((PFBZL_FileRecv)this).new Srch02();
	}

	public static PFBZL_FileRecv.Srch02 crtSrch02() {
		PFBZL_FileRecv lgc = new PFBZL_FileRecv();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＦＴＰサーバの監視対象ディレクトリを取得する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBZ.PFBZL5040.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZL5040.CndR.create();
			down0 = MCList.create(mcframe.serverPFBZ.PFBZL5040.DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_FileRecv)PFBZL_FileRecv_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL5040.CndR createCndR(){
			return mcframe.serverPFBZ.PFBZL5040.CndR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL5040.DtlR createDtlR(){
			return mcframe.serverPFBZ.PFBZL5040.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> createDtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL5040.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZL5040.CndR
		 */
		public mcframe.serverPFBZ.PFBZL5040.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>remote_dir</td></tr>
		 * 	<tr><td><br></td><td>local_dir</td></tr>
		 * 	<tr><td><br></td><td>transfer_lock_typ</td></tr>
		 * 	<tr><td><br></td><td>sts_fsuffix</td></tr>
		 * 	<tr><td><br></td><td>ftp_host</td></tr>
		 * 	<tr><td><br></td><td>ftp_user</td></tr>
		 * 	<tr><td><br></td><td>ftp_password</td></tr>
		 * 	<tr><td><br></td><td>ftp_port</td></tr>
		 * 	<tr><td><br></td><td>ftp_mode</td></tr>
		 * 	<tr><td><br></td><td>ftp_opts</td></tr>
		 * 	<tr><td><br></td><td>sftp_host</td></tr>
		 * 	<tr><td><br></td><td>sftp_user</td></tr>
		 * 	<tr><td><br></td><td>sftp_password</td></tr>
		 * 	<tr><td><br></td><td>sftp_port</td></tr>
		 * 	<tr><td><br></td><td>sftp_key_file_path</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_FileRecv)PFBZL_FileRecv_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * ローカルディレクトリの監視対象を取得する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFBZ.PFBZL5040.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFBZ.PFBZL5040.CndR.create();
			down0 = MCList.create(mcframe.serverPFBZ.PFBZL5040.DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBZL_FileRecv)PFBZL_FileRecv_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL5040.CndR createCndR(){
			return mcframe.serverPFBZ.PFBZL5040.CndR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFBZ.PFBZL5040.DtlR createDtlR(){
			return mcframe.serverPFBZ.PFBZL5040.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> createDtlL(){
			return MCList.create(mcframe.serverPFBZ.PFBZL5040.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFBZ.PFBZL5040.CndR
		 */
		public mcframe.serverPFBZ.PFBZL5040.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sdrvIf.if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>sdrvIf.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>local_dir</td></tr>
		 * 	<tr><td><br></td><td>transfer_lock_typ</td></tr>
		 * 	<tr><td><br></td><td>sts_fsuffix</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFBZ.PFBZL5040.DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBZL_FileRecv)PFBZL_FileRecv_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}