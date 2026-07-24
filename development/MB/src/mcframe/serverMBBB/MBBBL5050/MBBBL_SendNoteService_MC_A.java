package mcframe.serverMBBB.MBBBL5050;

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
 * "MBBBL_SendNoteService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_SendNoteService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBBL5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_SendNoteService.SendNote_Chk01 aSendNote_Chk01;

	protected void initSendNote_Chk01() {
		this.info = PDef.MB_MBBBL5050_SendNote_Chk01_INFO;
		this.aSendNote_Chk01 = ((MBBBL_SendNoteService)this).new SendNote_Chk01();
	}

	public static MBBBL_SendNoteService.SendNote_Chk01 crtSendNote_Chk01() {
		MBBBL_SendNoteService lgc = new MBBBL_SendNoteService();
		lgc.initSendNote_Chk01();
		return lgc.aSendNote_Chk01;
	}

	protected void paramSendNote_Chk01(MCParam p) {
		if (this.aSendNote_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendNote_Chk01.up0());
		p.addDownBlock(aSendNote_Chk01.down0());
	}

	protected void doSendNote_Chk01() {
		aSendNote_Chk01.call();
	};

	/**
	 * SendNote_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR createSendNote_Chk01_CndR(){
		return mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();
	}
	protected MBBBL_SendNoteService.SendNote_Chk02 aSendNote_Chk02;

	protected void initSendNote_Chk02() {
		this.info = PDef.MB_MBBBL5050_SendNote_Chk02_INFO;
		this.aSendNote_Chk02 = ((MBBBL_SendNoteService)this).new SendNote_Chk02();
	}

	public static MBBBL_SendNoteService.SendNote_Chk02 crtSendNote_Chk02() {
		MBBBL_SendNoteService lgc = new MBBBL_SendNoteService();
		lgc.initSendNote_Chk02();
		return lgc.aSendNote_Chk02;
	}

	protected void paramSendNote_Chk02(MCParam p) {
		if (this.aSendNote_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendNote_Chk02.up0());
		p.addDownBlock(aSendNote_Chk02.down0());
	}

	protected void doSendNote_Chk02() {
		aSendNote_Chk02.call();
	};

	/**
	 * SendNote_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR createSendNote_Chk02_CndR(){
		return mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();
	}
	protected MBBBL_SendNoteService.SendNote_Upd01 aSendNote_Upd01;

	protected void initSendNote_Upd01() {
		this.info = PDef.MB_MBBBL5050_SendNote_Upd01_INFO;
		this.aSendNote_Upd01 = ((MBBBL_SendNoteService)this).new SendNote_Upd01();
	}

	public static MBBBL_SendNoteService.SendNote_Upd01 crtSendNote_Upd01() {
		MBBBL_SendNoteService lgc = new MBBBL_SendNoteService();
		lgc.initSendNote_Upd01();
		return lgc.aSendNote_Upd01;
	}

	protected void paramSendNote_Upd01(MCParam p) {
		if (this.aSendNote_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendNote_Upd01.up0());
		p.addDownBlock(aSendNote_Upd01.down0());
	}

	protected void doSendNote_Upd01() {
		aSendNote_Upd01.call();
	};

	/**
	 * SendNote_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR createSendNote_Upd01_CndR(){
		return mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();
	}
	protected MBBBL_SendNoteService.SendNote_Del01 aSendNote_Del01;

	protected void initSendNote_Del01() {
		this.info = PDef.MB_MBBBL5050_SendNote_Del01_INFO;
		this.aSendNote_Del01 = ((MBBBL_SendNoteService)this).new SendNote_Del01();
	}

	public static MBBBL_SendNoteService.SendNote_Del01 crtSendNote_Del01() {
		MBBBL_SendNoteService lgc = new MBBBL_SendNoteService();
		lgc.initSendNote_Del01();
		return lgc.aSendNote_Del01;
	}

	protected void paramSendNote_Del01(MCParam p) {
		if (this.aSendNote_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendNote_Del01.up0());
		p.addDownBlock(aSendNote_Del01.down0());
	}

	protected void doSendNote_Del01() {
		aSendNote_Del01.call();
	};

	/**
	 * SendNote_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR createSendNote_Del01_CndR(){
		return mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendNote_Chk01オペレーション.<p>
	 *
	 * 手形情報送信前チェック<br>
	 */
	abstract public class SendNote_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendNote_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected SendNote_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();

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
			invoke((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendNote_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR createSendNote_Chk01_CndR(){
			return mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this).info;
		}


	}
	/**
	 * SendNote_Chk02オペレーション.<p>
	 *
	 * 手形情報送信取消前チェック<br>
	 */
	abstract public class SendNote_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendNote_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR down0;
		
		
		// コンストラクタ
		protected SendNote_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();

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
			invoke((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendNote_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR createSendNote_Chk02_CndR(){
			return mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this).info;
		}


	}
	/**
	 * SendNote_Upd01オペレーション.<p>
	 *
	 * 手形情報を送信する。<br>
	 */
	abstract public class SendNote_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendNote_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected SendNote_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();

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
			invoke((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendNote_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR createSendNote_Upd01_CndR(){
			return mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this).info;
		}


	}
	/**
	 * SendNote_Del01オペレーション.<p>
	 *
	 * 手形情報の送信を取り消す。<br>
	 */
	abstract public class SendNote_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendNote_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR down0;
		
		
		// コンストラクタ
		protected SendNote_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();

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
			invoke((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendNote_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR createSendNote_Del01_CndR(){
			return mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5050.SendNote_Chk02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendNoteService)MBBBL_SendNoteService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}