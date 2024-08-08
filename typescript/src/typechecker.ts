import type { DeclFun, Program } from './ast';

export function typecheckProgram(ast: Program) {
  for (const decl of ast.declarations) {
    switch (decl.type) {
      case 'DeclFun':
        typecheckFunctionDecl(decl);
        break;
      default:
        throw new Error('Unknown declaration type');
    }
  }
}

function typecheckFunctionDecl(decl: DeclFun) {
  console.log(`Checking the function "${decl.name}"...`);
}
