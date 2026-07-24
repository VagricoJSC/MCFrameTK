package mcframe.serverMABC.MABCL0150;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_PushNtcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_PushNtcReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0150";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_PushNtcReg.PushNtc_UpdChk01 aPushNtc_UpdChk01;

	protected void initPushNtc_UpdChk01() {
		this.info = PDef.MA_MABCL0150_PushNtc_UpdChk01_INFO;
		this.aPushNtc_UpdChk01 = ((MABCL_PushNtcReg)this).new PushNtc_UpdChk01();
	}

	public static MABCL_PushNtcReg.PushNtc_UpdChk01 crtPushNtc_UpdChk01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initPushNtc_UpdChk01();
		return lgc.aPushNtc_UpdChk01;
	}

	protected void paramPushNtc_UpdChk01(MCParam p) {
		if (this.aPushNtc_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPushNtc_UpdChk01.up0());
	}

	protected void doPushNtc_UpdChk01() {
		aPushNtc_UpdChk01.call();
	};

	/**
	 * PushNtc_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR createPushNtc_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.create();
	}

	/**
	 * PushNtc_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> createPushNtc_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);
	}
	protected MABCL_PushNtcReg.PushNtc_Upd01 aPushNtc_Upd01;

	protected void initPushNtc_Upd01() {
		this.info = PDef.MA_MABCL0150_PushNtc_Upd01_INFO;
		this.aPushNtc_Upd01 = ((MABCL_PushNtcReg)this).new PushNtc_Upd01();
	}

	public static MABCL_PushNtcReg.PushNtc_Upd01 crtPushNtc_Upd01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initPushNtc_Upd01();
		return lgc.aPushNtc_Upd01;
	}

	protected void paramPushNtc_Upd01(MCParam p) {
		if (this.aPushNtc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPushNtc_Upd01.up0());
	}

	protected void doPushNtc_Upd01() {
		aPushNtc_Upd01.call();
	};

	/**
	 * PushNtc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR createPushNtc_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.create();
	}

	/**
	 * PushNtc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> createPushNtc_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);
	}
	protected MABCL_PushNtcReg.PushNtc_DelChk01 aPushNtc_DelChk01;

	protected void initPushNtc_DelChk01() {
		this.info = PDef.MA_MABCL0150_PushNtc_DelChk01_INFO;
		this.aPushNtc_DelChk01 = ((MABCL_PushNtcReg)this).new PushNtc_DelChk01();
	}

	public static MABCL_PushNtcReg.PushNtc_DelChk01 crtPushNtc_DelChk01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initPushNtc_DelChk01();
		return lgc.aPushNtc_DelChk01;
	}

	protected void paramPushNtc_DelChk01(MCParam p) {
		if (this.aPushNtc_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPushNtc_DelChk01.up0());
	}

	protected void doPushNtc_DelChk01() {
		aPushNtc_DelChk01.call();
	};

	/**
	 * PushNtc_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR createPushNtc_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.create();
	}

	/**
	 * PushNtc_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> createPushNtc_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);
	}
	protected MABCL_PushNtcReg.PushNtc_Del01 aPushNtc_Del01;

	protected void initPushNtc_Del01() {
		this.info = PDef.MA_MABCL0150_PushNtc_Del01_INFO;
		this.aPushNtc_Del01 = ((MABCL_PushNtcReg)this).new PushNtc_Del01();
	}

	public static MABCL_PushNtcReg.PushNtc_Del01 crtPushNtc_Del01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initPushNtc_Del01();
		return lgc.aPushNtc_Del01;
	}

	protected void paramPushNtc_Del01(MCParam p) {
		if (this.aPushNtc_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPushNtc_Del01.up0());
	}

	protected void doPushNtc_Del01() {
		aPushNtc_Del01.call();
	};

	/**
	 * PushNtc_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR createPushNtc_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.create();
	}

	/**
	 * PushNtc_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> createPushNtc_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);
	}
	protected MABCL_PushNtcReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0150_Srch01_INFO;
		this.aSrch01 = ((MABCL_PushNtcReg)this).new Srch01();
	}

	public static MABCL_PushNtcReg.Srch01 crtSrch01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
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
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0150.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0150.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.Srch01_RsltR.class);
	}
	protected MABCL_PushNtcReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MA_MABCL0150_Sprt01_INFO;
		this.aSprt01 = ((MABCL_PushNtcReg)this).new Sprt01();
	}

	public static MABCL_PushNtcReg.Sprt01 crtSprt01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMABC.MABCL0150.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.Sprt01_DtlR.class);
	}
	protected MABCL_PushNtcReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0150_Upd01_INFO;
		this.aUpd01 = ((MABCL_PushNtcReg)this).new Upd01();
	}

	public static MABCL_PushNtcReg.Upd01 crtUpd01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);
	}
	protected MABCL_PushNtcReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0150_Del01_INFO;
		this.aDel01 = ((MABCL_PushNtcReg)this).new Del01();
	}

	public static MABCL_PushNtcReg.Del01 crtDel01() {
		MABCL_PushNtcReg lgc = new MABCL_PushNtcReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PushNtc_UpdChk01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタを登録する前のチェックを行う<br>
	 */
	abstract public class PushNtc_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PushNtc_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected PushNtc_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);

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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PushNtc_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR createPushNtc_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.create();
		}

		/**
		 * PushNtc_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> createPushNtc_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>push_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}


	}
	/**
	 * PushNtc_Upd01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタを登録する<br>
	 */
	abstract public class PushNtc_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PushNtc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PUSH_NTC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_PUSH_NTC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PUSH_NTC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_PUSH_NTC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected PushNtc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_PUSH_NTC_R.create("T1"));
			chkMaster = MCController.create(MAM_PUSH_NTC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_PUSH_NTC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_PUSH_NTC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PushNtc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR createPushNtc_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.create();
		}

		/**
		 * PushNtc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> createPushNtc_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>push_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_PUSH_NTC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src_PushNtc_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_PushNtc_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("msg_imp_typ", "msg_imp_typ");
				addColumnPathMap("push_typ", "push_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_PUSH_NTC_R r_dest, mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_PUSH_NTC_R> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src : src){
				MAM_PUSH_NTC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_PUSH_NTC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src_PushNtc_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_PushNtc_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_PUSH_NTC_R r_dest, mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_PUSH_NTC_R> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src : src){
				MAM_PUSH_NTC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * PushNtc_DelChk01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタを削除する前のチェックを行う<br>
	 */
	abstract public class PushNtc_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PushNtc_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected PushNtc_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);

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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PushNtc_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR createPushNtc_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.create();
		}

		/**
		 * PushNtc_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> createPushNtc_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}


	}
	/**
	 * PushNtc_Del01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタを削除する<br>
	 */
	abstract public class PushNtc_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PushNtc_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PUSH_NTC_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_PUSH_NTC_R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected PushNtc_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_PUSH_NTC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_PUSH_NTC_R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PushNtc_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR createPushNtc_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.create();
		}

		/**
		 * PushNtc_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> createPushNtc_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_PUSH_NTC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> src_PushNtc_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_PushNtc_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_PUSH_NTC_R r_dest, mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_PUSH_NTC_R> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_src : src){
				MAM_PUSH_NTC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0150.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_PUSH_NTC_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_PUSH_NTC_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0150.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0150.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_PUSH_NTC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_PUSH_NTC_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_PUSH_NTC_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0150.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0150.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0150.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0150.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>push_typ</td></tr>
		 * 	<tr><td><br></td><td>push_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0150.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_PUSH_NTC_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_wg_nm", "ntc_wg_nm");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_dpt_nm", "ntc_dpt_nm");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("ntc_aprv_role_nm", "ntc_aprv_role_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("msg_imp_typ", "msg_imp_typ");
				addColumnPathMap("push_typ", "push_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0150.Srch01_RsltR r_dest, MAM_PUSH_NTC_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0150.Srch01_RsltR> dest, MCList<MAM_PUSH_NTC_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_PUSH_NTC_R r_src : src){
				mcframe.serverMABC.MABCL0150.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLStEndDupChecker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> down0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PUSH_NTC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PUSH_NTC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_PUSH_NTC_R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMABC.MABCL0150.Sprt01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_PUSH_NTC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_PUSH_NTC_R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_PUSH_NTC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMABC.MABCL0150.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>push_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>push_typ</td></tr>
		 * 	<tr><td><br></td><td>push_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_PUSH_NTC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> src_Sprt01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Sprt01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_wg_nm", "ntc_wg_nm");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_dpt_nm", "ntc_dpt_nm");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("ntc_aprv_role_nm", "ntc_aprv_role_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("msg_imp_typ", "msg_imp_typ");
				addColumnPathMap("push_typ", "push_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_PUSH_NTC_R r_dest, mcframe.serverMABC.MABCL0150.Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_PUSH_NTC_R> dest, MCList<mcframe.serverMABC.MABCL0150.Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0150.Sprt01_DtlR r_src : src){
				MAM_PUSH_NTC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.crtPushNtc_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.crtPushNtc_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>msg_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>push_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("msg_imp_typ", "msg_imp_typ");
				addColumnPathMap("push_typ", "push_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("msg_imp_typ", "msg_imp_typ");
				addColumnPathMap("push_typ", "push_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0150.PushNtc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.PushNtc_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.crtPushNtc_DelChk01();
			del01 = mcframe.serverMABC.MABCL0150.MABCL_PushNtcReg.crtPushNtc_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>push_ntc_typ</td></tr>
		 * 	<tr><td><br></td><td>ntc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ntc_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_PushNtcReg)MABCL_PushNtcReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> src_Del01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("push_ntc_typ", "push_ntc_typ");
				addColumnPathMap("ntc_wg_cd", "ntc_wg_cd");
				addColumnPathMap("ntc_dpt_cd", "ntc_dpt_cd");
				addColumnPathMap("ntc_aprv_role_cd", "ntc_aprv_role_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0150.PushNtc_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}