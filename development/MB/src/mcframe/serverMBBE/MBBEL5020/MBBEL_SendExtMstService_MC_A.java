package mcframe.serverMBBE.MBBEL5020;

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
 * "MBBEL_SendExtMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_SendExtMstService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBEL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_SendExtMstService.SendExtMst_Chk01 aSendExtMst_Chk01;

	protected void initSendExtMst_Chk01() {
		this.info = PDef.MB_MBBEL5020_SendExtMst_Chk01_INFO;
		this.aSendExtMst_Chk01 = ((MBBEL_SendExtMstService)this).new SendExtMst_Chk01();
	}

	public static MBBEL_SendExtMstService.SendExtMst_Chk01 crtSendExtMst_Chk01() {
		MBBEL_SendExtMstService lgc = new MBBEL_SendExtMstService();
		lgc.initSendExtMst_Chk01();
		return lgc.aSendExtMst_Chk01;
	}

	protected void paramSendExtMst_Chk01(MCParam p) {
		if (this.aSendExtMst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendExtMst_Chk01.up0());
		p.addDownBlock(aSendExtMst_Chk01.down0());
	}

	protected void doSendExtMst_Chk01() {
		aSendExtMst_Chk01.call();
	};

	/**
	 * SendExtMst_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR createSendExtMst_Chk01_CndR(){
		return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();
	}
	protected MBBEL_SendExtMstService.SendExtMst_Chk02 aSendExtMst_Chk02;

	protected void initSendExtMst_Chk02() {
		this.info = PDef.MB_MBBEL5020_SendExtMst_Chk02_INFO;
		this.aSendExtMst_Chk02 = ((MBBEL_SendExtMstService)this).new SendExtMst_Chk02();
	}

	public static MBBEL_SendExtMstService.SendExtMst_Chk02 crtSendExtMst_Chk02() {
		MBBEL_SendExtMstService lgc = new MBBEL_SendExtMstService();
		lgc.initSendExtMst_Chk02();
		return lgc.aSendExtMst_Chk02;
	}

	protected void paramSendExtMst_Chk02(MCParam p) {
		if (this.aSendExtMst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendExtMst_Chk02.up0());
		p.addDownBlock(aSendExtMst_Chk02.down0());
	}

	protected void doSendExtMst_Chk02() {
		aSendExtMst_Chk02.call();
	};

	/**
	 * SendExtMst_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR createSendExtMst_Chk02_CndR(){
		return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();
	}
	protected MBBEL_SendExtMstService.SendExtMst_Ins01 aSendExtMst_Ins01;

	protected void initSendExtMst_Ins01() {
		this.info = PDef.MB_MBBEL5020_SendExtMst_Ins01_INFO;
		this.aSendExtMst_Ins01 = ((MBBEL_SendExtMstService)this).new SendExtMst_Ins01();
	}

	public static MBBEL_SendExtMstService.SendExtMst_Ins01 crtSendExtMst_Ins01() {
		MBBEL_SendExtMstService lgc = new MBBEL_SendExtMstService();
		lgc.initSendExtMst_Ins01();
		return lgc.aSendExtMst_Ins01;
	}

	protected void paramSendExtMst_Ins01(MCParam p) {
		if (this.aSendExtMst_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendExtMst_Ins01.up0());
		p.addDownBlock(aSendExtMst_Ins01.down0());
	}

	protected void doSendExtMst_Ins01() {
		aSendExtMst_Ins01.call();
	};

	/**
	 * SendExtMst_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR createSendExtMst_Ins01_CndR(){
		return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();
	}
	protected MBBEL_SendExtMstService.SendExtMst_Del01 aSendExtMst_Del01;

	protected void initSendExtMst_Del01() {
		this.info = PDef.MB_MBBEL5020_SendExtMst_Del01_INFO;
		this.aSendExtMst_Del01 = ((MBBEL_SendExtMstService)this).new SendExtMst_Del01();
	}

	public static MBBEL_SendExtMstService.SendExtMst_Del01 crtSendExtMst_Del01() {
		MBBEL_SendExtMstService lgc = new MBBEL_SendExtMstService();
		lgc.initSendExtMst_Del01();
		return lgc.aSendExtMst_Del01;
	}

	protected void paramSendExtMst_Del01(MCParam p) {
		if (this.aSendExtMst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendExtMst_Del01.up0());
		p.addDownBlock(aSendExtMst_Del01.down0());
	}

	protected void doSendExtMst_Del01() {
		aSendExtMst_Del01.call();
	};

	/**
	 * SendExtMst_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR createSendExtMst_Del01_CndR(){
		return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendExtMst_Chk01オペレーション.<p>
	 *
	 * 外部マスタ情報送信前チェック<br>
	 */
	abstract public class SendExtMst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendExtMst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected SendExtMst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();

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
			invoke((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendExtMst_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR createSendExtMst_Chk01_CndR(){
			return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this).info;
		}


	}
	/**
	 * SendExtMst_Chk02オペレーション.<p>
	 *
	 * 外部マスタ情報送信取消前チェック<br>
	 */
	abstract public class SendExtMst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendExtMst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR down0;
		
		
		// コンストラクタ
		protected SendExtMst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();

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
			invoke((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendExtMst_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR createSendExtMst_Chk02_CndR(){
			return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this).info;
		}


	}
	/**
	 * SendExtMst_Ins01オペレーション.<p>
	 *
	 * 外部マスタ情報を送信する。<br>
	 */
	abstract public class SendExtMst_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendExtMst_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected SendExtMst_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();

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
			invoke((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendExtMst_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR createSendExtMst_Ins01_CndR(){
			return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR up0() {
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
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this).info;
		}


	}
	/**
	 * SendExtMst_Del01オペレーション.<p>
	 *
	 * 外部マスタ情報の送信を取り消す。<br>
	 */
	abstract public class SendExtMst_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendExtMst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR down0;
		
		
		// コンストラクタ
		protected SendExtMst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();

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
			invoke((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendExtMst_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR createSendExtMst_Del01_CndR(){
			return mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR up0() {
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
		 * @see mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR
		 */
		public mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_SendExtMstService)MBBEL_SendExtMstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}