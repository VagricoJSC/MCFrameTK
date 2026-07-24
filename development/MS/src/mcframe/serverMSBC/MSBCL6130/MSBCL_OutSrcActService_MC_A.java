package mcframe.serverMSBC.MSBCL6130;

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
 * "MSBCL_OutSrcActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_OutSrcActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_OutSrcActService.OutSrcAct_Chk01 aOutSrcAct_Chk01;

	protected void initOutSrcAct_Chk01() {
		this.info = PDef.MS_MSBCL6130_OutSrcAct_Chk01_INFO;
		this.aOutSrcAct_Chk01 = ((MSBCL_OutSrcActService)this).new OutSrcAct_Chk01();
	}

	public static MSBCL_OutSrcActService.OutSrcAct_Chk01 crtOutSrcAct_Chk01() {
		MSBCL_OutSrcActService lgc = new MSBCL_OutSrcActService();
		lgc.initOutSrcAct_Chk01();
		return lgc.aOutSrcAct_Chk01;
	}

	protected void paramOutSrcAct_Chk01(MCParam p) {
		if (this.aOutSrcAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcAct_Chk01.up0());
		p.addDownBlock(aOutSrcAct_Chk01.down0());
	}

	protected void doOutSrcAct_Chk01() {
		aOutSrcAct_Chk01.call();
	};

	/**
	 * OutSrcAct_Chk01_ActDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR createOutSrcAct_Chk01_ActDR(){
		return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR.create();
	}

	/**
	 * OutSrcAct_Chk01_ActDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR> createOutSrcAct_Chk01_ActDL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR.class);
	}
	protected MSBCL_OutSrcActService.OutSrcAct_Upd01 aOutSrcAct_Upd01;

	protected void initOutSrcAct_Upd01() {
		this.info = PDef.MS_MSBCL6130_OutSrcAct_Upd01_INFO;
		this.aOutSrcAct_Upd01 = ((MSBCL_OutSrcActService)this).new OutSrcAct_Upd01();
	}

	public static MSBCL_OutSrcActService.OutSrcAct_Upd01 crtOutSrcAct_Upd01() {
		MSBCL_OutSrcActService lgc = new MSBCL_OutSrcActService();
		lgc.initOutSrcAct_Upd01();
		return lgc.aOutSrcAct_Upd01;
	}

	protected void paramOutSrcAct_Upd01(MCParam p) {
		if (this.aOutSrcAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcAct_Upd01.up0());
	}

	protected void doOutSrcAct_Upd01() {
		aOutSrcAct_Upd01.call();
	};

	/**
	 * OutSrcAct_Upd01_ActDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR createOutSrcAct_Upd01_ActDR(){
		return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR.create();
	}

	/**
	 * OutSrcAct_Upd01_ActDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR> createOutSrcAct_Upd01_ActDL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR.class);
	}
	protected MSBCL_OutSrcActService.OutSrcAct_Sprt02 aOutSrcAct_Sprt02;

	protected void initOutSrcAct_Sprt02() {
		this.info = PDef.MS_MSBCL6130_OutSrcAct_Sprt02_INFO;
		this.aOutSrcAct_Sprt02 = ((MSBCL_OutSrcActService)this).new OutSrcAct_Sprt02();
	}

	public static MSBCL_OutSrcActService.OutSrcAct_Sprt02 crtOutSrcAct_Sprt02() {
		MSBCL_OutSrcActService lgc = new MSBCL_OutSrcActService();
		lgc.initOutSrcAct_Sprt02();
		return lgc.aOutSrcAct_Sprt02;
	}

	protected void paramOutSrcAct_Sprt02(MCParam p) {
		if (this.aOutSrcAct_Sprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOutSrcAct_Sprt02.up0());
		p.addDownBlock(aOutSrcAct_Sprt02.down0());
	}

	protected void doOutSrcAct_Sprt02() {
		aOutSrcAct_Sprt02.call();
	};

	/**
	 * OutSrcAct_Sprt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR createOutSrcAct_Sprt02_CndR(){
		return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR.create();
	}

	/**
	 * OutSrcAct_Sprt02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR> createOutSrcAct_Sprt02_CndL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR.class);
	}

	/**
	 * OutSrcAct_Sprt02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR createOutSrcAct_Sprt02_RsltR(){
		return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR.create();
	}

	/**
	 * OutSrcAct_Sprt02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR> createOutSrcAct_Sprt02_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OutSrcAct_Chk01オペレーション.<p>
	 *
	 * 入荷実績・仕入実績の登録・訂正・取消の前に、外注製造実績の状況をチェックする<br>
	 */
	abstract public class OutSrcAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR> down0;
		
		
		// コンストラクタ
		protected OutSrcAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR.class);

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
			invoke((MSBCL_OutSrcActService)MSBCL_OutSrcActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcAct_Chk01_ActDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR createOutSrcAct_Chk01_ActDR(){
			return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR.create();
		}

		/**
		 * OutSrcAct_Chk01_ActDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR> createOutSrcAct_Chk01_ActDL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_abort_can_flg</td></tr>
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Chk01_ActDR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcActService)MSBCL_OutSrcActService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcAct_Upd01オペレーション.<p>
	 *
	 * 入荷実績・仕入実績の登録・訂正・取消に伴い、外注製造実績を登録・訂正・取消する。<br>
	 */
	abstract public class OutSrcAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR> up0;
		
		
		// コンストラクタ
		protected OutSrcAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OutSrcActService)MSBCL_OutSrcActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * OutSrcAct_Upd01_ActDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR createOutSrcAct_Upd01_ActDR(){
			return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR.create();
		}

		/**
		 * OutSrcAct_Upd01_ActDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR> createOutSrcAct_Upd01_ActDL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Upd01_ActDR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcActService)MSBCL_OutSrcActService_MC_A.this).info;
		}


	}
	/**
	 * OutSrcAct_Sprt02オペレーション.<p>
	 *
	 * 製造指図ＮＯを受け取り、購買区分・製造実績ＮＯを返す<br>
	 */
	abstract public class OutSrcAct_Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OutSrcAct_Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR> down0;
		
		
		// コンストラクタ
		protected OutSrcAct_Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR.class);

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
			invoke((MSBCL_OutSrcActService)MSBCL_OutSrcActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OutSrcAct_Sprt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR createOutSrcAct_Sprt02_CndR(){
			return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR.create();
		}

		/**
		 * OutSrcAct_Sprt02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR> createOutSrcAct_Sprt02_CndL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR.class);
		}

		/**
		 * OutSrcAct_Sprt02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR createOutSrcAct_Sprt02_RsltR(){
			return mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR.create();
		}

		/**
		 * OutSrcAct_Sprt02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR> createOutSrcAct_Sprt02_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6130.OutSrcAct_Sprt02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OutSrcActService)MSBCL_OutSrcActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}