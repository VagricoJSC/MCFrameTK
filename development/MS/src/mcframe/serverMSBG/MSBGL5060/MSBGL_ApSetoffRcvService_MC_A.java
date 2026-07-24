package mcframe.serverMSBG.MSBGL5060;

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
 * "MSBGL_ApSetoffRcvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_ApSetoffRcvService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_ApSetoffRcvService.ApSetoffRcv_Chk01 aApSetoffRcv_Chk01;

	protected void initApSetoffRcv_Chk01() {
		this.info = PDef.MS_MSBGL5060_ApSetoffRcv_Chk01_INFO;
		this.aApSetoffRcv_Chk01 = ((MSBGL_ApSetoffRcvService)this).new ApSetoffRcv_Chk01();
	}

	public static MSBGL_ApSetoffRcvService.ApSetoffRcv_Chk01 crtApSetoffRcv_Chk01() {
		MSBGL_ApSetoffRcvService lgc = new MSBGL_ApSetoffRcvService();
		lgc.initApSetoffRcv_Chk01();
		return lgc.aApSetoffRcv_Chk01;
	}

	protected void paramApSetoffRcv_Chk01(MCParam p) {
		if (this.aApSetoffRcv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSetoffRcv_Chk01.up0());
		p.addDownBlock(aApSetoffRcv_Chk01.down0());
	}

	protected void doApSetoffRcv_Chk01() {
		aApSetoffRcv_Chk01.call();
	};

	/**
	 * ApSetoffRcv_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR createApSetoffRcv_Chk01_DtlR(){
		return mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.create();
	}

	/**
	 * ApSetoffRcv_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> createApSetoffRcv_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);
	}
	protected MSBGL_ApSetoffRcvService.ApSetoffRcv_Upd01 aApSetoffRcv_Upd01;

	protected void initApSetoffRcv_Upd01() {
		this.info = PDef.MS_MSBGL5060_ApSetoffRcv_Upd01_INFO;
		this.aApSetoffRcv_Upd01 = ((MSBGL_ApSetoffRcvService)this).new ApSetoffRcv_Upd01();
	}

	public static MSBGL_ApSetoffRcvService.ApSetoffRcv_Upd01 crtApSetoffRcv_Upd01() {
		MSBGL_ApSetoffRcvService lgc = new MSBGL_ApSetoffRcvService();
		lgc.initApSetoffRcv_Upd01();
		return lgc.aApSetoffRcv_Upd01;
	}

	protected void paramApSetoffRcv_Upd01(MCParam p) {
		if (this.aApSetoffRcv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aApSetoffRcv_Upd01.up0());
		p.addDownBlock(aApSetoffRcv_Upd01.down0());
	}

	protected void doApSetoffRcv_Upd01() {
		aApSetoffRcv_Upd01.call();
	};

	/**
	 * ApSetoffRcv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR createApSetoffRcv_Upd01_DtlR(){
		return mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.create();
	}

	/**
	 * ApSetoffRcv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> createApSetoffRcv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ApSetoffRcv_Chk01オペレーション.<p>
	 *
	 * 買掛金相殺の入金の登録・訂正・取消前チェックの共通処理<br>
	 */
	abstract public class ApSetoffRcv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSetoffRcv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ApSetoffRcv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);

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
			invoke((MSBGL_ApSetoffRcvService)MSBGL_ApSetoffRcvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApSetoffRcv_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR createApSetoffRcv_Chk01_DtlR(){
			return mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.create();
		}

		/**
		 * ApSetoffRcv_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> createApSetoffRcv_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ApSetoffRcvService)MSBGL_ApSetoffRcvService_MC_A.this).info;
		}


	}
	/**
	 * ApSetoffRcv_Upd01オペレーション.<p>
	 *
	 * 買掛金相殺の入金の登録・訂正・取消の共通処理<br>
	 */
	abstract public class ApSetoffRcv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ApSetoffRcv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ApSetoffRcv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);

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
			invoke((MSBGL_ApSetoffRcvService)MSBGL_ApSetoffRcvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ApSetoffRcv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR createApSetoffRcv_Upd01_DtlR(){
			return mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.create();
		}

		/**
		 * ApSetoffRcv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> createApSetoffRcv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5060.ApSetoffRcv_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ApSetoffRcvService)MSBGL_ApSetoffRcvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}