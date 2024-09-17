package ec.edu.ups.pds.controller.builder;

import ec.edu.ups.pds.dto.builder.ActivoFijoDto;
import ec.edu.ups.pds.dto.factory.VehiculoDTO;
import ec.edu.ups.pds.service.builder.IActivoFijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/activo-fijo")
public class ActivoFijoController {
    @Autowired
    private IActivoFijoService activoFijoService;

    @PostMapping
    public ResponseEntity guardar(@RequestBody ActivoFijoDto activoFijo) {
        try {
            activoFijoService.guardar(activoFijo);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

    @GetMapping
    public ResponseEntity obtenerTodos() {
        try {
            return ResponseEntity.ok().body(activoFijoService.obtenerTodos());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
