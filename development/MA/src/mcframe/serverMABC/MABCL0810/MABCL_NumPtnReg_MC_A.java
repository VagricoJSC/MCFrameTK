package mcframe.serverMABC.MABCL0810;

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
 * "MABCL_NumPtnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_NumPtnReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0810";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_NumPtnReg.NumPtn_UpdChk01 aNumPtn_UpdChk01;

	protected void initNumPtn_UpdChk01() {
		this.info = PDef.MA_MABCL0810_NumPtn_UpdChk01_INFO;
		this.aNumPtn_UpdChk01 = ((MABCL_NumPtnReg)this).new NumPtn_UpdChk01();
	}

	public static MABCL_NumPtnReg.NumPtn_UpdChk01 crtNumPtn_UpdChk01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initNumPtn_UpdChk01();
		return lgc.aNumPtn_UpdChk01;
	}

	protected void paramNumPtn_UpdChk01(MCParam p) {
		if (this.aNumPtn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNumPtn_UpdChk01.up0());
	}

	protected void doNumPtn_UpdChk01() {
		aNumPtn_UpdChk01.call();
	};

	/**
	 * NumPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR createNumPtn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.create();
	}

	/**
	 * NumPtn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> createNumPtn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.NumPtn_Upd01 aNumPtn_Upd01;

	protected void initNumPtn_Upd01() {
		this.info = PDef.MA_MABCL0810_NumPtn_Upd01_INFO;
		this.aNumPtn_Upd01 = ((MABCL_NumPtnReg)this).new NumPtn_Upd01();
	}

	public static MABCL_NumPtnReg.NumPtn_Upd01 crtNumPtn_Upd01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initNumPtn_Upd01();
		return lgc.aNumPtn_Upd01;
	}

	protected void paramNumPtn_Upd01(MCParam p) {
		if (this.aNumPtn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNumPtn_Upd01.up0());
	}

	protected void doNumPtn_Upd01() {
		aNumPtn_Upd01.call();
	};

	/**
	 * NumPtn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR createNumPtn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.create();
	}

	/**
	 * NumPtn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> createNumPtn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.NumPtnLcl_UpdChk01 aNumPtnLcl_UpdChk01;

	protected void initNumPtnLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0810_NumPtnLcl_UpdChk01_INFO;
		this.aNumPtnLcl_UpdChk01 = ((MABCL_NumPtnReg)this).new NumPtnLcl_UpdChk01();
	}

	public static MABCL_NumPtnReg.NumPtnLcl_UpdChk01 crtNumPtnLcl_UpdChk01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initNumPtnLcl_UpdChk01();
		return lgc.aNumPtnLcl_UpdChk01;
	}

	protected void paramNumPtnLcl_UpdChk01(MCParam p) {
		if (this.aNumPtnLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNumPtnLcl_UpdChk01.up0());
	}

	protected void doNumPtnLcl_UpdChk01() {
		aNumPtnLcl_UpdChk01.call();
	};

	/**
	 * NumPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR createNumPtnLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * NumPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> createNumPtnLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.NumPtnLcl_Upd01 aNumPtnLcl_Upd01;

	protected void initNumPtnLcl_Upd01() {
		this.info = PDef.MA_MABCL0810_NumPtnLcl_Upd01_INFO;
		this.aNumPtnLcl_Upd01 = ((MABCL_NumPtnReg)this).new NumPtnLcl_Upd01();
	}

	public static MABCL_NumPtnReg.NumPtnLcl_Upd01 crtNumPtnLcl_Upd01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initNumPtnLcl_Upd01();
		return lgc.aNumPtnLcl_Upd01;
	}

	protected void paramNumPtnLcl_Upd01(MCParam p) {
		if (this.aNumPtnLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNumPtnLcl_Upd01.up0());
	}

	protected void doNumPtnLcl_Upd01() {
		aNumPtnLcl_Upd01.call();
	};

	/**
	 * NumPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR createNumPtnLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * NumPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> createNumPtnLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.NumPtn_DelChk01 aNumPtn_DelChk01;

	protected void initNumPtn_DelChk01() {
		this.info = PDef.MA_MABCL0810_NumPtn_DelChk01_INFO;
		this.aNumPtn_DelChk01 = ((MABCL_NumPtnReg)this).new NumPtn_DelChk01();
	}

	public static MABCL_NumPtnReg.NumPtn_DelChk01 crtNumPtn_DelChk01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initNumPtn_DelChk01();
		return lgc.aNumPtn_DelChk01;
	}

	protected void paramNumPtn_DelChk01(MCParam p) {
		if (this.aNumPtn_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNumPtn_DelChk01.up0());
	}

	protected void doNumPtn_DelChk01() {
		aNumPtn_DelChk01.call();
	};

	/**
	 * NumPtn_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR createNumPtn_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.create();
	}

	/**
	 * NumPtn_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> createNumPtn_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.NumPtn_Del01 aNumPtn_Del01;

	protected void initNumPtn_Del01() {
		this.info = PDef.MA_MABCL0810_NumPtn_Del01_INFO;
		this.aNumPtn_Del01 = ((MABCL_NumPtnReg)this).new NumPtn_Del01();
	}

	public static MABCL_NumPtnReg.NumPtn_Del01 crtNumPtn_Del01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initNumPtn_Del01();
		return lgc.aNumPtn_Del01;
	}

	protected void paramNumPtn_Del01(MCParam p) {
		if (this.aNumPtn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aNumPtn_Del01.up0());
	}

	protected void doNumPtn_Del01() {
		aNumPtn_Del01.call();
	};

	/**
	 * NumPtn_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR createNumPtn_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.create();
	}

	/**
	 * NumPtn_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> createNumPtn_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0810_Srch01_INFO;
		this.aSrch01 = ((MABCL_NumPtnReg)this).new Srch01();
	}

	public static MABCL_NumPtnReg.Srch01 crtSrch01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
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
		p.addDownBlock(aSrch01.down1());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0810.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0810.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.Srch01_RsltR.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0810.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0810.Srch01_Rslt2R.class);
	}
	protected MABCL_NumPtnReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0810_Upd01_INFO;
		this.aUpd01 = ((MABCL_NumPtnReg)this).new Upd01();
	}

	public static MABCL_NumPtnReg.Upd01 crtUpd01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_NumPtnReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0810_Del01_INFO;
		this.aDel01 = ((MABCL_NumPtnReg)this).new Del01();
	}

	public static MABCL_NumPtnReg.Del01 crtDel01() {
		MABCL_NumPtnReg lgc = new MABCL_NumPtnReg();
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
	public mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * NumPtn_UpdChk01オペレーション.<p>
	 *
	 * 発番パタンマスタを登録する前のチェックをする。<br>
	 */
	abstract public class NumPtn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NumPtn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected NumPtn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);

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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * NumPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR createNumPtn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.create();
		}

		/**
		 * NumPtn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> createNumPtn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_typ1</td></tr>
		 * 	<tr><td><br></td><td>elm_typ2</td></tr>
		 * 	<tr><td><br></td><td>elm_typ3</td></tr>
		 * 	<tr><td><br></td><td>elm_typ4</td></tr>
		 * 	<tr><td><br></td><td>elm_typ5</td></tr>
		 * 	<tr><td><br></td><td>elm_typ6</td></tr>
		 * 	<tr><td><br></td><td>elm_typ7</td></tr>
		 * 	<tr><td><br></td><td>elm_typ8</td></tr>
		 * 	<tr><td><br></td><td>elm_typ9</td></tr>
		 * 	<tr><td><br></td><td>elm_typ10</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt1</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt2</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt3</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt4</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt5</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt6</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt7</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt8</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt9</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt10</td></tr>
		 * 	<tr><td><br></td><td>fix1</td></tr>
		 * 	<tr><td><br></td><td>fix2</td></tr>
		 * 	<tr><td><br></td><td>fix3</td></tr>
		 * 	<tr><td><br></td><td>fix4</td></tr>
		 * 	<tr><td><br></td><td>fix5</td></tr>
		 * 	<tr><td><br></td><td>fix6</td></tr>
		 * 	<tr><td><br></td><td>fix7</td></tr>
		 * 	<tr><td><br></td><td>fix8</td></tr>
		 * 	<tr><td><br></td><td>fix9</td></tr>
		 * 	<tr><td><br></td><td>fix10</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg1</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg2</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg3</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg4</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg5</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg6</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg7</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg8</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg9</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg10</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str1</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str2</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str3</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str4</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str5</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str6</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str7</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str8</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str9</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str10</td></tr>
		 * 	<tr><td><br></td><td>key_dgt</td></tr>
		 * 	<tr><td><br></td><td>def_seq_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}


	}
	/**
	 * NumPtn_Upd01オペレーション.<p>
	 *
	 * 発番パタンマスタを登録する。<br>
	 */
	abstract public class NumPtn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NumPtn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_NUM_PTN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_NUM_PTN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected NumPtn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_NUM_PTN_R.create("T1"));
			chkMaster = MCController.create(MAM_NUM_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_NUM_PTN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_NUM_PTN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * NumPtn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR createNumPtn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.create();
		}

		/**
		 * NumPtn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> createNumPtn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_typ1</td></tr>
		 * 	<tr><td><br></td><td>elm_typ2</td></tr>
		 * 	<tr><td><br></td><td>elm_typ3</td></tr>
		 * 	<tr><td><br></td><td>elm_typ4</td></tr>
		 * 	<tr><td><br></td><td>elm_typ5</td></tr>
		 * 	<tr><td><br></td><td>elm_typ6</td></tr>
		 * 	<tr><td><br></td><td>elm_typ7</td></tr>
		 * 	<tr><td><br></td><td>elm_typ8</td></tr>
		 * 	<tr><td><br></td><td>elm_typ9</td></tr>
		 * 	<tr><td><br></td><td>elm_typ10</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt1</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt2</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt3</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt4</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt5</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt6</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt7</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt8</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt9</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt10</td></tr>
		 * 	<tr><td><br></td><td>fix1</td></tr>
		 * 	<tr><td><br></td><td>fix2</td></tr>
		 * 	<tr><td><br></td><td>fix3</td></tr>
		 * 	<tr><td><br></td><td>fix4</td></tr>
		 * 	<tr><td><br></td><td>fix5</td></tr>
		 * 	<tr><td><br></td><td>fix6</td></tr>
		 * 	<tr><td><br></td><td>fix7</td></tr>
		 * 	<tr><td><br></td><td>fix8</td></tr>
		 * 	<tr><td><br></td><td>fix9</td></tr>
		 * 	<tr><td><br></td><td>fix10</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg1</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg2</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg3</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg4</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg5</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg6</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg7</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg8</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg9</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg10</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str1</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str2</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str3</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str4</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str5</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str6</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str7</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str8</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str9</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str10</td></tr>
		 * 	<tr><td><br></td><td>key_dgt</td></tr>
		 * 	<tr><td><br></td><td>def_seq_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_NUM_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src_NumPtn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_NumPtn_Upd01_Dtl);
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
				addColumnPathMap("elm_typ1", "elm_typ1");
				addColumnPathMap("elm_typ2", "elm_typ2");
				addColumnPathMap("elm_typ3", "elm_typ3");
				addColumnPathMap("elm_typ4", "elm_typ4");
				addColumnPathMap("elm_typ5", "elm_typ5");
				addColumnPathMap("elm_typ6", "elm_typ6");
				addColumnPathMap("elm_typ7", "elm_typ7");
				addColumnPathMap("elm_typ8", "elm_typ8");
				addColumnPathMap("elm_typ9", "elm_typ9");
				addColumnPathMap("elm_typ10", "elm_typ10");
				addColumnPathMap("elm_dgt1", "elm_dgt1");
				addColumnPathMap("elm_dgt2", "elm_dgt2");
				addColumnPathMap("elm_dgt3", "elm_dgt3");
				addColumnPathMap("elm_dgt4", "elm_dgt4");
				addColumnPathMap("elm_dgt5", "elm_dgt5");
				addColumnPathMap("elm_dgt6", "elm_dgt6");
				addColumnPathMap("elm_dgt7", "elm_dgt7");
				addColumnPathMap("elm_dgt8", "elm_dgt8");
				addColumnPathMap("elm_dgt9", "elm_dgt9");
				addColumnPathMap("elm_dgt10", "elm_dgt10");
				addColumnPathMap("fix1", "fix1");
				addColumnPathMap("fix2", "fix2");
				addColumnPathMap("fix3", "fix3");
				addColumnPathMap("fix4", "fix4");
				addColumnPathMap("fix5", "fix5");
				addColumnPathMap("fix6", "fix6");
				addColumnPathMap("fix7", "fix7");
				addColumnPathMap("fix8", "fix8");
				addColumnPathMap("fix9", "fix9");
				addColumnPathMap("fix10", "fix10");
				addColumnPathMap("undisp_flg1", "undisp_flg1");
				addColumnPathMap("undisp_flg2", "undisp_flg2");
				addColumnPathMap("undisp_flg3", "undisp_flg3");
				addColumnPathMap("undisp_flg4", "undisp_flg4");
				addColumnPathMap("undisp_flg5", "undisp_flg5");
				addColumnPathMap("undisp_flg6", "undisp_flg6");
				addColumnPathMap("undisp_flg7", "undisp_flg7");
				addColumnPathMap("undisp_flg8", "undisp_flg8");
				addColumnPathMap("undisp_flg9", "undisp_flg9");
				addColumnPathMap("undisp_flg10", "undisp_flg10");
				addColumnPathMap("num_pad_str1", "num_pad_str1");
				addColumnPathMap("num_pad_str2", "num_pad_str2");
				addColumnPathMap("num_pad_str3", "num_pad_str3");
				addColumnPathMap("num_pad_str4", "num_pad_str4");
				addColumnPathMap("num_pad_str5", "num_pad_str5");
				addColumnPathMap("num_pad_str6", "num_pad_str6");
				addColumnPathMap("num_pad_str7", "num_pad_str7");
				addColumnPathMap("num_pad_str8", "num_pad_str8");
				addColumnPathMap("num_pad_str9", "num_pad_str9");
				addColumnPathMap("num_pad_str10", "num_pad_str10");
				addColumnPathMap("key_dgt", "key_dgt");
				addColumnPathMap("def_seq_typ", "def_seq_typ");
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
		protected void up_UPDATE_updMaster_0(MAM_NUM_PTN_R r_dest, mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_NUM_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src : src){
				MAM_NUM_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_NUM_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src_NumPtn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_NumPtn_Upd01_Dtl);
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_NUM_PTN_R r_dest, mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_NUM_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src : src){
				MAM_NUM_PTN_R r_dest = dest.createRow();
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
	 * NumPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 発番パタンマスタ(ロケール別情報)を登録する前のチェックをする。<br>
	 */
	abstract public class NumPtnLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NumPtnLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_NUM_PTN_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected NumPtnLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_NUM_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_NUM_PTN_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(EXISTS)) {
				up_EXISTS(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * EXISTS<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(EXISTS)) {
				down_EXISTS();
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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * NumPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR createNumPtnLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * NumPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> createNumPtnLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_NUM_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src_NumPtnLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_NumPtnLcl_UpdChk01_Dtl);
		}
		
		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_EXISTS_chk01_0() {
			MCRowMapper map = new Map_up_EXISTS_chk01_0();
			return map;
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_EXISTS_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_NUM_PTN_R r_dest, mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_NUM_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_NUM_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_EXISTS_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------EXISTS専用down関連メソッド--------------------------

		/**
		 * オペレーショングループEXISTSの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_EXISTS(){
		}
	}
	/**
	 * NumPtnLcl_Upd01オペレーション.<p>
	 *
	 * 発番パタンマスタ(ロケール別情報)を登録する。<br>
	 */
	abstract public class NumPtnLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NumPtnLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_NUM_PTN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_NUM_PTN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected NumPtnLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_NUM_PTN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_NUM_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_NUM_PTN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_NUM_PTN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * NumPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR createNumPtnLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * NumPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> createNumPtnLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_NUM_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src_NumPtnLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_NumPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_NUM_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_NUM_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_NUM_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_NUM_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src_NumPtnLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_NumPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_NUM_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_NUM_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_NUM_PTN_LCL_R r_dest = dest.createRow();
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
	 * NumPtn_DelChk01オペレーション.<p>
	 *
	 * 発番パタンマスタを削除する前のチェックをする。<br>
	 */
	abstract public class NumPtn_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NumPtn_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected NumPtn_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);

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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * NumPtn_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR createNumPtn_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.create();
		}

		/**
		 * NumPtn_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> createNumPtn_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}


	}
	/**
	 * NumPtn_Del01オペレーション.<p>
	 *
	 * 発番パタンマスタを削除する。<br>
	 */
	abstract public class NumPtn_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "NumPtn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_NUM_PTN_R> updMaster1_up0;
		public final MCList<MAM_NUM_PTN_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected NumPtn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_NUM_PTN_R.create("T1"));
			updMaster2 = MCController.create(MAM_NUM_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_NUM_PTN_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_NUM_PTN_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * NumPtn_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR createNumPtn_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.create();
		}

		/**
		 * NumPtn_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> createNumPtn_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_NUM_PTN_R> dest0_0, MCList<MAM_NUM_PTN_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> src_NumPtn_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_NumPtn_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_NumPtn_Del01_Dtl);
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_NUM_PTN_R r_dest, mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_NUM_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src : src){
				MAM_NUM_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster2_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster2_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_NUM_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_NUM_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src : src){
				MAM_NUM_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
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
	 * 検索処理をする。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLSearcher {
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
		private final mcframe.serverMABC.MABCL0810.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_NUM_PTN_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_NUM_PTN_R> c0_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_NUM_PTN_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_NUM_PTN_LCL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_NUM_PTN_LCL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_NUM_PTN_LCL_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0810.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0810.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0810.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_NUM_PTN_R.create("T1"));
			c1 = MCController.create(MAM_NUM_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_NUM_PTN_R>)c0.down(0);
			c1_down0 = (MCList<MAM_NUM_PTN_LCL_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_LCL, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_LCL)) {
				up_SELECT_LCL();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_NUM_PTN_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_NUM_PTN_LCL_R&gt;（{@link #c1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_LCL)) {
				down_SELECT_LCL(down1(), c1_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0810.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0810.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.Srch01_RsltR.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0810.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0810.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0810.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0810.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_typ1</td></tr>
		 * 	<tr><td><br></td><td>elm_typ2</td></tr>
		 * 	<tr><td><br></td><td>elm_typ3</td></tr>
		 * 	<tr><td><br></td><td>elm_typ4</td></tr>
		 * 	<tr><td><br></td><td>elm_typ5</td></tr>
		 * 	<tr><td><br></td><td>elm_typ6</td></tr>
		 * 	<tr><td><br></td><td>elm_typ7</td></tr>
		 * 	<tr><td><br></td><td>elm_typ8</td></tr>
		 * 	<tr><td><br></td><td>elm_typ9</td></tr>
		 * 	<tr><td><br></td><td>elm_typ10</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt1</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt2</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt3</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt4</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt5</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt6</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt7</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt8</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt9</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt10</td></tr>
		 * 	<tr><td><br></td><td>fix1</td></tr>
		 * 	<tr><td><br></td><td>fix2</td></tr>
		 * 	<tr><td><br></td><td>fix3</td></tr>
		 * 	<tr><td><br></td><td>fix4</td></tr>
		 * 	<tr><td><br></td><td>fix5</td></tr>
		 * 	<tr><td><br></td><td>fix6</td></tr>
		 * 	<tr><td><br></td><td>fix7</td></tr>
		 * 	<tr><td><br></td><td>fix8</td></tr>
		 * 	<tr><td><br></td><td>fix9</td></tr>
		 * 	<tr><td><br></td><td>fix10</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg1</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg2</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg3</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg4</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg5</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg6</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg7</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg8</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg9</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg10</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str1</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str2</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str3</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str4</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str5</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str6</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str7</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str8</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str9</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str10</td></tr>
		 * 	<tr><td><br></td><td>key_dgt</td></tr>
		 * 	<tr><td><br></td><td>def_seq_typ</td></tr>
		 * 	<tr><td><br></td><td>def_seq_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>num_biz_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>max_digit</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm1</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm2</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm3</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm4</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm5</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm6</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm7</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm8</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm9</td></tr>
		 * 	<tr><td><br></td><td>elm_typ_nm10</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0810.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_LCL専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCLの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0810.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_NUM_PTN_R> src0_0){
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("num_ptn_nm_lcl", "num_ptn_nm");
				addColumnPathMap("num_ptn_nm", "base_num_ptn_nm");
				addColumnPathMap("elm_typ1", "elm_typ1");
				addColumnPathMap("elm_typ2", "elm_typ2");
				addColumnPathMap("elm_typ3", "elm_typ3");
				addColumnPathMap("elm_typ4", "elm_typ4");
				addColumnPathMap("elm_typ5", "elm_typ5");
				addColumnPathMap("elm_typ6", "elm_typ6");
				addColumnPathMap("elm_typ7", "elm_typ7");
				addColumnPathMap("elm_typ8", "elm_typ8");
				addColumnPathMap("elm_typ9", "elm_typ9");
				addColumnPathMap("elm_typ10", "elm_typ10");
				addColumnPathMap("elm_dgt1", "elm_dgt1");
				addColumnPathMap("elm_dgt2", "elm_dgt2");
				addColumnPathMap("elm_dgt3", "elm_dgt3");
				addColumnPathMap("elm_dgt4", "elm_dgt4");
				addColumnPathMap("elm_dgt5", "elm_dgt5");
				addColumnPathMap("elm_dgt6", "elm_dgt6");
				addColumnPathMap("elm_dgt7", "elm_dgt7");
				addColumnPathMap("elm_dgt8", "elm_dgt8");
				addColumnPathMap("elm_dgt9", "elm_dgt9");
				addColumnPathMap("elm_dgt10", "elm_dgt10");
				addColumnPathMap("fix1", "fix1");
				addColumnPathMap("fix2", "fix2");
				addColumnPathMap("fix3", "fix3");
				addColumnPathMap("fix4", "fix4");
				addColumnPathMap("fix5", "fix5");
				addColumnPathMap("fix6", "fix6");
				addColumnPathMap("fix7", "fix7");
				addColumnPathMap("fix8", "fix8");
				addColumnPathMap("fix9", "fix9");
				addColumnPathMap("fix10", "fix10");
				addColumnPathMap("undisp_flg1", "undisp_flg1");
				addColumnPathMap("undisp_flg2", "undisp_flg2");
				addColumnPathMap("undisp_flg3", "undisp_flg3");
				addColumnPathMap("undisp_flg4", "undisp_flg4");
				addColumnPathMap("undisp_flg5", "undisp_flg5");
				addColumnPathMap("undisp_flg6", "undisp_flg6");
				addColumnPathMap("undisp_flg7", "undisp_flg7");
				addColumnPathMap("undisp_flg8", "undisp_flg8");
				addColumnPathMap("undisp_flg9", "undisp_flg9");
				addColumnPathMap("undisp_flg10", "undisp_flg10");
				addColumnPathMap("num_pad_str1", "num_pad_str1");
				addColumnPathMap("num_pad_str2", "num_pad_str2");
				addColumnPathMap("num_pad_str3", "num_pad_str3");
				addColumnPathMap("num_pad_str4", "num_pad_str4");
				addColumnPathMap("num_pad_str5", "num_pad_str5");
				addColumnPathMap("num_pad_str6", "num_pad_str6");
				addColumnPathMap("num_pad_str7", "num_pad_str7");
				addColumnPathMap("num_pad_str8", "num_pad_str8");
				addColumnPathMap("num_pad_str9", "num_pad_str9");
				addColumnPathMap("num_pad_str10", "num_pad_str10");
				addColumnPathMap("key_dgt", "key_dgt");
				addColumnPathMap("def_seq_typ", "def_seq_typ");
				addColumnPathMap("del_flg", "del_flg");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0810.Srch01_RsltR r_dest, MAM_NUM_PTN_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0810.Srch01_RsltR> dest, MCList<MAM_NUM_PTN_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_NUM_PTN_R r_src : src){
				mcframe.serverMABC.MABCL0810.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABC.MABCL0810.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_NUM_PTN_LCL_R> src0_0){
			down_SELECT_LCL_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL_c1_0() {
			MCRowMapper map = new Map_down_SELECT_LCL_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
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
			}
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL_c1_0(mcframe.serverMABC.MABCL0810.Srch01_Rslt2R r_dest, MAM_NUM_PTN_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c1_0(MCList<mcframe.serverMABC.MABCL0810.Srch01_Rslt2R> dest, MCList<MAM_NUM_PTN_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c1_0();
			for(MAM_NUM_PTN_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0810.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理をする。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
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
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtnLcl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtnLcl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtnLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtnLcl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtnLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtnLcl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.crtNumPtn_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.crtNumPtn_Upd01();
			chk02 = mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.crtNumPtnLcl_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.crtNumPtnLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_typ1</td></tr>
		 * 	<tr><td><br></td><td>elm_typ2</td></tr>
		 * 	<tr><td><br></td><td>elm_typ3</td></tr>
		 * 	<tr><td><br></td><td>elm_typ4</td></tr>
		 * 	<tr><td><br></td><td>elm_typ5</td></tr>
		 * 	<tr><td><br></td><td>elm_typ6</td></tr>
		 * 	<tr><td><br></td><td>elm_typ7</td></tr>
		 * 	<tr><td><br></td><td>elm_typ8</td></tr>
		 * 	<tr><td><br></td><td>elm_typ9</td></tr>
		 * 	<tr><td><br></td><td>elm_typ10</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt1</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt2</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt3</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt4</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt5</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt6</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt7</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt8</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt9</td></tr>
		 * 	<tr><td><br></td><td>elm_dgt10</td></tr>
		 * 	<tr><td><br></td><td>fix1</td></tr>
		 * 	<tr><td><br></td><td>fix2</td></tr>
		 * 	<tr><td><br></td><td>fix3</td></tr>
		 * 	<tr><td><br></td><td>fix4</td></tr>
		 * 	<tr><td><br></td><td>fix5</td></tr>
		 * 	<tr><td><br></td><td>fix6</td></tr>
		 * 	<tr><td><br></td><td>fix7</td></tr>
		 * 	<tr><td><br></td><td>fix8</td></tr>
		 * 	<tr><td><br></td><td>fix9</td></tr>
		 * 	<tr><td><br></td><td>fix10</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg1</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg2</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg3</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg4</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg5</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg6</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg7</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg8</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg9</td></tr>
		 * 	<tr><td><br></td><td>undisp_flg10</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str1</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str2</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str3</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str4</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str5</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str6</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str7</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str8</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str9</td></tr>
		 * 	<tr><td><br></td><td>num_pad_str10</td></tr>
		 * 	<tr><td><br></td><td>key_dgt</td></tr>
		 * 	<tr><td><br></td><td>def_seq_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src_Upd01_Dtl){
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
				addColumnPathMap("elm_typ1", "elm_typ1");
				addColumnPathMap("elm_typ2", "elm_typ2");
				addColumnPathMap("elm_typ3", "elm_typ3");
				addColumnPathMap("elm_typ4", "elm_typ4");
				addColumnPathMap("elm_typ5", "elm_typ5");
				addColumnPathMap("elm_typ6", "elm_typ6");
				addColumnPathMap("elm_typ7", "elm_typ7");
				addColumnPathMap("elm_typ8", "elm_typ8");
				addColumnPathMap("elm_typ9", "elm_typ9");
				addColumnPathMap("elm_typ10", "elm_typ10");
				addColumnPathMap("elm_dgt1", "elm_dgt1");
				addColumnPathMap("elm_dgt2", "elm_dgt2");
				addColumnPathMap("elm_dgt3", "elm_dgt3");
				addColumnPathMap("elm_dgt4", "elm_dgt4");
				addColumnPathMap("elm_dgt5", "elm_dgt5");
				addColumnPathMap("elm_dgt6", "elm_dgt6");
				addColumnPathMap("elm_dgt7", "elm_dgt7");
				addColumnPathMap("elm_dgt8", "elm_dgt8");
				addColumnPathMap("elm_dgt9", "elm_dgt9");
				addColumnPathMap("elm_dgt10", "elm_dgt10");
				addColumnPathMap("fix1", "fix1");
				addColumnPathMap("fix2", "fix2");
				addColumnPathMap("fix3", "fix3");
				addColumnPathMap("fix4", "fix4");
				addColumnPathMap("fix5", "fix5");
				addColumnPathMap("fix6", "fix6");
				addColumnPathMap("fix7", "fix7");
				addColumnPathMap("fix8", "fix8");
				addColumnPathMap("fix9", "fix9");
				addColumnPathMap("fix10", "fix10");
				addColumnPathMap("undisp_flg1", "undisp_flg1");
				addColumnPathMap("undisp_flg2", "undisp_flg2");
				addColumnPathMap("undisp_flg3", "undisp_flg3");
				addColumnPathMap("undisp_flg4", "undisp_flg4");
				addColumnPathMap("undisp_flg5", "undisp_flg5");
				addColumnPathMap("undisp_flg6", "undisp_flg6");
				addColumnPathMap("undisp_flg7", "undisp_flg7");
				addColumnPathMap("undisp_flg8", "undisp_flg8");
				addColumnPathMap("undisp_flg9", "undisp_flg9");
				addColumnPathMap("undisp_flg10", "undisp_flg10");
				addColumnPathMap("num_pad_str1", "num_pad_str1");
				addColumnPathMap("num_pad_str2", "num_pad_str2");
				addColumnPathMap("num_pad_str3", "num_pad_str3");
				addColumnPathMap("num_pad_str4", "num_pad_str4");
				addColumnPathMap("num_pad_str5", "num_pad_str5");
				addColumnPathMap("num_pad_str6", "num_pad_str6");
				addColumnPathMap("num_pad_str7", "num_pad_str7");
				addColumnPathMap("num_pad_str8", "num_pad_str8");
				addColumnPathMap("num_pad_str9", "num_pad_str9");
				addColumnPathMap("num_pad_str10", "num_pad_str10");
				addColumnPathMap("key_dgt", "key_dgt");
				addColumnPathMap("def_seq_typ", "def_seq_typ");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
				addColumnPathMap("elm_typ1", "elm_typ1");
				addColumnPathMap("elm_typ2", "elm_typ2");
				addColumnPathMap("elm_typ3", "elm_typ3");
				addColumnPathMap("elm_typ4", "elm_typ4");
				addColumnPathMap("elm_typ5", "elm_typ5");
				addColumnPathMap("elm_typ6", "elm_typ6");
				addColumnPathMap("elm_typ7", "elm_typ7");
				addColumnPathMap("elm_typ8", "elm_typ8");
				addColumnPathMap("elm_typ9", "elm_typ9");
				addColumnPathMap("elm_typ10", "elm_typ10");
				addColumnPathMap("elm_dgt1", "elm_dgt1");
				addColumnPathMap("elm_dgt2", "elm_dgt2");
				addColumnPathMap("elm_dgt3", "elm_dgt3");
				addColumnPathMap("elm_dgt4", "elm_dgt4");
				addColumnPathMap("elm_dgt5", "elm_dgt5");
				addColumnPathMap("elm_dgt6", "elm_dgt6");
				addColumnPathMap("elm_dgt7", "elm_dgt7");
				addColumnPathMap("elm_dgt8", "elm_dgt8");
				addColumnPathMap("elm_dgt9", "elm_dgt9");
				addColumnPathMap("elm_dgt10", "elm_dgt10");
				addColumnPathMap("fix1", "fix1");
				addColumnPathMap("fix2", "fix2");
				addColumnPathMap("fix3", "fix3");
				addColumnPathMap("fix4", "fix4");
				addColumnPathMap("fix5", "fix5");
				addColumnPathMap("fix6", "fix6");
				addColumnPathMap("fix7", "fix7");
				addColumnPathMap("fix8", "fix8");
				addColumnPathMap("fix9", "fix9");
				addColumnPathMap("fix10", "fix10");
				addColumnPathMap("undisp_flg1", "undisp_flg1");
				addColumnPathMap("undisp_flg2", "undisp_flg2");
				addColumnPathMap("undisp_flg3", "undisp_flg3");
				addColumnPathMap("undisp_flg4", "undisp_flg4");
				addColumnPathMap("undisp_flg5", "undisp_flg5");
				addColumnPathMap("undisp_flg6", "undisp_flg6");
				addColumnPathMap("undisp_flg7", "undisp_flg7");
				addColumnPathMap("undisp_flg8", "undisp_flg8");
				addColumnPathMap("undisp_flg9", "undisp_flg9");
				addColumnPathMap("undisp_flg10", "undisp_flg10");
				addColumnPathMap("num_pad_str1", "num_pad_str1");
				addColumnPathMap("num_pad_str2", "num_pad_str2");
				addColumnPathMap("num_pad_str3", "num_pad_str3");
				addColumnPathMap("num_pad_str4", "num_pad_str4");
				addColumnPathMap("num_pad_str5", "num_pad_str5");
				addColumnPathMap("num_pad_str6", "num_pad_str6");
				addColumnPathMap("num_pad_str7", "num_pad_str7");
				addColumnPathMap("num_pad_str8", "num_pad_str8");
				addColumnPathMap("num_pad_str9", "num_pad_str9");
				addColumnPathMap("num_pad_str10", "num_pad_str10");
				addColumnPathMap("key_dgt", "key_dgt");
				addColumnPathMap("def_seq_typ", "def_seq_typ");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0810.NumPtn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("num_ptn_nm", "num_ptn_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0810.NumPtnLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
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
		private final MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.NumPtn_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.crtNumPtn_DelChk01();
			del01 = mcframe.serverMABC.MABCL0810.MABCL_NumPtnReg.crtNumPtn_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_NumPtnReg)MABCL_NumPtnReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> src_Del01_Dtl){
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("num_biz_typ", "num_biz_typ");
				addColumnPathMap("num_ptn_cd", "num_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0810.NumPtn_DelChk01_DtlR r_dest = dest.createRow();
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